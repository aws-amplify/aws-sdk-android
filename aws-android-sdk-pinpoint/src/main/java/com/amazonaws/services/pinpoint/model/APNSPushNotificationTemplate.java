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
 * Specifies the content and settings for a message template that can be used in
 * push notifications that are sent through the APNs (Apple Push Notification
 * service) channel.
 * </p>
 */
public class APNSPushNotificationTemplate implements Serializable {
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
     * The message body to use in push notifications that are based on the
     * message template.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The URL of an image or video to display in push notifications that are
     * based on the message template.
     * </p>
     */
    private String mediaUrl;

    /**
     * <p>
     * The key for the sound to play when the recipient receives a push
     * notification that's based on the message template. The value for this key
     * is the name of a sound file in your app's main bundle or the
     * Library/Sounds folder in your app's data container. If the sound file
     * can't be found or you specify default for the value, the system plays the
     * default alert sound.
     * </p>
     */
    private String sound;

    /**
     * <p>
     * The title to use in push notifications that are based on the message
     * template. This title appears above the notification message on a
     * recipient's device.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps a push notification that's based on the message template and the
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
    public APNSPushNotificationTemplate withAction(String action) {
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
    public APNSPushNotificationTemplate withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The message body to use in push notifications that are based on the
     * message template.
     * </p>
     *
     * @return <p>
     *         The message body to use in push notifications that are based on
     *         the message template.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The message body to use in push notifications that are based on the
     * message template.
     * </p>
     *
     * @param body <p>
     *            The message body to use in push notifications that are based
     *            on the message template.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The message body to use in push notifications that are based on the
     * message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The message body to use in push notifications that are based
     *            on the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSPushNotificationTemplate withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The URL of an image or video to display in push notifications that are
     * based on the message template.
     * </p>
     *
     * @return <p>
     *         The URL of an image or video to display in push notifications
     *         that are based on the message template.
     *         </p>
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * <p>
     * The URL of an image or video to display in push notifications that are
     * based on the message template.
     * </p>
     *
     * @param mediaUrl <p>
     *            The URL of an image or video to display in push notifications
     *            that are based on the message template.
     *            </p>
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * <p>
     * The URL of an image or video to display in push notifications that are
     * based on the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaUrl <p>
     *            The URL of an image or video to display in push notifications
     *            that are based on the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSPushNotificationTemplate withMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives a push
     * notification that's based on the message template. The value for this key
     * is the name of a sound file in your app's main bundle or the
     * Library/Sounds folder in your app's data container. If the sound file
     * can't be found or you specify default for the value, the system plays the
     * default alert sound.
     * </p>
     *
     * @return <p>
     *         The key for the sound to play when the recipient receives a push
     *         notification that's based on the message template. The value for
     *         this key is the name of a sound file in your app's main bundle or
     *         the Library/Sounds folder in your app's data container. If the
     *         sound file can't be found or you specify default for the value,
     *         the system plays the default alert sound.
     *         </p>
     */
    public String getSound() {
        return sound;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives a push
     * notification that's based on the message template. The value for this key
     * is the name of a sound file in your app's main bundle or the
     * Library/Sounds folder in your app's data container. If the sound file
     * can't be found or you specify default for the value, the system plays the
     * default alert sound.
     * </p>
     *
     * @param sound <p>
     *            The key for the sound to play when the recipient receives a
     *            push notification that's based on the message template. The
     *            value for this key is the name of a sound file in your app's
     *            main bundle or the Library/Sounds folder in your app's data
     *            container. If the sound file can't be found or you specify
     *            default for the value, the system plays the default alert
     *            sound.
     *            </p>
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * <p>
     * The key for the sound to play when the recipient receives a push
     * notification that's based on the message template. The value for this key
     * is the name of a sound file in your app's main bundle or the
     * Library/Sounds folder in your app's data container. If the sound file
     * can't be found or you specify default for the value, the system plays the
     * default alert sound.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sound <p>
     *            The key for the sound to play when the recipient receives a
     *            push notification that's based on the message template. The
     *            value for this key is the name of a sound file in your app's
     *            main bundle or the Library/Sounds folder in your app's data
     *            container. If the sound file can't be found or you specify
     *            default for the value, the system plays the default alert
     *            sound.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSPushNotificationTemplate withSound(String sound) {
        this.sound = sound;
        return this;
    }

    /**
     * <p>
     * The title to use in push notifications that are based on the message
     * template. This title appears above the notification message on a
     * recipient's device.
     * </p>
     *
     * @return <p>
     *         The title to use in push notifications that are based on the
     *         message template. This title appears above the notification
     *         message on a recipient's device.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title to use in push notifications that are based on the message
     * template. This title appears above the notification message on a
     * recipient's device.
     * </p>
     *
     * @param title <p>
     *            The title to use in push notifications that are based on the
     *            message template. This title appears above the notification
     *            message on a recipient's device.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title to use in push notifications that are based on the message
     * template. This title appears above the notification message on a
     * recipient's device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title to use in push notifications that are based on the
     *            message template. This title appears above the notification
     *            message on a recipient's device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSPushNotificationTemplate withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps a push notification that's based on the message template and the
     * value of the Action property is URL.
     * </p>
     *
     * @return <p>
     *         The URL to open in the recipient's default mobile browser, if a
     *         recipient taps a push notification that's based on the message
     *         template and the value of the Action property is URL.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps a push notification that's based on the message template and the
     * value of the Action property is URL.
     * </p>
     *
     * @param url <p>
     *            The URL to open in the recipient's default mobile browser, if
     *            a recipient taps a push notification that's based on the
     *            message template and the value of the Action property is URL.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps a push notification that's based on the message template and the
     * value of the Action property is URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL to open in the recipient's default mobile browser, if
     *            a recipient taps a push notification that's based on the
     *            message template and the value of the Action property is URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public APNSPushNotificationTemplate withUrl(String url) {
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
        if (getMediaUrl() != null)
            sb.append("MediaUrl: " + getMediaUrl() + ",");
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
        hashCode = prime * hashCode + ((getMediaUrl() == null) ? 0 : getMediaUrl().hashCode());
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

        if (obj instanceof APNSPushNotificationTemplate == false)
            return false;
        APNSPushNotificationTemplate other = (APNSPushNotificationTemplate) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getMediaUrl() == null ^ this.getMediaUrl() == null)
            return false;
        if (other.getMediaUrl() != null && other.getMediaUrl().equals(this.getMediaUrl()) == false)
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
