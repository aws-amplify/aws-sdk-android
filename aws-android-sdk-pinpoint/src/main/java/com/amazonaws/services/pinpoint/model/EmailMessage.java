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
 * Specifies the default settings and content for a one-time email message
 * that's sent directly to an endpoint.
 * </p>
 */
public class EmailMessage implements Serializable {
    /**
     * <p>
     * The body of the email message.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The email address to forward bounces and complaints to, if feedback
     * forwarding is enabled.
     * </p>
     */
    private String feedbackForwardingAddress;

    /**
     * <p>
     * The verified email address to send the email message from. The default
     * value is the FromAddress specified for the email channel.
     * </p>
     */
    private String fromAddress;

    /**
     * <p>
     * The email message, represented as a raw MIME message.
     * </p>
     */
    private RawEmail rawEmail;

    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient
     * replies to the email, each reply-to address receives the reply.
     * </p>
     */
    private java.util.List<String> replyToAddresses;

    /**
     * <p>
     * The email message, composed of a subject, a text part, and an HTML part.
     * </p>
     */
    private SimpleEmail simpleEmail;

    /**
     * <p>
     * The default message variables to use in the email message. You can
     * override the default variables with individual address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * <p>
     * The body of the email message.
     * </p>
     *
     * @return <p>
     *         The body of the email message.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The body of the email message.
     * </p>
     *
     * @param body <p>
     *            The body of the email message.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the email message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The body of the email message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The email address to forward bounces and complaints to, if feedback
     * forwarding is enabled.
     * </p>
     *
     * @return <p>
     *         The email address to forward bounces and complaints to, if
     *         feedback forwarding is enabled.
     *         </p>
     */
    public String getFeedbackForwardingAddress() {
        return feedbackForwardingAddress;
    }

    /**
     * <p>
     * The email address to forward bounces and complaints to, if feedback
     * forwarding is enabled.
     * </p>
     *
     * @param feedbackForwardingAddress <p>
     *            The email address to forward bounces and complaints to, if
     *            feedback forwarding is enabled.
     *            </p>
     */
    public void setFeedbackForwardingAddress(String feedbackForwardingAddress) {
        this.feedbackForwardingAddress = feedbackForwardingAddress;
    }

    /**
     * <p>
     * The email address to forward bounces and complaints to, if feedback
     * forwarding is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param feedbackForwardingAddress <p>
     *            The email address to forward bounces and complaints to, if
     *            feedback forwarding is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withFeedbackForwardingAddress(String feedbackForwardingAddress) {
        this.feedbackForwardingAddress = feedbackForwardingAddress;
        return this;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default
     * value is the FromAddress specified for the email channel.
     * </p>
     *
     * @return <p>
     *         The verified email address to send the email message from. The
     *         default value is the FromAddress specified for the email channel.
     *         </p>
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default
     * value is the FromAddress specified for the email channel.
     * </p>
     *
     * @param fromAddress <p>
     *            The verified email address to send the email message from. The
     *            default value is the FromAddress specified for the email
     *            channel.
     *            </p>
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default
     * value is the FromAddress specified for the email channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromAddress <p>
     *            The verified email address to send the email message from. The
     *            default value is the FromAddress specified for the email
     *            channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * <p>
     * The email message, represented as a raw MIME message.
     * </p>
     *
     * @return <p>
     *         The email message, represented as a raw MIME message.
     *         </p>
     */
    public RawEmail getRawEmail() {
        return rawEmail;
    }

    /**
     * <p>
     * The email message, represented as a raw MIME message.
     * </p>
     *
     * @param rawEmail <p>
     *            The email message, represented as a raw MIME message.
     *            </p>
     */
    public void setRawEmail(RawEmail rawEmail) {
        this.rawEmail = rawEmail;
    }

    /**
     * <p>
     * The email message, represented as a raw MIME message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawEmail <p>
     *            The email message, represented as a raw MIME message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withRawEmail(RawEmail rawEmail) {
        this.rawEmail = rawEmail;
        return this;
    }

    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient
     * replies to the email, each reply-to address receives the reply.
     * </p>
     *
     * @return <p>
     *         The reply-to email address(es) for the email message. If a
     *         recipient replies to the email, each reply-to address receives
     *         the reply.
     *         </p>
     */
    public java.util.List<String> getReplyToAddresses() {
        return replyToAddresses;
    }

    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient
     * replies to the email, each reply-to address receives the reply.
     * </p>
     *
     * @param replyToAddresses <p>
     *            The reply-to email address(es) for the email message. If a
     *            recipient replies to the email, each reply-to address receives
     *            the reply.
     *            </p>
     */
    public void setReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        if (replyToAddresses == null) {
            this.replyToAddresses = null;
            return;
        }

        this.replyToAddresses = new java.util.ArrayList<String>(replyToAddresses);
    }

    /**
     * <p>
     * The reply-to email address(es) for the email message. If a recipient
     * replies to the email, each reply-to address receives the reply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replyToAddresses <p>
     *            The reply-to email address(es) for the email message. If a
     *            recipient replies to the email, each reply-to address receives
     *            the reply.
     *            </p>
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
     * <p>
     * The reply-to email address(es) for the email message. If a recipient
     * replies to the email, each reply-to address receives the reply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replyToAddresses <p>
     *            The reply-to email address(es) for the email message. If a
     *            recipient replies to the email, each reply-to address receives
     *            the reply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        setReplyToAddresses(replyToAddresses);
        return this;
    }

    /**
     * <p>
     * The email message, composed of a subject, a text part, and an HTML part.
     * </p>
     *
     * @return <p>
     *         The email message, composed of a subject, a text part, and an
     *         HTML part.
     *         </p>
     */
    public SimpleEmail getSimpleEmail() {
        return simpleEmail;
    }

    /**
     * <p>
     * The email message, composed of a subject, a text part, and an HTML part.
     * </p>
     *
     * @param simpleEmail <p>
     *            The email message, composed of a subject, a text part, and an
     *            HTML part.
     *            </p>
     */
    public void setSimpleEmail(SimpleEmail simpleEmail) {
        this.simpleEmail = simpleEmail;
    }

    /**
     * <p>
     * The email message, composed of a subject, a text part, and an HTML part.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param simpleEmail <p>
     *            The email message, composed of a subject, a text part, and an
     *            HTML part.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withSimpleEmail(SimpleEmail simpleEmail) {
        this.simpleEmail = simpleEmail;
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the email message. You can
     * override the default variables with individual address variables.
     * </p>
     *
     * @return <p>
     *         The default message variables to use in the email message. You
     *         can override the default variables with individual address
     *         variables.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the email message. You can
     * override the default variables with individual address variables.
     * </p>
     *
     * @param substitutions <p>
     *            The default message variables to use in the email message. You
     *            can override the default variables with individual address
     *            variables.
     *            </p>
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the email message. You can
     * override the default variables with individual address variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions <p>
     *            The default message variables to use in the email message. You
     *            can override the default variables with individual address
     *            variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessage withSubstitutions(
            java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the email message. You can
     * override the default variables with individual address variables.
     * </p>
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
