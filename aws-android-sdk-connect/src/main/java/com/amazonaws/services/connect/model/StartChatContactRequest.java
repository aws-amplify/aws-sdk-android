/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Initiates a contact flow to start a new chat for the customer. Response of
 * this API provides a token required to obtain credentials from the <a href=
 * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
 * >CreateParticipantConnection</a> API in the Amazon Connect Participant
 * Service.
 * </p>
 * <p>
 * When a new chat contact is successfully created, clients need to subscribe to
 * the participant’s connection for the created chat within 5 minutes. This is
 * achieved by invoking <a href=
 * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
 * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
 * </p>
 */
public class StartChatContactRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the contact flow for the chat.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String contactFlowId;

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes, and can be accessed in contact flows
     * just like any other contact attributes.
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
     * idempotency of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
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
     * The identifier of the contact flow for the chat.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier of the contact flow for the chat.
     *         </p>
     */
    public String getContactFlowId() {
        return contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow for the chat.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the contact flow for the chat.
     *            </p>
     */
    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow for the chat.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the contact flow for the chat.
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
     * standard Amazon Connect attributes, and can be accessed in contact flows
     * just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @return <p>
     *         A custom key-value pair using an attribute map. The attributes
     *         are standard Amazon Connect attributes, and can be accessed in
     *         contact flows just like any other contact attributes.
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
     * standard Amazon Connect attributes, and can be accessed in contact flows
     * just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @param attributes <p>
     *            A custom key-value pair using an attribute map. The attributes
     *            are standard Amazon Connect attributes, and can be accessed in
     *            contact flows just like any other contact attributes.
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
     * standard Amazon Connect attributes, and can be accessed in contact flows
     * just like any other contact attributes.
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
     *            are standard Amazon Connect attributes, and can be accessed in
     *            contact flows just like any other contact attributes.
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
     * standard Amazon Connect attributes, and can be accessed in contact flows
     * just like any other contact attributes.
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
     * idempotency of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
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
     *            the idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChatContactRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
            sb.append("ClientToken: " + getClientToken());
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
        return true;
    }
}
