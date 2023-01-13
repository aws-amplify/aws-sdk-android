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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the send notification action.
 * </p>
 */
public class SendNotificationActionDefinition implements Serializable {
    /**
     * <p>
     * Notification delivery method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL
     */
    private String deliveryMethod;

    /**
     * <p>
     * The subject of the email if the delivery method is <code>EMAIL</code>.
     * Supports variable injection. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String subject;

    /**
     * <p>
     * Notification content. Supports variable injection. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String content;

    /**
     * <p>
     * Content type format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT
     */
    private String contentType;

    /**
     * <p>
     * Notification recipient.
     * </p>
     */
    private NotificationRecipientType recipient;

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL
     *
     * @return <p>
     *         Notification delivery method.
     *         </p>
     * @see NotificationDeliveryType
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL
     *
     * @param deliveryMethod <p>
     *            Notification delivery method.
     *            </p>
     * @see NotificationDeliveryType
     */
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL
     *
     * @param deliveryMethod <p>
     *            Notification delivery method.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationDeliveryType
     */
    public SendNotificationActionDefinition withDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
        return this;
    }

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL
     *
     * @param deliveryMethod <p>
     *            Notification delivery method.
     *            </p>
     * @see NotificationDeliveryType
     */
    public void setDeliveryMethod(NotificationDeliveryType deliveryMethod) {
        this.deliveryMethod = deliveryMethod.toString();
    }

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL
     *
     * @param deliveryMethod <p>
     *            Notification delivery method.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationDeliveryType
     */
    public SendNotificationActionDefinition withDeliveryMethod(
            NotificationDeliveryType deliveryMethod) {
        this.deliveryMethod = deliveryMethod.toString();
        return this;
    }

    /**
     * <p>
     * The subject of the email if the delivery method is <code>EMAIL</code>.
     * Supports variable injection. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The subject of the email if the delivery method is
     *         <code>EMAIL</code>. Supports variable injection. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *         >JSONPath reference</a> in the <i>Amazon Connect Administrators
     *         Guide</i>.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * The subject of the email if the delivery method is <code>EMAIL</code>.
     * Supports variable injection. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param subject <p>
     *            The subject of the email if the delivery method is
     *            <code>EMAIL</code>. Supports variable injection. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *            >JSONPath reference</a> in the <i>Amazon Connect
     *            Administrators Guide</i>.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject of the email if the delivery method is <code>EMAIL</code>.
     * Supports variable injection. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param subject <p>
     *            The subject of the email if the delivery method is
     *            <code>EMAIL</code>. Supports variable injection. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *            >JSONPath reference</a> in the <i>Amazon Connect
     *            Administrators Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendNotificationActionDefinition withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * Notification content. Supports variable injection. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Notification content. Supports variable injection. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *         >JSONPath reference</a> in the <i>Amazon Connect Administrators
     *         Guide</i>.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * Notification content. Supports variable injection. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param content <p>
     *            Notification content. Supports variable injection. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *            >JSONPath reference</a> in the <i>Amazon Connect
     *            Administrators Guide</i>.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Notification content. Supports variable injection. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     * >JSONPath reference</a> in the <i>Amazon Connect Administrators
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param content <p>
     *            Notification content. Supports variable injection. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *            >JSONPath reference</a> in the <i>Amazon Connect
     *            Administrators Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendNotificationActionDefinition withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT
     *
     * @return <p>
     *         Content type format.
     *         </p>
     * @see NotificationContentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT
     *
     * @param contentType <p>
     *            Content type format.
     *            </p>
     * @see NotificationContentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT
     *
     * @param contentType <p>
     *            Content type format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationContentType
     */
    public SendNotificationActionDefinition withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT
     *
     * @param contentType <p>
     *            Content type format.
     *            </p>
     * @see NotificationContentType
     */
    public void setContentType(NotificationContentType contentType) {
        this.contentType = contentType.toString();
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT
     *
     * @param contentType <p>
     *            Content type format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationContentType
     */
    public SendNotificationActionDefinition withContentType(NotificationContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * Notification recipient.
     * </p>
     *
     * @return <p>
     *         Notification recipient.
     *         </p>
     */
    public NotificationRecipientType getRecipient() {
        return recipient;
    }

    /**
     * <p>
     * Notification recipient.
     * </p>
     *
     * @param recipient <p>
     *            Notification recipient.
     *            </p>
     */
    public void setRecipient(NotificationRecipientType recipient) {
        this.recipient = recipient;
    }

    /**
     * <p>
     * Notification recipient.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipient <p>
     *            Notification recipient.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendNotificationActionDefinition withRecipient(NotificationRecipientType recipient) {
        this.recipient = recipient;
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
        if (getDeliveryMethod() != null)
            sb.append("DeliveryMethod: " + getDeliveryMethod() + ",");
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getRecipient() != null)
            sb.append("Recipient: " + getRecipient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveryMethod() == null) ? 0 : getDeliveryMethod().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendNotificationActionDefinition == false)
            return false;
        SendNotificationActionDefinition other = (SendNotificationActionDefinition) obj;

        if (other.getDeliveryMethod() == null ^ this.getDeliveryMethod() == null)
            return false;
        if (other.getDeliveryMethod() != null
                && other.getDeliveryMethod().equals(this.getDeliveryMethod()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null
                && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        return true;
    }
}
