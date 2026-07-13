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
 * Initiates a flow to start a new task contact. For more information about task
 * contacts, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html"
 * >Concepts: Tasks in Amazon Connect</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 * <p>
 * When using <code>PreviousContactId</code> and <code>RelatedContactId</code>
 * input parameters, note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PreviousContactId</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Any updates to user-defined task contact attributes on any contact linked
 * through the same <code>PreviousContactId</code> will affect every contact in
 * the chain.
 * </p>
 * </li>
 * <li>
 * <p>
 * There can be a maximum of 12 linked task contacts in a chain. That is, 12
 * task contacts can be created that share the same
 * <code>PreviousContactId</code>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <code>RelatedContactId</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Copies contact attributes from the related task contact to the new contact.
 * </p>
 * </li>
 * <li>
 * <p>
 * Any update on attributes in a new task contact does not update attributes on
 * previous contact.
 * </p>
 * </li>
 * <li>
 * <p>
 * There’s no limit on the number of task contacts that can be created that use
 * the same <code>RelatedContactId</code>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * In addition, when calling StartTaskContact include only one of these
 * parameters: <code>ContactFlowID</code>, <code>QuickConnectID</code>, or
 * <code>TaskTemplateID</code>. Only one parameter is required as long as the
 * task template has a flow configured to run it. If more than one parameter is
 * specified, or only the <code>TaskTemplateID</code> is specified but it does
 * not have a flow configured, the request returns an error because Amazon
 * Connect cannot identify the unique flow to run when the task is created.
 * </p>
 * <p>
 * A <code>ServiceQuotaExceededException</code> occurs when the number of open
 * tasks exceeds the active tasks quota or there are already 12 tasks
 * referencing the same <code>PreviousContactId</code>. For more information
 * about service quotas for task contacts, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
 * >Amazon Connect service quotas</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 */
public class StartTaskContactRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The identifier of the previous chat, voice, or task contact. Any updates
     * to user-defined attributes to task contacts linked using the same
     * <code>PreviousContactID</code> will affect every contact in the chain.
     * There can be a maximum of 12 linked task contacts in a chain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String previousContactId;

    /**
     * <p>
     * The identifier of the flow for initiating the tasks. To see the
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
     * The name of a task that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String name;

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
     * The timestamp, in Unix Epoch seconds format, at which to start running
     * the inbound flow. The scheduled time cannot be in the past. It must be
     * within up to 6 days in future.
     * </p>
     */
    private java.util.Date scheduledTime;

    /**
     * <p>
     * A unique identifier for the task template. For more information about
     * task templates, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/task-templates.html"
     * >Create task templates</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String taskTemplateId;

    /**
     * <p>
     * The identifier for the quick connect. Tasks that are created by using
     * <code>QuickConnectId</code> will use the flow that is defined on agent or
     * queue quick connect. For more information about quick connects, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/quick-connects.html"
     * >Create quick connects</a>.
     * </p>
     */
    private String quickConnectId;

    /**
     * <p>
     * The contactId that is <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html#linked-tasks"
     * >related</a> to this contact. Linking tasks together by using
     * <code>RelatedContactID</code> copies over contact attributes from the
     * related task contact to the new task contact. All updates to user-defined
     * attributes in the new task contact are limited to the individual contact
     * ID, unlike what happens when tasks are linked by using
     * <code>PreviousContactID</code>. There are no limits to the number of
     * contacts that can be linked by using <code>RelatedContactId</code>.
     * </p>
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
    public StartTaskContactRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the previous chat, voice, or task contact. Any updates
     * to user-defined attributes to task contacts linked using the same
     * <code>PreviousContactID</code> will affect every contact in the chain.
     * There can be a maximum of 12 linked task contacts in a chain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the previous chat, voice, or task contact. Any
     *         updates to user-defined attributes to task contacts linked using
     *         the same <code>PreviousContactID</code> will affect every contact
     *         in the chain. There can be a maximum of 12 linked task contacts
     *         in a chain.
     *         </p>
     */
    public String getPreviousContactId() {
        return previousContactId;
    }

    /**
     * <p>
     * The identifier of the previous chat, voice, or task contact. Any updates
     * to user-defined attributes to task contacts linked using the same
     * <code>PreviousContactID</code> will affect every contact in the chain.
     * There can be a maximum of 12 linked task contacts in a chain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param previousContactId <p>
     *            The identifier of the previous chat, voice, or task contact.
     *            Any updates to user-defined attributes to task contacts linked
     *            using the same <code>PreviousContactID</code> will affect
     *            every contact in the chain. There can be a maximum of 12
     *            linked task contacts in a chain.
     *            </p>
     */
    public void setPreviousContactId(String previousContactId) {
        this.previousContactId = previousContactId;
    }

    /**
     * <p>
     * The identifier of the previous chat, voice, or task contact. Any updates
     * to user-defined attributes to task contacts linked using the same
     * <code>PreviousContactID</code> will affect every contact in the chain.
     * There can be a maximum of 12 linked task contacts in a chain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param previousContactId <p>
     *            The identifier of the previous chat, voice, or task contact.
     *            Any updates to user-defined attributes to task contacts linked
     *            using the same <code>PreviousContactID</code> will affect
     *            every contact in the chain. There can be a maximum of 12
     *            linked task contacts in a chain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskContactRequest withPreviousContactId(String previousContactId) {
        this.previousContactId = previousContactId;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow for initiating the tasks. To see the
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
     *         The identifier of the flow for initiating the tasks. To see the
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
     * The identifier of the flow for initiating the tasks. To see the
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
     *            The identifier of the flow for initiating the tasks. To see
     *            the ContactFlowId in the Amazon Connect admin website, on the
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
     * The identifier of the flow for initiating the tasks. To see the
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
     *            The identifier of the flow for initiating the tasks. To see
     *            the ContactFlowId in the Amazon Connect admin website, on the
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
    public StartTaskContactRequest withContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
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
    public StartTaskContactRequest withAttributes(java.util.Map<String, String> attributes) {
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
    public StartTaskContactRequest addAttributesEntry(String key, String value) {
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
    public StartTaskContactRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The name of a task that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return <p>
     *         The name of a task that is shown to an agent in the Contact
     *         Control Panel (CCP).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a task that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name <p>
     *            The name of a task that is shown to an agent in the Contact
     *            Control Panel (CCP).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a task that is shown to an agent in the Contact Control Panel
     * (CCP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name <p>
     *            The name of a task that is shown to an agent in the Contact
     *            Control Panel (CCP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskContactRequest withName(String name) {
        this.name = name;
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
    public StartTaskContactRequest withReferences(java.util.Map<String, Reference> references) {
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
    public StartTaskContactRequest addReferencesEntry(String key, Reference value) {
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
    public StartTaskContactRequest clearReferencesEntries() {
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
    public StartTaskContactRequest withDescription(String description) {
        this.description = description;
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
    public StartTaskContactRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running
     * the inbound flow. The scheduled time cannot be in the past. It must be
     * within up to 6 days in future.
     * </p>
     *
     * @return <p>
     *         The timestamp, in Unix Epoch seconds format, at which to start
     *         running the inbound flow. The scheduled time cannot be in the
     *         past. It must be within up to 6 days in future.
     *         </p>
     */
    public java.util.Date getScheduledTime() {
        return scheduledTime;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running
     * the inbound flow. The scheduled time cannot be in the past. It must be
     * within up to 6 days in future.
     * </p>
     *
     * @param scheduledTime <p>
     *            The timestamp, in Unix Epoch seconds format, at which to start
     *            running the inbound flow. The scheduled time cannot be in the
     *            past. It must be within up to 6 days in future.
     *            </p>
     */
    public void setScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running
     * the inbound flow. The scheduled time cannot be in the past. It must be
     * within up to 6 days in future.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledTime <p>
     *            The timestamp, in Unix Epoch seconds format, at which to start
     *            running the inbound flow. The scheduled time cannot be in the
     *            past. It must be within up to 6 days in future.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskContactRequest withScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the task template. For more information about
     * task templates, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/task-templates.html"
     * >Create task templates</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         A unique identifier for the task template. For more information
     *         about task templates, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/task-templates.html"
     *         >Create task templates</a> in the <i>Amazon Connect Administrator
     *         Guide</i>.
     *         </p>
     */
    public String getTaskTemplateId() {
        return taskTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the task template. For more information about
     * task templates, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/task-templates.html"
     * >Create task templates</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param taskTemplateId <p>
     *            A unique identifier for the task template. For more
     *            information about task templates, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/task-templates.html"
     *            >Create task templates</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     */
    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    /**
     * <p>
     * A unique identifier for the task template. For more information about
     * task templates, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/task-templates.html"
     * >Create task templates</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param taskTemplateId <p>
     *            A unique identifier for the task template. For more
     *            information about task templates, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/task-templates.html"
     *            >Create task templates</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskContactRequest withTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
        return this;
    }

    /**
     * <p>
     * The identifier for the quick connect. Tasks that are created by using
     * <code>QuickConnectId</code> will use the flow that is defined on agent or
     * queue quick connect. For more information about quick connects, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/quick-connects.html"
     * >Create quick connects</a>.
     * </p>
     *
     * @return <p>
     *         The identifier for the quick connect. Tasks that are created by
     *         using <code>QuickConnectId</code> will use the flow that is
     *         defined on agent or queue quick connect. For more information
     *         about quick connects, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/quick-connects.html"
     *         >Create quick connects</a>.
     *         </p>
     */
    public String getQuickConnectId() {
        return quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect. Tasks that are created by using
     * <code>QuickConnectId</code> will use the flow that is defined on agent or
     * queue quick connect. For more information about quick connects, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/quick-connects.html"
     * >Create quick connects</a>.
     * </p>
     *
     * @param quickConnectId <p>
     *            The identifier for the quick connect. Tasks that are created
     *            by using <code>QuickConnectId</code> will use the flow that is
     *            defined on agent or queue quick connect. For more information
     *            about quick connects, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/quick-connects.html"
     *            >Create quick connects</a>.
     *            </p>
     */
    public void setQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect. Tasks that are created by using
     * <code>QuickConnectId</code> will use the flow that is defined on agent or
     * queue quick connect. For more information about quick connects, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/quick-connects.html"
     * >Create quick connects</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectId <p>
     *            The identifier for the quick connect. Tasks that are created
     *            by using <code>QuickConnectId</code> will use the flow that is
     *            defined on agent or queue quick connect. For more information
     *            about quick connects, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/quick-connects.html"
     *            >Create quick connects</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskContactRequest withQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
        return this;
    }

    /**
     * <p>
     * The contactId that is <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html#linked-tasks"
     * >related</a> to this contact. Linking tasks together by using
     * <code>RelatedContactID</code> copies over contact attributes from the
     * related task contact to the new task contact. All updates to user-defined
     * attributes in the new task contact are limited to the individual contact
     * ID, unlike what happens when tasks are linked by using
     * <code>PreviousContactID</code>. There are no limits to the number of
     * contacts that can be linked by using <code>RelatedContactId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The contactId that is <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html#linked-tasks"
     *         >related</a> to this contact. Linking tasks together by using
     *         <code>RelatedContactID</code> copies over contact attributes from
     *         the related task contact to the new task contact. All updates to
     *         user-defined attributes in the new task contact are limited to
     *         the individual contact ID, unlike what happens when tasks are
     *         linked by using <code>PreviousContactID</code>. There are no
     *         limits to the number of contacts that can be linked by using
     *         <code>RelatedContactId</code>.
     *         </p>
     */
    public String getRelatedContactId() {
        return relatedContactId;
    }

    /**
     * <p>
     * The contactId that is <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html#linked-tasks"
     * >related</a> to this contact. Linking tasks together by using
     * <code>RelatedContactID</code> copies over contact attributes from the
     * related task contact to the new task contact. All updates to user-defined
     * attributes in the new task contact are limited to the individual contact
     * ID, unlike what happens when tasks are linked by using
     * <code>PreviousContactID</code>. There are no limits to the number of
     * contacts that can be linked by using <code>RelatedContactId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param relatedContactId <p>
     *            The contactId that is <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html#linked-tasks"
     *            >related</a> to this contact. Linking tasks together by using
     *            <code>RelatedContactID</code> copies over contact attributes
     *            from the related task contact to the new task contact. All
     *            updates to user-defined attributes in the new task contact are
     *            limited to the individual contact ID, unlike what happens when
     *            tasks are linked by using <code>PreviousContactID</code>.
     *            There are no limits to the number of contacts that can be
     *            linked by using <code>RelatedContactId</code>.
     *            </p>
     */
    public void setRelatedContactId(String relatedContactId) {
        this.relatedContactId = relatedContactId;
    }

    /**
     * <p>
     * The contactId that is <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html#linked-tasks"
     * >related</a> to this contact. Linking tasks together by using
     * <code>RelatedContactID</code> copies over contact attributes from the
     * related task contact to the new task contact. All updates to user-defined
     * attributes in the new task contact are limited to the individual contact
     * ID, unlike what happens when tasks are linked by using
     * <code>PreviousContactID</code>. There are no limits to the number of
     * contacts that can be linked by using <code>RelatedContactId</code>.
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
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html#linked-tasks"
     *            >related</a> to this contact. Linking tasks together by using
     *            <code>RelatedContactID</code> copies over contact attributes
     *            from the related task contact to the new task contact. All
     *            updates to user-defined attributes in the new task contact are
     *            limited to the individual contact ID, unlike what happens when
     *            tasks are linked by using <code>PreviousContactID</code>.
     *            There are no limits to the number of contacts that can be
     *            linked by using <code>RelatedContactId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskContactRequest withRelatedContactId(String relatedContactId) {
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
        if (getPreviousContactId() != null)
            sb.append("PreviousContactId: " + getPreviousContactId() + ",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getReferences() != null)
            sb.append("References: " + getReferences() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getScheduledTime() != null)
            sb.append("ScheduledTime: " + getScheduledTime() + ",");
        if (getTaskTemplateId() != null)
            sb.append("TaskTemplateId: " + getTaskTemplateId() + ",");
        if (getQuickConnectId() != null)
            sb.append("QuickConnectId: " + getQuickConnectId() + ",");
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
                + ((getPreviousContactId() == null) ? 0 : getPreviousContactId().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledTime() == null) ? 0 : getScheduledTime().hashCode());
        hashCode = prime * hashCode
                + ((getTaskTemplateId() == null) ? 0 : getTaskTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getQuickConnectId() == null) ? 0 : getQuickConnectId().hashCode());
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

        if (obj instanceof StartTaskContactRequest == false)
            return false;
        StartTaskContactRequest other = (StartTaskContactRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPreviousContactId() == null ^ this.getPreviousContactId() == null)
            return false;
        if (other.getPreviousContactId() != null
                && other.getPreviousContactId().equals(this.getPreviousContactId()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getScheduledTime() == null ^ this.getScheduledTime() == null)
            return false;
        if (other.getScheduledTime() != null
                && other.getScheduledTime().equals(this.getScheduledTime()) == false)
            return false;
        if (other.getTaskTemplateId() == null ^ this.getTaskTemplateId() == null)
            return false;
        if (other.getTaskTemplateId() != null
                && other.getTaskTemplateId().equals(this.getTaskTemplateId()) == false)
            return false;
        if (other.getQuickConnectId() == null ^ this.getQuickConnectId() == null)
            return false;
        if (other.getQuickConnectId() != null
                && other.getQuickConnectId().equals(this.getQuickConnectId()) == false)
            return false;
        if (other.getRelatedContactId() == null ^ this.getRelatedContactId() == null)
            return false;
        if (other.getRelatedContactId() != null
                && other.getRelatedContactId().equals(this.getRelatedContactId()) == false)
            return false;
        return true;
    }
}
