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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends a message to a particular channel that the member is a part of.
 * </p>
 * <note>
 * <p>
 * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the ARN
 * of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes
 * the API call as the value in the header.
 * </p>
 * <p>
 * Also, <code>STANDARD</code> messages can be up to 4KB in size and contain
 * metadata. Metadata is arbitrary, and you can use it in a variety of ways,
 * such as containing a link to an attachment.
 * </p>
 * <p>
 * <code>CONTROL</code> messages are limited to 30 bytes and do not contain
 * metadata.
 * </p>
 * </note>
 */
public class SendChannelMessageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String channelArn;

    /**
     * <p>
     * The content of the channel message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String content;

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * <p>
     * <code>STANDARD</code> messages can be up to 4KB in size and contain
     * metadata. Metadata is arbitrary, and you can use it in a variety of ways,
     * such as containing a link to an attachment.
     * </p>
     * <p>
     * <code>CONTROL</code> messages are limited to 30 bytes and do not contain
     * metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     */
    private String type;

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSISTENT, NON_PERSISTENT
     */
    private String persistence;

    /**
     * <p>
     * The optional metadata for each message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String metadata;

    /**
     * <p>
     * The <code>Idempotency</code> token for each client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or
     * <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String chimeBearer;

    /**
     * <p>
     * The push notification configuration of the message.
     * </p>
     */
    private PushNotificationConfiguration pushNotification;

    /**
     * <p>
     * The attributes for the message, used for message filtering along with a
     * <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     */
    private java.util.Map<String, MessageAttributeValue> messageAttributes;

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String subChannelId;

    /**
     * <p>
     * The content type of the channel message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 45<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String contentType;

    /**
     * <p>
     * The target of a message. Must be a member of the channel, such as another
     * user, a bot, or the sender. Only the target and the sender can view
     * targeted messages. Only users who can see targeted messages can take
     * actions on them. However, administrators can delete targeted messages
     * that they can’t see.
     * </p>
     */
    private java.util.List<Target> target;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the channel.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
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
     * @param channelArn <p>
     *            The ARN of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The content of the channel message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The content of the channel message.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the channel message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param content <p>
     *            The content of the channel message.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the channel message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param content <p>
     *            The content of the channel message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * <p>
     * <code>STANDARD</code> messages can be up to 4KB in size and contain
     * metadata. Metadata is arbitrary, and you can use it in a variety of ways,
     * such as containing a link to an attachment.
     * </p>
     * <p>
     * <code>CONTROL</code> messages are limited to 30 bytes and do not contain
     * metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @return <p>
     *         The type of message, <code>STANDARD</code> or
     *         <code>CONTROL</code>.
     *         </p>
     *         <p>
     *         <code>STANDARD</code> messages can be up to 4KB in size and
     *         contain metadata. Metadata is arbitrary, and you can use it in a
     *         variety of ways, such as containing a link to an attachment.
     *         </p>
     *         <p>
     *         <code>CONTROL</code> messages are limited to 30 bytes and do not
     *         contain metadata.
     *         </p>
     * @see ChannelMessageType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * <p>
     * <code>STANDARD</code> messages can be up to 4KB in size and contain
     * metadata. Metadata is arbitrary, and you can use it in a variety of ways,
     * such as containing a link to an attachment.
     * </p>
     * <p>
     * <code>CONTROL</code> messages are limited to 30 bytes and do not contain
     * metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @param type <p>
     *            The type of message, <code>STANDARD</code> or
     *            <code>CONTROL</code>.
     *            </p>
     *            <p>
     *            <code>STANDARD</code> messages can be up to 4KB in size and
     *            contain metadata. Metadata is arbitrary, and you can use it in
     *            a variety of ways, such as containing a link to an attachment.
     *            </p>
     *            <p>
     *            <code>CONTROL</code> messages are limited to 30 bytes and do
     *            not contain metadata.
     *            </p>
     * @see ChannelMessageType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * <p>
     * <code>STANDARD</code> messages can be up to 4KB in size and contain
     * metadata. Metadata is arbitrary, and you can use it in a variety of ways,
     * such as containing a link to an attachment.
     * </p>
     * <p>
     * <code>CONTROL</code> messages are limited to 30 bytes and do not contain
     * metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @param type <p>
     *            The type of message, <code>STANDARD</code> or
     *            <code>CONTROL</code>.
     *            </p>
     *            <p>
     *            <code>STANDARD</code> messages can be up to 4KB in size and
     *            contain metadata. Metadata is arbitrary, and you can use it in
     *            a variety of ways, such as containing a link to an attachment.
     *            </p>
     *            <p>
     *            <code>CONTROL</code> messages are limited to 30 bytes and do
     *            not contain metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMessageType
     */
    public SendChannelMessageRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * <p>
     * <code>STANDARD</code> messages can be up to 4KB in size and contain
     * metadata. Metadata is arbitrary, and you can use it in a variety of ways,
     * such as containing a link to an attachment.
     * </p>
     * <p>
     * <code>CONTROL</code> messages are limited to 30 bytes and do not contain
     * metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @param type <p>
     *            The type of message, <code>STANDARD</code> or
     *            <code>CONTROL</code>.
     *            </p>
     *            <p>
     *            <code>STANDARD</code> messages can be up to 4KB in size and
     *            contain metadata. Metadata is arbitrary, and you can use it in
     *            a variety of ways, such as containing a link to an attachment.
     *            </p>
     *            <p>
     *            <code>CONTROL</code> messages are limited to 30 bytes and do
     *            not contain metadata.
     *            </p>
     * @see ChannelMessageType
     */
    public void setType(ChannelMessageType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * <p>
     * <code>STANDARD</code> messages can be up to 4KB in size and contain
     * metadata. Metadata is arbitrary, and you can use it in a variety of ways,
     * such as containing a link to an attachment.
     * </p>
     * <p>
     * <code>CONTROL</code> messages are limited to 30 bytes and do not contain
     * metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, CONTROL
     *
     * @param type <p>
     *            The type of message, <code>STANDARD</code> or
     *            <code>CONTROL</code>.
     *            </p>
     *            <p>
     *            <code>STANDARD</code> messages can be up to 4KB in size and
     *            contain metadata. Metadata is arbitrary, and you can use it in
     *            a variety of ways, such as containing a link to an attachment.
     *            </p>
     *            <p>
     *            <code>CONTROL</code> messages are limited to 30 bytes and do
     *            not contain metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMessageType
     */
    public SendChannelMessageRequest withType(ChannelMessageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSISTENT, NON_PERSISTENT
     *
     * @return <p>
     *         Boolean that controls whether the message is persisted on the
     *         back end. Required.
     *         </p>
     * @see ChannelMessagePersistenceType
     */
    public String getPersistence() {
        return persistence;
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSISTENT, NON_PERSISTENT
     *
     * @param persistence <p>
     *            Boolean that controls whether the message is persisted on the
     *            back end. Required.
     *            </p>
     * @see ChannelMessagePersistenceType
     */
    public void setPersistence(String persistence) {
        this.persistence = persistence;
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end.
     * Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSISTENT, NON_PERSISTENT
     *
     * @param persistence <p>
     *            Boolean that controls whether the message is persisted on the
     *            back end. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMessagePersistenceType
     */
    public SendChannelMessageRequest withPersistence(String persistence) {
        this.persistence = persistence;
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end.
     * Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSISTENT, NON_PERSISTENT
     *
     * @param persistence <p>
     *            Boolean that controls whether the message is persisted on the
     *            back end. Required.
     *            </p>
     * @see ChannelMessagePersistenceType
     */
    public void setPersistence(ChannelMessagePersistenceType persistence) {
        this.persistence = persistence.toString();
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end.
     * Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSISTENT, NON_PERSISTENT
     *
     * @param persistence <p>
     *            Boolean that controls whether the message is persisted on the
     *            back end. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMessagePersistenceType
     */
    public SendChannelMessageRequest withPersistence(ChannelMessagePersistenceType persistence) {
        this.persistence = persistence.toString();
        return this;
    }

    /**
     * <p>
     * The optional metadata for each message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The optional metadata for each message.
     *         </p>
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The optional metadata for each message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The optional metadata for each message.
     *            </p>
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The optional metadata for each message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The optional metadata for each message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The <code>Idempotency</code> token for each client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The <code>Idempotency</code> token for each client request.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The <code>Idempotency</code> token for each client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            The <code>Idempotency</code> token for each client request.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The <code>Idempotency</code> token for each client request.
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
     *            The <code>Idempotency</code> token for each client request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or
     * <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the <code>AppInstanceUser</code> or
     *         <code>AppInstanceBot</code> that makes the API call.
     *         </p>
     */
    public String getChimeBearer() {
        return chimeBearer;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or
     * <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The ARN of the <code>AppInstanceUser</code> or
     *            <code>AppInstanceBot</code> that makes the API call.
     *            </p>
     */
    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or
     * <code>AppInstanceBot</code> that makes the API call.
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
     * @param chimeBearer <p>
     *            The ARN of the <code>AppInstanceUser</code> or
     *            <code>AppInstanceBot</code> that makes the API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
        return this;
    }

    /**
     * <p>
     * The push notification configuration of the message.
     * </p>
     *
     * @return <p>
     *         The push notification configuration of the message.
     *         </p>
     */
    public PushNotificationConfiguration getPushNotification() {
        return pushNotification;
    }

    /**
     * <p>
     * The push notification configuration of the message.
     * </p>
     *
     * @param pushNotification <p>
     *            The push notification configuration of the message.
     *            </p>
     */
    public void setPushNotification(PushNotificationConfiguration pushNotification) {
        this.pushNotification = pushNotification;
    }

    /**
     * <p>
     * The push notification configuration of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pushNotification <p>
     *            The push notification configuration of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withPushNotification(
            PushNotificationConfiguration pushNotification) {
        this.pushNotification = pushNotification;
        return this;
    }

    /**
     * <p>
     * The attributes for the message, used for message filtering along with a
     * <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     *
     * @return <p>
     *         The attributes for the message, used for message filtering along
     *         with a <code>FilterRule</code> defined in the
     *         <code>PushNotificationPreferences</code>.
     *         </p>
     */
    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * <p>
     * The attributes for the message, used for message filtering along with a
     * <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     *
     * @param messageAttributes <p>
     *            The attributes for the message, used for message filtering
     *            along with a <code>FilterRule</code> defined in the
     *            <code>PushNotificationPreferences</code>.
     *            </p>
     */
    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }

    /**
     * <p>
     * The attributes for the message, used for message filtering along with a
     * <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributes <p>
     *            The attributes for the message, used for message filtering
     *            along with a <code>FilterRule</code> defined in the
     *            <code>PushNotificationPreferences</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }

    /**
     * <p>
     * The attributes for the message, used for message filtering along with a
     * <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into MessageAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into MessageAttributes.
     * @param value The corresponding value of the entry to be added into
     *            MessageAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest addMessageAttributesEntry(String key,
            MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SendChannelMessageRequest clearMessageAttributesEntries() {
        this.messageAttributes = null;
        return this;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The ID of the SubChannel in the request.
     *         </p>
     */
    public String getSubChannelId() {
        return subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param subChannelId <p>
     *            The ID of the SubChannel in the request.
     *            </p>
     */
    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param subChannelId <p>
     *            The ID of the SubChannel in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
        return this;
    }

    /**
     * <p>
     * The content type of the channel message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 45<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The content type of the channel message.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type of the channel message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 45<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param contentType <p>
     *            The content type of the channel message.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the channel message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 45<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param contentType <p>
     *            The content type of the channel message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The target of a message. Must be a member of the channel, such as another
     * user, a bot, or the sender. Only the target and the sender can view
     * targeted messages. Only users who can see targeted messages can take
     * actions on them. However, administrators can delete targeted messages
     * that they can’t see.
     * </p>
     *
     * @return <p>
     *         The target of a message. Must be a member of the channel, such as
     *         another user, a bot, or the sender. Only the target and the
     *         sender can view targeted messages. Only users who can see
     *         targeted messages can take actions on them. However,
     *         administrators can delete targeted messages that they can’t see.
     *         </p>
     */
    public java.util.List<Target> getTarget() {
        return target;
    }

    /**
     * <p>
     * The target of a message. Must be a member of the channel, such as another
     * user, a bot, or the sender. Only the target and the sender can view
     * targeted messages. Only users who can see targeted messages can take
     * actions on them. However, administrators can delete targeted messages
     * that they can’t see.
     * </p>
     *
     * @param target <p>
     *            The target of a message. Must be a member of the channel, such
     *            as another user, a bot, or the sender. Only the target and the
     *            sender can view targeted messages. Only users who can see
     *            targeted messages can take actions on them. However,
     *            administrators can delete targeted messages that they can’t
     *            see.
     *            </p>
     */
    public void setTarget(java.util.Collection<Target> target) {
        if (target == null) {
            this.target = null;
            return;
        }

        this.target = new java.util.ArrayList<Target>(target);
    }

    /**
     * <p>
     * The target of a message. Must be a member of the channel, such as another
     * user, a bot, or the sender. Only the target and the sender can view
     * targeted messages. Only users who can see targeted messages can take
     * actions on them. However, administrators can delete targeted messages
     * that they can’t see.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The target of a message. Must be a member of the channel, such
     *            as another user, a bot, or the sender. Only the target and the
     *            sender can view targeted messages. Only users who can see
     *            targeted messages can take actions on them. However,
     *            administrators can delete targeted messages that they can’t
     *            see.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withTarget(Target... target) {
        if (getTarget() == null) {
            this.target = new java.util.ArrayList<Target>(target.length);
        }
        for (Target value : target) {
            this.target.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The target of a message. Must be a member of the channel, such as another
     * user, a bot, or the sender. Only the target and the sender can view
     * targeted messages. Only users who can see targeted messages can take
     * actions on them. However, administrators can delete targeted messages
     * that they can’t see.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The target of a message. Must be a member of the channel, such
     *            as another user, a bot, or the sender. Only the target and the
     *            sender can view targeted messages. Only users who can see
     *            targeted messages can take actions on them. However,
     *            administrators can delete targeted messages that they can’t
     *            see.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendChannelMessageRequest withTarget(java.util.Collection<Target> target) {
        setTarget(target);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getPersistence() != null)
            sb.append("Persistence: " + getPersistence() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: " + getChimeBearer() + ",");
        if (getPushNotification() != null)
            sb.append("PushNotification: " + getPushNotification() + ",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: " + getMessageAttributes() + ",");
        if (getSubChannelId() != null)
            sb.append("SubChannelId: " + getSubChannelId() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getTarget() != null)
            sb.append("Target: " + getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getPersistence() == null) ? 0 : getPersistence().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        hashCode = prime * hashCode
                + ((getPushNotification() == null) ? 0 : getPushNotification().hashCode());
        hashCode = prime * hashCode
                + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendChannelMessageRequest == false)
            return false;
        SendChannelMessageRequest other = (SendChannelMessageRequest) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPersistence() == null ^ this.getPersistence() == null)
            return false;
        if (other.getPersistence() != null
                && other.getPersistence().equals(this.getPersistence()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null
                && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        if (other.getPushNotification() == null ^ this.getPushNotification() == null)
            return false;
        if (other.getPushNotification() != null
                && other.getPushNotification().equals(this.getPushNotification()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null
                && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        if (other.getSubChannelId() == null ^ this.getSubChannelId() == null)
            return false;
        if (other.getSubChannelId() != null
                && other.getSubChannelId().equals(this.getSubChannelId()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }
}
