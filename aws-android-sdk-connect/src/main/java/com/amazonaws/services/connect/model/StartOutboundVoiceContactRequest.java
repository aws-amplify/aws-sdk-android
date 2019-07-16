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
 * The <code>StartOutboundVoiceContact</code> operation initiates a contact flow
 * to place an outbound call to a customer.
 * </p>
 * <p>
 * If you are using an IAM account, it must have permission to the
 * <code>connect:StartOutboundVoiceContact</code> action.
 * </p>
 * <p>
 * There is a 60 second dialing timeout for this operation. If the call is not
 * connected after 60 seconds, the call fails.
 * </p>
 */
public class StartOutboundVoiceContactRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The phone number of the customer in E.164 format.
     * </p>
     */
    private String destinationPhoneNumber;

    /**
     * <p>
     * The identifier for the contact flow to connect the outbound call to.
     * </p>
     * <p>
     * To find the <code>ContactFlowId</code>, open the contact flow you want to
     * use in the Amazon Connect contact flow editor. The ID for the contact
     * flow is displayed in the address bar as part of the URL. For example, the
     * contact flow ID is the set of characters at the end of the URL, after
     * 'contact-flow/' such as <code>78ea8fd5-2659-4f2b-b528-699760ccfc1b</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String contactFlowId;

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
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
     * If a contact is already started, the contact ID is returned. If the
     * contact is disconnected, a new contact is started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The phone number, in E.164 format, associated with your Amazon Connect
     * instance to use for the outbound call.
     * </p>
     */
    private String sourcePhoneNumber;

    /**
     * <p>
     * The queue to add the call to. If you specify a queue, the phone displayed
     * for caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue used will be the queue defined in the contact
     * flow.
     * </p>
     * <p>
     * To find the <code>QueueId</code>, open the queue you want to use in the
     * Amazon Connect Queue editor. The ID for the queue is displayed in the
     * address bar as part of the URL. For example, the queue ID is the set of
     * characters at the end of the URL, after 'queue/' such as
     * <code>queue/aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * For example, if you want play a greeting when the customer answers the
     * call, you can pass the customer name in attributes similar to the
     * following:
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The phone number of the customer in E.164 format.
     * </p>
     *
     * @return <p>
     *         The phone number of the customer in E.164 format.
     *         </p>
     */
    public String getDestinationPhoneNumber() {
        return destinationPhoneNumber;
    }

    /**
     * <p>
     * The phone number of the customer in E.164 format.
     * </p>
     *
     * @param destinationPhoneNumber <p>
     *            The phone number of the customer in E.164 format.
     *            </p>
     */
    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    /**
     * <p>
     * The phone number of the customer in E.164 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPhoneNumber <p>
     *            The phone number of the customer in E.164 format.
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
     * The identifier for the contact flow to connect the outbound call to.
     * </p>
     * <p>
     * To find the <code>ContactFlowId</code>, open the contact flow you want to
     * use in the Amazon Connect contact flow editor. The ID for the contact
     * flow is displayed in the address bar as part of the URL. For example, the
     * contact flow ID is the set of characters at the end of the URL, after
     * 'contact-flow/' such as <code>78ea8fd5-2659-4f2b-b528-699760ccfc1b</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier for the contact flow to connect the outbound call
     *         to.
     *         </p>
     *         <p>
     *         To find the <code>ContactFlowId</code>, open the contact flow you
     *         want to use in the Amazon Connect contact flow editor. The ID for
     *         the contact flow is displayed in the address bar as part of the
     *         URL. For example, the contact flow ID is the set of characters at
     *         the end of the URL, after 'contact-flow/' such as
     *         <code>78ea8fd5-2659-4f2b-b528-699760ccfc1b</code>.
     *         </p>
     */
    public String getContactFlowId() {
        return contactFlowId;
    }

    /**
     * <p>
     * The identifier for the contact flow to connect the outbound call to.
     * </p>
     * <p>
     * To find the <code>ContactFlowId</code>, open the contact flow you want to
     * use in the Amazon Connect contact flow editor. The ID for the contact
     * flow is displayed in the address bar as part of the URL. For example, the
     * contact flow ID is the set of characters at the end of the URL, after
     * 'contact-flow/' such as <code>78ea8fd5-2659-4f2b-b528-699760ccfc1b</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier for the contact flow to connect the outbound
     *            call to.
     *            </p>
     *            <p>
     *            To find the <code>ContactFlowId</code>, open the contact flow
     *            you want to use in the Amazon Connect contact flow editor. The
     *            ID for the contact flow is displayed in the address bar as
     *            part of the URL. For example, the contact flow ID is the set
     *            of characters at the end of the URL, after 'contact-flow/'
     *            such as <code>78ea8fd5-2659-4f2b-b528-699760ccfc1b</code>.
     *            </p>
     */
    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier for the contact flow to connect the outbound call to.
     * </p>
     * <p>
     * To find the <code>ContactFlowId</code>, open the contact flow you want to
     * use in the Amazon Connect contact flow editor. The ID for the contact
     * flow is displayed in the address bar as part of the URL. For example, the
     * contact flow ID is the set of characters at the end of the URL, after
     * 'contact-flow/' such as <code>78ea8fd5-2659-4f2b-b528-699760ccfc1b</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier for the contact flow to connect the outbound
     *            call to.
     *            </p>
     *            <p>
     *            To find the <code>ContactFlowId</code>, open the contact flow
     *            you want to use in the Amazon Connect contact flow editor. The
     *            ID for the contact flow is displayed in the address bar as
     *            part of the URL. For example, the contact flow ID is the set
     *            of characters at the end of the URL, after 'contact-flow/'
     *            such as <code>78ea8fd5-2659-4f2b-b528-699760ccfc1b</code>.
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
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier for your Amazon Connect instance. To find the ID
     *         of your instance, open the AWS console and select Amazon Connect.
     *         Select the alias of the instance in the Instance alias column.
     *         The instance ID is displayed in the Overview section of your
     *         instance settings. For example, the instance ID is the set of
     *         characters at the end of the instance ARN, after instance/, such
     *         as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
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
     * If a contact is already started, the contact ID is returned. If the
     * contact is disconnected, a new contact is started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. The token is valid for 7 days
     *         after creation. If a contact is already started, the contact ID
     *         is returned. If the contact is disconnected, a new contact is
     *         started.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. The token is valid for 7 days after creation.
     * If a contact is already started, the contact ID is returned. If the
     * contact is disconnected, a new contact is started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. The token is valid for 7 days
     *            after creation. If a contact is already started, the contact
     *            ID is returned. If the contact is disconnected, a new contact
     *            is started.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. The token is valid for 7 days after creation.
     * If a contact is already started, the contact ID is returned. If the
     * contact is disconnected, a new contact is started.
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
     *            ID is returned. If the contact is disconnected, a new contact
     *            is started.
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
     * The phone number, in E.164 format, associated with your Amazon Connect
     * instance to use for the outbound call.
     * </p>
     *
     * @return <p>
     *         The phone number, in E.164 format, associated with your Amazon
     *         Connect instance to use for the outbound call.
     *         </p>
     */
    public String getSourcePhoneNumber() {
        return sourcePhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format, associated with your Amazon Connect
     * instance to use for the outbound call.
     * </p>
     *
     * @param sourcePhoneNumber <p>
     *            The phone number, in E.164 format, associated with your Amazon
     *            Connect instance to use for the outbound call.
     *            </p>
     */
    public void setSourcePhoneNumber(String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format, associated with your Amazon Connect
     * instance to use for the outbound call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePhoneNumber <p>
     *            The phone number, in E.164 format, associated with your Amazon
     *            Connect instance to use for the outbound call.
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
     * The queue to add the call to. If you specify a queue, the phone displayed
     * for caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue used will be the queue defined in the contact
     * flow.
     * </p>
     * <p>
     * To find the <code>QueueId</code>, open the queue you want to use in the
     * Amazon Connect Queue editor. The ID for the queue is displayed in the
     * address bar as part of the URL. For example, the queue ID is the set of
     * characters at the end of the URL, after 'queue/' such as
     * <code>queue/aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * </p>
     *
     * @return <p>
     *         The queue to add the call to. If you specify a queue, the phone
     *         displayed for caller ID is the phone number specified in the
     *         queue. If you do not specify a queue, the queue used will be the
     *         queue defined in the contact flow.
     *         </p>
     *         <p>
     *         To find the <code>QueueId</code>, open the queue you want to use
     *         in the Amazon Connect Queue editor. The ID for the queue is
     *         displayed in the address bar as part of the URL. For example, the
     *         queue ID is the set of characters at the end of the URL, after
     *         'queue/' such as
     *         <code>queue/aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The queue to add the call to. If you specify a queue, the phone displayed
     * for caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue used will be the queue defined in the contact
     * flow.
     * </p>
     * <p>
     * To find the <code>QueueId</code>, open the queue you want to use in the
     * Amazon Connect Queue editor. The ID for the queue is displayed in the
     * address bar as part of the URL. For example, the queue ID is the set of
     * characters at the end of the URL, after 'queue/' such as
     * <code>queue/aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * </p>
     *
     * @param queueId <p>
     *            The queue to add the call to. If you specify a queue, the
     *            phone displayed for caller ID is the phone number specified in
     *            the queue. If you do not specify a queue, the queue used will
     *            be the queue defined in the contact flow.
     *            </p>
     *            <p>
     *            To find the <code>QueueId</code>, open the queue you want to
     *            use in the Amazon Connect Queue editor. The ID for the queue
     *            is displayed in the address bar as part of the URL. For
     *            example, the queue ID is the set of characters at the end of
     *            the URL, after 'queue/' such as
     *            <code>queue/aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue to add the call to. If you specify a queue, the phone displayed
     * for caller ID is the phone number specified in the queue. If you do not
     * specify a queue, the queue used will be the queue defined in the contact
     * flow.
     * </p>
     * <p>
     * To find the <code>QueueId</code>, open the queue you want to use in the
     * Amazon Connect Queue editor. The ID for the queue is displayed in the
     * address bar as part of the URL. For example, the queue ID is the set of
     * characters at the end of the URL, after 'queue/' such as
     * <code>queue/aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The queue to add the call to. If you specify a queue, the
     *            phone displayed for caller ID is the phone number specified in
     *            the queue. If you do not specify a queue, the queue used will
     *            be the queue defined in the contact flow.
     *            </p>
     *            <p>
     *            To find the <code>QueueId</code>, open the queue you want to
     *            use in the Amazon Connect Queue editor. The ID for the queue
     *            is displayed in the address bar as part of the URL. For
     *            example, the queue ID is the set of characters at the end of
     *            the URL, after 'queue/' such as
     *            <code>queue/aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
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
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * For example, if you want play a greeting when the customer answers the
     * call, you can pass the customer name in attributes similar to the
     * following:
     * </p>
     *
     * @return <p>
     *         Specify a custom key-value pair using an attribute map. The
     *         attributes are standard Amazon Connect attributes, and can be
     *         accessed in contact flows just like any other contact attributes.
     *         </p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs
     *         per contact. Attribute keys can include only alphanumeric, dash,
     *         and underscore characters.
     *         </p>
     *         <p>
     *         For example, if you want play a greeting when the customer
     *         answers the call, you can pass the customer name in attributes
     *         similar to the following:
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * For example, if you want play a greeting when the customer answers the
     * call, you can pass the customer name in attributes similar to the
     * following:
     * </p>
     *
     * @param attributes <p>
     *            Specify a custom key-value pair using an attribute map. The
     *            attributes are standard Amazon Connect attributes, and can be
     *            accessed in contact flows just like any other contact
     *            attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
     *            </p>
     *            <p>
     *            For example, if you want play a greeting when the customer
     *            answers the call, you can pass the customer name in attributes
     *            similar to the following:
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * For example, if you want play a greeting when the customer answers the
     * call, you can pass the customer name in attributes similar to the
     * following:
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            Specify a custom key-value pair using an attribute map. The
     *            attributes are standard Amazon Connect attributes, and can be
     *            accessed in contact flows just like any other contact
     *            attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
     *            </p>
     *            <p>
     *            For example, if you want play a greeting when the customer
     *            answers the call, you can pass the customer name in attributes
     *            similar to the following:
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
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * For example, if you want play a greeting when the customer answers the
     * call, you can pass the customer name in attributes similar to the
     * following:
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
