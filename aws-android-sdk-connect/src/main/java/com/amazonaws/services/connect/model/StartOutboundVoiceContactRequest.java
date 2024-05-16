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
 * Places an outbound call to a contact, and then initiates the flow. It
 * performs the actions in the flow that's specified (in
 * <code>ContactFlowId</code>).
 * </p>
 * <p>
 * Agents do not initiate the outbound API, which means that they do not dial
 * the contact. If the flow places an outbound call to a contact, and then puts
 * the contact in queue, the call is then routed to the agent, like any other
 * inbound case.
 * </p>
 * <p>
 * There is a 60-second dialing timeout for this operation. If the call is not
 * connected after 60 seconds, it fails.
 * </p>
 * <note>
 * <p>
 * UK numbers with a 447 prefix are not allowed by default. Before you can dial
 * these UK mobile numbers, you must submit a service quota increase request.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
 * >Amazon Connect Service Quotas</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 * </note> <note>
 * <p>
 * Campaign calls are not allowed by default. Before you can make a call with
 * <code>TrafficType</code> = <code>CAMPAIGN</code>, you must submit a service
 * quota increase request to the quota <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
 * >Amazon Connect campaigns</a>.
 * </p>
 * </note>
 */
public class StartOutboundVoiceContactRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of a voice contact that is shown to an agent in the Contact
     * Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the voice contact that is shown to an agent in the
     * Contact Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String description;

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Contacts can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during voice contact creation.
     * </p>
     */
    private java.util.Map<String, Reference> references;

    /**
     * <p>
     * The <code>contactId</code> that is related to this contact. Linking
     * voice, task, or chat by using <code>RelatedContactID</code> copies over
     * contact attributes from the related contact to the new contact. All
     * updates to user-defined attributes in the new contact are limited to the
     * individual contact ID. There are no limits to the number of contacts that
     * can be linked by using <code>RelatedContactId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String relatedContactId;

    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     */
    private String destinationPhoneNumber;

    /**
     * <p>
     * The identifier of the flow for the outbound call. To see the
     * ContactFlowId in the Amazon Connect admin website, on the navigation menu
     * go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow
     * page, under the name of the flow, choose <b>Show additional flow
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
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>. The token is valid for 7
     * days after creation. If a contact is already started, the contact ID is
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The phone number associated with the Amazon Connect instance, in E.164
     * format. If you do not specify a source phone number, you must specify a
     * queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     */
    private String sourcePhoneNumber;

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for
     * caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue defined in the flow is used. If you do not
     * specify a queue, you must specify a source phone number.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * A custom key-value pair using an attribute map. The attributes are
     * standard Amazon Connect attributes, and can be accessed in flows just
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
     * Configuration of the answering machine detection for this outbound call.
     * </p>
     */
    private AnswerMachineDetectionConfig answerMachineDetectionConfig;

    /**
     * <p>
     * The campaign identifier of the outbound communication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String campaignId;

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are
     * handled differently by Amazon Connect. The default value is
     * <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     * <code>EnableAnswerMachineDetection</code> is set to <code>true</code>.
     * For all other cases, use <code>GENERAL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERAL, CAMPAIGN
     */
    private String trafficType;

    /**
     * <p>
     * The name of a voice contact that is shown to an agent in the Contact
     * Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return <p>
     *         The name of a voice contact that is shown to an agent in the
     *         Contact Control Panel (CCP).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a voice contact that is shown to an agent in the Contact
     * Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name <p>
     *            The name of a voice contact that is shown to an agent in the
     *            Contact Control Panel (CCP).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a voice contact that is shown to an agent in the Contact
     * Control Panel (CCP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name <p>
     *            The name of a voice contact that is shown to an agent in the
     *            Contact Control Panel (CCP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the voice contact that is shown to an agent in the
     * Contact Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>
     *         A description of the voice contact that is shown to an agent in
     *         the Contact Control Panel (CCP).
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the voice contact that is shown to an agent in the
     * Contact Control Panel (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            A description of the voice contact that is shown to an agent
     *            in the Contact Control Panel (CCP).
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the voice contact that is shown to an agent in the
     * Contact Control Panel (CCP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param description <p>
     *            A description of the voice contact that is shown to an agent
     *            in the Contact Control Panel (CCP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Contacts can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during voice contact creation.
     * </p>
     *
     * @return <p>
     *         A formatted URL that is shown to an agent in the Contact Control
     *         Panel (CCP). Contacts can have the following reference types at
     *         the time of creation: <code>URL</code> | <code>NUMBER</code> |
     *         <code>STRING</code> | <code>DATE</code> | <code>EMAIL</code>.
     *         <code>ATTACHMENT</code> is not a supported reference type during
     *         voice contact creation.
     *         </p>
     */
    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Contacts can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during voice contact creation.
     * </p>
     *
     * @param references <p>
     *            A formatted URL that is shown to an agent in the Contact
     *            Control Panel (CCP). Contacts can have the following reference
     *            types at the time of creation: <code>URL</code> |
     *            <code>NUMBER</code> | <code>STRING</code> | <code>DATE</code>
     *            | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     *            supported reference type during voice contact creation.
     *            </p>
     */
    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Contacts can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during voice contact creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param references <p>
     *            A formatted URL that is shown to an agent in the Contact
     *            Control Panel (CCP). Contacts can have the following reference
     *            types at the time of creation: <code>URL</code> |
     *            <code>NUMBER</code> | <code>STRING</code> | <code>DATE</code>
     *            | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     *            supported reference type during voice contact creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withReferences(
            java.util.Map<String, Reference> references) {
        this.references = references;
        return this;
    }

    /**
     * <p>
     * A formatted URL that is shown to an agent in the Contact Control Panel
     * (CCP). Contacts can have the following reference types at the time of
     * creation: <code>URL</code> | <code>NUMBER</code> | <code>STRING</code> |
     * <code>DATE</code> | <code>EMAIL</code>. <code>ATTACHMENT</code> is not a
     * supported reference type during voice contact creation.
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
    public StartOutboundVoiceContactRequest addReferencesEntry(String key, Reference value) {
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
    public StartOutboundVoiceContactRequest clearReferencesEntries() {
        this.references = null;
        return this;
    }

    /**
     * <p>
     * The <code>contactId</code> that is related to this contact. Linking
     * voice, task, or chat by using <code>RelatedContactID</code> copies over
     * contact attributes from the related contact to the new contact. All
     * updates to user-defined attributes in the new contact are limited to the
     * individual contact ID. There are no limits to the number of contacts that
     * can be linked by using <code>RelatedContactId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The <code>contactId</code> that is related to this contact.
     *         Linking voice, task, or chat by using
     *         <code>RelatedContactID</code> copies over contact attributes from
     *         the related contact to the new contact. All updates to
     *         user-defined attributes in the new contact are limited to the
     *         individual contact ID. There are no limits to the number of
     *         contacts that can be linked by using
     *         <code>RelatedContactId</code>.
     *         </p>
     */
    public String getRelatedContactId() {
        return relatedContactId;
    }

    /**
     * <p>
     * The <code>contactId</code> that is related to this contact. Linking
     * voice, task, or chat by using <code>RelatedContactID</code> copies over
     * contact attributes from the related contact to the new contact. All
     * updates to user-defined attributes in the new contact are limited to the
     * individual contact ID. There are no limits to the number of contacts that
     * can be linked by using <code>RelatedContactId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The <code>contactId</code> that is related to this contact.
     *            Linking voice, task, or chat by using
     *            <code>RelatedContactID</code> copies over contact attributes
     *            from the related contact to the new contact. All updates to
     *            user-defined attributes in the new contact are limited to the
     *            individual contact ID. There are no limits to the number of
     *            contacts that can be linked by using
     *            <code>RelatedContactId</code>.
     *            </p>
     */
    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The <code>contactId</code> that is related to this contact. Linking
     * voice, task, or chat by using <code>RelatedContactID</code> copies over
     * contact attributes from the related contact to the new contact. All
     * updates to user-defined attributes in the new contact are limited to the
     * individual contact ID. There are no limits to the number of contacts that
     * can be linked by using <code>RelatedContactId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The <code>contactId</code> that is related to this contact.
     *            Linking voice, task, or chat by using
     *            <code>RelatedContactID</code> copies over contact attributes
     *            from the related contact to the new contact. All updates to
     *            user-defined attributes in the new contact are limited to the
     *            individual contact ID. There are no limits to the number of
     *            contacts that can be linked by using
     *            <code>RelatedContactId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
        return this;
    }

    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @return <p>
     *         The phone number of the customer, in E.164 format.
     *         </p>
     */
    public String getDestinationPhoneNumber() {
        return destinationPhoneNumber;
    }

    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @param destinationPhoneNumber <p>
     *            The phone number of the customer, in E.164 format.
     *            </p>
     */
    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @param destinationPhoneNumber <p>
     *            The phone number of the customer, in E.164 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow for the outbound call. To see the
     * ContactFlowId in the Amazon Connect admin website, on the navigation menu
     * go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow
     * page, under the name of the flow, choose <b>Show additional flow
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
     *         The identifier of the flow for the outbound call. To see the
     *         ContactFlowId in the Amazon Connect admin website, on the
     *         navigation menu go to <b>Routing</b>, <b>Contact Flows</b>.
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
     * The identifier of the flow for the outbound call. To see the
     * ContactFlowId in the Amazon Connect admin website, on the navigation menu
     * go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow
     * page, under the name of the flow, choose <b>Show additional flow
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
     *            The identifier of the flow for the outbound call. To see the
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
     * The identifier of the flow for the outbound call. To see the
     * ContactFlowId in the Amazon Connect admin website, on the navigation menu
     * go to <b>Routing</b>, <b>Contact Flows</b>. Choose the flow. On the flow
     * page, under the name of the flow, choose <b>Show additional flow
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
     *            The identifier of the flow for the outbound call. To see the
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
    public StartOutboundVoiceContactRequest withContactFlowId(String contactFlowId) {
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
    public StartOutboundVoiceContactRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>. The token is valid for 7
     * days after creation. If a contact is already started, the contact ID is
     * returned.
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
     *         >Making retries safe with idempotent APIs</a>. The token is valid
     *         for 7 days after creation. If a contact is already started, the
     *         contact ID is returned.
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
     * >Making retries safe with idempotent APIs</a>. The token is valid for 7
     * days after creation. If a contact is already started, the contact ID is
     * returned.
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
     *            >Making retries safe with idempotent APIs</a>. The token is
     *            valid for 7 days after creation. If a contact is already
     *            started, the contact ID is returned.
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
     * >Making retries safe with idempotent APIs</a>. The token is valid for 7
     * days after creation. If a contact is already started, the contact ID is
     * returned.
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
     *            >Making retries safe with idempotent APIs</a>. The token is
     *            valid for 7 days after creation. If a contact is already
     *            started, the contact ID is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The phone number associated with the Amazon Connect instance, in E.164
     * format. If you do not specify a source phone number, you must specify a
     * queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @return <p>
     *         The phone number associated with the Amazon Connect instance, in
     *         E.164 format. If you do not specify a source phone number, you
     *         must specify a queue.
     *         </p>
     */
    public String getSourcePhoneNumber() {
        return sourcePhoneNumber;
    }

    /**
     * <p>
     * The phone number associated with the Amazon Connect instance, in E.164
     * format. If you do not specify a source phone number, you must specify a
     * queue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @param sourcePhoneNumber <p>
     *            The phone number associated with the Amazon Connect instance,
     *            in E.164 format. If you do not specify a source phone number,
     *            you must specify a queue.
     *            </p>
     */
    public void setSourcePhoneNumber(String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
    }

    /**
     * <p>
     * The phone number associated with the Amazon Connect instance, in E.164
     * format. If you do not specify a source phone number, you must specify a
     * queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\\+[1-9]\\d{1,14}$<br/>
     *
     * @param sourcePhoneNumber <p>
     *            The phone number associated with the Amazon Connect instance,
     *            in E.164 format. If you do not specify a source phone number,
     *            you must specify a queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withSourcePhoneNumber(String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
        return this;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for
     * caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue defined in the flow is used. If you do not
     * specify a queue, you must specify a source phone number.
     * </p>
     *
     * @return <p>
     *         The queue for the call. If you specify a queue, the phone
     *         displayed for caller ID is the phone number specified in the
     *         queue. If you do not specify a queue, the queue defined in the
     *         flow is used. If you do not specify a queue, you must specify a
     *         source phone number.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for
     * caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue defined in the flow is used. If you do not
     * specify a queue, you must specify a source phone number.
     * </p>
     *
     * @param queueId <p>
     *            The queue for the call. If you specify a queue, the phone
     *            displayed for caller ID is the phone number specified in the
     *            queue. If you do not specify a queue, the queue defined in the
     *            flow is used. If you do not specify a queue, you must specify
     *            a source phone number.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for
     * caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue defined in the flow is used. If you do not
     * specify a queue, you must specify a source phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The queue for the call. If you specify a queue, the phone
     *            displayed for caller ID is the phone number specified in the
     *            queue. If you do not specify a queue, the queue defined in the
     *            flow is used. If you do not specify a queue, you must specify
     *            a source phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withQueueId(String queueId) {
        this.queueId = queueId;
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
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @return <p>
     *         A custom key-value pair using an attribute map. The attributes
     *         are standard Amazon Connect attributes, and can be accessed in
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
     * standard Amazon Connect attributes, and can be accessed in flows just
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
     *            are standard Amazon Connect attributes, and can be accessed in
     *            flows just like any other contact attributes.
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
     * standard Amazon Connect attributes, and can be accessed in flows just
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
     *            are standard Amazon Connect attributes, and can be accessed in
     *            flows just like any other contact attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withAttributes(java.util.Map<String, String> attributes) {
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
    public StartOutboundVoiceContactRequest addAttributesEntry(String key, String value) {
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
    public StartOutboundVoiceContactRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Configuration of the answering machine detection for this outbound call.
     * </p>
     *
     * @return <p>
     *         Configuration of the answering machine detection for this
     *         outbound call.
     *         </p>
     */
    public AnswerMachineDetectionConfig getAnswerMachineDetectionConfig() {
        return answerMachineDetectionConfig;
    }

    /**
     * <p>
     * Configuration of the answering machine detection for this outbound call.
     * </p>
     *
     * @param answerMachineDetectionConfig <p>
     *            Configuration of the answering machine detection for this
     *            outbound call.
     *            </p>
     */
    public void setAnswerMachineDetectionConfig(
            AnswerMachineDetectionConfig answerMachineDetectionConfig) {
        this.answerMachineDetectionConfig = answerMachineDetectionConfig;
    }

    /**
     * <p>
     * Configuration of the answering machine detection for this outbound call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param answerMachineDetectionConfig <p>
     *            Configuration of the answering machine detection for this
     *            outbound call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withAnswerMachineDetectionConfig(
            AnswerMachineDetectionConfig answerMachineDetectionConfig) {
        this.answerMachineDetectionConfig = answerMachineDetectionConfig;
        return this;
    }

    /**
     * <p>
     * The campaign identifier of the outbound communication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The campaign identifier of the outbound communication.
     *         </p>
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * <p>
     * The campaign identifier of the outbound communication.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param campaignId <p>
     *            The campaign identifier of the outbound communication.
     *            </p>
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The campaign identifier of the outbound communication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param campaignId <p>
     *            The campaign identifier of the outbound communication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOutboundVoiceContactRequest withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are
     * handled differently by Amazon Connect. The default value is
     * <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     * <code>EnableAnswerMachineDetection</code> is set to <code>true</code>.
     * For all other cases, use <code>GENERAL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERAL, CAMPAIGN
     *
     * @return <p>
     *         Denotes the class of traffic. Calls with different traffic types
     *         are handled differently by Amazon Connect. The default value is
     *         <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *         <code>EnableAnswerMachineDetection</code> is set to
     *         <code>true</code>. For all other cases, use <code>GENERAL</code>.
     *         </p>
     * @see TrafficType
     */
    public String getTrafficType() {
        return trafficType;
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are
     * handled differently by Amazon Connect. The default value is
     * <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     * <code>EnableAnswerMachineDetection</code> is set to <code>true</code>.
     * For all other cases, use <code>GENERAL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERAL, CAMPAIGN
     *
     * @param trafficType <p>
     *            Denotes the class of traffic. Calls with different traffic
     *            types are handled differently by Amazon Connect. The default
     *            value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *            <code>EnableAnswerMachineDetection</code> is set to
     *            <code>true</code>. For all other cases, use
     *            <code>GENERAL</code>.
     *            </p>
     * @see TrafficType
     */
    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are
     * handled differently by Amazon Connect. The default value is
     * <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     * <code>EnableAnswerMachineDetection</code> is set to <code>true</code>.
     * For all other cases, use <code>GENERAL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERAL, CAMPAIGN
     *
     * @param trafficType <p>
     *            Denotes the class of traffic. Calls with different traffic
     *            types are handled differently by Amazon Connect. The default
     *            value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *            <code>EnableAnswerMachineDetection</code> is set to
     *            <code>true</code>. For all other cases, use
     *            <code>GENERAL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficType
     */
    public StartOutboundVoiceContactRequest withTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are
     * handled differently by Amazon Connect. The default value is
     * <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     * <code>EnableAnswerMachineDetection</code> is set to <code>true</code>.
     * For all other cases, use <code>GENERAL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERAL, CAMPAIGN
     *
     * @param trafficType <p>
     *            Denotes the class of traffic. Calls with different traffic
     *            types are handled differently by Amazon Connect. The default
     *            value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *            <code>EnableAnswerMachineDetection</code> is set to
     *            <code>true</code>. For all other cases, use
     *            <code>GENERAL</code>.
     *            </p>
     * @see TrafficType
     */
    public void setTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
    }

    /**
     * <p>
     * Denotes the class of traffic. Calls with different traffic types are
     * handled differently by Amazon Connect. The default value is
     * <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     * <code>EnableAnswerMachineDetection</code> is set to <code>true</code>.
     * For all other cases, use <code>GENERAL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GENERAL, CAMPAIGN
     *
     * @param trafficType <p>
     *            Denotes the class of traffic. Calls with different traffic
     *            types are handled differently by Amazon Connect. The default
     *            value is <code>GENERAL</code>. Use <code>CAMPAIGN</code> if
     *            <code>EnableAnswerMachineDetection</code> is set to
     *            <code>true</code>. For all other cases, use
     *            <code>GENERAL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrafficType
     */
    public StartOutboundVoiceContactRequest withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getReferences() != null)
            sb.append("References: " + getReferences() + ",");
        if (getRelatedContactId() != null)
            sb.append("RelatedContactId: " + getRelatedContactId() + ",");
        if (getDestinationPhoneNumber() != null)
            sb.append("DestinationPhoneNumber: " + getDestinationPhoneNumber() + ",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getSourcePhoneNumber() != null)
            sb.append("SourcePhoneNumber: " + getSourcePhoneNumber() + ",");
        if (getQueueId() != null)
            sb.append("QueueId: " + getQueueId() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getAnswerMachineDetectionConfig() != null)
            sb.append("AnswerMachineDetectionConfig: " + getAnswerMachineDetectionConfig() + ",");
        if (getCampaignId() != null)
            sb.append("CampaignId: " + getCampaignId() + ",");
        if (getTrafficType() != null)
            sb.append("TrafficType: " + getTrafficType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedContactId() == null) ? 0 : getRelatedContactId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationPhoneNumber() == null) ? 0 : getDestinationPhoneNumber()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getSourcePhoneNumber() == null) ? 0 : getSourcePhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getAnswerMachineDetectionConfig() == null) ? 0
                        : getAnswerMachineDetectionConfig().hashCode());
        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartOutboundVoiceContactRequest == false)
            return false;
        StartOutboundVoiceContactRequest other = (StartOutboundVoiceContactRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null
                && other.getReferences().equals(this.getReferences()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null
                && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        if (other.getDestinationPhoneNumber() == null ^ this.getDestinationPhoneNumber() == null)
            return false;
        if (other.getDestinationPhoneNumber() != null
                && other.getDestinationPhoneNumber().equals(this.getDestinationPhoneNumber()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSourcePhoneNumber() == null ^ this.getSourcePhoneNumber() == null)
            return false;
        if (other.getSourcePhoneNumber() != null
                && other.getSourcePhoneNumber().equals(this.getSourcePhoneNumber()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getAnswerMachineDetectionConfig() == null
                ^ this.getAnswerMachineDetectionConfig() == null)
            return false;
        if (other.getAnswerMachineDetectionConfig() != null
                && other.getAnswerMachineDetectionConfig().equals(
                        this.getAnswerMachineDetectionConfig()) == false)
            return false;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null
                && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getTrafficType() == null ^ this.getTrafficType() == null)
            return false;
        if (other.getTrafficType() != null
                && other.getTrafficType().equals(this.getTrafficType()) == false)
            return false;
        return true;
    }
}
