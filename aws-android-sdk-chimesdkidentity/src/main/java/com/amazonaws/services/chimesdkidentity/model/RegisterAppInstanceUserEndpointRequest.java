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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Registers an endpoint under an Amazon Chime <code>AppInstanceUser</code>. The
 * endpoint receives messages for a user. For push notifications, the endpoint
 * is a mobile device used to receive mobile push notifications for a user.
 * </p>
 */
public class RegisterAppInstanceUserEndpointRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile
     * notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as
     * <code>PinpointAppArn</code>.
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
     * The idempotency token for each client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to
     * receive messages. <code>ALL</code> indicates the endpoint receives all
     * messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     */
    private String allowMessages;

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
    public RegisterAppInstanceUserEndpointRequest withAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
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
    public RegisterAppInstanceUserEndpointRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile
     * notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as
     * <code>PinpointAppArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     *
     * @return <p>
     *         The type of the <code>AppInstanceUserEndpoint</code>. Supported
     *         types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>APNS</code>: The mobile notification service for an Apple
     *         device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APNS_SANDBOX</code>: The sandbox environment of the mobile
     *         notification service for an Apple device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GCM</code>: The mobile notification service for an Android
     *         device.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Populate the <code>ResourceArn</code> value of each type as
     *         <code>PinpointAppArn</code>.
     *         </p>
     * @see AppInstanceUserEndpointType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile
     * notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as
     * <code>PinpointAppArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     *
     * @param type <p>
     *            The type of the <code>AppInstanceUserEndpoint</code>.
     *            Supported types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>APNS</code>: The mobile notification service for an
     *            Apple device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>APNS_SANDBOX</code>: The sandbox environment of the
     *            mobile notification service for an Apple device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GCM</code>: The mobile notification service for an
     *            Android device.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Populate the <code>ResourceArn</code> value of each type as
     *            <code>PinpointAppArn</code>.
     *            </p>
     * @see AppInstanceUserEndpointType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile
     * notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as
     * <code>PinpointAppArn</code>.
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
     *            Supported types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>APNS</code>: The mobile notification service for an
     *            Apple device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>APNS_SANDBOX</code>: The sandbox environment of the
     *            mobile notification service for an Apple device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GCM</code>: The mobile notification service for an
     *            Android device.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Populate the <code>ResourceArn</code> value of each type as
     *            <code>PinpointAppArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppInstanceUserEndpointType
     */
    public RegisterAppInstanceUserEndpointRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile
     * notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as
     * <code>PinpointAppArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM
     *
     * @param type <p>
     *            The type of the <code>AppInstanceUserEndpoint</code>.
     *            Supported types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>APNS</code>: The mobile notification service for an
     *            Apple device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>APNS_SANDBOX</code>: The sandbox environment of the
     *            mobile notification service for an Apple device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GCM</code>: The mobile notification service for an
     *            Android device.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Populate the <code>ResourceArn</code> value of each type as
     *            <code>PinpointAppArn</code>.
     *            </p>
     * @see AppInstanceUserEndpointType
     */
    public void setType(AppInstanceUserEndpointType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile
     * notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as
     * <code>PinpointAppArn</code>.
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
     *            Supported types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>APNS</code>: The mobile notification service for an
     *            Apple device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>APNS_SANDBOX</code>: The sandbox environment of the
     *            mobile notification service for an Apple device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GCM</code>: The mobile notification service for an
     *            Android device.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Populate the <code>ResourceArn</code> value of each type as
     *            <code>PinpointAppArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppInstanceUserEndpointType
     */
    public RegisterAppInstanceUserEndpointRequest withType(AppInstanceUserEndpointType type) {
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
    public RegisterAppInstanceUserEndpointRequest withResourceArn(String resourceArn) {
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
    public RegisterAppInstanceUserEndpointRequest withEndpointAttributes(
            EndpointAttributes endpointAttributes) {
        this.endpointAttributes = endpointAttributes;
        return this;
    }

    /**
     * <p>
     * The idempotency token for each client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The idempotency token for each client request.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The idempotency token for each client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            The idempotency token for each client request.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The idempotency token for each client request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            The idempotency token for each client request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterAppInstanceUserEndpointRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to
     * receive messages. <code>ALL</code> indicates the endpoint receives all
     * messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @return <p>
     *         Boolean that controls whether the AppInstanceUserEndpoint is
     *         opted in to receive messages. <code>ALL</code> indicates the
     *         endpoint receives all messages. <code>NONE</code> indicates the
     *         endpoint receives no messages.
     *         </p>
     * @see AllowMessages
     */
    public String getAllowMessages() {
        return allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to
     * receive messages. <code>ALL</code> indicates the endpoint receives all
     * messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the AppInstanceUserEndpoint is
     *            opted in to receive messages. <code>ALL</code> indicates the
     *            endpoint receives all messages. <code>NONE</code> indicates
     *            the endpoint receives no messages.
     *            </p>
     * @see AllowMessages
     */
    public void setAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to
     * receive messages. <code>ALL</code> indicates the endpoint receives all
     * messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the AppInstanceUserEndpoint is
     *            opted in to receive messages. <code>ALL</code> indicates the
     *            endpoint receives all messages. <code>NONE</code> indicates
     *            the endpoint receives no messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowMessages
     */
    public RegisterAppInstanceUserEndpointRequest withAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to
     * receive messages. <code>ALL</code> indicates the endpoint receives all
     * messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the AppInstanceUserEndpoint is
     *            opted in to receive messages. <code>ALL</code> indicates the
     *            endpoint receives all messages. <code>NONE</code> indicates
     *            the endpoint receives no messages.
     *            </p>
     * @see AllowMessages
     */
    public void setAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to
     * receive messages. <code>ALL</code> indicates the endpoint receives all
     * messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the AppInstanceUserEndpoint is
     *            opted in to receive messages. <code>ALL</code> indicates the
     *            endpoint receives all messages. <code>NONE</code> indicates
     *            the endpoint receives no messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowMessages
     */
    public RegisterAppInstanceUserEndpointRequest withAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getEndpointAttributes() != null)
            sb.append("EndpointAttributes: " + getEndpointAttributes() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getAllowMessages() != null)
            sb.append("AllowMessages: " + getAllowMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointAttributes() == null) ? 0 : getEndpointAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getAllowMessages() == null) ? 0 : getAllowMessages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterAppInstanceUserEndpointRequest == false)
            return false;
        RegisterAppInstanceUserEndpointRequest other = (RegisterAppInstanceUserEndpointRequest) obj;

        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null
                && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getAllowMessages() == null ^ this.getAllowMessages() == null)
            return false;
        if (other.getAllowMessages() != null
                && other.getAllowMessages().equals(this.getAllowMessages()) == false)
            return false;
        return true;
    }
}
