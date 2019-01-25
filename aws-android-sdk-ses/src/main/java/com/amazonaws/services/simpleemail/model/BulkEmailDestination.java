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
 * An array that contains one or more Destinations, as well as the tags and
 * replacement data associated with each of those Destinations.
 * </p>
 */
public class BulkEmailDestination implements Serializable {
    /**
     * <p>
     * Represents the destination of the message, consisting of To:, CC:, and
     * BCC: fields.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason,
     * the <i>local part</i> of a destination email address (the part of the
     * email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
     * characters</a>. If the <i>domain part</i> of an address (the part after
     * the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a
     * href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     * </p>
     * </note>
     */
    private Destination destination;

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendBulkTemplatedEmail</code>. Tags correspond
     * to characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     */
    private java.util.List<MessageTag> replacementTags = new java.util.ArrayList<MessageTag>();

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is
     * a JSON object, typically consisting of key-value pairs in which the keys
     * correspond to replacement tags in the email template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     */
    private String replacementTemplateData;

    /**
     * <p>
     * Represents the destination of the message, consisting of To:, CC:, and
     * BCC: fields.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason,
     * the <i>local part</i> of a destination email address (the part of the
     * email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
     * characters</a>. If the <i>domain part</i> of an address (the part after
     * the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a
     * href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         Represents the destination of the message, consisting of To:,
     *         CC:, and BCC: fields.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon SES does not support the SMTPUTF8 extension, as described
     *         in <a href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For
     *         this reason, the <i>local part</i> of a destination email address
     *         (the part of the email address that precedes the @ sign) may only
     *         contain <a
     *         href="https://en.wikipedia.org/wiki/Email_address#Local-part"
     *         >7-bit ASCII characters</a>. If the <i>domain part</i> of an
     *         address (the part after the @ sign) contains non-ASCII
     *         characters, they must be encoded using Punycode, as described in
     *         <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *         </p>
     *         </note>
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * <p>
     * Represents the destination of the message, consisting of To:, CC:, and
     * BCC: fields.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason,
     * the <i>local part</i> of a destination email address (the part of the
     * email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
     * characters</a>. If the <i>domain part</i> of an address (the part after
     * the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a
     * href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     * </p>
     * </note>
     *
     * @param destination <p>
     *            Represents the destination of the message, consisting of To:,
     *            CC:, and BCC: fields.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SES does not support the SMTPUTF8 extension, as
     *            described in <a
     *            href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For
     *            this reason, the <i>local part</i> of a destination email
     *            address (the part of the email address that precedes the @
     *            sign) may only contain <a href=
     *            "https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit
     *            ASCII characters</a>. If the <i>domain part</i> of an address
     *            (the part after the @ sign) contains non-ASCII characters,
     *            they must be encoded using Punycode, as described in <a
     *            href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *            </p>
     *            </note>
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Represents the destination of the message, consisting of To:, CC:, and
     * BCC: fields.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason,
     * the <i>local part</i> of a destination email address (the part of the
     * email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
     * characters</a>. If the <i>domain part</i> of an address (the part after
     * the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a
     * href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            Represents the destination of the message, consisting of To:,
     *            CC:, and BCC: fields.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SES does not support the SMTPUTF8 extension, as
     *            described in <a
     *            href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For
     *            this reason, the <i>local part</i> of a destination email
     *            address (the part of the email address that precedes the @
     *            sign) may only contain <a href=
     *            "https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit
     *            ASCII characters</a>. If the <i>domain part</i> of an address
     *            (the part after the @ sign) contains non-ASCII characters,
     *            they must be encoded using Punycode, as described in <a
     *            href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BulkEmailDestination withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendBulkTemplatedEmail</code>. Tags correspond
     * to characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     *
     * @return <p>
     *         A list of tags, in the form of name/value pairs, to apply to an
     *         email that you send using <code>SendBulkTemplatedEmail</code>.
     *         Tags correspond to characteristics of the email that you define,
     *         so that you can publish email sending events.
     *         </p>
     */
    public java.util.List<MessageTag> getReplacementTags() {
        return replacementTags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendBulkTemplatedEmail</code>. Tags correspond
     * to characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     *
     * @param replacementTags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using
     *            <code>SendBulkTemplatedEmail</code>. Tags correspond to
     *            characteristics of the email that you define, so that you can
     *            publish email sending events.
     *            </p>
     */
    public void setReplacementTags(java.util.Collection<MessageTag> replacementTags) {
        if (replacementTags == null) {
            this.replacementTags = null;
            return;
        }

        this.replacementTags = new java.util.ArrayList<MessageTag>(replacementTags);
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendBulkTemplatedEmail</code>. Tags correspond
     * to characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replacementTags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using
     *            <code>SendBulkTemplatedEmail</code>. Tags correspond to
     *            characteristics of the email that you define, so that you can
     *            publish email sending events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BulkEmailDestination withReplacementTags(MessageTag... replacementTags) {
        if (getReplacementTags() == null) {
            this.replacementTags = new java.util.ArrayList<MessageTag>(replacementTags.length);
        }
        for (MessageTag value : replacementTags) {
            this.replacementTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendBulkTemplatedEmail</code>. Tags correspond
     * to characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replacementTags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using
     *            <code>SendBulkTemplatedEmail</code>. Tags correspond to
     *            characteristics of the email that you define, so that you can
     *            publish email sending events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BulkEmailDestination withReplacementTags(java.util.Collection<MessageTag> replacementTags) {
        setReplacementTags(replacementTags);
        return this;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is
     * a JSON object, typically consisting of key-value pairs in which the keys
     * correspond to replacement tags in the email template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @return <p>
     *         A list of replacement values to apply to the template. This
     *         parameter is a JSON object, typically consisting of key-value
     *         pairs in which the keys correspond to replacement tags in the
     *         email template.
     *         </p>
     */
    public String getReplacementTemplateData() {
        return replacementTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is
     * a JSON object, typically consisting of key-value pairs in which the keys
     * correspond to replacement tags in the email template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @param replacementTemplateData <p>
     *            A list of replacement values to apply to the template. This
     *            parameter is a JSON object, typically consisting of key-value
     *            pairs in which the keys correspond to replacement tags in the
     *            email template.
     *            </p>
     */
    public void setReplacementTemplateData(String replacementTemplateData) {
        this.replacementTemplateData = replacementTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is
     * a JSON object, typically consisting of key-value pairs in which the keys
     * correspond to replacement tags in the email template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @param replacementTemplateData <p>
     *            A list of replacement values to apply to the template. This
     *            parameter is a JSON object, typically consisting of key-value
     *            pairs in which the keys correspond to replacement tags in the
     *            email template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BulkEmailDestination withReplacementTemplateData(String replacementTemplateData) {
        this.replacementTemplateData = replacementTemplateData;
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
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getReplacementTags() != null)
            sb.append("ReplacementTags: " + getReplacementTags() + ",");
        if (getReplacementTemplateData() != null)
            sb.append("ReplacementTemplateData: " + getReplacementTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getReplacementTags() == null) ? 0 : getReplacementTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplacementTemplateData() == null) ? 0 : getReplacementTemplateData()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkEmailDestination == false)
            return false;
        BulkEmailDestination other = (BulkEmailDestination) obj;

        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getReplacementTags() == null ^ this.getReplacementTags() == null)
            return false;
        if (other.getReplacementTags() != null
                && other.getReplacementTags().equals(this.getReplacementTags()) == false)
            return false;
        if (other.getReplacementTemplateData() == null ^ this.getReplacementTemplateData() == null)
            return false;
        if (other.getReplacementTemplateData() != null
                && other.getReplacementTemplateData().equals(this.getReplacementTemplateData()) == false)
            return false;
        return true;
    }
}
