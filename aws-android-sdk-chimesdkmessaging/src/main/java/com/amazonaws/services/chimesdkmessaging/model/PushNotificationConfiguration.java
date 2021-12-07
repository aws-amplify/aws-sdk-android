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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * The push notification configuration of the message.
 * </p>
 */
public class PushNotificationConfiguration implements Serializable {
    /**
     * <p>
     * The title of the push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String title;

    /**
     * <p>
     * The body of the push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 150<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String body;

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a
     * message. <code>DEFAULT</code>: Normal mobile push notification.
     * <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, VOIP
     */
    private String type;

    /**
     * <p>
     * The title of the push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The title of the push notification.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param title <p>
     *            The title of the push notification.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param title <p>
     *            The title of the push notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationConfiguration withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The body of the push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 150<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The body of the push notification.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The body of the push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 150<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param body <p>
     *            The body of the push notification.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 150<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param body <p>
     *            The body of the push notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationConfiguration withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a
     * message. <code>DEFAULT</code>: Normal mobile push notification.
     * <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, VOIP
     *
     * @return <p>
     *         Enum value that indicates the type of the push notification for a
     *         message. <code>DEFAULT</code>: Normal mobile push notification.
     *         <code>VOIP</code>: VOIP mobile push notification.
     *         </p>
     * @see PushNotificationType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a
     * message. <code>DEFAULT</code>: Normal mobile push notification.
     * <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, VOIP
     *
     * @param type <p>
     *            Enum value that indicates the type of the push notification
     *            for a message. <code>DEFAULT</code>: Normal mobile push
     *            notification. <code>VOIP</code>: VOIP mobile push
     *            notification.
     *            </p>
     * @see PushNotificationType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a
     * message. <code>DEFAULT</code>: Normal mobile push notification.
     * <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, VOIP
     *
     * @param type <p>
     *            Enum value that indicates the type of the push notification
     *            for a message. <code>DEFAULT</code>: Normal mobile push
     *            notification. <code>VOIP</code>: VOIP mobile push
     *            notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PushNotificationType
     */
    public PushNotificationConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a
     * message. <code>DEFAULT</code>: Normal mobile push notification.
     * <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, VOIP
     *
     * @param type <p>
     *            Enum value that indicates the type of the push notification
     *            for a message. <code>DEFAULT</code>: Normal mobile push
     *            notification. <code>VOIP</code>: VOIP mobile push
     *            notification.
     *            </p>
     * @see PushNotificationType
     */
    public void setType(PushNotificationType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Enum value that indicates the type of the push notification for a
     * message. <code>DEFAULT</code>: Normal mobile push notification.
     * <code>VOIP</code>: VOIP mobile push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, VOIP
     *
     * @param type <p>
     *            Enum value that indicates the type of the push notification
     *            for a message. <code>DEFAULT</code>: Normal mobile push
     *            notification. <code>VOIP</code>: VOIP mobile push
     *            notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PushNotificationType
     */
    public PushNotificationConfiguration withType(PushNotificationType type) {
        this.type = type.toString();
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
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushNotificationConfiguration == false)
            return false;
        PushNotificationConfiguration other = (PushNotificationConfiguration) obj;

        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
