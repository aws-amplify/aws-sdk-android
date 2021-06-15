/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Places an outbound call to a contact, and then initiates the contact flow. It
 * performs the actions in the contact flow that's specified (in
 * <code>ContactFlowId</code>).
 * </p>
 * <p>
 * Agents do not initiate the outbound API, which means that they do not dial
 * the contact. If the contact flow places an outbound call to a contact, and
 * then puts the contact in queue, the call is then routed to the agent, like
 * any other inbound case.
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
 * </note>
 */
public class StartOutboundVoiceContactRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The phone number of the customer, in E.164 format.
     * </p>
     */
    private String destinationPhoneNumber;

    /**
     * <p>
     * The identifier of the contact flow for the outbound call. To see the
     * ContactFlowId in the Amazon Connect console user interface, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     * contact flow. On the contact flow page, under the name of the contact
     * flow, choose <b>Show additional flow information</b>. The ContactFlowId
     * is the last part of the ARN, shown here in bold:
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
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. The token is valid for 7 days after creation.
     * If a contact is already started, the contact ID is returned.
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
     */
    private String sourcePhoneNumber;

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for
     * caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue defined in the contact flow is used. If you do
     * not specify a queue, you must specify a source phone number.
     * </p>
     */
    private String queueId;

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
     * The phone number of the customer, in E.164 format.
     * </p>
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
     * The identifier of the contact flow for the outbound call. To see the
     * ContactFlowId in the Amazon Connect console user interface, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     * contact flow. On the contact flow page, under the name of the contact
     * flow, choose <b>Show additional flow information</b>. The ContactFlowId
     * is the last part of the ARN, shown here in bold:
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
     *         The identifier of the contact flow for the outbound call. To see
     *         the ContactFlowId in the Amazon Connect console user interface,
     *         on the navigation menu go to <b>Routing</b>, <b>Contact
     *         Flows</b>. Choose the contact flow. On the contact flow page,
     *         under the name of the contact flow, choose <b>Show additional
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
     * The identifier of the contact flow for the outbound call. To see the
     * ContactFlowId in the Amazon Connect console user interface, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     * contact flow. On the contact flow page, under the name of the contact
     * flow, choose <b>Show additional flow information</b>. The ContactFlowId
     * is the last part of the ARN, shown here in bold:
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
     *            The identifier of the contact flow for the outbound call. To
     *            see the ContactFlowId in the Amazon Connect console user
     *            interface, on the navigation menu go to <b>Routing</b>,
     *            <b>Contact Flows</b>. Choose the contact flow. On the contact
     *            flow page, under the name of the contact flow, choose <b>Show
     *            additional flow information</b>. The ContactFlowId is the last
     *            part of the ARN, shown here in bold:
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
     * The identifier of the contact flow for the outbound call. To see the
     * ContactFlowId in the Amazon Connect console user interface, on the
     * navigation menu go to <b>Routing</b>, <b>Contact Flows</b>. Choose the
     * contact flow. On the contact flow page, under the name of the contact
     * flow, choose <b>Show additional flow information</b>. The ContactFlowId
     * is the last part of the ARN, shown here in bold:
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
     *            The identifier of the contact flow for the outbound call. To
     *            see the ContactFlowId in the Amazon Connect console user
     *            interface, on the navigation menu go to <b>Routing</b>,
     *            <b>Contact Flows</b>. Choose the contact flow. On the contact
     *            flow page, under the name of the contact flow, choose <b>Show
     *            additional flow information</b>. The ContactFlowId is the last
     *            part of the ARN, shown here in bold:
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
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
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
     * idempotency of the request. The token is valid for 7 days after creation.
     * If a contact is already started, the contact ID is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. The token is valid for 7 days
     *         after creation. If a contact is already started, the contact ID
     *         is returned.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. The token is valid for 7 days after creation.
     * If a contact is already started, the contact ID is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. The token is valid for 7 days
     *            after creation. If a contact is already started, the contact
     *            ID is returned.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. The token is valid for 7 days after creation.
     * If a contact is already started, the contact ID is returned.
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
     *            the idempotency of the request. The token is valid for 7 days
     *            after creation. If a contact is already started, the contact
     *            ID is returned.
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
     * specify a queue, the queue defined in the contact flow is used. If you do
     * not specify a queue, you must specify a source phone number.
     * </p>
     *
     * @return <p>
     *         The queue for the call. If you specify a queue, the phone
     *         displayed for caller ID is the phone number specified in the
     *         queue. If you do not specify a queue, the queue defined in the
     *         contact flow is used. If you do not specify a queue, you must
     *         specify a source phone number.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for
     * caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue defined in the contact flow is used. If you do
     * not specify a queue, you must specify a source phone number.
     * </p>
     *
     * @param queueId <p>
     *            The queue for the call. If you specify a queue, the phone
     *            displayed for caller ID is the phone number specified in the
     *            queue. If you do not specify a queue, the queue defined in the
     *            contact flow is used. If you do not specify a queue, you must
     *            specify a source phone number.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue for the call. If you specify a queue, the phone displayed for
     * caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue defined in the contact flow is used. If you do
     * not specify a queue, you must specify a source phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The queue for the call. If you specify a queue, the phone
     *            displayed for caller ID is the phone number specified in the
     *            queue. If you do not specify a queue, the queue defined in the
     *            contact flow is used. If you do not specify a queue, you must
     *            specify a source phone number.
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
    public StartOutboundVoiceContactRequest withAttributes(java.util.Map<String, String> attributes) {
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
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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
        return true;
    }
}
