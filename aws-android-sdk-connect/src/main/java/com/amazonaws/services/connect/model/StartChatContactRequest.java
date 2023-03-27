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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Initiates a flow to start a new chat for the customer. Response of this API
 * provides a token required to obtain credentials from the <a href=
 * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
 * >CreateParticipantConnection</a> API in the Amazon Connect Participant
 * Service.
 * </p>
 * <p>
 * When a new chat contact is successfully created, clients must subscribe to
 * the participant’s connection for the created chat within 5 minutes. This is
 * achieved by invoking <a href=
 * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
 * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
 * </p>
 * <p>
 * A 429 error occurs in the following situations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * API rate limit is exceeded. API TPS throttling returns a
 * <code>TooManyRequests</code> exception.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
 * >quota for concurrent active chats</a> is exceeded. Active chat throttling
 * returns a <code>LimitExceededException</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you use the <code>ChatDurationInMinutes</code> parameter and receive a 400
 * error, your account may not support the ability to configure custom chat
 * durations. For more information, contact Amazon Web Services Support.
 * </p>
 * <p>
 * For more information about chat, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html"
 * >Chat</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
public class StartChatContactRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the flow for initiating the chat. To see the
     * ContactFlowId in the Amazon Connect console user interface, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     * flow. On the flow page, under the name of the flow, choose <b>Show
     * additional flow information</b>. The ContactFlowId is the last part of
     * the ARN, shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-
     * xxxxxxxxxxxx/contact-flow/<b>846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String contactFlowId;

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * Information identifying the participant.
     * </p>
     */
    private ParticipantDetails participantDetails;

    /**
     * <p>
     * The initial message to be sent to the newly created chat.
     * </p>
     */
    private ChatMessage initialMessage;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The total duration of the newly started chat session. If not specified,
     * the chat session duration defaults to 25 hour. The minimum configurable
     * time is 60 minutes. The maximum configurable time is 10,080 minutes (7
     * days).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 10080<br/>
     */
    private Integer chatDurationInMinutes;

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     * <note>
     * <p>
     * The type
     * <code>application/vnd.amazonaws.connect.message.interactive</code> is
     * required to use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     * >Show view</a> flow block.
     * </p>
     * </note>
     */
    private java.util.List<String> supportedMessagingContentTypes;

    /**
     * <p>
     * Enable persistent chats. For more information about enabling persistent
     * chat, and for example use cases and how to configure for them, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     * >Enable persistent chat</a>.
     * </p>
     */
    private PersistentChat persistentChat;

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is
     * related to the chat starting.
     * </p>
     * <note>
     * <p>
     * You cannot provide data for both RelatedContactId and PersistentChat.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String relatedContactId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the chat. To see the
     * ContactFlowId in the Amazon Connect console user interface, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     * flow. On the flow page, under the name of the flow, choose <b>Show
     * additional flow information</b>. The ContactFlowId is the last part of
     * the ARN, shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-
     * xxxxxxxxxxxx/contact-flow/<b>846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier of the flow for initiating the chat. To see the
     *         ContactFlowId in the Amazon Connect console user interface, on
     *         the navigation menu go to <b>Routing</b>, <b>Contact Flows</b>.
     *         Choose the flow. On the flow page, under the name of the flow,
     *         choose <b>Show additional flow information</b>. The ContactFlowId
     *         is the last part of the ARN, shown here in bold:
     *         </p>
     *         <p>
     *         arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-
     *         xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *         846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     *         </p>
     */
    public String getContactFlowId() {
        return contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the chat. To see the
     * ContactFlowId in the Amazon Connect console user interface, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     * flow. On the flow page, under the name of the flow, choose <b>Show
     * additional flow information</b>. The ContactFlowId is the last part of
     * the ARN, shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-
     * xxxxxxxxxxxx/contact-flow/<b>846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the flow for initiating the chat. To see the
     *            ContactFlowId in the Amazon Connect console user interface, on
     *            the navigation menu go to <b>Routing</b>, <b>Contact
     *            Flows</b>. Choose the flow. On the flow page, under the name
     *            of the flow, choose <b>Show additional flow information</b>.
     *            The ContactFlowId is the last part of the ARN, shown here in
     *            bold:
     *            </p>
     *            <p>
     *            arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-
     *            xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *            846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     *            </p>
     */
    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the chat. To see the
     * ContactFlowId in the Amazon Connect console user interface, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     * flow. On the flow page, under the name of the flow, choose <b>Show
     * additional flow information</b>. The ContactFlowId is the last part of
     * the ARN, shown here in bold:
     * </p>
     * <p>
     * arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-
     * xxxxxxxxxxxx/contact-flow/<b>846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the flow for initiating the chat. To see the
     *            ContactFlowId in the Amazon Connect console user interface, on
     *            the navigation menu go to <b>Routing</b>, <b>Contact
     *            Flows</b>. Choose the flow. On the flow page, under the name
     *            of the flow, choose <b>Show additional flow information</b>.
     *            The ContactFlowId is the last part of the ARN, shown here in
     *            bold:
     *            </p>
     *            <p>
     *            arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-
     *            xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *            846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @return <p>
     *         A custom key-value pair using an attribute map. The attributes
     *         are standard Amazon Connect attributes. They can be accessed in
     *         flows just like any other contact attributes.
     *         </p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs
     *         per contact. Attribute keys can include only alphanumeric, dash,
     *         and underscore characters.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @param attributes <p>
     *            A custom key-value pair using an attribute map. The attributes
     *            are standard Amazon Connect attributes. They can be accessed
     *            in flows just like any other contact attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A custom key-value pair using an attribute map. The attributes
     *            are standard Amazon Connect attributes. They can be accessed
     *            in flows just like any other contact attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes. They can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StartChatContactRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Information identifying the participant.
     * </p>
     *
     * @return <p>
     *         Information identifying the participant.
     *         </p>
     */
    public ParticipantDetails getParticipantDetails() {
        return participantDetails;
    }

    /**
     * <p>
     * Information identifying the participant.
     * </p>
     *
     * @param participantDetails <p>
     *            Information identifying the participant.
     *            </p>
     */
    public void setParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
    }

    /**
     * <p>
     * Information identifying the participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param participantDetails <p>
     *            Information identifying the participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
        return this;
    }

    /**
     * <p>
     * The initial message to be sent to the newly created chat.
     * </p>
     *
     * @return <p>
     *         The initial message to be sent to the newly created chat.
     *         </p>
     */
    public ChatMessage getInitialMessage() {
        return initialMessage;
    }

    /**
     * <p>
     * The initial message to be sent to the newly created chat.
     * </p>
     *
     * @param initialMessage <p>
     *            The initial message to be sent to the newly created chat.
     *            </p>
     */
    public void setInitialMessage(ChatMessage initialMessage) {
        this.initialMessage = initialMessage;
    }

    /**
     * <p>
     * The initial message to be sent to the newly created chat.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initialMessage <p>
     *            The initial message to be sent to the newly created chat.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withInitialMessage(ChatMessage initialMessage) {
        this.initialMessage = initialMessage;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. If not provided, the Amazon Web
     *         Services SDK populates this field. For more information about
     *         idempotency, see <a href=
     *         "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *         >Making retries safe with idempotent APIs</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The total duration of the newly started chat session. If not specified,
     * the chat session duration defaults to 25 hour. The minimum configurable
     * time is 60 minutes. The maximum configurable time is 10,080 minutes (7
     * days).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 10080<br/>
     *
     * @return <p>
     *         The total duration of the newly started chat session. If not
     *         specified, the chat session duration defaults to 25 hour. The
     *         minimum configurable time is 60 minutes. The maximum configurable
     *         time is 10,080 minutes (7 days).
     *         </p>
     */
    public Integer getChatDurationInMinutes() {
        return chatDurationInMinutes;
    }

    /**
     * <p>
     * The total duration of the newly started chat session. If not specified,
     * the chat session duration defaults to 25 hour. The minimum configurable
     * time is 60 minutes. The maximum configurable time is 10,080 minutes (7
     * days).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 10080<br/>
     *
     * @param chatDurationInMinutes <p>
     *            The total duration of the newly started chat session. If not
     *            specified, the chat session duration defaults to 25 hour. The
     *            minimum configurable time is 60 minutes. The maximum
     *            configurable time is 10,080 minutes (7 days).
     *            </p>
     */
    public void setChatDurationInMinutes(Integer chatDurationInMinutes) {
        this.chatDurationInMinutes = chatDurationInMinutes;
    }

    /**
     * <p>
     * The total duration of the newly started chat session. If not specified,
     * the chat session duration defaults to 25 hour. The minimum configurable
     * time is 60 minutes. The maximum configurable time is 10,080 minutes (7
     * days).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 10080<br/>
     *
     * @param chatDurationInMinutes <p>
     *            The total duration of the newly started chat session. If not
     *            specified, the chat session duration defaults to 25 hour. The
     *            minimum configurable time is 60 minutes. The maximum
     *            configurable time is 10,080 minutes (7 days).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withChatDurationInMinutes(Integer chatDurationInMinutes) {
        this.chatDurationInMinutes = chatDurationInMinutes;
        return this;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     * <note>
     * <p>
     * The type
     * <code>application/vnd.amazonaws.connect.message.interactive</code> is
     * required to use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     * >Show view</a> flow block.
     * </p>
     * </note>
     *
     * @return <p>
     *         The supported chat message content types. Supported types are
     *         <code>text/plain</code>, <code>text/markdown</code>,
     *         <code>application/json</code>,
     *         <code>application/vnd.amazonaws.connect.message.interactive</code>
     *         , and
     *         <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *         .
     *         </p>
     *         <p>
     *         Content types must always contain <code>text/plain</code>. You
     *         can then put any other supported type in the list. For example,
     *         all the following lists are valid because they contain
     *         <code>text/plain</code>:
     *         <code>[text/plain, text/markdown, application/json]</code>,
     *         <code>[text/markdown, text/plain]</code>,
     *         <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *         .
     *         </p>
     *         <note>
     *         <p>
     *         The type
     *         <code>application/vnd.amazonaws.connect.message.interactive</code>
     *         is required to use the <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     *         >Show view</a> flow block.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getSupportedMessagingContentTypes() {
        return supportedMessagingContentTypes;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     * <note>
     * <p>
     * The type
     * <code>application/vnd.amazonaws.connect.message.interactive</code> is
     * required to use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     * >Show view</a> flow block.
     * </p>
     * </note>
     *
     * @param supportedMessagingContentTypes <p>
     *            The supported chat message content types. Supported types are
     *            <code>text/plain</code>, <code>text/markdown</code>,
     *            <code>application/json</code>,
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            , and
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            .
     *            </p>
     *            <p>
     *            Content types must always contain <code>text/plain</code>. You
     *            can then put any other supported type in the list. For
     *            example, all the following lists are valid because they
     *            contain <code>text/plain</code>:
     *            <code>[text/plain, text/markdown, application/json]</code>,
     *            <code>[text/markdown, text/plain]</code>,
     *            <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *            .
     *            </p>
     *            <note>
     *            <p>
     *            The type
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            is required to use the <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     *            >Show view</a> flow block.
     *            </p>
     *            </note>
     */
    public void setSupportedMessagingContentTypes(
            java.util.Collection<String> supportedMessagingContentTypes) {
        if (supportedMessagingContentTypes == null) {
            this.supportedMessagingContentTypes = null;
            return;
        }

        this.supportedMessagingContentTypes = new java.util.ArrayList<String>(
                supportedMessagingContentTypes);
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     * <note>
     * <p>
     * The type
     * <code>application/vnd.amazonaws.connect.message.interactive</code> is
     * required to use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     * >Show view</a> flow block.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedMessagingContentTypes <p>
     *            The supported chat message content types. Supported types are
     *            <code>text/plain</code>, <code>text/markdown</code>,
     *            <code>application/json</code>,
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            , and
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            .
     *            </p>
     *            <p>
     *            Content types must always contain <code>text/plain</code>. You
     *            can then put any other supported type in the list. For
     *            example, all the following lists are valid because they
     *            contain <code>text/plain</code>:
     *            <code>[text/plain, text/markdown, application/json]</code>,
     *            <code>[text/markdown, text/plain]</code>,
     *            <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *            .
     *            </p>
     *            <note>
     *            <p>
     *            The type
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            is required to use the <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     *            >Show view</a> flow block.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withSupportedMessagingContentTypes(
            String... supportedMessagingContentTypes) {
        if (getSupportedMessagingContentTypes() == null) {
            this.supportedMessagingContentTypes = new java.util.ArrayList<String>(
                    supportedMessagingContentTypes.length);
        }
        for (String value : supportedMessagingContentTypes) {
            this.supportedMessagingContentTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The supported chat message content types. Supported types are
     * <code>text/plain</code>, <code>text/markdown</code>,
     * <code>application/json</code>,
     * <code>application/vnd.amazonaws.connect.message.interactive</code>, and
     * <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     * .
     * </p>
     * <p>
     * Content types must always contain <code>text/plain</code>. You can then
     * put any other supported type in the list. For example, all the following
     * lists are valid because they contain <code>text/plain</code>:
     * <code>[text/plain, text/markdown, application/json]</code>,
     * <code>[text/markdown, text/plain]</code>,
     * <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     * .
     * </p>
     * <note>
     * <p>
     * The type
     * <code>application/vnd.amazonaws.connect.message.interactive</code> is
     * required to use the <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     * >Show view</a> flow block.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedMessagingContentTypes <p>
     *            The supported chat message content types. Supported types are
     *            <code>text/plain</code>, <code>text/markdown</code>,
     *            <code>application/json</code>,
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            , and
     *            <code>application/vnd.amazonaws.connect.message.interactive.response</code>
     *            .
     *            </p>
     *            <p>
     *            Content types must always contain <code>text/plain</code>. You
     *            can then put any other supported type in the list. For
     *            example, all the following lists are valid because they
     *            contain <code>text/plain</code>:
     *            <code>[text/plain, text/markdown, application/json]</code>,
     *            <code>[text/markdown, text/plain]</code>,
     *            <code>[text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response]</code>
     *            .
     *            </p>
     *            <note>
     *            <p>
     *            The type
     *            <code>application/vnd.amazonaws.connect.message.interactive</code>
     *            is required to use the <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/show-view-block.html"
     *            >Show view</a> flow block.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withSupportedMessagingContentTypes(
            java.util.Collection<String> supportedMessagingContentTypes) {
        setSupportedMessagingContentTypes(supportedMessagingContentTypes);
        return this;
    }

    /**
     * <p>
     * Enable persistent chats. For more information about enabling persistent
     * chat, and for example use cases and how to configure for them, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     * >Enable persistent chat</a>.
     * </p>
     *
     * @return <p>
     *         Enable persistent chats. For more information about enabling
     *         persistent chat, and for example use cases and how to configure
     *         for them, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     *         >Enable persistent chat</a>.
     *         </p>
     */
    public PersistentChat getPersistentChat() {
        return persistentChat;
    }

    /**
     * <p>
     * Enable persistent chats. For more information about enabling persistent
     * chat, and for example use cases and how to configure for them, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     * >Enable persistent chat</a>.
     * </p>
     *
     * @param persistentChat <p>
     *            Enable persistent chats. For more information about enabling
     *            persistent chat, and for example use cases and how to
     *            configure for them, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     *            >Enable persistent chat</a>.
     *            </p>
     */
    public void setPersistentChat(PersistentChat persistentChat) {
        this.persistentChat = persistentChat;
    }

    /**
     * <p>
     * Enable persistent chats. For more information about enabling persistent
     * chat, and for example use cases and how to configure for them, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     * >Enable persistent chat</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persistentChat <p>
     *            Enable persistent chats. For more information about enabling
     *            persistent chat, and for example use cases and how to
     *            configure for them, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html"
     *            >Enable persistent chat</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withPersistentChat(PersistentChat persistentChat) {
        this.persistentChat = persistentChat;
        return this;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is
     * related to the chat starting.
     * </p>
     * <note>
     * <p>
     * You cannot provide data for both RelatedContactId and PersistentChat.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The unique identifier for an Amazon Connect contact. This
     *         identifier is related to the chat starting.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot provide data for both RelatedContactId and
     *         PersistentChat.
     *         </p>
     *         </note>
     */
    public String getRelatedContactId() {
        return relatedContactId;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is
     * related to the chat starting.
     * </p>
     * <note>
     * <p>
     * You cannot provide data for both RelatedContactId and PersistentChat.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The unique identifier for an Amazon Connect contact. This
     *            identifier is related to the chat starting.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot provide data for both RelatedContactId and
     *            PersistentChat.
     *            </p>
     *            </note>
     */
    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is
     * related to the chat starting.
     * </p>
     * <note>
     * <p>
     * You cannot provide data for both RelatedContactId and PersistentChat.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The unique identifier for an Amazon Connect contact. This
     *            identifier is related to the chat starting.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot provide data for both RelatedContactId and
     *            PersistentChat.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getParticipantDetails() != null)
            sb.append("ParticipantDetails: " + getParticipantDetails() + ",");
        if (getInitialMessage() != null)
            sb.append("InitialMessage: " + getInitialMessage() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getChatDurationInMinutes() != null)
            sb.append("ChatDurationInMinutes: " + getChatDurationInMinutes() + ",");
        if (getSupportedMessagingContentTypes() != null)
            sb.append("SupportedMessagingContentTypes: " + getSupportedMessagingContentTypes()
                    + ",");
        if (getPersistentChat() != null)
            sb.append("PersistentChat: " + getPersistentChat() + ",");
        if (getRelatedContactId() != null)
            sb.append("RelatedContactId: " + getRelatedContactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantDetails() == null) ? 0 : getParticipantDetails().hashCode());
        hashCode = prime * hashCode
                + ((getInitialMessage() == null) ? 0 : getInitialMessage().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getChatDurationInMinutes() == null) ? 0 : getChatDurationInMinutes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedMessagingContentTypes() == null) ? 0
                        : getSupportedMessagingContentTypes().hashCode());
        hashCode = prime * hashCode
                + ((getPersistentChat() == null) ? 0 : getPersistentChat().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedContactId() == null) ? 0 : getRelatedContactId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartChatContactRequest == false)
            return false;
        StartChatContactRequest other = (StartChatContactRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null
                && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getParticipantDetails() == null ^ this.getParticipantDetails() == null)
            return false;
        if (other.getParticipantDetails() != null
                && other.getParticipantDetails().equals(this.getParticipantDetails()) == false)
            return false;
        if (other.getInitialMessage() == null ^ this.getInitialMessage() == null)
            return false;
        if (other.getInitialMessage() != null
                && other.getInitialMessage().equals(this.getInitialMessage()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getChatDurationInMinutes() == null ^ this.getChatDurationInMinutes() == null)
            return false;
        if (other.getChatDurationInMinutes() != null
                && other.getChatDurationInMinutes().equals(this.getChatDurationInMinutes()) == false)
            return false;
        if (other.getSupportedMessagingContentTypes() == null
                ^ this.getSupportedMessagingContentTypes() == null)
            return false;
        if (other.getSupportedMessagingContentTypes() != null
                && other.getSupportedMessagingContentTypes().equals(
                        this.getSupportedMessagingContentTypes()) == false)
            return false;
        if (other.getPersistentChat() == null ^ this.getPersistentChat() == null)
            return false;
        if (other.getPersistentChat() != null
                && other.getPersistentChat().equals(this.getPersistentChat()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null
                && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        return true;
    }
}
