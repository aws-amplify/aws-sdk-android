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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Recipient-related information to include in the Delivery Status Notification
 * (DSN) when an email that Amazon SES receives on your behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class BouncedRecipientInfo implements Serializable {
    /**
     * <p>
     * The email address of the recipient of the bounced email.
     * </p>
     */
    private String recipient;

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to receive email for the recipient of the bounced email.
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     */
    private String recipientArn;

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota,
     * ContentRejected, Undefined, TemporaryFailure
     */
    private String bounceType;

    /**
     * <p>
     * Recipient-related DSN fields, most of which would normally be filled in
     * automatically when provided with a <code>BounceType</code>. You must
     * provide either this parameter or <code>BounceType</code>.
     * </p>
     */
    private RecipientDsnFields recipientDsnFields;

    /**
     * <p>
     * The email address of the recipient of the bounced email.
     * </p>
     *
     * @return <p>
     *         The email address of the recipient of the bounced email.
     *         </p>
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * <p>
     * The email address of the recipient of the bounced email.
     * </p>
     *
     * @param recipient <p>
     *            The email address of the recipient of the bounced email.
     *            </p>
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * <p>
     * The email address of the recipient of the bounced email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipient <p>
     *            The email address of the recipient of the bounced email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BouncedRecipientInfo withRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to receive email for the recipient of the bounced email.
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         This parameter is used only for sending authorization. It is the
     *         ARN of the identity that is associated with the sending
     *         authorization policy that permits you to receive email for the
     *         recipient of the bounced email. For more information about
     *         sending authorization, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */
    public String getRecipientArn() {
        return recipientArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to receive email for the recipient of the bounced email.
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @param recipientArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to receive email for the
     *            recipient of the bounced email. For more information about
     *            sending authorization, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     */
    public void setRecipientArn(String recipientArn) {
        this.recipientArn = recipientArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to receive email for the recipient of the bounced email.
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipientArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to receive email for the
     *            recipient of the bounced email. For more information about
     *            sending authorization, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BouncedRecipientInfo withRecipientArn(String recipientArn) {
        this.recipientArn = recipientArn;
        return this;
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota,
     * ContentRejected, Undefined, TemporaryFailure
     *
     * @return <p>
     *         The reason for the bounce. You must provide either this parameter
     *         or <code>RecipientDsnFields</code>.
     *         </p>
     * @see BounceType
     */
    public String getBounceType() {
        return bounceType;
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota,
     * ContentRejected, Undefined, TemporaryFailure
     *
     * @param bounceType <p>
     *            The reason for the bounce. You must provide either this
     *            parameter or <code>RecipientDsnFields</code>.
     *            </p>
     * @see BounceType
     */
    public void setBounceType(String bounceType) {
        this.bounceType = bounceType;
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota,
     * ContentRejected, Undefined, TemporaryFailure
     *
     * @param bounceType <p>
     *            The reason for the bounce. You must provide either this
     *            parameter or <code>RecipientDsnFields</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BounceType
     */
    public BouncedRecipientInfo withBounceType(String bounceType) {
        this.bounceType = bounceType;
        return this;
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota,
     * ContentRejected, Undefined, TemporaryFailure
     *
     * @param bounceType <p>
     *            The reason for the bounce. You must provide either this
     *            parameter or <code>RecipientDsnFields</code>.
     *            </p>
     * @see BounceType
     */
    public void setBounceType(BounceType bounceType) {
        this.bounceType = bounceType.toString();
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota,
     * ContentRejected, Undefined, TemporaryFailure
     *
     * @param bounceType <p>
     *            The reason for the bounce. You must provide either this
     *            parameter or <code>RecipientDsnFields</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BounceType
     */
    public BouncedRecipientInfo withBounceType(BounceType bounceType) {
        this.bounceType = bounceType.toString();
        return this;
    }

    /**
     * <p>
     * Recipient-related DSN fields, most of which would normally be filled in
     * automatically when provided with a <code>BounceType</code>. You must
     * provide either this parameter or <code>BounceType</code>.
     * </p>
     *
     * @return <p>
     *         Recipient-related DSN fields, most of which would normally be
     *         filled in automatically when provided with a
     *         <code>BounceType</code>. You must provide either this parameter
     *         or <code>BounceType</code>.
     *         </p>
     */
    public RecipientDsnFields getRecipientDsnFields() {
        return recipientDsnFields;
    }

    /**
     * <p>
     * Recipient-related DSN fields, most of which would normally be filled in
     * automatically when provided with a <code>BounceType</code>. You must
     * provide either this parameter or <code>BounceType</code>.
     * </p>
     *
     * @param recipientDsnFields <p>
     *            Recipient-related DSN fields, most of which would normally be
     *            filled in automatically when provided with a
     *            <code>BounceType</code>. You must provide either this
     *            parameter or <code>BounceType</code>.
     *            </p>
     */
    public void setRecipientDsnFields(RecipientDsnFields recipientDsnFields) {
        this.recipientDsnFields = recipientDsnFields;
    }

    /**
     * <p>
     * Recipient-related DSN fields, most of which would normally be filled in
     * automatically when provided with a <code>BounceType</code>. You must
     * provide either this parameter or <code>BounceType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipientDsnFields <p>
     *            Recipient-related DSN fields, most of which would normally be
     *            filled in automatically when provided with a
     *            <code>BounceType</code>. You must provide either this
     *            parameter or <code>BounceType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BouncedRecipientInfo withRecipientDsnFields(RecipientDsnFields recipientDsnFields) {
        this.recipientDsnFields = recipientDsnFields;
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
        if (getRecipient() != null)
            sb.append("Recipient: " + getRecipient() + ",");
        if (getRecipientArn() != null)
            sb.append("RecipientArn: " + getRecipientArn() + ",");
        if (getBounceType() != null)
            sb.append("BounceType: " + getBounceType() + ",");
        if (getRecipientDsnFields() != null)
            sb.append("RecipientDsnFields: " + getRecipientDsnFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        hashCode = prime * hashCode
                + ((getRecipientArn() == null) ? 0 : getRecipientArn().hashCode());
        hashCode = prime * hashCode + ((getBounceType() == null) ? 0 : getBounceType().hashCode());
        hashCode = prime * hashCode
                + ((getRecipientDsnFields() == null) ? 0 : getRecipientDsnFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BouncedRecipientInfo == false)
            return false;
        BouncedRecipientInfo other = (BouncedRecipientInfo) obj;

        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null
                && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        if (other.getRecipientArn() == null ^ this.getRecipientArn() == null)
            return false;
        if (other.getRecipientArn() != null
                && other.getRecipientArn().equals(this.getRecipientArn()) == false)
            return false;
        if (other.getBounceType() == null ^ this.getBounceType() == null)
            return false;
        if (other.getBounceType() != null
                && other.getBounceType().equals(this.getBounceType()) == false)
            return false;
        if (other.getRecipientDsnFields() == null ^ this.getRecipientDsnFields() == null)
            return false;
        if (other.getRecipientDsnFields() != null
                && other.getRecipientDsnFields().equals(this.getRecipientDsnFields()) == false)
            return false;
        return true;
    }
}
