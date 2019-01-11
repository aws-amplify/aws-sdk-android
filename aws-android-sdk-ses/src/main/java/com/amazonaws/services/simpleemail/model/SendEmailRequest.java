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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Composes an email message and immediately queues it for sending. In order to
 * send email using the <code>SendEmail</code> operation, your message must meet
 * the following requirements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The message must be sent from a verified email address or domain. If you
 * attempt to send email using a non-verified address or domain, the operation
 * will result in an "Email address not verified" error.
 * </p>
 * </li>
 * <li>
 * <p>
 * If your account is still in the Amazon SES sandbox, you may only send to
 * verified addresses or domains, or to email addresses associated with the
 * Amazon SES Mailbox Simulator. For more information, see <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
 * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
 * Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * The maximum message size is 10 MB.
 * </p>
 * </li>
 * <li>
 * <p>
 * The message must include at least one recipient email address. The recipient
 * address can be a To: address, a CC: address, or a BCC: address. If a
 * recipient email address is invalid (that is, it is not in the format
 * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message will
 * be rejected, even if the message contains other recipients that are valid.
 * </p>
 * </li>
 * <li>
 * <p>
 * The message may not include more than 50 recipients, across the To:, CC: and
 * BCC: fields. If you need to send an email message to a larger audience, you
 * can divide your recipient list into groups of 50 or fewer, and then call the
 * <code>SendEmail</code> operation several times to send the message to each
 * group.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * For every message that you send, the total number of recipients (including
 * each recipient in the To:, CC: and BCC: fields) is counted against the
 * maximum number of emails you can send in a 24-hour period (your <i>sending
 * quota</i>). For more information about sending quotas in Amazon SES, see <a
 * href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
 * >Managing Your Amazon SES Sending Limits</a> in the <i>Amazon SES Developer
 * Guide.</i>
 * </p>
 * </important>
 */
public class SendEmailRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The email address that is sending the email. This email address must be
     * either individually verified with Amazon SES, or from a domain that has
     * been verified with Amazon SES. For information about verifying
     * identities, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * If you are sending on behalf of another user and have been permitted to
     * do so by a sending authorization policy, then you must also specify the
     * <code>SourceArn</code> parameter. For more information about sending
     * authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason,
     * the <i>local part</i> of a source email address (the part of the email
     * address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
     * characters</a>. If the <i>domain part</i> of an address (the part after
     * the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a
     * href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender
     * name (also known as the <i>friendly name</i>) may contain non-ASCII
     * characters. These characters must be encoded using MIME encoded-word
     * syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>. MIME encoded-word syntax uses the following form:
     * <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     */
    private String source;

    /**
     * <p>
     * The destination for this email, composed of To:, CC:, and BCC: fields.
     * </p>
     */
    private Destination destination;

    /**
     * <p>
     * The message to be sent.
     * </p>
     */
    private Message message;

    /**
     * <p>
     * The reply-to email address(es) for the message. If the recipient replies
     * to the message, each reply-to address will receive the reply.
     * </p>
     */
    private java.util.List<String> replyToAddresses = new java.util.ArrayList<String>();

    /**
     * <p>
     * The email address that bounces and complaints will be forwarded to when
     * feedback forwarding is enabled. If the message cannot be delivered to the
     * recipient, then an error message will be returned from the recipient's
     * ISP; this message will then be forwarded to the email address specified
     * by the <code>ReturnPath</code> parameter. The <code>ReturnPath</code>
     * parameter is never overwritten. This email address must be either
     * individually verified with Amazon SES, or from a domain that has been
     * verified with Amazon SES.
     * </p>
     */
    private String returnPath;

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to send for the email address specified in the
     * <code>Source</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>Source</code> to be <code>user@example.com</code>.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     */
    private String sourceArn;

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     */
    private String returnPathArn;

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     */
    private java.util.List<MessageTag> tags = new java.util.ArrayList<MessageTag>();

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendEmail</code>.
     * </p>
     */
    private String configurationSetName;

    /**
     * Default constructor for SendEmailRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public SendEmailRequest() {
    }

    /**
     * Constructs a new SendEmailRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param source <p>
     *            The email address that is sending the email. This email
     *            address must be either individually verified with Amazon SES,
     *            or from a domain that has been verified with Amazon SES. For
     *            information about verifying identities, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            <p>
     *            If you are sending on behalf of another user and have been
     *            permitted to do so by a sending authorization policy, then you
     *            must also specify the <code>SourceArn</code> parameter. For
     *            more information about sending authorization, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SES does not support the SMTPUTF8 extension, as
     *            described in <a
     *            href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For
     *            this reason, the <i>local part</i> of a source email address
     *            (the part of the email address that precedes the @ sign) may
     *            only contain <a href=
     *            "https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit
     *            ASCII characters</a>. If the <i>domain part</i> of an address
     *            (the part after the @ sign) contains non-ASCII characters,
     *            they must be encoded using Punycode, as described in <a
     *            href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *            The sender name (also known as the <i>friendly name</i>) may
     *            contain non-ASCII characters. These characters must be encoded
     *            using MIME encoded-word syntax, as described in <a
     *            href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     *            encoded-word syntax uses the following form:
     *            <code>=?charset?encoding?encoded-text?=</code>.
     *            </p>
     *            </note>
     * @param destination <p>
     *            The destination for this email, composed of To:, CC:, and BCC:
     *            fields.
     *            </p>
     * @param message <p>
     *            The message to be sent.
     *            </p>
     */
    public SendEmailRequest(String source, Destination destination, Message message) {
        setSource(source);
        setDestination(destination);
        setMessage(message);
    }

    /**
     * <p>
     * The email address that is sending the email. This email address must be
     * either individually verified with Amazon SES, or from a domain that has
     * been verified with Amazon SES. For information about verifying
     * identities, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * If you are sending on behalf of another user and have been permitted to
     * do so by a sending authorization policy, then you must also specify the
     * <code>SourceArn</code> parameter. For more information about sending
     * authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason,
     * the <i>local part</i> of a source email address (the part of the email
     * address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
     * characters</a>. If the <i>domain part</i> of an address (the part after
     * the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a
     * href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender
     * name (also known as the <i>friendly name</i>) may contain non-ASCII
     * characters. These characters must be encoded using MIME encoded-word
     * syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>. MIME encoded-word syntax uses the following form:
     * <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The email address that is sending the email. This email address
     *         must be either individually verified with Amazon SES, or from a
     *         domain that has been verified with Amazon SES. For information
     *         about verifying identities, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     *         <p>
     *         If you are sending on behalf of another user and have been
     *         permitted to do so by a sending authorization policy, then you
     *         must also specify the <code>SourceArn</code> parameter. For more
     *         information about sending authorization, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon SES does not support the SMTPUTF8 extension, as described
     *         in <a href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For
     *         this reason, the <i>local part</i> of a source email address (the
     *         part of the email address that precedes the @ sign) may only
     *         contain <a
     *         href="https://en.wikipedia.org/wiki/Email_address#Local-part"
     *         >7-bit ASCII characters</a>. If the <i>domain part</i> of an
     *         address (the part after the @ sign) contains non-ASCII
     *         characters, they must be encoded using Punycode, as described in
     *         <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *         The sender name (also known as the <i>friendly name</i>) may
     *         contain non-ASCII characters. These characters must be encoded
     *         using MIME encoded-word syntax, as described in <a
     *         href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     *         encoded-word syntax uses the following form:
     *         <code>=?charset?encoding?encoded-text?=</code>.
     *         </p>
     *         </note>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The email address that is sending the email. This email address must be
     * either individually verified with Amazon SES, or from a domain that has
     * been verified with Amazon SES. For information about verifying
     * identities, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * If you are sending on behalf of another user and have been permitted to
     * do so by a sending authorization policy, then you must also specify the
     * <code>SourceArn</code> parameter. For more information about sending
     * authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason,
     * the <i>local part</i> of a source email address (the part of the email
     * address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
     * characters</a>. If the <i>domain part</i> of an address (the part after
     * the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a
     * href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender
     * name (also known as the <i>friendly name</i>) may contain non-ASCII
     * characters. These characters must be encoded using MIME encoded-word
     * syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>. MIME encoded-word syntax uses the following form:
     * <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     *
     * @param source <p>
     *            The email address that is sending the email. This email
     *            address must be either individually verified with Amazon SES,
     *            or from a domain that has been verified with Amazon SES. For
     *            information about verifying identities, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            <p>
     *            If you are sending on behalf of another user and have been
     *            permitted to do so by a sending authorization policy, then you
     *            must also specify the <code>SourceArn</code> parameter. For
     *            more information about sending authorization, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SES does not support the SMTPUTF8 extension, as
     *            described in <a
     *            href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For
     *            this reason, the <i>local part</i> of a source email address
     *            (the part of the email address that precedes the @ sign) may
     *            only contain <a href=
     *            "https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit
     *            ASCII characters</a>. If the <i>domain part</i> of an address
     *            (the part after the @ sign) contains non-ASCII characters,
     *            they must be encoded using Punycode, as described in <a
     *            href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *            The sender name (also known as the <i>friendly name</i>) may
     *            contain non-ASCII characters. These characters must be encoded
     *            using MIME encoded-word syntax, as described in <a
     *            href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     *            encoded-word syntax uses the following form:
     *            <code>=?charset?encoding?encoded-text?=</code>.
     *            </p>
     *            </note>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The email address that is sending the email. This email address must be
     * either individually verified with Amazon SES, or from a domain that has
     * been verified with Amazon SES. For information about verifying
     * identities, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * If you are sending on behalf of another user and have been permitted to
     * do so by a sending authorization policy, then you must also specify the
     * <code>SourceArn</code> parameter. For more information about sending
     * authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason,
     * the <i>local part</i> of a source email address (the part of the email
     * address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
     * characters</a>. If the <i>domain part</i> of an address (the part after
     * the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a
     * href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender
     * name (also known as the <i>friendly name</i>) may contain non-ASCII
     * characters. These characters must be encoded using MIME encoded-word
     * syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>. MIME encoded-word syntax uses the following form:
     * <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The email address that is sending the email. This email
     *            address must be either individually verified with Amazon SES,
     *            or from a domain that has been verified with Amazon SES. For
     *            information about verifying identities, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            <p>
     *            If you are sending on behalf of another user and have been
     *            permitted to do so by a sending authorization policy, then you
     *            must also specify the <code>SourceArn</code> parameter. For
     *            more information about sending authorization, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SES does not support the SMTPUTF8 extension, as
     *            described in <a
     *            href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For
     *            this reason, the <i>local part</i> of a source email address
     *            (the part of the email address that precedes the @ sign) may
     *            only contain <a href=
     *            "https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit
     *            ASCII characters</a>. If the <i>domain part</i> of an address
     *            (the part after the @ sign) contains non-ASCII characters,
     *            they must be encoded using Punycode, as described in <a
     *            href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *            The sender name (also known as the <i>friendly name</i>) may
     *            contain non-ASCII characters. These characters must be encoded
     *            using MIME encoded-word syntax, as described in <a
     *            href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     *            encoded-word syntax uses the following form:
     *            <code>=?charset?encoding?encoded-text?=</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The destination for this email, composed of To:, CC:, and BCC: fields.
     * </p>
     *
     * @return <p>
     *         The destination for this email, composed of To:, CC:, and BCC:
     *         fields.
     *         </p>
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * <p>
     * The destination for this email, composed of To:, CC:, and BCC: fields.
     * </p>
     *
     * @param destination <p>
     *            The destination for this email, composed of To:, CC:, and BCC:
     *            fields.
     *            </p>
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination for this email, composed of To:, CC:, and BCC: fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            The destination for this email, composed of To:, CC:, and BCC:
     *            fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * The message to be sent.
     * </p>
     *
     * @return <p>
     *         The message to be sent.
     *         </p>
     */
    public Message getMessage() {
        return message;
    }

    /**
     * <p>
     * The message to be sent.
     * </p>
     *
     * @param message <p>
     *            The message to be sent.
     *            </p>
     */
    public void setMessage(Message message) {
        this.message = message;
    }

    /**
     * <p>
     * The message to be sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The message to be sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withMessage(Message message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The reply-to email address(es) for the message. If the recipient replies
     * to the message, each reply-to address will receive the reply.
     * </p>
     *
     * @return <p>
     *         The reply-to email address(es) for the message. If the recipient
     *         replies to the message, each reply-to address will receive the
     *         reply.
     *         </p>
     */
    public java.util.List<String> getReplyToAddresses() {
        return replyToAddresses;
    }

    /**
     * <p>
     * The reply-to email address(es) for the message. If the recipient replies
     * to the message, each reply-to address will receive the reply.
     * </p>
     *
     * @param replyToAddresses <p>
     *            The reply-to email address(es) for the message. If the
     *            recipient replies to the message, each reply-to address will
     *            receive the reply.
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
     * The reply-to email address(es) for the message. If the recipient replies
     * to the message, each reply-to address will receive the reply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replyToAddresses <p>
     *            The reply-to email address(es) for the message. If the
     *            recipient replies to the message, each reply-to address will
     *            receive the reply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withReplyToAddresses(String... replyToAddresses) {
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
     * The reply-to email address(es) for the message. If the recipient replies
     * to the message, each reply-to address will receive the reply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replyToAddresses <p>
     *            The reply-to email address(es) for the message. If the
     *            recipient replies to the message, each reply-to address will
     *            receive the reply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        setReplyToAddresses(replyToAddresses);
        return this;
    }

    /**
     * <p>
     * The email address that bounces and complaints will be forwarded to when
     * feedback forwarding is enabled. If the message cannot be delivered to the
     * recipient, then an error message will be returned from the recipient's
     * ISP; this message will then be forwarded to the email address specified
     * by the <code>ReturnPath</code> parameter. The <code>ReturnPath</code>
     * parameter is never overwritten. This email address must be either
     * individually verified with Amazon SES, or from a domain that has been
     * verified with Amazon SES.
     * </p>
     *
     * @return <p>
     *         The email address that bounces and complaints will be forwarded
     *         to when feedback forwarding is enabled. If the message cannot be
     *         delivered to the recipient, then an error message will be
     *         returned from the recipient's ISP; this message will then be
     *         forwarded to the email address specified by the
     *         <code>ReturnPath</code> parameter. The <code>ReturnPath</code>
     *         parameter is never overwritten. This email address must be either
     *         individually verified with Amazon SES, or from a domain that has
     *         been verified with Amazon SES.
     *         </p>
     */
    public String getReturnPath() {
        return returnPath;
    }

    /**
     * <p>
     * The email address that bounces and complaints will be forwarded to when
     * feedback forwarding is enabled. If the message cannot be delivered to the
     * recipient, then an error message will be returned from the recipient's
     * ISP; this message will then be forwarded to the email address specified
     * by the <code>ReturnPath</code> parameter. The <code>ReturnPath</code>
     * parameter is never overwritten. This email address must be either
     * individually verified with Amazon SES, or from a domain that has been
     * verified with Amazon SES.
     * </p>
     *
     * @param returnPath <p>
     *            The email address that bounces and complaints will be
     *            forwarded to when feedback forwarding is enabled. If the
     *            message cannot be delivered to the recipient, then an error
     *            message will be returned from the recipient's ISP; this
     *            message will then be forwarded to the email address specified
     *            by the <code>ReturnPath</code> parameter. The
     *            <code>ReturnPath</code> parameter is never overwritten. This
     *            email address must be either individually verified with Amazon
     *            SES, or from a domain that has been verified with Amazon SES.
     *            </p>
     */
    public void setReturnPath(String returnPath) {
        this.returnPath = returnPath;
    }

    /**
     * <p>
     * The email address that bounces and complaints will be forwarded to when
     * feedback forwarding is enabled. If the message cannot be delivered to the
     * recipient, then an error message will be returned from the recipient's
     * ISP; this message will then be forwarded to the email address specified
     * by the <code>ReturnPath</code> parameter. The <code>ReturnPath</code>
     * parameter is never overwritten. This email address must be either
     * individually verified with Amazon SES, or from a domain that has been
     * verified with Amazon SES.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnPath <p>
     *            The email address that bounces and complaints will be
     *            forwarded to when feedback forwarding is enabled. If the
     *            message cannot be delivered to the recipient, then an error
     *            message will be returned from the recipient's ISP; this
     *            message will then be forwarded to the email address specified
     *            by the <code>ReturnPath</code> parameter. The
     *            <code>ReturnPath</code> parameter is never overwritten. This
     *            email address must be either individually verified with Amazon
     *            SES, or from a domain that has been verified with Amazon SES.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withReturnPath(String returnPath) {
        this.returnPath = returnPath;
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to send for the email address specified in the
     * <code>Source</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>Source</code> to be <code>user@example.com</code>.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         This parameter is used only for sending authorization. It is the
     *         ARN of the identity that is associated with the sending
     *         authorization policy that permits you to send for the email
     *         address specified in the <code>Source</code> parameter.
     *         </p>
     *         <p>
     *         For example, if the owner of <code>example.com</code> (which has
     *         ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         ) attaches a policy to it that authorizes you to send from
     *         <code>user@example.com</code>, then you would specify the
     *         <code>SourceArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         , and the <code>Source</code> to be <code>user@example.com</code>
     *         .
     *         </p>
     *         <p>
     *         For more information about sending authorization, see the <a
     *         href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to send for the email address specified in the
     * <code>Source</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>Source</code> to be <code>user@example.com</code>.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @param sourceArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to send for the email
     *            address specified in the <code>Source</code> parameter.
     *            </p>
     *            <p>
     *            For example, if the owner of <code>example.com</code> (which
     *            has ARN
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            ) attaches a policy to it that authorizes you to send from
     *            <code>user@example.com</code>, then you would specify the
     *            <code>SourceArn</code> to be
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            , and the <code>Source</code> to be
     *            <code>user@example.com</code>.
     *            </p>
     *            <p>
     *            For more information about sending authorization, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to send for the email address specified in the
     * <code>Source</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>Source</code> to be <code>user@example.com</code>.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to send for the email
     *            address specified in the <code>Source</code> parameter.
     *            </p>
     *            <p>
     *            For example, if the owner of <code>example.com</code> (which
     *            has ARN
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            ) attaches a policy to it that authorizes you to send from
     *            <code>user@example.com</code>, then you would specify the
     *            <code>SourceArn</code> to be
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            , and the <code>Source</code> to be
     *            <code>user@example.com</code>.
     *            </p>
     *            <p>
     *            For more information about sending authorization, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         This parameter is used only for sending authorization. It is the
     *         ARN of the identity that is associated with the sending
     *         authorization policy that permits you to use the email address
     *         specified in the <code>ReturnPath</code> parameter.
     *         </p>
     *         <p>
     *         For example, if the owner of <code>example.com</code> (which has
     *         ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         ) attaches a policy to it that authorizes you to use
     *         <code>feedback@example.com</code>, then you would specify the
     *         <code>ReturnPathArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         , and the <code>ReturnPath</code> to be
     *         <code>feedback@example.com</code>.
     *         </p>
     *         <p>
     *         For more information about sending authorization, see the <a
     *         href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */
    public String getReturnPathArn() {
        return returnPathArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @param returnPathArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to use the email address
     *            specified in the <code>ReturnPath</code> parameter.
     *            </p>
     *            <p>
     *            For example, if the owner of <code>example.com</code> (which
     *            has ARN
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            ) attaches a policy to it that authorizes you to use
     *            <code>feedback@example.com</code>, then you would specify the
     *            <code>ReturnPathArn</code> to be
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            , and the <code>ReturnPath</code> to be
     *            <code>feedback@example.com</code>.
     *            </p>
     *            <p>
     *            For more information about sending authorization, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     */
    public void setReturnPathArn(String returnPathArn) {
        this.returnPathArn = returnPathArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnPathArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to use the email address
     *            specified in the <code>ReturnPath</code> parameter.
     *            </p>
     *            <p>
     *            For example, if the owner of <code>example.com</code> (which
     *            has ARN
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            ) attaches a policy to it that authorizes you to use
     *            <code>feedback@example.com</code>, then you would specify the
     *            <code>ReturnPathArn</code> to be
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            , and the <code>ReturnPath</code> to be
     *            <code>feedback@example.com</code>.
     *            </p>
     *            <p>
     *            For more information about sending authorization, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withReturnPathArn(String returnPathArn) {
        this.returnPathArn = returnPathArn;
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     *
     * @return <p>
     *         A list of tags, in the form of name/value pairs, to apply to an
     *         email that you send using <code>SendEmail</code>. Tags correspond
     *         to characteristics of the email that you define, so that you can
     *         publish email sending events.
     *         </p>
     */
    public java.util.List<MessageTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     *
     * @param tags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using <code>SendEmail</code>. Tags
     *            correspond to characteristics of the email that you define, so
     *            that you can publish email sending events.
     *            </p>
     */
    public void setTags(java.util.Collection<MessageTag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<MessageTag>(tags);
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using <code>SendEmail</code>. Tags
     *            correspond to characteristics of the email that you define, so
     *            that you can publish email sending events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withTags(MessageTag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<MessageTag>(tags.length);
        }
        for (MessageTag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using <code>SendEmail</code>. Tags
     *            correspond to characteristics of the email that you define, so
     *            that you can publish email sending events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withTags(java.util.Collection<MessageTag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendEmail</code>.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set to use when you send an email
     *         using <code>SendEmail</code>.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendEmail</code>.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to use when you send an
     *            email using <code>SendEmail</code>.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendEmail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to use when you send an
     *            email using <code>SendEmail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendEmailRequest withConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
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
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getReplyToAddresses() != null)
            sb.append("ReplyToAddresses: " + getReplyToAddresses() + ",");
        if (getReturnPath() != null)
            sb.append("ReturnPath: " + getReturnPath() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getReturnPathArn() != null)
            sb.append("ReturnPathArn: " + getReturnPathArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: " + getConfigurationSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode());
        hashCode = prime * hashCode + ((getReturnPath() == null) ? 0 : getReturnPath().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getReturnPathArn() == null) ? 0 : getReturnPathArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendEmailRequest == false)
            return false;
        SendEmailRequest other = (SendEmailRequest) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getReplyToAddresses() == null ^ this.getReplyToAddresses() == null)
            return false;
        if (other.getReplyToAddresses() != null
                && other.getReplyToAddresses().equals(this.getReplyToAddresses()) == false)
            return false;
        if (other.getReturnPath() == null ^ this.getReturnPath() == null)
            return false;
        if (other.getReturnPath() != null
                && other.getReturnPath().equals(this.getReturnPath()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getReturnPathArn() == null ^ this.getReturnPathArn() == null)
            return false;
        if (other.getReturnPathArn() != null
                && other.getReturnPathArn().equals(this.getReturnPathArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        return true;
    }
}
