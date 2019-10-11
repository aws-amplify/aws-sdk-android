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
 * Specifies the content and settings for a message template can be used in push
 * notifications that are sent through the ADM (Amazon Device Messaging), GCM
 * (Firebase Cloud Messaging, formerly Google Cloud Messaging), or Baidu (Baidu
 * Cloud Push) channel.
 * </p>
 */
public class AndroidPushNotificationTemplate implements Serializable {
    /**
     * <p>
     * The action to occur if a recipient taps a push notification that's based
     * on the message template. Valid values are:
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
     * the app. This action uses the deep-linking features of the Android
     * platform.
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
     * The message body to use in a push notification that's based on the
     * message template.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The URL of the large icon image to display in the content view of a push
     * notification that's based on the message template.
     * </p>
     */
    private String imageIconUrl;

    /**
     * <p>
     * The URL of an image to display in a push notification that's based on the
     * message template.
     * </p>
     */
    private String imageUrl;

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the
     * content view of a push notification that's based on the message template.
     * </p>
     */
    private String smallImageIconUrl;

    /**
     * <p>
     * The sound to play when a recipient receives a push notification that's
     * based on the message template. You can use the default stream or specify
     * the file name of a sound resource that's bundled in your app. On an
     * Android platform, the sound file must reside in /res/raw/.
     * </p>
     */
    private String sound;

    /**
     * <p>
     * The title to use in a push notification that's based on the message
     * template. This title appears above the notification message on a
     * recipient's device.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The URL to open in a recipient's default mobile browser, if a recipient
     * taps a a push notification that's based on the message template and the
     * value of the Action property is URL.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The action to occur if a recipient taps a push notification that's based
     * on the message template. Valid values are:
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
     * the app. This action uses the deep-linking features of the Android
     * platform.
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
     *         The action to occur if a recipient taps a push notification
     *         that's based on the message template. Valid values are:
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
     *         interface in the app. This action uses the deep-linking features
     *         of the Android platform.
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
     * The action to occur if a recipient taps a push notification that's based
     * on the message template. Valid values are:
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
     * the app. This action uses the deep-linking features of the Android
     * platform.
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
     *            The action to occur if a recipient taps a push notification
     *            that's based on the message template. Valid values are:
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
     *            interface in the app. This action uses the deep-linking
     *            features of the Android platform.
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
     * The action to occur if a recipient taps a push notification that's based
     * on the message template. Valid values are:
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
     * the app. This action uses the deep-linking features of the Android
     * platform.
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
     *            The action to occur if a recipient taps a push notification
     *            that's based on the message template. Valid values are:
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
     *            interface in the app. This action uses the deep-linking
     *            features of the Android platform.
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
    public AndroidPushNotificationTemplate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to occur if a recipient taps a push notification that's based
     * on the message template. Valid values are:
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
     * the app. This action uses the deep-linking features of the Android
     * platform.
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
     *            The action to occur if a recipient taps a push notification
     *            that's based on the message template. Valid values are:
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
     *            interface in the app. This action uses the deep-linking
     *            features of the Android platform.
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
     * The action to occur if a recipient taps a push notification that's based
     * on the message template. Valid values are:
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
     * the app. This action uses the deep-linking features of the Android
     * platform.
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
     *            The action to occur if a recipient taps a push notification
     *            that's based on the message template. Valid values are:
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
     *            interface in the app. This action uses the deep-linking
     *            features of the Android platform.
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
    public AndroidPushNotificationTemplate withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The message body to use in a push notification that's based on the
     * message template.
     * </p>
     *
     * @return <p>
     *         The message body to use in a push notification that's based on
     *         the message template.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The message body to use in a push notification that's based on the
     * message template.
     * </p>
     *
     * @param body <p>
     *            The message body to use in a push notification that's based on
     *            the message template.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The message body to use in a push notification that's based on the
     * message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The message body to use in a push notification that's based on
     *            the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AndroidPushNotificationTemplate withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of a push
     * notification that's based on the message template.
     * </p>
     *
     * @return <p>
     *         The URL of the large icon image to display in the content view of
     *         a push notification that's based on the message template.
     *         </p>
     */
    public String getImageIconUrl() {
        return imageIconUrl;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of a push
     * notification that's based on the message template.
     * </p>
     *
     * @param imageIconUrl <p>
     *            The URL of the large icon image to display in the content view
     *            of a push notification that's based on the message template.
     *            </p>
     */
    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of a push
     * notification that's based on the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageIconUrl <p>
     *            The URL of the large icon image to display in the content view
     *            of a push notification that's based on the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AndroidPushNotificationTemplate withImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
        return this;
    }

    /**
     * <p>
     * The URL of an image to display in a push notification that's based on the
     * message template.
     * </p>
     *
     * @return <p>
     *         The URL of an image to display in a push notification that's
     *         based on the message template.
     *         </p>
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display in a push notification that's based on the
     * message template.
     * </p>
     *
     * @param imageUrl <p>
     *            The URL of an image to display in a push notification that's
     *            based on the message template.
     *            </p>
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display in a push notification that's based on the
     * message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageUrl <p>
     *            The URL of an image to display in a push notification that's
     *            based on the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AndroidPushNotificationTemplate withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the
     * content view of a push notification that's based on the message template.
     * </p>
     *
     * @return <p>
     *         The URL of the small icon image to display in the status bar and
     *         the content view of a push notification that's based on the
     *         message template.
     *         </p>
     */
    public String getSmallImageIconUrl() {
        return smallImageIconUrl;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the
     * content view of a push notification that's based on the message template.
     * </p>
     *
     * @param smallImageIconUrl <p>
     *            The URL of the small icon image to display in the status bar
     *            and the content view of a push notification that's based on
     *            the message template.
     *            </p>
     */
    public void setSmallImageIconUrl(String smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the
     * content view of a push notification that's based on the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smallImageIconUrl <p>
     *            The URL of the small icon image to display in the status bar
     *            and the content view of a push notification that's based on
     *            the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AndroidPushNotificationTemplate withSmallImageIconUrl(String smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
        return this;
    }

    /**
     * <p>
     * The sound to play when a recipient receives a push notification that's
     * based on the message template. You can use the default stream or specify
     * the file name of a sound resource that's bundled in your app. On an
     * Android platform, the sound file must reside in /res/raw/.
     * </p>
     *
     * @return <p>
     *         The sound to play when a recipient receives a push notification
     *         that's based on the message template. You can use the default
     *         stream or specify the file name of a sound resource that's
     *         bundled in your app. On an Android platform, the sound file must
     *         reside in /res/raw/.
     *         </p>
     */
    public String getSound() {
        return sound;
    }

    /**
     * <p>
     * The sound to play when a recipient receives a push notification that's
     * based on the message template. You can use the default stream or specify
     * the file name of a sound resource that's bundled in your app. On an
     * Android platform, the sound file must reside in /res/raw/.
     * </p>
     *
     * @param sound <p>
     *            The sound to play when a recipient receives a push
     *            notification that's based on the message template. You can use
     *            the default stream or specify the file name of a sound
     *            resource that's bundled in your app. On an Android platform,
     *            the sound file must reside in /res/raw/.
     *            </p>
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * <p>
     * The sound to play when a recipient receives a push notification that's
     * based on the message template. You can use the default stream or specify
     * the file name of a sound resource that's bundled in your app. On an
     * Android platform, the sound file must reside in /res/raw/.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sound <p>
     *            The sound to play when a recipient receives a push
     *            notification that's based on the message template. You can use
     *            the default stream or specify the file name of a sound
     *            resource that's bundled in your app. On an Android platform,
     *            the sound file must reside in /res/raw/.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AndroidPushNotificationTemplate withSound(String sound) {
        this.sound = sound;
        return this;
    }

    /**
     * <p>
     * The title to use in a push notification that's based on the message
     * template. This title appears above the notification message on a
     * recipient's device.
     * </p>
     *
     * @return <p>
     *         The title to use in a push notification that's based on the
     *         message template. This title appears above the notification
     *         message on a recipient's device.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title to use in a push notification that's based on the message
     * template. This title appears above the notification message on a
     * recipient's device.
     * </p>
     *
     * @param title <p>
     *            The title to use in a push notification that's based on the
     *            message template. This title appears above the notification
     *            message on a recipient's device.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title to use in a push notification that's based on the message
     * template. This title appears above the notification message on a
     * recipient's device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title to use in a push notification that's based on the
     *            message template. This title appears above the notification
     *            message on a recipient's device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AndroidPushNotificationTemplate withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The URL to open in a recipient's default mobile browser, if a recipient
     * taps a a push notification that's based on the message template and the
     * value of the Action property is URL.
     * </p>
     *
     * @return <p>
     *         The URL to open in a recipient's default mobile browser, if a
     *         recipient taps a a push notification that's based on the message
     *         template and the value of the Action property is URL.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL to open in a recipient's default mobile browser, if a recipient
     * taps a a push notification that's based on the message template and the
     * value of the Action property is URL.
     * </p>
     *
     * @param url <p>
     *            The URL to open in a recipient's default mobile browser, if a
     *            recipient taps a a push notification that's based on the
     *            message template and the value of the Action property is URL.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to open in a recipient's default mobile browser, if a recipient
     * taps a a push notification that's based on the message template and the
     * value of the Action property is URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL to open in a recipient's default mobile browser, if a
     *            recipient taps a a push notification that's based on the
     *            message template and the value of the Action property is URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AndroidPushNotificationTemplate withUrl(String url) {
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
        if (getImageUrl() != null)
            sb.append("ImageUrl: " + getImageUrl() + ",");
        if (getSmallImageIconUrl() != null)
            sb.append("SmallImageIconUrl: " + getSmallImageIconUrl() + ",");
        if (getSound() != null)
            sb.append("Sound: " + getSound() + ",");
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
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode
                + ((getSmallImageIconUrl() == null) ? 0 : getSmallImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getSound() == null) ? 0 : getSound().hashCode());
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

        if (obj instanceof AndroidPushNotificationTemplate == false)
            return false;
        AndroidPushNotificationTemplate other = (AndroidPushNotificationTemplate) obj;

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
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
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
