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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the content and settings for a push notification that's sent to
 * recipients of a campaign.
 * </p>
 */
public class Message implements Serializable {
    /**
     * <p>
     * The action to occur if a recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This setting uses the deep-linking features of iOS and Android.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     */
    private String action;

    /**
     * <p>
     * The body of the notification message. The maximum number of characters is
     * 200.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The URL of the image to display as the push-notification icon, such as
     * the icon for the app.
     * </p>
     */
    private String imageIconUrl;

    /**
     * <p>
     * The URL of the image to display as the small, push-notification icon,
     * such as a small version of the icon for the app.
     * </p>
     */
    private String imageSmallIconUrl;

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     */
    private String imageUrl;

    /**
     * <p>
     * The JSON payload to use for a silent push notification.
     * </p>
     */
    private String jsonBody;

    /**
     * <p>
     * The URL of the image or video to display in the push notification.
     * </p>
     */
    private String mediaUrl;

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides other values for the message.
     * </p>
     */
    private String rawContent;

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or
     * supporting phone home functionality.
     * </p>
     */
    private Boolean silentPush;

    /**
     * <p>
     * The number of seconds that the push-notification service should keep the
     * message, if the service is unable to deliver the notification the first
     * time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon
     * Device Messaging (ADM) service.
     * </p>
     */
    private Integer timeToLive;

    /**
     * <p>
     * The title to display above the notification message on a recipient's
     * device.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The URL to open in a recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The action to occur if a recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This setting uses the deep-linking features of iOS and Android.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @return <p>
     *         The action to occur if a recipient taps the push notification.
     *         Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         OPEN_APP - Your app opens or it becomes the foreground app if it
     *         was sent to the background. This is the default action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DEEP_LINK - Your app opens and displays a designated user
     *         interface in the app. This setting uses the deep-linking features
     *         of iOS and Android.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         URL - The default mobile browser on the recipient's device opens
     *         and loads the web page at a URL that you specify.
     *         </p>
     *         </li>
     *         </ul>
     * @see Action
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action to occur if a recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This setting uses the deep-linking features of iOS and Android.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action <p>
     *            The action to occur if a recipient taps the push notification.
     *            Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OPEN_APP - Your app opens or it becomes the foreground app if
     *            it was sent to the background. This is the default action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEEP_LINK - Your app opens and displays a designated user
     *            interface in the app. This setting uses the deep-linking
     *            features of iOS and Android.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            URL - The default mobile browser on the recipient's device
     *            opens and loads the web page at a URL that you specify.
     *            </p>
     *            </li>
     *            </ul>
     * @see Action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to occur if a recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This setting uses the deep-linking features of iOS and Android.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action <p>
     *            The action to occur if a recipient taps the push notification.
     *            Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OPEN_APP - Your app opens or it becomes the foreground app if
     *            it was sent to the background. This is the default action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEEP_LINK - Your app opens and displays a designated user
     *            interface in the app. This setting uses the deep-linking
     *            features of iOS and Android.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            URL - The default mobile browser on the recipient's device
     *            opens and loads the web page at a URL that you specify.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Action
     */
    public Message withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to occur if a recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This setting uses the deep-linking features of iOS and Android.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action <p>
     *            The action to occur if a recipient taps the push notification.
     *            Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OPEN_APP - Your app opens or it becomes the foreground app if
     *            it was sent to the background. This is the default action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEEP_LINK - Your app opens and displays a designated user
     *            interface in the app. This setting uses the deep-linking
     *            features of iOS and Android.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            URL - The default mobile browser on the recipient's device
     *            opens and loads the web page at a URL that you specify.
     *            </p>
     *            </li>
     *            </ul>
     * @see Action
     */
    public void setAction(Action action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action to occur if a recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This setting uses the deep-linking features of iOS and Android.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action <p>
     *            The action to occur if a recipient taps the push notification.
     *            Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OPEN_APP - Your app opens or it becomes the foreground app if
     *            it was sent to the background. This is the default action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEEP_LINK - Your app opens and displays a designated user
     *            interface in the app. This setting uses the deep-linking
     *            features of iOS and Android.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            URL - The default mobile browser on the recipient's device
     *            opens and loads the web page at a URL that you specify.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Action
     */
    public Message withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The body of the notification message. The maximum number of characters is
     * 200.
     * </p>
     *
     * @return <p>
     *         The body of the notification message. The maximum number of
     *         characters is 200.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The body of the notification message. The maximum number of characters is
     * 200.
     * </p>
     *
     * @param body <p>
     *            The body of the notification message. The maximum number of
     *            characters is 200.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the notification message. The maximum number of characters is
     * 200.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The body of the notification message. The maximum number of
     *            characters is 200.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The URL of the image to display as the push-notification icon, such as
     * the icon for the app.
     * </p>
     *
     * @return <p>
     *         The URL of the image to display as the push-notification icon,
     *         such as the icon for the app.
     *         </p>
     */
    public String getImageIconUrl() {
        return imageIconUrl;
    }

    /**
     * <p>
     * The URL of the image to display as the push-notification icon, such as
     * the icon for the app.
     * </p>
     *
     * @param imageIconUrl <p>
     *            The URL of the image to display as the push-notification icon,
     *            such as the icon for the app.
     *            </p>
     */
    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * <p>
     * The URL of the image to display as the push-notification icon, such as
     * the icon for the app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageIconUrl <p>
     *            The URL of the image to display as the push-notification icon,
     *            such as the icon for the app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
        return this;
    }

    /**
     * <p>
     * The URL of the image to display as the small, push-notification icon,
     * such as a small version of the icon for the app.
     * </p>
     *
     * @return <p>
     *         The URL of the image to display as the small, push-notification
     *         icon, such as a small version of the icon for the app.
     *         </p>
     */
    public String getImageSmallIconUrl() {
        return imageSmallIconUrl;
    }

    /**
     * <p>
     * The URL of the image to display as the small, push-notification icon,
     * such as a small version of the icon for the app.
     * </p>
     *
     * @param imageSmallIconUrl <p>
     *            The URL of the image to display as the small,
     *            push-notification icon, such as a small version of the icon
     *            for the app.
     *            </p>
     */
    public void setImageSmallIconUrl(String imageSmallIconUrl) {
        this.imageSmallIconUrl = imageSmallIconUrl;
    }

    /**
     * <p>
     * The URL of the image to display as the small, push-notification icon,
     * such as a small version of the icon for the app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageSmallIconUrl <p>
     *            The URL of the image to display as the small,
     *            push-notification icon, such as a small version of the icon
     *            for the app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withImageSmallIconUrl(String imageSmallIconUrl) {
        this.imageSmallIconUrl = imageSmallIconUrl;
        return this;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     *
     * @return <p>
     *         The URL of an image to display in the push notification.
     *         </p>
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     *
     * @param imageUrl <p>
     *            The URL of an image to display in the push notification.
     *            </p>
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageUrl <p>
     *            The URL of an image to display in the push notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification.
     * </p>
     *
     * @return <p>
     *         The JSON payload to use for a silent push notification.
     *         </p>
     */
    public String getJsonBody() {
        return jsonBody;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification.
     * </p>
     *
     * @param jsonBody <p>
     *            The JSON payload to use for a silent push notification.
     *            </p>
     */
    public void setJsonBody(String jsonBody) {
        this.jsonBody = jsonBody;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonBody <p>
     *            The JSON payload to use for a silent push notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withJsonBody(String jsonBody) {
        this.jsonBody = jsonBody;
        return this;
    }

    /**
     * <p>
     * The URL of the image or video to display in the push notification.
     * </p>
     *
     * @return <p>
     *         The URL of the image or video to display in the push
     *         notification.
     *         </p>
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * <p>
     * The URL of the image or video to display in the push notification.
     * </p>
     *
     * @param mediaUrl <p>
     *            The URL of the image or video to display in the push
     *            notification.
     *            </p>
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * <p>
     * The URL of the image or video to display in the push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaUrl <p>
     *            The URL of the image or video to display in the push
     *            notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides other values for the message.
     * </p>
     *
     * @return <p>
     *         The raw, JSON-formatted string to use as the payload for the
     *         notification message. This value overrides other values for the
     *         message.
     *         </p>
     */
    public String getRawContent() {
        return rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides other values for the message.
     * </p>
     *
     * @param rawContent <p>
     *            The raw, JSON-formatted string to use as the payload for the
     *            notification message. This value overrides other values for
     *            the message.
     *            </p>
     */
    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides other values for the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawContent <p>
     *            The raw, JSON-formatted string to use as the payload for the
     *            notification message. This value overrides other values for
     *            the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or
     * supporting phone home functionality.
     * </p>
     *
     * @return <p>
     *         Specifies whether the notification is a silent push notification,
     *         which is a push notification that doesn't display on a
     *         recipient's device. Silent push notifications can be used for
     *         cases such as updating an app's configuration, displaying
     *         messages in an in-app message center, or supporting phone home
     *         functionality.
     *         </p>
     */
    public Boolean isSilentPush() {
        return silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or
     * supporting phone home functionality.
     * </p>
     *
     * @return <p>
     *         Specifies whether the notification is a silent push notification,
     *         which is a push notification that doesn't display on a
     *         recipient's device. Silent push notifications can be used for
     *         cases such as updating an app's configuration, displaying
     *         messages in an in-app message center, or supporting phone home
     *         functionality.
     *         </p>
     */
    public Boolean getSilentPush() {
        return silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or
     * supporting phone home functionality.
     * </p>
     *
     * @param silentPush <p>
     *            Specifies whether the notification is a silent push
     *            notification, which is a push notification that doesn't
     *            display on a recipient's device. Silent push notifications can
     *            be used for cases such as updating an app's configuration,
     *            displaying messages in an in-app message center, or supporting
     *            phone home functionality.
     *            </p>
     */
    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration, displaying messages in an in-app message center, or
     * supporting phone home functionality.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param silentPush <p>
     *            Specifies whether the notification is a silent push
     *            notification, which is a push notification that doesn't
     *            display on a recipient's device. Silent push notifications can
     *            be used for cases such as updating an app's configuration,
     *            displaying messages in an in-app message center, or supporting
     *            phone home functionality.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
        return this;
    }

    /**
     * <p>
     * The number of seconds that the push-notification service should keep the
     * message, if the service is unable to deliver the notification the first
     * time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon
     * Device Messaging (ADM) service.
     * </p>
     *
     * @return <p>
     *         The number of seconds that the push-notification service should
     *         keep the message, if the service is unable to deliver the
     *         notification the first time. This value is converted to an
     *         expiration value when it's sent to a push-notification service.
     *         If this value is 0, the service treats the notification as if it
     *         expires immediately and the service doesn't store or try to
     *         deliver the notification again.
     *         </p>
     *         <p>
     *         This value doesn't apply to messages that are sent through the
     *         Amazon Device Messaging (ADM) service.
     *         </p>
     */
    public Integer getTimeToLive() {
        return timeToLive;
    }

    /**
     * <p>
     * The number of seconds that the push-notification service should keep the
     * message, if the service is unable to deliver the notification the first
     * time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon
     * Device Messaging (ADM) service.
     * </p>
     *
     * @param timeToLive <p>
     *            The number of seconds that the push-notification service
     *            should keep the message, if the service is unable to deliver
     *            the notification the first time. This value is converted to an
     *            expiration value when it's sent to a push-notification
     *            service. If this value is 0, the service treats the
     *            notification as if it expires immediately and the service
     *            doesn't store or try to deliver the notification again.
     *            </p>
     *            <p>
     *            This value doesn't apply to messages that are sent through the
     *            Amazon Device Messaging (ADM) service.
     *            </p>
     */
    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * The number of seconds that the push-notification service should keep the
     * message, if the service is unable to deliver the notification the first
     * time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon
     * Device Messaging (ADM) service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLive <p>
     *            The number of seconds that the push-notification service
     *            should keep the message, if the service is unable to deliver
     *            the notification the first time. This value is converted to an
     *            expiration value when it's sent to a push-notification
     *            service. If this value is 0, the service treats the
     *            notification as if it expires immediately and the service
     *            doesn't store or try to deliver the notification again.
     *            </p>
     *            <p>
     *            This value doesn't apply to messages that are sent through the
     *            Amazon Device Messaging (ADM) service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * <p>
     * The title to display above the notification message on a recipient's
     * device.
     * </p>
     *
     * @return <p>
     *         The title to display above the notification message on a
     *         recipient's device.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title to display above the notification message on a recipient's
     * device.
     * </p>
     *
     * @param title <p>
     *            The title to display above the notification message on a
     *            recipient's device.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title to display above the notification message on a recipient's
     * device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title to display above the notification message on a
     *            recipient's device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The URL to open in a recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     *
     * @return <p>
     *         The URL to open in a recipient's default mobile browser, if a
     *         recipient taps the push notification and the value of the Action
     *         property is URL.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL to open in a recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     *
     * @param url <p>
     *            The URL to open in a recipient's default mobile browser, if a
     *            recipient taps the push notification and the value of the
     *            Action property is URL.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to open in a recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL to open in a recipient's default mobile browser, if a
     *            recipient taps the push notification and the value of the
     *            Action property is URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withUrl(String url) {
        this.url = url;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getImageIconUrl() != null)
            sb.append("ImageIconUrl: " + getImageIconUrl() + ",");
        if (getImageSmallIconUrl() != null)
            sb.append("ImageSmallIconUrl: " + getImageSmallIconUrl() + ",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: " + getImageUrl() + ",");
        if (getJsonBody() != null)
            sb.append("JsonBody: " + getJsonBody() + ",");
        if (getMediaUrl() != null)
            sb.append("MediaUrl: " + getMediaUrl() + ",");
        if (getRawContent() != null)
            sb.append("RawContent: " + getRawContent() + ",");
        if (getSilentPush() != null)
            sb.append("SilentPush: " + getSilentPush() + ",");
        if (getTimeToLive() != null)
            sb.append("TimeToLive: " + getTimeToLive() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getImageIconUrl() == null) ? 0 : getImageIconUrl().hashCode());
        hashCode = prime * hashCode
                + ((getImageSmallIconUrl() == null) ? 0 : getImageSmallIconUrl().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getJsonBody() == null) ? 0 : getJsonBody().hashCode());
        hashCode = prime * hashCode + ((getMediaUrl() == null) ? 0 : getMediaUrl().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getImageIconUrl() == null ^ this.getImageIconUrl() == null)
            return false;
        if (other.getImageIconUrl() != null
                && other.getImageIconUrl().equals(this.getImageIconUrl()) == false)
            return false;
        if (other.getImageSmallIconUrl() == null ^ this.getImageSmallIconUrl() == null)
            return false;
        if (other.getImageSmallIconUrl() != null
                && other.getImageSmallIconUrl().equals(this.getImageSmallIconUrl()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getJsonBody() == null ^ this.getJsonBody() == null)
            return false;
        if (other.getJsonBody() != null && other.getJsonBody().equals(this.getJsonBody()) == false)
            return false;
        if (other.getMediaUrl() == null ^ this.getMediaUrl() == null)
            return false;
        if (other.getMediaUrl() != null && other.getMediaUrl().equals(this.getMediaUrl()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null
                && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSilentPush() == null ^ this.getSilentPush() == null)
            return false;
        if (other.getSilentPush() != null
                && other.getSilentPush().equals(this.getSilentPush()) == false)
            return false;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null
                && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
