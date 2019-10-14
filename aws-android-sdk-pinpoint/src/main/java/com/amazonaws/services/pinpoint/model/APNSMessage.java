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
 * Specifies the settings for a one-time message that's sent directly to an
 * endpoint through the APNs (Apple Push Notification service) channel.
 * </p>
 */
public class APNSMessage implements Serializable {
    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
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
     * the app. This setting uses the deep-linking features of the iOS platform.
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
     * The key that indicates whether and how to modify the badge of your app's
     * icon when the recipient receives the push notification. If this key isn't
     * included in the dictionary, the badge doesn't change. To remove the
     * badge, set this value to 0.
     * </p>
     */
    private Integer badge;

    /**
     * <p>
     * The body of the notification message.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The key that indicates the notification type for the push notification.
     * This key is a value that's defined by the identifier property of one of
     * your app's registered categories.
     * </p>
     */
    private String category;

    /**
     * <p>
     * An arbitrary identifier that, if assigned to multiple messages, APNs uses
     * to coalesce the messages into a single push notification instead of
     * delivering each message individually. This value can't exceed 64 bytes.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-collapse-id request
     * header when it sends the notification message to APNs.
     * </p>
     */
    private String collapseId;

    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is
     * added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     */
    private java.util.Map<String, String> data;

    /**
     * <p>
     * The URL of an image or video to display in the push notification.
     * </p>
     */
    private String mediaUrl;

    /**
     * <p>
     * The authentication method that you want Amazon Pinpoint to use when
     * authenticating with Apple Push Notification service (APNs), CERTIFICATE
     * or TOKEN.
     * </p>
     */
    private String preferredAuthenticationMethod;

    /**
     * <p>
     * para>5 - Low priority, the notification might be delayed, delivered as
     * part of a group, or throttled.
     * </p>
     * /listitem> <li>
     * <p>
     * 10 - High priority, the notification is sent immediately. This is the
     * default value. A high priority notification should trigger an alert, play
     * a sound, or badge your app's icon on the recipient's device.
     * </p>
     * </li>/para>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-priority request header
     * when it sends the notification message to APNs.
     * </p>
     * <p>
     * The equivalent values for Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), are normal, for 5, and high, for 10. If you
     * specify an FCM value for this property, Amazon Pinpoint accepts and
     * converts the value to the corresponding APNs value.
     * </p>
     */
    private String priority;

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides the message.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. The value of the
     * content-available key has to be an integer, and can only be 0 or 1. If
     * you're sending a standard notification, set the value of
     * content-available to 0. If you're sending a silent (background)
     * notification, set the value of content-available to 1. Additionally,
     * silent notification payloads can't include the alert, badge, or sound
     * keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * </note>
     */
    private String rawContent;

    /**
     * <p>
     * Specifies whether the notification is a silent push notification. A
     * silent (or background) push notification isn't displayed on recipients'
     * devices. You can use silent push notifications to make small updates to
     * your app, or to display messages in an in-app message center.
     * </p>
     * <p>
     * Amazon Pinpoint uses this property to determine the correct value for the
     * apns-push-type request header when it sends the notification message to
     * APNs. If you specify a value of true for this property, Amazon Pinpoint
     * sets the value for the apns-push-type header field to background.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. For silent (background)
     * notifications, set the value of content-available to 1. Additionally, the
     * message payload for a silent notification can't include the alert, badge,
     * or sound keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * <p>
     * Apple has indicated that they will throttle "excessive" background
     * notifications based on current traffic volumes. To prevent your
     * notifications being throttled, Apple recommends that you send no more
     * than 3 silent push notifications to each recipient per hour.
     * </p>
     * </note>
     */
    private Boolean silentPush;

    /**
     * <p>
     * The key for the sound to play when the recipient receives the push
     * notification. The value for this key is the name of a sound file in your
     * app's main bundle or the Library/Sounds folder in your app's data
     * container. If the sound file can't be found or you specify default for
     * the value, the system plays the default alert sound.
     * </p>
     */
    private String sound;

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override these default variables with individual address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * <p>
     * The key that represents your app-specific identifier for grouping
     * notifications. If you provide a Notification Content app extension, you
     * can use this value to group your notifications together.
     * </p>
     */
    private String threadId;

    /**
     * <p>
     * The amount of time, in seconds, that APNs should store and attempt to
     * deliver the push notification, if the service is unable to deliver the
     * notification the first time. If this value is 0, APNs treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-expiration request
     * header when it sends the notification message to APNs.
     * </p>
     */
    private Integer timeToLive;

    /**
     * <p>
     * The title to display above the notification message on the recipient's
     * device.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
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
     * the app. This setting uses the deep-linking features of the iOS platform.
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
     *         The action to occur if the recipient taps the push notification.
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
     *         of the iOS platform.
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
     * The action to occur if the recipient taps the push notification. Valid
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
     * the app. This setting uses the deep-linking features of the iOS platform.
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
     *            The action to occur if the recipient taps the push
     *            notification. Valid values are:
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
     *            features of the iOS platform.
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
     * The action to occur if the recipient taps the push notification. Valid
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
     * the app. This setting uses the deep-linking features of the iOS platform.
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
     *            The action to occur if the recipient taps the push
     *            notification. Valid values are:
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
     *            features of the iOS platform.
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
    public APNSMessage withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
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
     * the app. This setting uses the deep-linking features of the iOS platform.
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
     *            The action to occur if the recipient taps the push
     *            notification. Valid values are:
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
     *            features of the iOS platform.
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
     * The action to occur if the recipient taps the push notification. Valid
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
     * the app. This setting uses the deep-linking features of the iOS platform.
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
     *            The action to occur if the recipient taps the push
     *            notification. Valid values are:
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
     *            features of the iOS platform.
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
    public APNSMessage withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The key that indicates whether and how to modify the badge of your app's
     * icon when the recipient receives the push notification. If this key isn't
     * included in the dictionary, the badge doesn't change. To remove the
     * badge, set this value to 0.
     * </p>
     *
     * @return <p>
     *         The key that indicates whether and how to modify the badge of
     *         your app's icon when the recipient receives the push
     *         notification. If this key isn't included in the dictionary, the
     *         badge doesn't change. To remove the badge, set this value to 0.
     *         </p>
     */
    public Integer getBadge() {
        return badge;
    }

    /**
     * <p>
     * The key that indicates whether and how to modify the badge of your app's
     * icon when the recipient receives the push notification. If this key isn't
     * included in the dictionary, the badge doesn't change. To remove the
     * badge, set this value to 0.
     * </p>
     *
     * @param badge <p>
     *            The key that indicates whether and how to modify the badge of
     *            your app's icon when the recipient receives the push
     *            notification. If this key isn't included in the dictionary,
     *            the badge doesn't change. To remove the badge, set this value
     *            to 0.
     *            </p>
     */
    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    /**
     * <p>
     * The key that indicates whether and how to modify the badge of your app's
     * icon when the recipient receives the push notification. If this key isn't
     * included in the dictionary, the badge doesn't change. To remove the
     * badge, set this value to 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param badge <p>
     *            The key that indicates whether and how to modify the badge of
     *            your app's icon when the recipient receives the push
     *            notification. If this key isn't included in the dictionary,
     *            the badge doesn't change. To remove the badge, set this value
     *            to 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withBadge(Integer badge) {
        this.badge = badge;
        return this;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     *
     * @return <p>
     *         The body of the notification message.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     *
     * @param body <p>
     *            The body of the notification message.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The body of the notification message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The key that indicates the notification type for the push notification.
     * This key is a value that's defined by the identifier property of one of
     * your app's registered categories.
     * </p>
     *
     * @return <p>
     *         The key that indicates the notification type for the push
     *         notification. This key is a value that's defined by the
     *         identifier property of one of your app's registered categories.
     *         </p>
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The key that indicates the notification type for the push notification.
     * This key is a value that's defined by the identifier property of one of
     * your app's registered categories.
     * </p>
     *
     * @param category <p>
     *            The key that indicates the notification type for the push
     *            notification. This key is a value that's defined by the
     *            identifier property of one of your app's registered
     *            categories.
     *            </p>
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The key that indicates the notification type for the push notification.
     * This key is a value that's defined by the identifier property of one of
     * your app's registered categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param category <p>
     *            The key that indicates the notification type for the push
     *            notification. This key is a value that's defined by the
     *            identifier property of one of your app's registered
     *            categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * An arbitrary identifier that, if assigned to multiple messages, APNs uses
     * to coalesce the messages into a single push notification instead of
     * delivering each message individually. This value can't exceed 64 bytes.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-collapse-id request
     * header when it sends the notification message to APNs.
     * </p>
     *
     * @return <p>
     *         An arbitrary identifier that, if assigned to multiple messages,
     *         APNs uses to coalesce the messages into a single push
     *         notification instead of delivering each message individually.
     *         This value can't exceed 64 bytes.
     *         </p>
     *         <p>
     *         Amazon Pinpoint specifies this value in the apns-collapse-id
     *         request header when it sends the notification message to APNs.
     *         </p>
     */
    public String getCollapseId() {
        return collapseId;
    }

    /**
     * <p>
     * An arbitrary identifier that, if assigned to multiple messages, APNs uses
     * to coalesce the messages into a single push notification instead of
     * delivering each message individually. This value can't exceed 64 bytes.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-collapse-id request
     * header when it sends the notification message to APNs.
     * </p>
     *
     * @param collapseId <p>
     *            An arbitrary identifier that, if assigned to multiple
     *            messages, APNs uses to coalesce the messages into a single
     *            push notification instead of delivering each message
     *            individually. This value can't exceed 64 bytes.
     *            </p>
     *            <p>
     *            Amazon Pinpoint specifies this value in the apns-collapse-id
     *            request header when it sends the notification message to APNs.
     *            </p>
     */
    public void setCollapseId(String collapseId) {
        this.collapseId = collapseId;
    }

    /**
     * <p>
     * An arbitrary identifier that, if assigned to multiple messages, APNs uses
     * to coalesce the messages into a single push notification instead of
     * delivering each message individually. This value can't exceed 64 bytes.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-collapse-id request
     * header when it sends the notification message to APNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collapseId <p>
     *            An arbitrary identifier that, if assigned to multiple
     *            messages, APNs uses to coalesce the messages into a single
     *            push notification instead of delivering each message
     *            individually. This value can't exceed 64 bytes.
     *            </p>
     *            <p>
     *            Amazon Pinpoint specifies this value in the apns-collapse-id
     *            request header when it sends the notification message to APNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withCollapseId(String collapseId) {
        this.collapseId = collapseId;
        return this;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is
     * added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     *
     * @return <p>
     *         The JSON payload to use for a silent push notification. This
     *         payload is added to the data.pinpoint.jsonBody object of the
     *         notification.
     *         </p>
     */
    public java.util.Map<String, String> getData() {
        return data;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is
     * added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     *
     * @param data <p>
     *            The JSON payload to use for a silent push notification. This
     *            payload is added to the data.pinpoint.jsonBody object of the
     *            notification.
     *            </p>
     */
    public void setData(java.util.Map<String, String> data) {
        this.data = data;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is
     * added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The JSON payload to use for a silent push notification. This
     *            payload is added to the data.pinpoint.jsonBody object of the
     *            notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * The JSON payload to use for a silent push notification. This payload is
     * added to the data.pinpoint.jsonBody object of the notification.
     * </p>
     * <p>
     * The method adds a new key-value pair into Data parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Data.
     * @param value The corresponding value of the entry to be added into Data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage addDataEntry(String key, String value) {
        if (null == this.data) {
            this.data = new java.util.HashMap<String, String>();
        }
        if (this.data.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.data.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public APNSMessage clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * <p>
     * The URL of an image or video to display in the push notification.
     * </p>
     *
     * @return <p>
     *         The URL of an image or video to display in the push notification.
     *         </p>
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * <p>
     * The URL of an image or video to display in the push notification.
     * </p>
     *
     * @param mediaUrl <p>
     *            The URL of an image or video to display in the push
     *            notification.
     *            </p>
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * <p>
     * The URL of an image or video to display in the push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaUrl <p>
     *            The URL of an image or video to display in the push
     *            notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * <p>
     * The authentication method that you want Amazon Pinpoint to use when
     * authenticating with Apple Push Notification service (APNs), CERTIFICATE
     * or TOKEN.
     * </p>
     *
     * @return <p>
     *         The authentication method that you want Amazon Pinpoint to use
     *         when authenticating with Apple Push Notification service (APNs),
     *         CERTIFICATE or TOKEN.
     *         </p>
     */
    public String getPreferredAuthenticationMethod() {
        return preferredAuthenticationMethod;
    }

    /**
     * <p>
     * The authentication method that you want Amazon Pinpoint to use when
     * authenticating with Apple Push Notification service (APNs), CERTIFICATE
     * or TOKEN.
     * </p>
     *
     * @param preferredAuthenticationMethod <p>
     *            The authentication method that you want Amazon Pinpoint to use
     *            when authenticating with Apple Push Notification service
     *            (APNs), CERTIFICATE or TOKEN.
     *            </p>
     */
    public void setPreferredAuthenticationMethod(String preferredAuthenticationMethod) {
        this.preferredAuthenticationMethod = preferredAuthenticationMethod;
    }

    /**
     * <p>
     * The authentication method that you want Amazon Pinpoint to use when
     * authenticating with Apple Push Notification service (APNs), CERTIFICATE
     * or TOKEN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredAuthenticationMethod <p>
     *            The authentication method that you want Amazon Pinpoint to use
     *            when authenticating with Apple Push Notification service
     *            (APNs), CERTIFICATE or TOKEN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withPreferredAuthenticationMethod(String preferredAuthenticationMethod) {
        this.preferredAuthenticationMethod = preferredAuthenticationMethod;
        return this;
    }

    /**
     * <p>
     * para>5 - Low priority, the notification might be delayed, delivered as
     * part of a group, or throttled.
     * </p>
     * /listitem> <li>
     * <p>
     * 10 - High priority, the notification is sent immediately. This is the
     * default value. A high priority notification should trigger an alert, play
     * a sound, or badge your app's icon on the recipient's device.
     * </p>
     * </li>/para>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-priority request header
     * when it sends the notification message to APNs.
     * </p>
     * <p>
     * The equivalent values for Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), are normal, for 5, and high, for 10. If you
     * specify an FCM value for this property, Amazon Pinpoint accepts and
     * converts the value to the corresponding APNs value.
     * </p>
     *
     * @return <p>
     *         para>5 - Low priority, the notification might be delayed,
     *         delivered as part of a group, or throttled.
     *         </p>
     *         /listitem> <li>
     *         <p>
     *         10 - High priority, the notification is sent immediately. This is
     *         the default value. A high priority notification should trigger an
     *         alert, play a sound, or badge your app's icon on the recipient's
     *         device.
     *         </p>
     *         </li>/para>
     *         <p>
     *         Amazon Pinpoint specifies this value in the apns-priority request
     *         header when it sends the notification message to APNs.
     *         </p>
     *         <p>
     *         The equivalent values for Firebase Cloud Messaging (FCM),
     *         formerly Google Cloud Messaging (GCM), are normal, for 5, and
     *         high, for 10. If you specify an FCM value for this property,
     *         Amazon Pinpoint accepts and converts the value to the
     *         corresponding APNs value.
     *         </p>
     */
    public String getPriority() {
        return priority;
    }

    /**
     * <p>
     * para>5 - Low priority, the notification might be delayed, delivered as
     * part of a group, or throttled.
     * </p>
     * /listitem> <li>
     * <p>
     * 10 - High priority, the notification is sent immediately. This is the
     * default value. A high priority notification should trigger an alert, play
     * a sound, or badge your app's icon on the recipient's device.
     * </p>
     * </li>/para>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-priority request header
     * when it sends the notification message to APNs.
     * </p>
     * <p>
     * The equivalent values for Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), are normal, for 5, and high, for 10. If you
     * specify an FCM value for this property, Amazon Pinpoint accepts and
     * converts the value to the corresponding APNs value.
     * </p>
     *
     * @param priority <p>
     *            para>5 - Low priority, the notification might be delayed,
     *            delivered as part of a group, or throttled.
     *            </p>
     *            /listitem> <li>
     *            <p>
     *            10 - High priority, the notification is sent immediately. This
     *            is the default value. A high priority notification should
     *            trigger an alert, play a sound, or badge your app's icon on
     *            the recipient's device.
     *            </p>
     *            </li>/para>
     *            <p>
     *            Amazon Pinpoint specifies this value in the apns-priority
     *            request header when it sends the notification message to APNs.
     *            </p>
     *            <p>
     *            The equivalent values for Firebase Cloud Messaging (FCM),
     *            formerly Google Cloud Messaging (GCM), are normal, for 5, and
     *            high, for 10. If you specify an FCM value for this property,
     *            Amazon Pinpoint accepts and converts the value to the
     *            corresponding APNs value.
     *            </p>
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * para>5 - Low priority, the notification might be delayed, delivered as
     * part of a group, or throttled.
     * </p>
     * /listitem> <li>
     * <p>
     * 10 - High priority, the notification is sent immediately. This is the
     * default value. A high priority notification should trigger an alert, play
     * a sound, or badge your app's icon on the recipient's device.
     * </p>
     * </li>/para>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-priority request header
     * when it sends the notification message to APNs.
     * </p>
     * <p>
     * The equivalent values for Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), are normal, for 5, and high, for 10. If you
     * specify an FCM value for this property, Amazon Pinpoint accepts and
     * converts the value to the corresponding APNs value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priority <p>
     *            para>5 - Low priority, the notification might be delayed,
     *            delivered as part of a group, or throttled.
     *            </p>
     *            /listitem> <li>
     *            <p>
     *            10 - High priority, the notification is sent immediately. This
     *            is the default value. A high priority notification should
     *            trigger an alert, play a sound, or badge your app's icon on
     *            the recipient's device.
     *            </p>
     *            </li>/para>
     *            <p>
     *            Amazon Pinpoint specifies this value in the apns-priority
     *            request header when it sends the notification message to APNs.
     *            </p>
     *            <p>
     *            The equivalent values for Firebase Cloud Messaging (FCM),
     *            formerly Google Cloud Messaging (GCM), are normal, for 5, and
     *            high, for 10. If you specify an FCM value for this property,
     *            Amazon Pinpoint accepts and converts the value to the
     *            corresponding APNs value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides the message.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. The value of the
     * content-available key has to be an integer, and can only be 0 or 1. If
     * you're sending a standard notification, set the value of
     * content-available to 0. If you're sending a silent (background)
     * notification, set the value of content-available to 1. Additionally,
     * silent notification payloads can't include the alert, badge, or sound
     * keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * </note>
     *
     * @return <p>
     *         The raw, JSON-formatted string to use as the payload for the
     *         notification message. This value overrides the message.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify the raw content of an APNs push notification, the
     *         message payload has to include the content-available key. The
     *         value of the content-available key has to be an integer, and can
     *         only be 0 or 1. If you're sending a standard notification, set
     *         the value of content-available to 0. If you're sending a silent
     *         (background) notification, set the value of content-available to
     *         1. Additionally, silent notification payloads can't include the
     *         alert, badge, or sound keys. For more information, see <a href=
     *         "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     *         >Generating a Remote Notification</a> and <a href=
     *         "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     *         >Pushing Background Updates to Your App</a> on the Apple
     *         Developer website.
     *         </p>
     *         </note>
     */
    public String getRawContent() {
        return rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides the message.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. The value of the
     * content-available key has to be an integer, and can only be 0 or 1. If
     * you're sending a standard notification, set the value of
     * content-available to 0. If you're sending a silent (background)
     * notification, set the value of content-available to 1. Additionally,
     * silent notification payloads can't include the alert, badge, or sound
     * keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * </note>
     *
     * @param rawContent <p>
     *            The raw, JSON-formatted string to use as the payload for the
     *            notification message. This value overrides the message.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify the raw content of an APNs push notification,
     *            the message payload has to include the content-available key.
     *            The value of the content-available key has to be an integer,
     *            and can only be 0 or 1. If you're sending a standard
     *            notification, set the value of content-available to 0. If
     *            you're sending a silent (background) notification, set the
     *            value of content-available to 1. Additionally, silent
     *            notification payloads can't include the alert, badge, or sound
     *            keys. For more information, see <a href=
     *            "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     *            >Generating a Remote Notification</a> and <a href=
     *            "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     *            >Pushing Background Updates to Your App</a> on the Apple
     *            Developer website.
     *            </p>
     *            </note>
     */
    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides the message.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. The value of the
     * content-available key has to be an integer, and can only be 0 or 1. If
     * you're sending a standard notification, set the value of
     * content-available to 0. If you're sending a silent (background)
     * notification, set the value of content-available to 1. Additionally,
     * silent notification payloads can't include the alert, badge, or sound
     * keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawContent <p>
     *            The raw, JSON-formatted string to use as the payload for the
     *            notification message. This value overrides the message.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify the raw content of an APNs push notification,
     *            the message payload has to include the content-available key.
     *            The value of the content-available key has to be an integer,
     *            and can only be 0 or 1. If you're sending a standard
     *            notification, set the value of content-available to 0. If
     *            you're sending a silent (background) notification, set the
     *            value of content-available to 1. Additionally, silent
     *            notification payloads can't include the alert, badge, or sound
     *            keys. For more information, see <a href=
     *            "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     *            >Generating a Remote Notification</a> and <a href=
     *            "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     *            >Pushing Background Updates to Your App</a> on the Apple
     *            Developer website.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification. A
     * silent (or background) push notification isn't displayed on recipients'
     * devices. You can use silent push notifications to make small updates to
     * your app, or to display messages in an in-app message center.
     * </p>
     * <p>
     * Amazon Pinpoint uses this property to determine the correct value for the
     * apns-push-type request header when it sends the notification message to
     * APNs. If you specify a value of true for this property, Amazon Pinpoint
     * sets the value for the apns-push-type header field to background.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. For silent (background)
     * notifications, set the value of content-available to 1. Additionally, the
     * message payload for a silent notification can't include the alert, badge,
     * or sound keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * <p>
     * Apple has indicated that they will throttle "excessive" background
     * notifications based on current traffic volumes. To prevent your
     * notifications being throttled, Apple recommends that you send no more
     * than 3 silent push notifications to each recipient per hour.
     * </p>
     * </note>
     *
     * @return <p>
     *         Specifies whether the notification is a silent push notification.
     *         A silent (or background) push notification isn't displayed on
     *         recipients' devices. You can use silent push notifications to
     *         make small updates to your app, or to display messages in an
     *         in-app message center.
     *         </p>
     *         <p>
     *         Amazon Pinpoint uses this property to determine the correct value
     *         for the apns-push-type request header when it sends the
     *         notification message to APNs. If you specify a value of true for
     *         this property, Amazon Pinpoint sets the value for the
     *         apns-push-type header field to background.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify the raw content of an APNs push notification, the
     *         message payload has to include the content-available key. For
     *         silent (background) notifications, set the value of
     *         content-available to 1. Additionally, the message payload for a
     *         silent notification can't include the alert, badge, or sound
     *         keys. For more information, see <a href=
     *         "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     *         >Generating a Remote Notification</a> and <a href=
     *         "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     *         >Pushing Background Updates to Your App</a> on the Apple
     *         Developer website.
     *         </p>
     *         <p>
     *         Apple has indicated that they will throttle "excessive"
     *         background notifications based on current traffic volumes. To
     *         prevent your notifications being throttled, Apple recommends that
     *         you send no more than 3 silent push notifications to each
     *         recipient per hour.
     *         </p>
     *         </note>
     */
    public Boolean isSilentPush() {
        return silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification. A
     * silent (or background) push notification isn't displayed on recipients'
     * devices. You can use silent push notifications to make small updates to
     * your app, or to display messages in an in-app message center.
     * </p>
     * <p>
     * Amazon Pinpoint uses this property to determine the correct value for the
     * apns-push-type request header when it sends the notification message to
     * APNs. If you specify a value of true for this property, Amazon Pinpoint
     * sets the value for the apns-push-type header field to background.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. For silent (background)
     * notifications, set the value of content-available to 1. Additionally, the
     * message payload for a silent notification can't include the alert, badge,
     * or sound keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * <p>
     * Apple has indicated that they will throttle "excessive" background
     * notifications based on current traffic volumes. To prevent your
     * notifications being throttled, Apple recommends that you send no more
     * than 3 silent push notifications to each recipient per hour.
     * </p>
     * </note>
     *
     * @return <p>
     *         Specifies whether the notification is a silent push notification.
     *         A silent (or background) push notification isn't displayed on
     *         recipients' devices. You can use silent push notifications to
     *         make small updates to your app, or to display messages in an
     *         in-app message center.
     *         </p>
     *         <p>
     *         Amazon Pinpoint uses this property to determine the correct value
     *         for the apns-push-type request header when it sends the
     *         notification message to APNs. If you specify a value of true for
     *         this property, Amazon Pinpoint sets the value for the
     *         apns-push-type header field to background.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify the raw content of an APNs push notification, the
     *         message payload has to include the content-available key. For
     *         silent (background) notifications, set the value of
     *         content-available to 1. Additionally, the message payload for a
     *         silent notification can't include the alert, badge, or sound
     *         keys. For more information, see <a href=
     *         "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     *         >Generating a Remote Notification</a> and <a href=
     *         "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     *         >Pushing Background Updates to Your App</a> on the Apple
     *         Developer website.
     *         </p>
     *         <p>
     *         Apple has indicated that they will throttle "excessive"
     *         background notifications based on current traffic volumes. To
     *         prevent your notifications being throttled, Apple recommends that
     *         you send no more than 3 silent push notifications to each
     *         recipient per hour.
     *         </p>
     *         </note>
     */
    public Boolean getSilentPush() {
        return silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification. A
     * silent (or background) push notification isn't displayed on recipients'
     * devices. You can use silent push notifications to make small updates to
     * your app, or to display messages in an in-app message center.
     * </p>
     * <p>
     * Amazon Pinpoint uses this property to determine the correct value for the
     * apns-push-type request header when it sends the notification message to
     * APNs. If you specify a value of true for this property, Amazon Pinpoint
     * sets the value for the apns-push-type header field to background.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. For silent (background)
     * notifications, set the value of content-available to 1. Additionally, the
     * message payload for a silent notification can't include the alert, badge,
     * or sound keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * <p>
     * Apple has indicated that they will throttle "excessive" background
     * notifications based on current traffic volumes. To prevent your
     * notifications being throttled, Apple recommends that you send no more
     * than 3 silent push notifications to each recipient per hour.
     * </p>
     * </note>
     *
     * @param silentPush <p>
     *            Specifies whether the notification is a silent push
     *            notification. A silent (or background) push notification isn't
     *            displayed on recipients' devices. You can use silent push
     *            notifications to make small updates to your app, or to display
     *            messages in an in-app message center.
     *            </p>
     *            <p>
     *            Amazon Pinpoint uses this property to determine the correct
     *            value for the apns-push-type request header when it sends the
     *            notification message to APNs. If you specify a value of true
     *            for this property, Amazon Pinpoint sets the value for the
     *            apns-push-type header field to background.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify the raw content of an APNs push notification,
     *            the message payload has to include the content-available key.
     *            For silent (background) notifications, set the value of
     *            content-available to 1. Additionally, the message payload for
     *            a silent notification can't include the alert, badge, or sound
     *            keys. For more information, see <a href=
     *            "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     *            >Generating a Remote Notification</a> and <a href=
     *            "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     *            >Pushing Background Updates to Your App</a> on the Apple
     *            Developer website.
     *            </p>
     *            <p>
     *            Apple has indicated that they will throttle "excessive"
     *            background notifications based on current traffic volumes. To
     *            prevent your notifications being throttled, Apple recommends
     *            that you send no more than 3 silent push notifications to each
     *            recipient per hour.
     *            </p>
     *            </note>
     */
    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification. A
     * silent (or background) push notification isn't displayed on recipients'
     * devices. You can use silent push notifications to make small updates to
     * your app, or to display messages in an in-app message center.
     * </p>
     * <p>
     * Amazon Pinpoint uses this property to determine the correct value for the
     * apns-push-type request header when it sends the notification message to
     * APNs. If you specify a value of true for this property, Amazon Pinpoint
     * sets the value for the apns-push-type header field to background.
     * </p>
     * <note>
     * <p>
     * If you specify the raw content of an APNs push notification, the message
     * payload has to include the content-available key. For silent (background)
     * notifications, set the value of content-available to 1. Additionally, the
     * message payload for a silent notification can't include the alert, badge,
     * or sound keys. For more information, see <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     * >Generating a Remote Notification</a> and <a href=
     * "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     * >Pushing Background Updates to Your App</a> on the Apple Developer
     * website.
     * </p>
     * <p>
     * Apple has indicated that they will throttle "excessive" background
     * notifications based on current traffic volumes. To prevent your
     * notifications being throttled, Apple recommends that you send no more
     * than 3 silent push notifications to each recipient per hour.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param silentPush <p>
     *            Specifies whether the notification is a silent push
     *            notification. A silent (or background) push notification isn't
     *            displayed on recipients' devices. You can use silent push
     *            notifications to make small updates to your app, or to display
     *            messages in an in-app message center.
     *            </p>
     *            <p>
     *            Amazon Pinpoint uses this property to determine the correct
     *            value for the apns-push-type request header when it sends the
     *            notification message to APNs. If you specify a value of true
     *            for this property, Amazon Pinpoint sets the value for the
     *            apns-push-type header field to background.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify the raw content of an APNs push notification,
     *            the message payload has to include the content-available key.
     *            For silent (background) notifications, set the value of
     *            content-available to 1. Additionally, the message payload for
     *            a silent notification can't include the alert, badge, or sound
     *            keys. For more information, see <a href=
     *            "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification"
     *            >Generating a Remote Notification</a> and <a href=
     *            "https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/pushing_background_updates_to_your_app"
     *            >Pushing Background Updates to Your App</a> on the Apple
     *            Developer website.
     *            </p>
     *            <p>
     *            Apple has indicated that they will throttle "excessive"
     *            background notifications based on current traffic volumes. To
     *            prevent your notifications being throttled, Apple recommends
     *            that you send no more than 3 silent push notifications to each
     *            recipient per hour.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
        return this;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives the push
     * notification. The value for this key is the name of a sound file in your
     * app's main bundle or the Library/Sounds folder in your app's data
     * container. If the sound file can't be found or you specify default for
     * the value, the system plays the default alert sound.
     * </p>
     *
     * @return <p>
     *         The key for the sound to play when the recipient receives the
     *         push notification. The value for this key is the name of a sound
     *         file in your app's main bundle or the Library/Sounds folder in
     *         your app's data container. If the sound file can't be found or
     *         you specify default for the value, the system plays the default
     *         alert sound.
     *         </p>
     */
    public String getSound() {
        return sound;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives the push
     * notification. The value for this key is the name of a sound file in your
     * app's main bundle or the Library/Sounds folder in your app's data
     * container. If the sound file can't be found or you specify default for
     * the value, the system plays the default alert sound.
     * </p>
     *
     * @param sound <p>
     *            The key for the sound to play when the recipient receives the
     *            push notification. The value for this key is the name of a
     *            sound file in your app's main bundle or the Library/Sounds
     *            folder in your app's data container. If the sound file can't
     *            be found or you specify default for the value, the system
     *            plays the default alert sound.
     *            </p>
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives the push
     * notification. The value for this key is the name of a sound file in your
     * app's main bundle or the Library/Sounds folder in your app's data
     * container. If the sound file can't be found or you specify default for
     * the value, the system plays the default alert sound.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sound <p>
     *            The key for the sound to play when the recipient receives the
     *            push notification. The value for this key is the name of a
     *            sound file in your app's main bundle or the Library/Sounds
     *            folder in your app's data container. If the sound file can't
     *            be found or you specify default for the value, the system
     *            plays the default alert sound.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withSound(String sound) {
        this.sound = sound;
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override these default variables with individual address variables.
     * </p>
     *
     * @return <p>
     *         The default message variables to use in the notification message.
     *         You can override these default variables with individual address
     *         variables.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override these default variables with individual address variables.
     * </p>
     *
     * @param substitutions <p>
     *            The default message variables to use in the notification
     *            message. You can override these default variables with
     *            individual address variables.
     *            </p>
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override these default variables with individual address variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions <p>
     *            The default message variables to use in the notification
     *            message. You can override these default variables with
     *            individual address variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override these default variables with individual address variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into Substitutions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Substitutions.
     * @param value The corresponding value of the entry to be added into
     *            Substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public APNSMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The key that represents your app-specific identifier for grouping
     * notifications. If you provide a Notification Content app extension, you
     * can use this value to group your notifications together.
     * </p>
     *
     * @return <p>
     *         The key that represents your app-specific identifier for grouping
     *         notifications. If you provide a Notification Content app
     *         extension, you can use this value to group your notifications
     *         together.
     *         </p>
     */
    public String getThreadId() {
        return threadId;
    }

    /**
     * <p>
     * The key that represents your app-specific identifier for grouping
     * notifications. If you provide a Notification Content app extension, you
     * can use this value to group your notifications together.
     * </p>
     *
     * @param threadId <p>
     *            The key that represents your app-specific identifier for
     *            grouping notifications. If you provide a Notification Content
     *            app extension, you can use this value to group your
     *            notifications together.
     *            </p>
     */
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * <p>
     * The key that represents your app-specific identifier for grouping
     * notifications. If you provide a Notification Content app extension, you
     * can use this value to group your notifications together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threadId <p>
     *            The key that represents your app-specific identifier for
     *            grouping notifications. If you provide a Notification Content
     *            app extension, you can use this value to group your
     *            notifications together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that APNs should store and attempt to
     * deliver the push notification, if the service is unable to deliver the
     * notification the first time. If this value is 0, APNs treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-expiration request
     * header when it sends the notification message to APNs.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, that APNs should store and
     *         attempt to deliver the push notification, if the service is
     *         unable to deliver the notification the first time. If this value
     *         is 0, APNs treats the notification as if it expires immediately
     *         and the service doesn't store or try to deliver the notification
     *         again.
     *         </p>
     *         <p>
     *         Amazon Pinpoint specifies this value in the apns-expiration
     *         request header when it sends the notification message to APNs.
     *         </p>
     */
    public Integer getTimeToLive() {
        return timeToLive;
    }

    /**
     * <p>
     * The amount of time, in seconds, that APNs should store and attempt to
     * deliver the push notification, if the service is unable to deliver the
     * notification the first time. If this value is 0, APNs treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-expiration request
     * header when it sends the notification message to APNs.
     * </p>
     *
     * @param timeToLive <p>
     *            The amount of time, in seconds, that APNs should store and
     *            attempt to deliver the push notification, if the service is
     *            unable to deliver the notification the first time. If this
     *            value is 0, APNs treats the notification as if it expires
     *            immediately and the service doesn't store or try to deliver
     *            the notification again.
     *            </p>
     *            <p>
     *            Amazon Pinpoint specifies this value in the apns-expiration
     *            request header when it sends the notification message to APNs.
     *            </p>
     */
    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * The amount of time, in seconds, that APNs should store and attempt to
     * deliver the push notification, if the service is unable to deliver the
     * notification the first time. If this value is 0, APNs treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * Amazon Pinpoint specifies this value in the apns-expiration request
     * header when it sends the notification message to APNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLive <p>
     *            The amount of time, in seconds, that APNs should store and
     *            attempt to deliver the push notification, if the service is
     *            unable to deliver the notification the first time. If this
     *            value is 0, APNs treats the notification as if it expires
     *            immediately and the service doesn't store or try to deliver
     *            the notification again.
     *            </p>
     *            <p>
     *            Amazon Pinpoint specifies this value in the apns-expiration
     *            request header when it sends the notification message to APNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's
     * device.
     * </p>
     *
     * @return <p>
     *         The title to display above the notification message on the
     *         recipient's device.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's
     * device.
     * </p>
     *
     * @param title <p>
     *            The title to display above the notification message on the
     *            recipient's device.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's
     * device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title to display above the notification message on the
     *            recipient's device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     *
     * @return <p>
     *         The URL to open in the recipient's default mobile browser, if a
     *         recipient taps the push notification and the value of the Action
     *         property is URL.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     *
     * @param url <p>
     *            The URL to open in the recipient's default mobile browser, if
     *            a recipient taps the push notification and the value of the
     *            Action property is URL.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL to open in the recipient's default mobile browser, if
     *            a recipient taps the push notification and the value of the
     *            Action property is URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSMessage withUrl(String url) {
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
        if (getBadge() != null)
            sb.append("Badge: " + getBadge() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getCollapseId() != null)
            sb.append("CollapseId: " + getCollapseId() + ",");
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getMediaUrl() != null)
            sb.append("MediaUrl: " + getMediaUrl() + ",");
        if (getPreferredAuthenticationMethod() != null)
            sb.append("PreferredAuthenticationMethod: " + getPreferredAuthenticationMethod() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getRawContent() != null)
            sb.append("RawContent: " + getRawContent() + ",");
        if (getSilentPush() != null)
            sb.append("SilentPush: " + getSilentPush() + ",");
        if (getSound() != null)
            sb.append("Sound: " + getSound() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions() + ",");
        if (getThreadId() != null)
            sb.append("ThreadId: " + getThreadId() + ",");
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
        hashCode = prime * hashCode + ((getBadge() == null) ? 0 : getBadge().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCollapseId() == null) ? 0 : getCollapseId().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getMediaUrl() == null) ? 0 : getMediaUrl().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredAuthenticationMethod() == null) ? 0
                        : getPreferredAuthenticationMethod().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode + ((getSound() == null) ? 0 : getSound().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
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

        if (obj instanceof APNSMessage == false)
            return false;
        APNSMessage other = (APNSMessage) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBadge() == null ^ this.getBadge() == null)
            return false;
        if (other.getBadge() != null && other.getBadge().equals(this.getBadge()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCollapseId() == null ^ this.getCollapseId() == null)
            return false;
        if (other.getCollapseId() != null
                && other.getCollapseId().equals(this.getCollapseId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getMediaUrl() == null ^ this.getMediaUrl() == null)
            return false;
        if (other.getMediaUrl() != null && other.getMediaUrl().equals(this.getMediaUrl()) == false)
            return false;
        if (other.getPreferredAuthenticationMethod() == null
                ^ this.getPreferredAuthenticationMethod() == null)
            return false;
        if (other.getPreferredAuthenticationMethod() != null
                && other.getPreferredAuthenticationMethod().equals(
                        this.getPreferredAuthenticationMethod()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
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
        if (other.getSound() == null ^ this.getSound() == null)
            return false;
        if (other.getSound() != null && other.getSound().equals(this.getSound()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null
                && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getThreadId() == null ^ this.getThreadId() == null)
            return false;
        if (other.getThreadId() != null && other.getThreadId().equals(this.getThreadId()) == false)
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
