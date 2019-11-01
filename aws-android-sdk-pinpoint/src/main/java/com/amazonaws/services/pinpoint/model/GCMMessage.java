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
 * GCM Message.
 */
public class GCMMessage implements Serializable {
    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP - Your app launches, or it becomes the foreground
     * app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your
     * app and display a designated user interface within the app. URL - The
     * default mobile browser on the user's device launches and opens a web page
     * at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK |
     * URL
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     */
    private String action;

    /**
     * The message body of the notification.
     */
    private String body;

    /**
     * This parameter identifies a group of messages (e.g., with collapse_key:
     * "Updates Available") that can be collapsed, so that only the last message
     * gets sent when delivery can be resumed. This is intended to avoid sending
     * too many of the same messages when the device comes back online or
     * becomes active.
     */
    private String collapseKey;

    /**
     * The data payload used for a silent push. This payload is added to the
     * notifications' data.pinpoint.jsonBody' object
     */
    private java.util.Map<String, String> data;

    /**
     * The icon image name of the asset saved in your application.
     */
    private String iconReference;

    /**
     * The URL that points to an image used as the large icon to the
     * notification content view.
     */
    private String imageIconUrl;

    /**
     * The URL that points to an image used in the push notification.
     */
    private String imageUrl;

    /**
     * The message priority. Amazon Pinpoint uses this value to set the FCM or
     * GCM priority parameter when it sends the message. Accepts the following
     * values: "Normal" - Messages might be delayed. Delivery is optimized for
     * battery usage on the receiving device. Use normal priority unless
     * immediate delivery is required. "High" - Messages are sent immediately
     * and might wake a sleeping device. The equivalent values for APNs messages
     * are "5" and "10". Amazon Pinpoint accepts these values here and converts
     * them. For more information, see About FCM Messages in the Firebase
     * documentation.
     */
    private String priority;

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     */
    private String rawContent;

    /**
     * This parameter specifies the package name of the application where the
     * registration tokens must match in order to receive the message.
     */
    private String restrictedPackageName;

    /**
     * Indicates if the message should display on the users device. Silent
     * pushes can be used for Remote Configuration and Phone Home use cases.
     */
    private Boolean silentPush;

    /**
     * The URL that points to an image used as the small icon for the
     * notification which will be used to represent the notification in the
     * status bar and content view
     */
    private String smallImageIconUrl;

    /**
     * Indicates a sound to play when the device receives the notification.
     * Supports default, or the filename of a sound resource bundled in the app.
     * Android sound files must reside in /res/raw/
     */
    private String sound;

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * The length of time (in seconds) that FCM or GCM stores and attempts to
     * deliver the message. If unspecified, the value defaults to the maximum,
     * which is 2,419,200 seconds (28 days). Amazon Pinpoint uses this value to
     * set the FCM or GCM time_to_live parameter.
     */
    private Integer timeToLive;

    /**
     * The message title that displays above the message on the user's device.
     */
    private String title;

    /**
     * The URL to open in the user's mobile browser. Used if the value for
     * Action is URL.
     */
    private String url;

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP - Your app launches, or it becomes the foreground
     * app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your
     * app and display a designated user interface within the app. URL - The
     * default mobile browser on the user's device launches and opens a web page
     * at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK |
     * URL
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @return The action that occurs if the user taps a push notification
     *         delivered by the campaign: OPEN_APP - Your app launches, or it
     *         becomes the foreground app if it has been sent to the background.
     *         This is the default action. DEEP_LINK - Uses deep linking
     *         features in iOS and Android to open your app and display a
     *         designated user interface within the app. URL - The default
     *         mobile browser on the user's device launches and opens a web page
     *         at the URL you specify. Possible values include: OPEN_APP |
     *         DEEP_LINK | URL
     * @see Action
     */
    public String getAction() {
        return action;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP - Your app launches, or it becomes the foreground
     * app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your
     * app and display a designated user interface within the app. URL - The
     * default mobile browser on the user's device launches and opens a web page
     * at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK |
     * URL
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action The action that occurs if the user taps a push notification
     *            delivered by the campaign: OPEN_APP - Your app launches, or it
     *            becomes the foreground app if it has been sent to the
     *            background. This is the default action. DEEP_LINK - Uses deep
     *            linking features in iOS and Android to open your app and
     *            display a designated user interface within the app. URL - The
     *            default mobile browser on the user's device launches and opens
     *            a web page at the URL you specify. Possible values include:
     *            OPEN_APP | DEEP_LINK | URL
     * @see Action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP - Your app launches, or it becomes the foreground
     * app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your
     * app and display a designated user interface within the app. URL - The
     * default mobile browser on the user's device launches and opens a web page
     * at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK |
     * URL
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action The action that occurs if the user taps a push notification
     *            delivered by the campaign: OPEN_APP - Your app launches, or it
     *            becomes the foreground app if it has been sent to the
     *            background. This is the default action. DEEP_LINK - Uses deep
     *            linking features in iOS and Android to open your app and
     *            display a designated user interface within the app. URL - The
     *            default mobile browser on the user's device launches and opens
     *            a web page at the URL you specify. Possible values include:
     *            OPEN_APP | DEEP_LINK | URL
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Action
     */
    public GCMMessage withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP - Your app launches, or it becomes the foreground
     * app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your
     * app and display a designated user interface within the app. URL - The
     * default mobile browser on the user's device launches and opens a web page
     * at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK |
     * URL
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action The action that occurs if the user taps a push notification
     *            delivered by the campaign: OPEN_APP - Your app launches, or it
     *            becomes the foreground app if it has been sent to the
     *            background. This is the default action. DEEP_LINK - Uses deep
     *            linking features in iOS and Android to open your app and
     *            display a designated user interface within the app. URL - The
     *            default mobile browser on the user's device launches and opens
     *            a web page at the URL you specify. Possible values include:
     *            OPEN_APP | DEEP_LINK | URL
     * @see Action
     */
    public void setAction(Action action) {
        this.action = action.toString();
    }

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP - Your app launches, or it becomes the foreground
     * app if it has been sent to the background. This is the default action.
     * DEEP_LINK - Uses deep linking features in iOS and Android to open your
     * app and display a designated user interface within the app. URL - The
     * default mobile browser on the user's device launches and opens a web page
     * at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK |
     * URL
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action The action that occurs if the user taps a push notification
     *            delivered by the campaign: OPEN_APP - Your app launches, or it
     *            becomes the foreground app if it has been sent to the
     *            background. This is the default action. DEEP_LINK - Uses deep
     *            linking features in iOS and Android to open your app and
     *            display a designated user interface within the app. URL - The
     *            default mobile browser on the user's device launches and opens
     *            a web page at the URL you specify. Possible values include:
     *            OPEN_APP | DEEP_LINK | URL
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Action
     */
    public GCMMessage withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * The message body of the notification.
     *
     * @return The message body of the notification.
     */
    public String getBody() {
        return body;
    }

    /**
     * The message body of the notification.
     *
     * @param body The message body of the notification.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The message body of the notification.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body The message body of the notification.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * This parameter identifies a group of messages (e.g., with collapse_key:
     * "Updates Available") that can be collapsed, so that only the last message
     * gets sent when delivery can be resumed. This is intended to avoid sending
     * too many of the same messages when the device comes back online or
     * becomes active.
     *
     * @return This parameter identifies a group of messages (e.g., with
     *         collapse_key: "Updates Available") that can be collapsed, so that
     *         only the last message gets sent when delivery can be resumed.
     *         This is intended to avoid sending too many of the same messages
     *         when the device comes back online or becomes active.
     */
    public String getCollapseKey() {
        return collapseKey;
    }

    /**
     * This parameter identifies a group of messages (e.g., with collapse_key:
     * "Updates Available") that can be collapsed, so that only the last message
     * gets sent when delivery can be resumed. This is intended to avoid sending
     * too many of the same messages when the device comes back online or
     * becomes active.
     *
     * @param collapseKey This parameter identifies a group of messages (e.g.,
     *            with collapse_key: "Updates Available") that can be collapsed,
     *            so that only the last message gets sent when delivery can be
     *            resumed. This is intended to avoid sending too many of the
     *            same messages when the device comes back online or becomes
     *            active.
     */
    public void setCollapseKey(String collapseKey) {
        this.collapseKey = collapseKey;
    }

    /**
     * This parameter identifies a group of messages (e.g., with collapse_key:
     * "Updates Available") that can be collapsed, so that only the last message
     * gets sent when delivery can be resumed. This is intended to avoid sending
     * too many of the same messages when the device comes back online or
     * becomes active.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collapseKey This parameter identifies a group of messages (e.g.,
     *            with collapse_key: "Updates Available") that can be collapsed,
     *            so that only the last message gets sent when delivery can be
     *            resumed. This is intended to avoid sending too many of the
     *            same messages when the device comes back online or becomes
     *            active.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withCollapseKey(String collapseKey) {
        this.collapseKey = collapseKey;
        return this;
    }

    /**
     * The data payload used for a silent push. This payload is added to the
     * notifications' data.pinpoint.jsonBody' object
     *
     * @return The data payload used for a silent push. This payload is added to
     *         the notifications' data.pinpoint.jsonBody' object
     */
    public java.util.Map<String, String> getData() {
        return data;
    }

    /**
     * The data payload used for a silent push. This payload is added to the
     * notifications' data.pinpoint.jsonBody' object
     *
     * @param data The data payload used for a silent push. This payload is
     *            added to the notifications' data.pinpoint.jsonBody' object
     */
    public void setData(java.util.Map<String, String> data) {
        this.data = data;
    }

    /**
     * The data payload used for a silent push. This payload is added to the
     * notifications' data.pinpoint.jsonBody' object
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data The data payload used for a silent push. This payload is
     *            added to the notifications' data.pinpoint.jsonBody' object
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }

    /**
     * The data payload used for a silent push. This payload is added to the
     * notifications' data.pinpoint.jsonBody' object
     * <p>
     * The method adds a new key-value pair into Data parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Data.
     * @param value The corresponding value of the entry to be added into Data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage addDataEntry(String key, String value) {
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
    public GCMMessage clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * The icon image name of the asset saved in your application.
     *
     * @return The icon image name of the asset saved in your application.
     */
    public String getIconReference() {
        return iconReference;
    }

    /**
     * The icon image name of the asset saved in your application.
     *
     * @param iconReference The icon image name of the asset saved in your
     *            application.
     */
    public void setIconReference(String iconReference) {
        this.iconReference = iconReference;
    }

    /**
     * The icon image name of the asset saved in your application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iconReference The icon image name of the asset saved in your
     *            application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withIconReference(String iconReference) {
        this.iconReference = iconReference;
        return this;
    }

    /**
     * The URL that points to an image used as the large icon to the
     * notification content view.
     *
     * @return The URL that points to an image used as the large icon to the
     *         notification content view.
     */
    public String getImageIconUrl() {
        return imageIconUrl;
    }

    /**
     * The URL that points to an image used as the large icon to the
     * notification content view.
     *
     * @param imageIconUrl The URL that points to an image used as the large
     *            icon to the notification content view.
     */
    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * The URL that points to an image used as the large icon to the
     * notification content view.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageIconUrl The URL that points to an image used as the large
     *            icon to the notification content view.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
        return this;
    }

    /**
     * The URL that points to an image used in the push notification.
     *
     * @return The URL that points to an image used in the push notification.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * The URL that points to an image used in the push notification.
     *
     * @param imageUrl The URL that points to an image used in the push
     *            notification.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * The URL that points to an image used in the push notification.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageUrl The URL that points to an image used in the push
     *            notification.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * The message priority. Amazon Pinpoint uses this value to set the FCM or
     * GCM priority parameter when it sends the message. Accepts the following
     * values: "Normal" - Messages might be delayed. Delivery is optimized for
     * battery usage on the receiving device. Use normal priority unless
     * immediate delivery is required. "High" - Messages are sent immediately
     * and might wake a sleeping device. The equivalent values for APNs messages
     * are "5" and "10". Amazon Pinpoint accepts these values here and converts
     * them. For more information, see About FCM Messages in the Firebase
     * documentation.
     *
     * @return The message priority. Amazon Pinpoint uses this value to set the
     *         FCM or GCM priority parameter when it sends the message. Accepts
     *         the following values: "Normal" - Messages might be delayed.
     *         Delivery is optimized for battery usage on the receiving device.
     *         Use normal priority unless immediate delivery is required. "High"
     *         - Messages are sent immediately and might wake a sleeping device.
     *         The equivalent values for APNs messages are "5" and "10". Amazon
     *         Pinpoint accepts these values here and converts them. For more
     *         information, see About FCM Messages in the Firebase
     *         documentation.
     */
    public String getPriority() {
        return priority;
    }

    /**
     * The message priority. Amazon Pinpoint uses this value to set the FCM or
     * GCM priority parameter when it sends the message. Accepts the following
     * values: "Normal" - Messages might be delayed. Delivery is optimized for
     * battery usage on the receiving device. Use normal priority unless
     * immediate delivery is required. "High" - Messages are sent immediately
     * and might wake a sleeping device. The equivalent values for APNs messages
     * are "5" and "10". Amazon Pinpoint accepts these values here and converts
     * them. For more information, see About FCM Messages in the Firebase
     * documentation.
     *
     * @param priority The message priority. Amazon Pinpoint uses this value to
     *            set the FCM or GCM priority parameter when it sends the
     *            message. Accepts the following values: "Normal" - Messages
     *            might be delayed. Delivery is optimized for battery usage on
     *            the receiving device. Use normal priority unless immediate
     *            delivery is required. "High" - Messages are sent immediately
     *            and might wake a sleeping device. The equivalent values for
     *            APNs messages are "5" and "10". Amazon Pinpoint accepts these
     *            values here and converts them. For more information, see About
     *            FCM Messages in the Firebase documentation.
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * The message priority. Amazon Pinpoint uses this value to set the FCM or
     * GCM priority parameter when it sends the message. Accepts the following
     * values: "Normal" - Messages might be delayed. Delivery is optimized for
     * battery usage on the receiving device. Use normal priority unless
     * immediate delivery is required. "High" - Messages are sent immediately
     * and might wake a sleeping device. The equivalent values for APNs messages
     * are "5" and "10". Amazon Pinpoint accepts these values here and converts
     * them. For more information, see About FCM Messages in the Firebase
     * documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priority The message priority. Amazon Pinpoint uses this value to
     *            set the FCM or GCM priority parameter when it sends the
     *            message. Accepts the following values: "Normal" - Messages
     *            might be delayed. Delivery is optimized for battery usage on
     *            the receiving device. Use normal priority unless immediate
     *            delivery is required. "High" - Messages are sent immediately
     *            and might wake a sleeping device. The equivalent values for
     *            APNs messages are "5" and "10". Amazon Pinpoint accepts these
     *            values here and converts them. For more information, see About
     *            FCM Messages in the Firebase documentation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     *
     * @return The Raw JSON formatted string to be used as the payload. This
     *         value overrides the message.
     */
    public String getRawContent() {
        return rawContent;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     *
     * @param rawContent The Raw JSON formatted string to be used as the
     *            payload. This value overrides the message.
     */
    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawContent The Raw JSON formatted string to be used as the
     *            payload. This value overrides the message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    /**
     * This parameter specifies the package name of the application where the
     * registration tokens must match in order to receive the message.
     *
     * @return This parameter specifies the package name of the application
     *         where the registration tokens must match in order to receive the
     *         message.
     */
    public String getRestrictedPackageName() {
        return restrictedPackageName;
    }

    /**
     * This parameter specifies the package name of the application where the
     * registration tokens must match in order to receive the message.
     *
     * @param restrictedPackageName This parameter specifies the package name of
     *            the application where the registration tokens must match in
     *            order to receive the message.
     */
    public void setRestrictedPackageName(String restrictedPackageName) {
        this.restrictedPackageName = restrictedPackageName;
    }

    /**
     * This parameter specifies the package name of the application where the
     * registration tokens must match in order to receive the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restrictedPackageName This parameter specifies the package name of
     *            the application where the registration tokens must match in
     *            order to receive the message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withRestrictedPackageName(String restrictedPackageName) {
        this.restrictedPackageName = restrictedPackageName;
        return this;
    }

    /**
     * Indicates if the message should display on the users device. Silent
     * pushes can be used for Remote Configuration and Phone Home use cases.
     *
     * @return Indicates if the message should display on the users device.
     *         Silent pushes can be used for Remote Configuration and Phone Home
     *         use cases.
     */
    public Boolean isSilentPush() {
        return silentPush;
    }

    /**
     * Indicates if the message should display on the users device. Silent
     * pushes can be used for Remote Configuration and Phone Home use cases.
     *
     * @return Indicates if the message should display on the users device.
     *         Silent pushes can be used for Remote Configuration and Phone Home
     *         use cases.
     */
    public Boolean getSilentPush() {
        return silentPush;
    }

    /**
     * Indicates if the message should display on the users device. Silent
     * pushes can be used for Remote Configuration and Phone Home use cases.
     *
     * @param silentPush Indicates if the message should display on the users
     *            device. Silent pushes can be used for Remote Configuration and
     *            Phone Home use cases.
     */
    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * Indicates if the message should display on the users device. Silent
     * pushes can be used for Remote Configuration and Phone Home use cases.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param silentPush Indicates if the message should display on the users
     *            device. Silent pushes can be used for Remote Configuration and
     *            Phone Home use cases.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
        return this;
    }

    /**
     * The URL that points to an image used as the small icon for the
     * notification which will be used to represent the notification in the
     * status bar and content view
     *
     * @return The URL that points to an image used as the small icon for the
     *         notification which will be used to represent the notification in
     *         the status bar and content view
     */
    public String getSmallImageIconUrl() {
        return smallImageIconUrl;
    }

    /**
     * The URL that points to an image used as the small icon for the
     * notification which will be used to represent the notification in the
     * status bar and content view
     *
     * @param smallImageIconUrl The URL that points to an image used as the
     *            small icon for the notification which will be used to
     *            represent the notification in the status bar and content view
     */
    public void setSmallImageIconUrl(String smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
    }

    /**
     * The URL that points to an image used as the small icon for the
     * notification which will be used to represent the notification in the
     * status bar and content view
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smallImageIconUrl The URL that points to an image used as the
     *            small icon for the notification which will be used to
     *            represent the notification in the status bar and content view
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withSmallImageIconUrl(String smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
        return this;
    }

    /**
     * Indicates a sound to play when the device receives the notification.
     * Supports default, or the filename of a sound resource bundled in the app.
     * Android sound files must reside in /res/raw/
     *
     * @return Indicates a sound to play when the device receives the
     *         notification. Supports default, or the filename of a sound
     *         resource bundled in the app. Android sound files must reside in
     *         /res/raw/
     */
    public String getSound() {
        return sound;
    }

    /**
     * Indicates a sound to play when the device receives the notification.
     * Supports default, or the filename of a sound resource bundled in the app.
     * Android sound files must reside in /res/raw/
     *
     * @param sound Indicates a sound to play when the device receives the
     *            notification. Supports default, or the filename of a sound
     *            resource bundled in the app. Android sound files must reside
     *            in /res/raw/
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * Indicates a sound to play when the device receives the notification.
     * Supports default, or the filename of a sound resource bundled in the app.
     * Android sound files must reside in /res/raw/
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sound Indicates a sound to play when the device receives the
     *            notification. Supports default, or the filename of a sound
     *            resource bundled in the app. Android sound files must reside
     *            in /res/raw/
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withSound(String sound) {
        this.sound = sound;
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     *
     * @return Default message substitutions. Can be overridden by individual
     *         address substitutions.
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     *
     * @param substitutions Default message substitutions. Can be overridden by
     *            individual address substitutions.
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions Default message substitutions. Can be overridden by
     *            individual address substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
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
    public GCMMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
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
    public GCMMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * The length of time (in seconds) that FCM or GCM stores and attempts to
     * deliver the message. If unspecified, the value defaults to the maximum,
     * which is 2,419,200 seconds (28 days). Amazon Pinpoint uses this value to
     * set the FCM or GCM time_to_live parameter.
     *
     * @return The length of time (in seconds) that FCM or GCM stores and
     *         attempts to deliver the message. If unspecified, the value
     *         defaults to the maximum, which is 2,419,200 seconds (28 days).
     *         Amazon Pinpoint uses this value to set the FCM or GCM
     *         time_to_live parameter.
     */
    public Integer getTimeToLive() {
        return timeToLive;
    }

    /**
     * The length of time (in seconds) that FCM or GCM stores and attempts to
     * deliver the message. If unspecified, the value defaults to the maximum,
     * which is 2,419,200 seconds (28 days). Amazon Pinpoint uses this value to
     * set the FCM or GCM time_to_live parameter.
     *
     * @param timeToLive The length of time (in seconds) that FCM or GCM stores
     *            and attempts to deliver the message. If unspecified, the value
     *            defaults to the maximum, which is 2,419,200 seconds (28 days).
     *            Amazon Pinpoint uses this value to set the FCM or GCM
     *            time_to_live parameter.
     */
    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * The length of time (in seconds) that FCM or GCM stores and attempts to
     * deliver the message. If unspecified, the value defaults to the maximum,
     * which is 2,419,200 seconds (28 days). Amazon Pinpoint uses this value to
     * set the FCM or GCM time_to_live parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLive The length of time (in seconds) that FCM or GCM stores
     *            and attempts to deliver the message. If unspecified, the value
     *            defaults to the maximum, which is 2,419,200 seconds (28 days).
     *            Amazon Pinpoint uses this value to set the FCM or GCM
     *            time_to_live parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * The message title that displays above the message on the user's device.
     *
     * @return The message title that displays above the message on the user's
     *         device.
     */
    public String getTitle() {
        return title;
    }

    /**
     * The message title that displays above the message on the user's device.
     *
     * @param title The message title that displays above the message on the
     *            user's device.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The message title that displays above the message on the user's device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title The message title that displays above the message on the
     *            user's device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * The URL to open in the user's mobile browser. Used if the value for
     * Action is URL.
     *
     * @return The URL to open in the user's mobile browser. Used if the value
     *         for Action is URL.
     */
    public String getUrl() {
        return url;
    }

    /**
     * The URL to open in the user's mobile browser. Used if the value for
     * Action is URL.
     *
     * @param url The URL to open in the user's mobile browser. Used if the
     *            value for Action is URL.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The URL to open in the user's mobile browser. Used if the value for
     * Action is URL.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url The URL to open in the user's mobile browser. Used if the
     *            value for Action is URL.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMMessage withUrl(String url) {
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
        if (getCollapseKey() != null)
            sb.append("CollapseKey: " + getCollapseKey() + ",");
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getIconReference() != null)
            sb.append("IconReference: " + getIconReference() + ",");
        if (getImageIconUrl() != null)
            sb.append("ImageIconUrl: " + getImageIconUrl() + ",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: " + getImageUrl() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getRawContent() != null)
            sb.append("RawContent: " + getRawContent() + ",");
        if (getRestrictedPackageName() != null)
            sb.append("RestrictedPackageName: " + getRestrictedPackageName() + ",");
        if (getSilentPush() != null)
            sb.append("SilentPush: " + getSilentPush() + ",");
        if (getSmallImageIconUrl() != null)
            sb.append("SmallImageIconUrl: " + getSmallImageIconUrl() + ",");
        if (getSound() != null)
            sb.append("Sound: " + getSound() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions() + ",");
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
                + ((getCollapseKey() == null) ? 0 : getCollapseKey().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode
                + ((getIconReference() == null) ? 0 : getIconReference().hashCode());
        hashCode = prime * hashCode
                + ((getImageIconUrl() == null) ? 0 : getImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime
                * hashCode
                + ((getRestrictedPackageName() == null) ? 0 : getRestrictedPackageName().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode
                + ((getSmallImageIconUrl() == null) ? 0 : getSmallImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getSound() == null) ? 0 : getSound().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
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

        if (obj instanceof GCMMessage == false)
            return false;
        GCMMessage other = (GCMMessage) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getCollapseKey() == null ^ this.getCollapseKey() == null)
            return false;
        if (other.getCollapseKey() != null
                && other.getCollapseKey().equals(this.getCollapseKey()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getIconReference() == null ^ this.getIconReference() == null)
            return false;
        if (other.getIconReference() != null
                && other.getIconReference().equals(this.getIconReference()) == false)
            return false;
        if (other.getImageIconUrl() == null ^ this.getImageIconUrl() == null)
            return false;
        if (other.getImageIconUrl() != null
                && other.getImageIconUrl().equals(this.getImageIconUrl()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
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
        if (other.getRestrictedPackageName() == null ^ this.getRestrictedPackageName() == null)
            return false;
        if (other.getRestrictedPackageName() != null
                && other.getRestrictedPackageName().equals(this.getRestrictedPackageName()) == false)
            return false;
        if (other.getSilentPush() == null ^ this.getSilentPush() == null)
            return false;
        if (other.getSilentPush() != null
                && other.getSilentPush().equals(this.getSilentPush()) == false)
            return false;
        if (other.getSmallImageIconUrl() == null ^ this.getSmallImageIconUrl() == null)
            return false;
        if (other.getSmallImageIconUrl() != null
                && other.getSmallImageIconUrl().equals(this.getSmallImageIconUrl()) == false)
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
