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
 * Email Message.
 */
public class EmailMessage implements Serializable {
    /**
     * The body of the email message.
     */
    private String body;

    /**
     * The email address that bounces and complaints will be forwarded to when
     * feedback forwarding is enabled.
     */
    private String feedbackForwardingAddress;

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     */
    private String fromAddress;

    /**
     * An email represented as a raw MIME message.
     */
    private RawEmail rawEmail;

    /**
     * The reply-to email address(es) for the email. If the recipient replies to
     * the email, each reply-to address will receive the reply.
     */
    private java.util.List<String> replyToAddresses;

    /**
     * An email composed of a subject, a text part and a html part.
     */
    private SimpleEmail simpleEmail;

    /**
     * Default message substitutions. Can be overridden by individual address
     * substitutions.
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * The body of the email message.
     *
     * @return The body of the email message.
     */
    public String getBody() {
        return body;
    }

    /**
     * The body of the email message.
     *
     * @param body The body of the email message.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The body of the email message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body The body of the email message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * The email address that bounces and complaints will be forwarded to when
     * feedback forwarding is enabled.
     *
     * @return The email address that bounces and complaints will be forwarded
     *         to when feedback forwarding is enabled.
     */
    public String getFeedbackForwardingAddress() {
        return feedbackForwardingAddress;
    }

    /**
     * The email address that bounces and complaints will be forwarded to when
     * feedback forwarding is enabled.
     *
     * @param feedbackForwardingAddress The email address that bounces and
     *            complaints will be forwarded to when feedback forwarding is
     *            enabled.
     */
    public void setFeedbackForwardingAddress(String feedbackForwardingAddress) {
        this.feedbackForwardingAddress = feedbackForwardingAddress;
    }

    /**
     * The email address that bounces and complaints will be forwarded to when
     * feedback forwarding is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param feedbackForwardingAddress The email address that bounces and
     *            complaints will be forwarded to when feedback forwarding is
     *            enabled.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withFeedbackForwardingAddress(String feedbackForwardingAddress) {
        this.feedbackForwardingAddress = feedbackForwardingAddress;
        return this;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     *
     * @return The email address used to send the email from. Defaults to use
     *         FromAddress specified in the Email Channel.
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     *
     * @param fromAddress The email address used to send the email from.
     *            Defaults to use FromAddress specified in the Email Channel.
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * The email address used to send the email from. Defaults to use
     * FromAddress specified in the Email Channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress The email address used to send the email from.
     *            Defaults to use FromAddress specified in the Email Channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * An email represented as a raw MIME message.
     *
     * @return An email represented as a raw MIME message.
     */
    public RawEmail getRawEmail() {
        return rawEmail;
    }

    /**
     * An email represented as a raw MIME message.
     *
     * @param rawEmail An email represented as a raw MIME message.
     */
    public void setRawEmail(RawEmail rawEmail) {
        this.rawEmail = rawEmail;
    }

    /**
     * An email represented as a raw MIME message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawEmail An email represented as a raw MIME message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withRawEmail(RawEmail rawEmail) {
        this.rawEmail = rawEmail;
        return this;
    }

    /**
     * The reply-to email address(es) for the email. If the recipient replies to
     * the email, each reply-to address will receive the reply.
     *
     * @return The reply-to email address(es) for the email. If the recipient
     *         replies to the email, each reply-to address will receive the
     *         reply.
     */
    public java.util.List<String> getReplyToAddresses() {
        return replyToAddresses;
    }

    /**
     * The reply-to email address(es) for the email. If the recipient replies to
     * the email, each reply-to address will receive the reply.
     *
     * @param replyToAddresses The reply-to email address(es) for the email. If
     *            the recipient replies to the email, each reply-to address will
     *            receive the reply.
     */
    public void setReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        if (replyToAddresses == null) {
            this.replyToAddresses = null;
            return;
        }

        this.replyToAddresses = new java.util.ArrayList<String>(replyToAddresses);
    }

    /**
     * The reply-to email address(es) for the email. If the recipient replies to
     * the email, each reply-to address will receive the reply.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replyToAddresses The reply-to email address(es) for the email. If
     *            the recipient replies to the email, each reply-to address will
     *            receive the reply.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withReplyToAddresses(String... replyToAddresses) {
        if (getReplyToAddresses() == null) {
            this.replyToAddresses = new java.util.ArrayList<String>(replyToAddresses.length);
        }
        for (String value : replyToAddresses) {
            this.replyToAddresses.add(value);
        }
        return this;
    }

    /**
     * The reply-to email address(es) for the email. If the recipient replies to
     * the email, each reply-to address will receive the reply.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replyToAddresses The reply-to email address(es) for the email. If
     *            the recipient replies to the email, each reply-to address will
     *            receive the reply.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        setReplyToAddresses(replyToAddresses);
        return this;
    }

    /**
     * An email composed of a subject, a text part and a html part.
     *
     * @return An email composed of a subject, a text part and a html part.
     */
    public SimpleEmail getSimpleEmail() {
        return simpleEmail;
    }

    /**
     * An email composed of a subject, a text part and a html part.
     *
     * @param simpleEmail An email composed of a subject, a text part and a html
     *            part.
     */
    public void setSimpleEmail(SimpleEmail simpleEmail) {
        this.simpleEmail = simpleEmail;
    }

    /**
     * An email composed of a subject, a text part and a html part.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param simpleEmail An email composed of a subject, a text part and a html
     *            part.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withSimpleEmail(SimpleEmail simpleEmail) {
        this.simpleEmail = simpleEmail;
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
    public EmailMessage withSubstitutions(
            java.util.Map<String, java.util.List<String>> substitutions) {
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
    public EmailMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
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
    public EmailMessage clearSubstitutionsEntries() {
        this.substitutions = null;
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getFeedbackForwardingAddress() != null)
            sb.append("FeedbackForwardingAddress: " + getFeedbackForwardingAddress() + ",");
        if (getFromAddress() != null)
            sb.append("FromAddress: " + getFromAddress() + ",");
        if (getRawEmail() != null)
            sb.append("RawEmail: " + getRawEmail() + ",");
        if (getReplyToAddresses() != null)
            sb.append("ReplyToAddresses: " + getReplyToAddresses() + ",");
        if (getSimpleEmail() != null)
            sb.append("SimpleEmail: " + getSimpleEmail() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime
                * hashCode
                + ((getFeedbackForwardingAddress() == null) ? 0 : getFeedbackForwardingAddress()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getRawEmail() == null) ? 0 : getRawEmail().hashCode());
        hashCode = prime * hashCode
                + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getSimpleEmail() == null) ? 0 : getSimpleEmail().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailMessage == false)
            return false;
        EmailMessage other = (EmailMessage) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFeedbackForwardingAddress() == null
                ^ this.getFeedbackForwardingAddress() == null)
            return false;
        if (other.getFeedbackForwardingAddress() != null
                && other.getFeedbackForwardingAddress().equals(this.getFeedbackForwardingAddress()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null
                && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getRawEmail() == null ^ this.getRawEmail() == null)
            return false;
        if (other.getRawEmail() != null && other.getRawEmail().equals(this.getRawEmail()) == false)
            return false;
        if (other.getReplyToAddresses() == null ^ this.getReplyToAddresses() == null)
            return false;
        if (other.getReplyToAddresses() != null
                && other.getReplyToAddresses().equals(this.getReplyToAddresses()) == false)
            return false;
        if (other.getSimpleEmail() == null ^ this.getSimpleEmail() == null)
            return false;
        if (other.getSimpleEmail() != null
                && other.getSimpleEmail().equals(this.getSimpleEmail()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null
                && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        return true;
    }
}
