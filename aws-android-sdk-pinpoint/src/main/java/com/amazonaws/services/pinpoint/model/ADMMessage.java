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
 * ADM Message.
 */
public class ADMMessage implements Serializable {
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
     * Optional. Arbitrary string used to indicate multiple messages are
     * logically the same and that ADM is allowed to drop previously enqueued
     * messages in favor of this one.
     */
    private String consolidationKey;

    /**
     * The data payload used for a silent push. This payload is added to the
     * notifications' data.pinpoint.jsonBody' object
     */
    private java.util.Map<String, String> data;

    /**
     * Optional. Number of seconds ADM should retain the message if the device
     * is offline
     */
    private String expiresAfter;

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
     * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to
     * verify data integrity
     */
    private String mD5;

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     */
    private String rawContent;

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
    public ADMMessage withAction(String action) {
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
    public ADMMessage withAction(Action action) {
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
    public ADMMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Optional. Arbitrary string used to indicate multiple messages are
     * logically the same and that ADM is allowed to drop previously enqueued
     * messages in favor of this one.
     *
     * @return Optional. Arbitrary string used to indicate multiple messages are
     *         logically the same and that ADM is allowed to drop previously
     *         enqueued messages in favor of this one.
     */
    public String getConsolidationKey() {
        return consolidationKey;
    }

    /**
     * Optional. Arbitrary string used to indicate multiple messages are
     * logically the same and that ADM is allowed to drop previously enqueued
     * messages in favor of this one.
     *
     * @param consolidationKey Optional. Arbitrary string used to indicate
     *            multiple messages are logically the same and that ADM is
     *            allowed to drop previously enqueued messages in favor of this
     *            one.
     */
    public void setConsolidationKey(String consolidationKey) {
        this.consolidationKey = consolidationKey;
    }

    /**
     * Optional. Arbitrary string used to indicate multiple messages are
     * logically the same and that ADM is allowed to drop previously enqueued
     * messages in favor of this one.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consolidationKey Optional. Arbitrary string used to indicate
     *            multiple messages are logically the same and that ADM is
     *            allowed to drop previously enqueued messages in favor of this
     *            one.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ADMMessage withConsolidationKey(String consolidationKey) {
        this.consolidationKey = consolidationKey;
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
    public ADMMessage withData(java.util.Map<String, String> data) {
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
    public ADMMessage addDataEntry(String key, String value) {
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
    public ADMMessage clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * Optional. Number of seconds ADM should retain the message if the device
     * is offline
     *
     * @return Optional. Number of seconds ADM should retain the message if the
     *         device is offline
     */
    public String getExpiresAfter() {
        return expiresAfter;
    }

    /**
     * Optional. Number of seconds ADM should retain the message if the device
     * is offline
     *
     * @param expiresAfter Optional. Number of seconds ADM should retain the
     *            message if the device is offline
     */
    public void setExpiresAfter(String expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * Optional. Number of seconds ADM should retain the message if the device
     * is offline
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiresAfter Optional. Number of seconds ADM should retain the
     *            message if the device is offline
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ADMMessage withExpiresAfter(String expiresAfter) {
        this.expiresAfter = expiresAfter;
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
    public ADMMessage withIconReference(String iconReference) {
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
    public ADMMessage withImageIconUrl(String imageIconUrl) {
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
    public ADMMessage withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to
     * verify data integrity
     *
     * @return Optional. Base-64-encoded MD5 checksum of the data parameter.
     *         Used to verify data integrity
     */
    public String getMD5() {
        return mD5;
    }

    /**
     * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to
     * verify data integrity
     *
     * @param mD5 Optional. Base-64-encoded MD5 checksum of the data parameter.
     *            Used to verify data integrity
     */
    public void setMD5(String mD5) {
        this.mD5 = mD5;
    }

    /**
     * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to
     * verify data integrity
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mD5 Optional. Base-64-encoded MD5 checksum of the data parameter.
     *            Used to verify data integrity
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ADMMessage withMD5(String mD5) {
        this.mD5 = mD5;
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
    public ADMMessage withRawContent(String rawContent) {
        this.rawContent = rawContent;
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
    public ADMMessage withSilentPush(Boolean silentPush) {
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
    public ADMMessage withSmallImageIconUrl(String smallImageIconUrl) {
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
    public ADMMessage withSound(String sound) {
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
    public ADMMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
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
    public ADMMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
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
    public ADMMessage clearSubstitutionsEntries() {
        this.substitutions = null;
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
    public ADMMessage withTitle(String title) {
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
    public ADMMessage withUrl(String url) {
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
        if (getConsolidationKey() != null)
            sb.append("ConsolidationKey: " + getConsolidationKey() + ",");
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getExpiresAfter() != null)
            sb.append("ExpiresAfter: " + getExpiresAfter() + ",");
        if (getIconReference() != null)
            sb.append("IconReference: " + getIconReference() + ",");
        if (getImageIconUrl() != null)
            sb.append("ImageIconUrl: " + getImageIconUrl() + ",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: " + getImageUrl() + ",");
        if (getMD5() != null)
            sb.append("MD5: " + getMD5() + ",");
        if (getRawContent() != null)
            sb.append("RawContent: " + getRawContent() + ",");
        if (getSilentPush() != null)
            sb.append("SilentPush: " + getSilentPush() + ",");
        if (getSmallImageIconUrl() != null)
            sb.append("SmallImageIconUrl: " + getSmallImageIconUrl() + ",");
        if (getSound() != null)
            sb.append("Sound: " + getSound() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions() + ",");
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
                + ((getConsolidationKey() == null) ? 0 : getConsolidationKey().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode
                + ((getExpiresAfter() == null) ? 0 : getExpiresAfter().hashCode());
        hashCode = prime * hashCode
                + ((getIconReference() == null) ? 0 : getIconReference().hashCode());
        hashCode = prime * hashCode
                + ((getImageIconUrl() == null) ? 0 : getImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getMD5() == null) ? 0 : getMD5().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode
                + ((getSmallImageIconUrl() == null) ? 0 : getSmallImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getSound() == null) ? 0 : getSound().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
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

        if (obj instanceof ADMMessage == false)
            return false;
        ADMMessage other = (ADMMessage) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getConsolidationKey() == null ^ this.getConsolidationKey() == null)
            return false;
        if (other.getConsolidationKey() != null
                && other.getConsolidationKey().equals(this.getConsolidationKey()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getExpiresAfter() == null ^ this.getExpiresAfter() == null)
            return false;
        if (other.getExpiresAfter() != null
                && other.getExpiresAfter().equals(this.getExpiresAfter()) == false)
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
        if (other.getMD5() == null ^ this.getMD5() == null)
            return false;
        if (other.getMD5() != null && other.getMD5().equals(this.getMD5()) == false)
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
