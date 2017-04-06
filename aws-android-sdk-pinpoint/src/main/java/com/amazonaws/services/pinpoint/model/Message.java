/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class Message implements Serializable {
    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP â€“ Your app launches, or it becomes the
     * foreground app if it has been sent to the background. This is the default
     * action. DEEP_LINK â€“ Uses deep linking features in iOS and Android to
     * open your app and display a designated user interface within the app. URL
     * â€“ The default mobile browser on the user's device launches and opens a
     * web page at the URL you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     */
    private String action;

    /**
     * The message body. Can include up to 140 characters.
     */
    private String body;

    /**
     * The URL that points to the icon image for the push notification icon, for
     * example, the app icon.
     */
    private String imageIconUrl;

    /**
     * The URL that points to an image used in the push notification.
     */
    private String imageUrl;

    /**
     * The JSON payload used for a silent push.
     */
    private String jsonBody;

    /**
     * The URL that points to the media resource, for example a .mp4 or .gif
     * file.
     */
    private String mediaUrl;

    /**
     * Indicates if the message should display on the users device. Silent
     * pushes can be used for Remote Configuration and Phone Home use cases.
     */
    private Boolean silentPush;

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
     * the campaign: OPEN_APP â€“ Your app launches, or it becomes the
     * foreground app if it has been sent to the background. This is the default
     * action. DEEP_LINK â€“ Uses deep linking features in iOS and Android to
     * open your app and display a designated user interface within the app. URL
     * â€“ The default mobile browser on the user's device launches and opens a
     * web page at the URL you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @return The action that occurs if the user taps a push notification
     *         delivered by the campaign: OPEN_APP â€“ Your app launches, or it
     *         becomes the foreground app if it has been sent to the background.
     *         This is the default action. DEEP_LINK â€“ Uses deep linking
     *         features in iOS and Android to open your app and display a
     *         designated user interface within the app. URL â€“ The default
     *         mobile browser on the user's device launches and opens a web page
     *         at the URL you specify.
     * @see Action
     */
    public String getAction() {
        return action;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP â€“ Your app launches, or it becomes the
     * foreground app if it has been sent to the background. This is the default
     * action. DEEP_LINK â€“ Uses deep linking features in iOS and Android to
     * open your app and display a designated user interface within the app. URL
     * â€“ The default mobile browser on the user's device launches and opens a
     * web page at the URL you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action The action that occurs if the user taps a push notification
     *            delivered by the campaign: OPEN_APP â€“ Your app launches, or
     *            it becomes the foreground app if it has been sent to the
     *            background. This is the default action. DEEP_LINK â€“ Uses
     *            deep linking features in iOS and Android to open your app and
     *            display a designated user interface within the app. URL â€“
     *            The default mobile browser on the user's device launches and
     *            opens a web page at the URL you specify.
     * @see Action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP â€“ Your app launches, or it becomes the
     * foreground app if it has been sent to the background. This is the default
     * action. DEEP_LINK â€“ Uses deep linking features in iOS and Android to
     * open your app and display a designated user interface within the app. URL
     * â€“ The default mobile browser on the user's device launches and opens a
     * web page at the URL you specify.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action The action that occurs if the user taps a push notification
     *            delivered by the campaign: OPEN_APP â€“ Your app launches, or
     *            it becomes the foreground app if it has been sent to the
     *            background. This is the default action. DEEP_LINK â€“ Uses
     *            deep linking features in iOS and Android to open your app and
     *            display a designated user interface within the app. URL â€“
     *            The default mobile browser on the user's device launches and
     *            opens a web page at the URL you specify.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Action
     */
    public Message withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP â€“ Your app launches, or it becomes the
     * foreground app if it has been sent to the background. This is the default
     * action. DEEP_LINK â€“ Uses deep linking features in iOS and Android to
     * open your app and display a designated user interface within the app. URL
     * â€“ The default mobile browser on the user's device launches and opens a
     * web page at the URL you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action The action that occurs if the user taps a push notification
     *            delivered by the campaign: OPEN_APP â€“ Your app launches, or
     *            it becomes the foreground app if it has been sent to the
     *            background. This is the default action. DEEP_LINK â€“ Uses
     *            deep linking features in iOS and Android to open your app and
     *            display a designated user interface within the app. URL â€“
     *            The default mobile browser on the user's device launches and
     *            opens a web page at the URL you specify.
     * @see Action
     */
    public void setAction(Action action) {
        this.action = action.toString();
    }

    /**
     * The action that occurs if the user taps a push notification delivered by
     * the campaign: OPEN_APP â€“ Your app launches, or it becomes the
     * foreground app if it has been sent to the background. This is the default
     * action. DEEP_LINK â€“ Uses deep linking features in iOS and Android to
     * open your app and display a designated user interface within the app. URL
     * â€“ The default mobile browser on the user's device launches and opens a
     * web page at the URL you specify.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action The action that occurs if the user taps a push notification
     *            delivered by the campaign: OPEN_APP â€“ Your app launches, or
     *            it becomes the foreground app if it has been sent to the
     *            background. This is the default action. DEEP_LINK â€“ Uses
     *            deep linking features in iOS and Android to open your app and
     *            display a designated user interface within the app. URL â€“
     *            The default mobile browser on the user's device launches and
     *            opens a web page at the URL you specify.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Action
     */
    public Message withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * The message body. Can include up to 140 characters.
     *
     * @return The message body. Can include up to 140 characters.
     */
    public String getBody() {
        return body;
    }

    /**
     * The message body. Can include up to 140 characters.
     *
     * @param body The message body. Can include up to 140 characters.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The message body. Can include up to 140 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body The message body. Can include up to 140 characters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * The URL that points to the icon image for the push notification icon, for
     * example, the app icon.
     *
     * @return The URL that points to the icon image for the push notification
     *         icon, for example, the app icon.
     */
    public String getImageIconUrl() {
        return imageIconUrl;
    }

    /**
     * The URL that points to the icon image for the push notification icon, for
     * example, the app icon.
     *
     * @param imageIconUrl The URL that points to the icon image for the push
     *            notification icon, for example, the app icon.
     */
    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * The URL that points to the icon image for the push notification icon, for
     * example, the app icon.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageIconUrl The URL that points to the icon image for the push
     *            notification icon, for example, the app icon.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withImageIconUrl(String imageIconUrl) {
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
    public Message withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * The JSON payload used for a silent push.
     *
     * @return The JSON payload used for a silent push.
     */
    public String getJsonBody() {
        return jsonBody;
    }

    /**
     * The JSON payload used for a silent push.
     *
     * @param jsonBody The JSON payload used for a silent push.
     */
    public void setJsonBody(String jsonBody) {
        this.jsonBody = jsonBody;
    }

    /**
     * The JSON payload used for a silent push.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonBody The JSON payload used for a silent push.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withJsonBody(String jsonBody) {
        this.jsonBody = jsonBody;
        return this;
    }

    /**
     * The URL that points to the media resource, for example a .mp4 or .gif
     * file.
     *
     * @return The URL that points to the media resource, for example a .mp4 or
     *         .gif file.
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * The URL that points to the media resource, for example a .mp4 or .gif
     * file.
     *
     * @param mediaUrl The URL that points to the media resource, for example a
     *            .mp4 or .gif file.
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * The URL that points to the media resource, for example a .mp4 or .gif
     * file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaUrl The URL that points to the media resource, for example a
     *            .mp4 or .gif file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Message withMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
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
    public Message withSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
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
    public Message withTitle(String title) {
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
        if (getImageUrl() != null)
            sb.append("ImageUrl: " + getImageUrl() + ",");
        if (getJsonBody() != null)
            sb.append("JsonBody: " + getJsonBody() + ",");
        if (getMediaUrl() != null)
            sb.append("MediaUrl: " + getMediaUrl() + ",");
        if (getSilentPush() != null)
            sb.append("SilentPush: " + getSilentPush() + ",");
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
        hashCode = prime * hashCode + ((getJsonBody() == null) ? 0 : getJsonBody().hashCode());
        hashCode = prime * hashCode + ((getMediaUrl() == null) ? 0 : getMediaUrl().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
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
        if (other.getSilentPush() == null ^ this.getSilentPush() == null)
            return false;
        if (other.getSilentPush() != null
                && other.getSilentPush().equals(this.getSilentPush()) == false)
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
