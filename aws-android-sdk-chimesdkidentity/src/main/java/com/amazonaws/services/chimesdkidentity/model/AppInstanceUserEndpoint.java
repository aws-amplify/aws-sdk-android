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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

/**
 * <p>
 * An endpoint under an Amazon Chime <code>AppInstanceUser</code> that receives
 * messages for a user. For push notifications, the endpoint is a mobile device
 * used to receive mobile push notifications for a user.
 * </p>
 */
public class AppInstanceUserEndpoint implements Serializable {
    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String appInstanceUserArn;

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String endpointId;

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String name;

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     */
    private String type;

    /**
     * <p>
     * The ARN of the resource to which the endpoint belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The attributes of an <code>Endpoint</code>.
     * </p>
     */
    private EndpointAttributes endpointAttributes;

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was last
     * updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     */
    private String allowMessages;

    /**
     * <p>
     * A read-only field that represents the state of an
     * <code>AppInstanceUserEndpoint</code>. Supported values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active
     * and able to receive messages. When <code>ACTIVE</code>, the
     * <code>EndpointStatusReason</code> remains empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is
     * inactive and can't receive message. When <code>INACTIVE</code>, the
     * corresponding reason will be conveyed through
     * <code>EndpointStatusReason</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_DEVICE_TOKEN</code> indicates that an
     * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to
     * invalid device token
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_PINPOINT_ARN</code> indicates that an
     * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to an
     * invalid pinpoint ARN that was input through the <code>ResourceArn</code>
     * field.
     * </p>
     * </li>
     * </ul>
     */
    private EndpointState endpointState;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the <code>AppInstanceUser</code>.
     *         </p>
     */
    public String getAppInstanceUserArn() {
        return appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceUserArn <p>
     *            The ARN of the <code>AppInstanceUser</code>.
     *            </p>
     */
    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceUserArn <p>
     *            The ARN of the <code>AppInstanceUser</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserEndpoint withAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The unique identifier of the <code>AppInstanceUserEndpoint</code>
     *         .
     *         </p>
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param endpointId <p>
     *            The unique identifier of the
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     */
    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param endpointId <p>
     *            The unique identifier of the
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserEndpoint withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The name of the <code>AppInstanceUserEndpoint</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param name <p>
     *            The name of the <code>AppInstanceUserEndpoint</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param name <p>
     *            The name of the <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserEndpoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     *
     * @return <p>
     *         The type of the <code>AppInstanceUserEndpoint</code>.
     *         </p>
     * @see AppInstanceUserEndpointType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     *
     * @param type <p>
     *            The type of the <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @see AppInstanceUserEndpointType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     *
     * @param type <p>
     *            The type of the <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppInstanceUserEndpointType
     */
    public AppInstanceUserEndpoint withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     *
     * @param type <p>
     *            The type of the <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @see AppInstanceUserEndpointType
     */
    public void setType(AppInstanceUserEndpointType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     *
     * @param type <p>
     *            The type of the <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppInstanceUserEndpointType
     */
    public AppInstanceUserEndpoint withType(AppInstanceUserEndpointType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the resource to which the endpoint belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the resource to which the endpoint belongs.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource to which the endpoint belongs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the resource to which the endpoint belongs.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource to which the endpoint belongs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the resource to which the endpoint belongs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserEndpoint withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The attributes of an <code>Endpoint</code>.
     * </p>
     *
     * @return <p>
     *         The attributes of an <code>Endpoint</code>.
     *         </p>
     */
    public EndpointAttributes getEndpointAttributes() {
        return endpointAttributes;
    }

    /**
     * <p>
     * The attributes of an <code>Endpoint</code>.
     * </p>
     *
     * @param endpointAttributes <p>
     *            The attributes of an <code>Endpoint</code>.
     *            </p>
     */
    public void setEndpointAttributes(EndpointAttributes endpointAttributes) {
        this.endpointAttributes = endpointAttributes;
    }

    /**
     * <p>
     * The attributes of an <code>Endpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointAttributes <p>
     *            The attributes of an <code>Endpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserEndpoint withEndpointAttributes(EndpointAttributes endpointAttributes) {
        this.endpointAttributes = endpointAttributes;
        return this;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * </p>
     *
     * @return <p>
     *         The time at which an <code>AppInstanceUserEndpoint</code> was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The time at which an <code>AppInstanceUserEndpoint</code> was
     *            created.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The time at which an <code>AppInstanceUserEndpoint</code> was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserEndpoint withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was last
     * updated.
     * </p>
     *
     * @return <p>
     *         The time at which an <code>AppInstanceUserEndpoint</code> was
     *         last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was last
     * updated.
     * </p>
     *
     * @param lastUpdatedTimestamp <p>
     *            The time at which an <code>AppInstanceUserEndpoint</code> was
     *            last updated.
     *            </p>
     */
    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was last
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimestamp <p>
     *            The time at which an <code>AppInstanceUserEndpoint</code> was
     *            last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserEndpoint withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @return <p>
     *         Boolean that controls whether the
     *         <code>AppInstanceUserEndpoint</code> is opted in to receive
     *         messages. <code>ALL</code> indicates the endpoint will receive
     *         all messages. <code>NONE</code> indicates the endpoint will
     *         receive no messages.
     *         </p>
     * @see AllowMessages
     */
    public String getAllowMessages() {
        return allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the
     *            <code>AppInstanceUserEndpoint</code> is opted in to receive
     *            messages. <code>ALL</code> indicates the endpoint will receive
     *            all messages. <code>NONE</code> indicates the endpoint will
     *            receive no messages.
     *            </p>
     * @see AllowMessages
     */
    public void setAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the
     *            <code>AppInstanceUserEndpoint</code> is opted in to receive
     *            messages. <code>ALL</code> indicates the endpoint will receive
     *            all messages. <code>NONE</code> indicates the endpoint will
     *            receive no messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowMessages
     */
    public AppInstanceUserEndpoint withAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the
     *            <code>AppInstanceUserEndpoint</code> is opted in to receive
     *            messages. <code>ALL</code> indicates the endpoint will receive
     *            all messages. <code>NONE</code> indicates the endpoint will
     *            receive no messages.
     *            </p>
     * @see AllowMessages
     */
    public void setAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the
     *            <code>AppInstanceUserEndpoint</code> is opted in to receive
     *            messages. <code>ALL</code> indicates the endpoint will receive
     *            all messages. <code>NONE</code> indicates the endpoint will
     *            receive no messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowMessages
     */
    public AppInstanceUserEndpoint withAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
        return this;
    }

    /**
     * <p>
     * A read-only field that represents the state of an
     * <code>AppInstanceUserEndpoint</code>. Supported values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active
     * and able to receive messages. When <code>ACTIVE</code>, the
     * <code>EndpointStatusReason</code> remains empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is
     * inactive and can't receive message. When <code>INACTIVE</code>, the
     * corresponding reason will be conveyed through
     * <code>EndpointStatusReason</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_DEVICE_TOKEN</code> indicates that an
     * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to
     * invalid device token
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_PINPOINT_ARN</code> indicates that an
     * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to an
     * invalid pinpoint ARN that was input through the <code>ResourceArn</code>
     * field.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A read-only field that represents the state of an
     *         <code>AppInstanceUserEndpoint</code>. Supported values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is
     *         active and able to receive messages. When <code>ACTIVE</code>,
     *         the <code>EndpointStatusReason</code> remains empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code>
     *         is inactive and can't receive message. When <code>INACTIVE</code>
     *         , the corresponding reason will be conveyed through
     *         <code>EndpointStatusReason</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_DEVICE_TOKEN</code> indicates that an
     *         <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due
     *         to invalid device token
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_PINPOINT_ARN</code> indicates that an
     *         <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due
     *         to an invalid pinpoint ARN that was input through the
     *         <code>ResourceArn</code> field.
     *         </p>
     *         </li>
     *         </ul>
     */
    public EndpointState getEndpointState() {
        return endpointState;
    }

    /**
     * <p>
     * A read-only field that represents the state of an
     * <code>AppInstanceUserEndpoint</code>. Supported values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active
     * and able to receive messages. When <code>ACTIVE</code>, the
     * <code>EndpointStatusReason</code> remains empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is
     * inactive and can't receive message. When <code>INACTIVE</code>, the
     * corresponding reason will be conveyed through
     * <code>EndpointStatusReason</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_DEVICE_TOKEN</code> indicates that an
     * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to
     * invalid device token
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_PINPOINT_ARN</code> indicates that an
     * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to an
     * invalid pinpoint ARN that was input through the <code>ResourceArn</code>
     * field.
     * </p>
     * </li>
     * </ul>
     *
     * @param endpointState <p>
     *            A read-only field that represents the state of an
     *            <code>AppInstanceUserEndpoint</code>. Supported values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code>
     *            is active and able to receive messages. When
     *            <code>ACTIVE</code>, the <code>EndpointStatusReason</code>
     *            remains empty.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INACTIVE</code>: The
     *            <code>AppInstanceUserEndpoint</code> is inactive and can't
     *            receive message. When <code>INACTIVE</code>, the corresponding
     *            reason will be conveyed through
     *            <code>EndpointStatusReason</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INVALID_DEVICE_TOKEN</code> indicates that an
     *            <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     *            due to invalid device token
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INVALID_PINPOINT_ARN</code> indicates that an
     *            <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     *            due to an invalid pinpoint ARN that was input through the
     *            <code>ResourceArn</code> field.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setEndpointState(EndpointState endpointState) {
        this.endpointState = endpointState;
    }

    /**
     * <p>
     * A read-only field that represents the state of an
     * <code>AppInstanceUserEndpoint</code>. Supported values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active
     * and able to receive messages. When <code>ACTIVE</code>, the
     * <code>EndpointStatusReason</code> remains empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is
     * inactive and can't receive message. When <code>INACTIVE</code>, the
     * corresponding reason will be conveyed through
     * <code>EndpointStatusReason</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_DEVICE_TOKEN</code> indicates that an
     * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to
     * invalid device token
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_PINPOINT_ARN</code> indicates that an
     * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to an
     * invalid pinpoint ARN that was input through the <code>ResourceArn</code>
     * field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointState <p>
     *            A read-only field that represents the state of an
     *            <code>AppInstanceUserEndpoint</code>. Supported values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code>
     *            is active and able to receive messages. When
     *            <code>ACTIVE</code>, the <code>EndpointStatusReason</code>
     *            remains empty.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INACTIVE</code>: The
     *            <code>AppInstanceUserEndpoint</code> is inactive and can't
     *            receive message. When <code>INACTIVE</code>, the corresponding
     *            reason will be conveyed through
     *            <code>EndpointStatusReason</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INVALID_DEVICE_TOKEN</code> indicates that an
     *            <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     *            due to invalid device token
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INVALID_PINPOINT_ARN</code> indicates that an
     *            <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     *            due to an invalid pinpoint ARN that was input through the
     *            <code>ResourceArn</code> field.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserEndpoint withEndpointState(EndpointState endpointState) {
        this.endpointState = endpointState;
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
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: " + getAppInstanceUserArn() + ",");
        if (getEndpointId() != null)
            sb.append("EndpointId: " + getEndpointId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getEndpointAttributes() != null)
            sb.append("EndpointAttributes: " + getEndpointAttributes() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        if (getAllowMessages() != null)
            sb.append("AllowMessages: " + getAllowMessages() + ",");
        if (getEndpointState() != null)
            sb.append("EndpointState: " + getEndpointState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointAttributes() == null) ? 0 : getEndpointAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getAllowMessages() == null) ? 0 : getAllowMessages().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointState() == null) ? 0 : getEndpointState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceUserEndpoint == false)
            return false;
        AppInstanceUserEndpoint other = (AppInstanceUserEndpoint) obj;

        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null
                && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null
                && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getEndpointAttributes() == null ^ this.getEndpointAttributes() == null)
            return false;
        if (other.getEndpointAttributes() != null
                && other.getEndpointAttributes().equals(this.getEndpointAttributes()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null
                && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getAllowMessages() == null ^ this.getAllowMessages() == null)
            return false;
        if (other.getAllowMessages() != null
                && other.getAllowMessages().equals(this.getAllowMessages()) == false)
            return false;
        if (other.getEndpointState() == null ^ this.getEndpointState() == null)
            return false;
        if (other.getEndpointState() != null
                && other.getEndpointState().equals(this.getEndpointState()) == false)
            return false;
        return true;
    }
}
