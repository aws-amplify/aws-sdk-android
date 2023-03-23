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
 * Creates a channel to which you can add users and send messages.
 * </p>
 * <p>
 * <b>Restriction</b>: You can't change a channel's privacy.
 * </p>
 * <note>
 * <p>
 * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the ARN
 * of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes
 * the API call as the value in the header.
 * </p>
 * </note>
 */
public class CreateChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the channel request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String appInstanceArn;

    /**
     * <p>
     * The name of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String name;

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>.
     * Administrators, moderators, and channel members can add themselves and
     * other members to unrestricted channels. Only administrators and
     * moderators can add members to restricted channels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNRESTRICTED, RESTRICTED
     */
    private String mode;

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>.
     * Private channels aren't discoverable by users outside the channel. Public
     * channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     */
    private String privacy;

    /**
     * <p>
     * The metadata of the creation request. Limited to 1KB and UTF-8.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String metadata;

    /**
     * <p>
     * The client token for the request. An <code>Idempotency</code> token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     */
    private java.util.List<Tag> tags;

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
     * The ID of the channel in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9]([A-Za-z0-9\:\-\_\.\@]{0,62}[A-Za-z0-9])?<br/>
     */
    private String channelId;

    /**
     * <p>
     * The ARNs of the channel members in the request.
     * </p>
     */
    private java.util.List<String> memberArns;

    /**
     * <p>
     * The ARNs of the channel moderators in the request.
     * </p>
     */
    private java.util.List<String> moderatorArns;

    /**
     * <p>
     * The attributes required to configure and create an elastic channel. An
     * elastic channel can support a maximum of 1-million users, excluding
     * moderators.
     * </p>
     */
    private ElasticChannelConfiguration elasticChannelConfiguration;

    /**
     * <p>
     * Settings that control the interval after which the channel is
     * automatically deleted.
     * </p>
     */
    private ExpirationSettings expirationSettings;

    /**
     * <p>
     * The ARN of the channel request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the channel request.
     *         </p>
     */
    public String getAppInstanceArn() {
        return appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the channel request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceArn <p>
     *            The ARN of the channel request.
     *            </p>
     */
    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the channel request.
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
     * @param appInstanceArn <p>
     *            The ARN of the channel request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
        return this;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the channel.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param name <p>
     *            The name of the channel.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param name <p>
     *            The name of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>.
     * Administrators, moderators, and channel members can add themselves and
     * other members to unrestricted channels. Only administrators and
     * moderators can add members to restricted channels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNRESTRICTED, RESTRICTED
     *
     * @return <p>
     *         The channel mode: <code>UNRESTRICTED</code> or
     *         <code>RESTRICTED</code>. Administrators, moderators, and channel
     *         members can add themselves and other members to unrestricted
     *         channels. Only administrators and moderators can add members to
     *         restricted channels.
     *         </p>
     * @see ChannelMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>.
     * Administrators, moderators, and channel members can add themselves and
     * other members to unrestricted channels. Only administrators and
     * moderators can add members to restricted channels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNRESTRICTED, RESTRICTED
     *
     * @param mode <p>
     *            The channel mode: <code>UNRESTRICTED</code> or
     *            <code>RESTRICTED</code>. Administrators, moderators, and
     *            channel members can add themselves and other members to
     *            unrestricted channels. Only administrators and moderators can
     *            add members to restricted channels.
     *            </p>
     * @see ChannelMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>.
     * Administrators, moderators, and channel members can add themselves and
     * other members to unrestricted channels. Only administrators and
     * moderators can add members to restricted channels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNRESTRICTED, RESTRICTED
     *
     * @param mode <p>
     *            The channel mode: <code>UNRESTRICTED</code> or
     *            <code>RESTRICTED</code>. Administrators, moderators, and
     *            channel members can add themselves and other members to
     *            unrestricted channels. Only administrators and moderators can
     *            add members to restricted channels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMode
     */
    public CreateChannelRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>.
     * Administrators, moderators, and channel members can add themselves and
     * other members to unrestricted channels. Only administrators and
     * moderators can add members to restricted channels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNRESTRICTED, RESTRICTED
     *
     * @param mode <p>
     *            The channel mode: <code>UNRESTRICTED</code> or
     *            <code>RESTRICTED</code>. Administrators, moderators, and
     *            channel members can add themselves and other members to
     *            unrestricted channels. Only administrators and moderators can
     *            add members to restricted channels.
     *            </p>
     * @see ChannelMode
     */
    public void setMode(ChannelMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The channel mode: <code>UNRESTRICTED</code> or <code>RESTRICTED</code>.
     * Administrators, moderators, and channel members can add themselves and
     * other members to unrestricted channels. Only administrators and
     * moderators can add members to restricted channels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNRESTRICTED, RESTRICTED
     *
     * @param mode <p>
     *            The channel mode: <code>UNRESTRICTED</code> or
     *            <code>RESTRICTED</code>. Administrators, moderators, and
     *            channel members can add themselves and other members to
     *            unrestricted channels. Only administrators and moderators can
     *            add members to restricted channels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMode
     */
    public CreateChannelRequest withMode(ChannelMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>.
     * Private channels aren't discoverable by users outside the channel. Public
     * channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @return <p>
     *         The channel's privacy level: <code>PUBLIC</code> or
     *         <code>PRIVATE</code>. Private channels aren't discoverable by
     *         users outside the channel. Public channels are discoverable by
     *         anyone in the <code>AppInstance</code>.
     *         </p>
     * @see ChannelPrivacy
     */
    public String getPrivacy() {
        return privacy;
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>.
     * Private channels aren't discoverable by users outside the channel. Public
     * channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param privacy <p>
     *            The channel's privacy level: <code>PUBLIC</code> or
     *            <code>PRIVATE</code>. Private channels aren't discoverable by
     *            users outside the channel. Public channels are discoverable by
     *            anyone in the <code>AppInstance</code>.
     *            </p>
     * @see ChannelPrivacy
     */
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>.
     * Private channels aren't discoverable by users outside the channel. Public
     * channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param privacy <p>
     *            The channel's privacy level: <code>PUBLIC</code> or
     *            <code>PRIVATE</code>. Private channels aren't discoverable by
     *            users outside the channel. Public channels are discoverable by
     *            anyone in the <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelPrivacy
     */
    public CreateChannelRequest withPrivacy(String privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>.
     * Private channels aren't discoverable by users outside the channel. Public
     * channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param privacy <p>
     *            The channel's privacy level: <code>PUBLIC</code> or
     *            <code>PRIVATE</code>. Private channels aren't discoverable by
     *            users outside the channel. Public channels are discoverable by
     *            anyone in the <code>AppInstance</code>.
     *            </p>
     * @see ChannelPrivacy
     */
    public void setPrivacy(ChannelPrivacy privacy) {
        this.privacy = privacy.toString();
    }

    /**
     * <p>
     * The channel's privacy level: <code>PUBLIC</code> or <code>PRIVATE</code>.
     * Private channels aren't discoverable by users outside the channel. Public
     * channels are discoverable by anyone in the <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param privacy <p>
     *            The channel's privacy level: <code>PUBLIC</code> or
     *            <code>PRIVATE</code>. Private channels aren't discoverable by
     *            users outside the channel. Public channels are discoverable by
     *            anyone in the <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelPrivacy
     */
    public CreateChannelRequest withPrivacy(ChannelPrivacy privacy) {
        this.privacy = privacy.toString();
        return this;
    }

    /**
     * <p>
     * The metadata of the creation request. Limited to 1KB and UTF-8.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The metadata of the creation request. Limited to 1KB and UTF-8.
     *         </p>
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The metadata of the creation request. Limited to 1KB and UTF-8.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The metadata of the creation request. Limited to 1KB and
     *            UTF-8.
     *            </p>
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the creation request. Limited to 1KB and UTF-8.
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
     *            The metadata of the creation request. Limited to 1KB and
     *            UTF-8.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The client token for the request. An <code>Idempotency</code> token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The client token for the request. An <code>Idempotency</code>
     *         token.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The client token for the request. An <code>Idempotency</code> token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            The client token for the request. An <code>Idempotency</code>
     *            token.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The client token for the request. An <code>Idempotency</code> token.
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
     *            The client token for the request. An <code>Idempotency</code>
     *            token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     *
     * @return <p>
     *         The tags for the creation request.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     *
     * @param tags <p>
     *            The tags for the creation request.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the creation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the creation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the creation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public CreateChannelRequest withChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
        return this;
    }

    /**
     * <p>
     * The ID of the channel in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9]([A-Za-z0-9\:\-\_\.\@]{0,62}[A-Za-z0-9])?<br/>
     *
     * @return <p>
     *         The ID of the channel in the request.
     *         </p>
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * <p>
     * The ID of the channel in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9]([A-Za-z0-9\:\-\_\.\@]{0,62}[A-Za-z0-9])?<br/>
     *
     * @param channelId <p>
     *            The ID of the channel in the request.
     *            </p>
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * <p>
     * The ID of the channel in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9]([A-Za-z0-9\:\-\_\.\@]{0,62}[A-Za-z0-9])?<br/>
     *
     * @param channelId <p>
     *            The ID of the channel in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * <p>
     * The ARNs of the channel members in the request.
     * </p>
     *
     * @return <p>
     *         The ARNs of the channel members in the request.
     *         </p>
     */
    public java.util.List<String> getMemberArns() {
        return memberArns;
    }

    /**
     * <p>
     * The ARNs of the channel members in the request.
     * </p>
     *
     * @param memberArns <p>
     *            The ARNs of the channel members in the request.
     *            </p>
     */
    public void setMemberArns(java.util.Collection<String> memberArns) {
        if (memberArns == null) {
            this.memberArns = null;
            return;
        }

        this.memberArns = new java.util.ArrayList<String>(memberArns);
    }

    /**
     * <p>
     * The ARNs of the channel members in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberArns <p>
     *            The ARNs of the channel members in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withMemberArns(String... memberArns) {
        if (getMemberArns() == null) {
            this.memberArns = new java.util.ArrayList<String>(memberArns.length);
        }
        for (String value : memberArns) {
            this.memberArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the channel members in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberArns <p>
     *            The ARNs of the channel members in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withMemberArns(java.util.Collection<String> memberArns) {
        setMemberArns(memberArns);
        return this;
    }

    /**
     * <p>
     * The ARNs of the channel moderators in the request.
     * </p>
     *
     * @return <p>
     *         The ARNs of the channel moderators in the request.
     *         </p>
     */
    public java.util.List<String> getModeratorArns() {
        return moderatorArns;
    }

    /**
     * <p>
     * The ARNs of the channel moderators in the request.
     * </p>
     *
     * @param moderatorArns <p>
     *            The ARNs of the channel moderators in the request.
     *            </p>
     */
    public void setModeratorArns(java.util.Collection<String> moderatorArns) {
        if (moderatorArns == null) {
            this.moderatorArns = null;
            return;
        }

        this.moderatorArns = new java.util.ArrayList<String>(moderatorArns);
    }

    /**
     * <p>
     * The ARNs of the channel moderators in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param moderatorArns <p>
     *            The ARNs of the channel moderators in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withModeratorArns(String... moderatorArns) {
        if (getModeratorArns() == null) {
            this.moderatorArns = new java.util.ArrayList<String>(moderatorArns.length);
        }
        for (String value : moderatorArns) {
            this.moderatorArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the channel moderators in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param moderatorArns <p>
     *            The ARNs of the channel moderators in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withModeratorArns(java.util.Collection<String> moderatorArns) {
        setModeratorArns(moderatorArns);
        return this;
    }

    /**
     * <p>
     * The attributes required to configure and create an elastic channel. An
     * elastic channel can support a maximum of 1-million users, excluding
     * moderators.
     * </p>
     *
     * @return <p>
     *         The attributes required to configure and create an elastic
     *         channel. An elastic channel can support a maximum of 1-million
     *         users, excluding moderators.
     *         </p>
     */
    public ElasticChannelConfiguration getElasticChannelConfiguration() {
        return elasticChannelConfiguration;
    }

    /**
     * <p>
     * The attributes required to configure and create an elastic channel. An
     * elastic channel can support a maximum of 1-million users, excluding
     * moderators.
     * </p>
     *
     * @param elasticChannelConfiguration <p>
     *            The attributes required to configure and create an elastic
     *            channel. An elastic channel can support a maximum of 1-million
     *            users, excluding moderators.
     *            </p>
     */
    public void setElasticChannelConfiguration(
            ElasticChannelConfiguration elasticChannelConfiguration) {
        this.elasticChannelConfiguration = elasticChannelConfiguration;
    }

    /**
     * <p>
     * The attributes required to configure and create an elastic channel. An
     * elastic channel can support a maximum of 1-million users, excluding
     * moderators.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticChannelConfiguration <p>
     *            The attributes required to configure and create an elastic
     *            channel. An elastic channel can support a maximum of 1-million
     *            users, excluding moderators.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withElasticChannelConfiguration(
            ElasticChannelConfiguration elasticChannelConfiguration) {
        this.elasticChannelConfiguration = elasticChannelConfiguration;
        return this;
    }

    /**
     * <p>
     * Settings that control the interval after which the channel is
     * automatically deleted.
     * </p>
     *
     * @return <p>
     *         Settings that control the interval after which the channel is
     *         automatically deleted.
     *         </p>
     */
    public ExpirationSettings getExpirationSettings() {
        return expirationSettings;
    }

    /**
     * <p>
     * Settings that control the interval after which the channel is
     * automatically deleted.
     * </p>
     *
     * @param expirationSettings <p>
     *            Settings that control the interval after which the channel is
     *            automatically deleted.
     *            </p>
     */
    public void setExpirationSettings(ExpirationSettings expirationSettings) {
        this.expirationSettings = expirationSettings;
    }

    /**
     * <p>
     * Settings that control the interval after which the channel is
     * automatically deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationSettings <p>
     *            Settings that control the interval after which the channel is
     *            automatically deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChannelRequest withExpirationSettings(ExpirationSettings expirationSettings) {
        this.expirationSettings = expirationSettings;
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: " + getAppInstanceArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getPrivacy() != null)
            sb.append("Privacy: " + getPrivacy() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: " + getChimeBearer() + ",");
        if (getChannelId() != null)
            sb.append("ChannelId: " + getChannelId() + ",");
        if (getMemberArns() != null)
            sb.append("MemberArns: " + getMemberArns() + ",");
        if (getModeratorArns() != null)
            sb.append("ModeratorArns: " + getModeratorArns() + ",");
        if (getElasticChannelConfiguration() != null)
            sb.append("ElasticChannelConfiguration: " + getElasticChannelConfiguration() + ",");
        if (getExpirationSettings() != null)
            sb.append("ExpirationSettings: " + getExpirationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getPrivacy() == null) ? 0 : getPrivacy().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getMemberArns() == null) ? 0 : getMemberArns().hashCode());
        hashCode = prime * hashCode
                + ((getModeratorArns() == null) ? 0 : getModeratorArns().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticChannelConfiguration() == null) ? 0
                        : getElasticChannelConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationSettings() == null) ? 0 : getExpirationSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelRequest == false)
            return false;
        CreateChannelRequest other = (CreateChannelRequest) obj;

        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null
                && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getPrivacy() == null ^ this.getPrivacy() == null)
            return false;
        if (other.getPrivacy() != null && other.getPrivacy().equals(this.getPrivacy()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null
                && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null
                && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getMemberArns() == null ^ this.getMemberArns() == null)
            return false;
        if (other.getMemberArns() != null
                && other.getMemberArns().equals(this.getMemberArns()) == false)
            return false;
        if (other.getModeratorArns() == null ^ this.getModeratorArns() == null)
            return false;
        if (other.getModeratorArns() != null
                && other.getModeratorArns().equals(this.getModeratorArns()) == false)
            return false;
        if (other.getElasticChannelConfiguration() == null
                ^ this.getElasticChannelConfiguration() == null)
            return false;
        if (other.getElasticChannelConfiguration() != null
                && other.getElasticChannelConfiguration().equals(
                        this.getElasticChannelConfiguration()) == false)
            return false;
        if (other.getExpirationSettings() == null ^ this.getExpirationSettings() == null)
            return false;
        if (other.getExpirationSettings() != null
                && other.getExpirationSettings().equals(this.getExpirationSettings()) == false)
            return false;
        return true;
    }
}
