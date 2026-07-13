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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Places an inbound in-app, web, or video call to a contact, and then initiates
 * the flow. It performs the actions in the flow that are specified (in
 * ContactFlowId) and present in the Amazon Connect instance (specified as
 * InstanceId).
 * </p>
 */
public class StartWebRTCContactRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes, and can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, -, and _
     * characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

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
     * The token is valid for 7 days after creation. If a contact is already
     * started, the contact ID is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the flow for the call. To see the ContactFlowId in the
     * Amazon Connect admin website, on the navigation menu go to
     * <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page,
     * under the name of the flow, choose <b>Show additional flow
     * information</b>. The ContactFlowId is the last part of the ARN, shown
     * here in bold:
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
     * Information about the video sharing capabilities of the participants
     * (customer, agent).
     * </p>
     */
    private AllowedCapabilities allowedCapabilities;

    /**
     * <p>
     * The customer's details.
     * </p>
     */
    private ParticipantDetails participantDetails;

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is
     * related to the contact starting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String relatedContactId;

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Tasks can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during task creation.
     * </p>
     */
    private java.util.Map<String, Reference> references;

    /**
     * <p>
     * A description of the task that is shown to an agent in the Contact
     * Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String description;

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes, and can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, -, and _
     * characters.
     * </p>
     *
     * @return <p>
     *         A custom key-value pair using an attribute map. The attributes
     *         are standard Amazon Connect attributes, and can be accessed in
     *         flows just like any other contact attributes.
     *         </p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs
     *         per contact. Attribute keys can include only alphanumeric, -, and
     *         _ characters.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes, and can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, -, and _
     * characters.
     * </p>
     *
     * @param attributes <p>
     *            A custom key-value pair using an attribute map. The attributes
     *            are standard Amazon Connect attributes, and can be accessed in
     *            flows just like any other contact attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, -, and _ characters.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes, and can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, -, and _
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A custom key-value pair using an attribute map. The attributes
     *            are standard Amazon Connect attributes, and can be accessed in
     *            flows just like any other contact attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, -, and _ characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes, and can be accessed in flows just
     * like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, -, and _
     * characters.
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
    public StartWebRTCContactRequest addAttributesEntry(String key, String value) {
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
    public StartWebRTCContactRequest clearAttributesEntries() {
        this.attributes = null;
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
     * The token is valid for 7 days after creation. If a contact is already
     * started, the contact ID is returned.
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
     *         <p>
     *         The token is valid for 7 days after creation. If a contact is
     *         already started, the contact ID is returned.
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
     * The token is valid for 7 days after creation. If a contact is already
     * started, the contact ID is returned.
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
     *            <p>
     *            The token is valid for 7 days after creation. If a contact is
     *            already started, the contact ID is returned.
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
     * The token is valid for 7 days after creation. If a contact is already
     * started, the contact ID is returned.
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
     *            <p>
     *            The token is valid for 7 days after creation. If a contact is
     *            already started, the contact ID is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow for the call. To see the ContactFlowId in the
     * Amazon Connect admin website, on the navigation menu go to
     * <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page,
     * under the name of the flow, choose <b>Show additional flow
     * information</b>. The ContactFlowId is the last part of the ARN, shown
     * here in bold:
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
     *         The identifier of the flow for the call. To see the ContactFlowId
     *         in the Amazon Connect admin website, on the navigation menu go to
     *         <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the
     *         flow page, under the name of the flow, choose <b>Show additional
     *         flow information</b>. The ContactFlowId is the last part of the
     *         ARN, shown here in bold:
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
     * The identifier of the flow for the call. To see the ContactFlowId in the
     * Amazon Connect admin website, on the navigation menu go to
     * <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page,
     * under the name of the flow, choose <b>Show additional flow
     * information</b>. The ContactFlowId is the last part of the ARN, shown
     * here in bold:
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
     *            The identifier of the flow for the call. To see the
     *            ContactFlowId in the Amazon Connect admin website, on the
     *            navigation menu go to <b>Routing</b>, <b>Contact Flows</b>.
     *            Choose the flow. On the flow page, under the name of the flow,
     *            choose <b>Show additional flow information</b>. The
     *            ContactFlowId is the last part of the ARN, shown here in bold:
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
     * The identifier of the flow for the call. To see the ContactFlowId in the
     * Amazon Connect admin website, on the navigation menu go to
     * <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow page,
     * under the name of the flow, choose <b>Show additional flow
     * information</b>. The ContactFlowId is the last part of the ARN, shown
     * here in bold:
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
     *            The identifier of the flow for the call. To see the
     *            ContactFlowId in the Amazon Connect admin website, on the
     *            navigation menu go to <b>Routing</b>, <b>Contact Flows</b>.
     *            Choose the flow. On the flow page, under the name of the flow,
     *            choose <b>Show additional flow information</b>. The
     *            ContactFlowId is the last part of the ARN, shown here in bold:
     *            </p>
     *            <p>
     *            arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-
     *            xxxx-xxxx-xxxxxxxxxxxx/contact-flow/<b>
     *            846ec553-a005-41c0-8341-xxxxxxxxxxxx</b>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest withContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
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
    public StartWebRTCContactRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * Information about the video sharing capabilities of the participants
     * (customer, agent).
     * </p>
     *
     * @return <p>
     *         Information about the video sharing capabilities of the
     *         participants (customer, agent).
     *         </p>
     */
    public AllowedCapabilities getAllowedCapabilities() {
        return allowedCapabilities;
    }

    /**
     * <p>
     * Information about the video sharing capabilities of the participants
     * (customer, agent).
     * </p>
     *
     * @param allowedCapabilities <p>
     *            Information about the video sharing capabilities of the
     *            participants (customer, agent).
     *            </p>
     */
    public void setAllowedCapabilities(AllowedCapabilities allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
    }

    /**
     * <p>
     * Information about the video sharing capabilities of the participants
     * (customer, agent).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedCapabilities <p>
     *            Information about the video sharing capabilities of the
     *            participants (customer, agent).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest withAllowedCapabilities(AllowedCapabilities allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
        return this;
    }

    /**
     * <p>
     * The customer's details.
     * </p>
     *
     * @return <p>
     *         The customer's details.
     *         </p>
     */
    public ParticipantDetails getParticipantDetails() {
        return participantDetails;
    }

    /**
     * <p>
     * The customer's details.
     * </p>
     *
     * @param participantDetails <p>
     *            The customer's details.
     *            </p>
     */
    public void setParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
    }

    /**
     * <p>
     * The customer's details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param participantDetails <p>
     *            The customer's details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest withParticipantDetails(ParticipantDetails participantDetails) {
        this.participantDetails = participantDetails;
        return this;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is
     * related to the contact starting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The unique identifier for an Amazon Connect contact. This
     *         identifier is related to the contact starting.
     *         </p>
     */
    public String getRelatedContactId() {
        return relatedContactId;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is
     * related to the contact starting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The unique identifier for an Amazon Connect contact. This
     *            identifier is related to the contact starting.
     *            </p>
     */
    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The unique identifier for an Amazon Connect contact. This identifier is
     * related to the contact starting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The unique identifier for an Amazon Connect contact. This
     *            identifier is related to the contact starting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest withRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Tasks can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during task creation.
     * </p>
     *
     * @return <p>
     *         A formatted URL that is shown to an agent in the Contact Control
     *         Panel (CCP). Tasks can have the following reference types at the
     *         time of creation: <code>URL</code> | <code>NUMBER</code> |
     *         <code>STRING</code> | <code>DATE</code> | <code>EMAIL</code>.
     *         <code>ATTACHMENT</code> is not a supported reference type during
     *         task creation.
     *         </p>
     */
    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Tasks can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during task creation.
     * </p>
     *
     * @param references <p>
     *            A formatted URL that is shown to an agent in the Contact
     *            Control Panel (CCP). Tasks can have the following reference
     *            types at the time of creation: <code>URL</code> |
     *            <code>NUMBER</code> | <code>STRING</code> | <code>DATE</code>
     *            | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     *            supported reference type during task creation.
     *            </p>
     */
    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Tasks can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during task creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param references <p>
     *            A formatted URL that is shown to an agent in the Contact
     *            Control Panel (CCP). Tasks can have the following reference
     *            types at the time of creation: <code>URL</code> |
     *            <code>NUMBER</code> | <code>STRING</code> | <code>DATE</code>
     *            | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     *            supported reference type during task creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest withReferences(java.util.Map<String, Reference> references) {
        this.references = references;
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Tasks can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during task creation.
     * </p>
     * <p>
     * The method adds a new key-value pair into References parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into References.
     * @param value The corresponding value of the entry to be added into
     *            References.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest addReferencesEntry(String key, Reference value) {
        if (null == this.references) {
            this.references = new java.util.HashMap<String, Reference>();
        }
        if (this.references.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.references.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into References.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StartWebRTCContactRequest clearReferencesEntries() {
        this.references = null;
        return this;
    }

    /**
     * <p>
     * A description of the task that is shown to an agent in the Contact
     * Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>
     *         A description of the task that is shown to an agent in the
     *         Contact Control Panel (CCP).
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the task that is shown to an agent in the Contact
     * Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            A description of the task that is shown to an agent in the
     *            Contact Control Panel (CCP).
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the task that is shown to an agent in the Contact
     * Control Panel (CCP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            A description of the task that is shown to an agent in the
     *            Contact Control Panel (CCP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartWebRTCContactRequest withDescription(String description) {
        this.description = description;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAllowedCapabilities() != null)
            sb.append("AllowedCapabilities: " + getAllowedCapabilities() + ",");
        if (getParticipantDetails() != null)
            sb.append("ParticipantDetails: " + getParticipantDetails() + ",");
        if (getRelatedContactId() != null)
            sb.append("RelatedContactId: " + getRelatedContactId() + ",");
        if (getReferences() != null)
            sb.append("References: " + getReferences() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedCapabilities() == null) ? 0 : getAllowedCapabilities().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantDetails() == null) ? 0 : getParticipantDetails().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedContactId() == null) ? 0 : getRelatedContactId().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartWebRTCContactRequest == false)
            return false;
        StartWebRTCContactRequest other = (StartWebRTCContactRequest) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null
                && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAllowedCapabilities() == null ^ this.getAllowedCapabilities() == null)
            return false;
        if (other.getAllowedCapabilities() != null
                && other.getAllowedCapabilities().equals(this.getAllowedCapabilities()) == false)
            return false;
        if (other.getParticipantDetails() == null ^ this.getParticipantDetails() == null)
            return false;
        if (other.getParticipantDetails() != null
                && other.getParticipantDetails().equals(this.getParticipantDetails()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null
                && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null
                && other.getReferences().equals(this.getReferences()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
