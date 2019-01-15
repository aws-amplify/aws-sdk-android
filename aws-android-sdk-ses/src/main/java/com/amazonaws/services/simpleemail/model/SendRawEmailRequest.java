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
 * Composes an email message and immediately queues it for sending.
 * </p>
 * <p>
 * This operation is more flexible than the <code>SendEmail</code> API
 * operation. When you use the <code>SendRawEmail</code> operation, you can
 * specify the headers of the message as well as its content. This flexibility
 * is useful, for example, when you want to send a multipart MIME email (such a
 * message that contains both a text and an HTML version). You can also use this
 * operation to send messages that include attachments.
 * </p>
 * <p>
 * The <code>SendRawEmail</code> operation has the following requirements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can only send email from <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
 * >verified email addresses or domains</a>. If you try to send email from an
 * address that isn't verified, the operation results in an
 * "Email address not verified" error.
 * </p>
 * </li>
 * <li>
 * <p>
 * If your account is still in the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/request-production-access.html"
 * >Amazon SES sandbox</a>, you can only send email to other verified addresses
 * in your account, or to addresses that are associated with the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mailbox-simulator.html"
 * >Amazon SES mailbox simulator</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The maximum message size, including attachments, is 10 MB.
 * </p>
 * </li>
 * <li>
 * <p>
 * Each message has to include at least one recipient address. A recipient
 * address includes any address on the To:, CC:, or BCC: lines.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you send a single message to more than one recipient address, and one of
 * the recipient addresses isn't in a valid format (that is, it's not in the
 * format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), Amazon SES rejects
 * the entire message, even if the other addresses are valid.
 * </p>
 * </li>
 * <li>
 * <p>
 * Each message can include up to 50 recipient addresses across the To:, CC:, or
 * BCC: lines. If you need to send a single message to more than 50 recipients,
 * you have to split the list of recipient addresses into groups of less than 50
 * recipients, and send separate messages to each group.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME
 * message parts. However, if Amazon SES has to modify the contents of your
 * message (for example, if you use open and click tracking), 8-bit content
 * isn't preserved. For this reason, we highly recommend that you encode all
 * content that isn't 7-bit ASCII. For more information, see <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html#send-email-mime-encoding"
 * >MIME Encoding</a> in the <i>Amazon SES Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Additionally, keep the following considerations in mind when using the
 * <code>SendRawEmail</code> operation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Although you can customize the message headers when using the
 * <code>SendRawEmail</code> operation, Amazon SES will automatically apply its
 * own <code>Message-ID</code> and <code>Date</code> headers; if you passed
 * these headers when creating the message, they will be overwritten by the
 * values that Amazon SES provides.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you are using sending authorization to send on behalf of another user,
 * <code>SendRawEmail</code> enables you to specify the cross-account identity
 * for the email's Source, From, and Return-Path parameters in one of two ways:
 * you can pass optional parameters <code>SourceArn</code>, <code>FromArn</code>
 * , and/or <code>ReturnPathArn</code> to the API, or you can include the
 * following X-headers in the header of your raw email:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>X-SES-SOURCE-ARN</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>X-SES-FROM-ARN</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>X-SES-RETURN-PATH-ARN</code>
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * Do not include these X-headers in the DKIM signature; Amazon SES will remove
 * them before sending the email.
 * </p>
 * </important>
 * <p>
 * For most common sending authorization scenarios, we recommend that you
 * specify the <code>SourceIdentityArn</code> parameter and not the
 * <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code>
 * parameters. If you only specify the <code>SourceIdentityArn</code> parameter,
 * Amazon SES will set the From and Return Path addresses to the identity
 * specified in <code>SourceIdentityArn</code>. For more information about
 * sending authorization, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
 * >Using Sending Authorization with Amazon SES</a> in the <i>Amazon SES
 * Developer Guide.</i>
 * </p>
 * </li>
 * <li>
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
 * </li>
 * </ul>
 */
public class SendRawEmailRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.)
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in<a
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
     * If you specify the <code>Source</code> parameter and have feedback
     * forwarding enabled, then bounces and complaints will be sent to this
     * email address. This takes precedence over any Return-Path header that you
     * might include in the raw text of the message.
     * </p>
     */
    private String source;

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     */
    private java.util.List<String> destinations = new java.util.ArrayList<String>();

    /**
     * <p>
     * The raw email message itself. The message has to meet the following
     * criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by a blank
     * line.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the required header fields must be present in the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each part of a multipart MIME message must be formatted properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * Attachments must be of a content type that Amazon SES supports. For a
     * list on unsupported content types, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     * >Unsupported Attachment Types</a> in the <i>Amazon SES Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be base64-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside
     * of the 7-bit ASCII character range, we highly recommend that you encode
     * that content. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     * >Sending Raw Email</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC
     * 5321</a>, the maximum length of each line of text, including the
     * &lt;CRLF&gt;, must not exceed 1,000 characters.
     * </p>
     * </li>
     * </ul>
     */
    private RawMessage rawMessage;

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to specify a particular "From" address in the header of
     * the raw email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-FROM-ARN</code> in the raw message of the email. If you use
     * both the <code>FromArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>FromArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     */
    private String fromArn;

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
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you use
     * both the <code>SourceArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
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
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the email. If
     * you use both the <code>ReturnPathArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     */
    private String returnPathArn;

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendRawEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     */
    private java.util.List<MessageTag> tags = new java.util.ArrayList<MessageTag>();

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendRawEmail</code>.
     * </p>
     */
    private String configurationSetName;

    /**
     * Default constructor for SendRawEmailRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public SendRawEmailRequest() {
    }

    /**
     * Constructs a new SendRawEmailRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param rawMessage <p>
     *            The raw email message itself. The message has to meet the
     *            following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The message has to contain a header and a body, separated by a
     *            blank line.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            All of the required header fields must be present in the
     *            message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each part of a multipart MIME message must be formatted
     *            properly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Attachments must be of a content type that Amazon SES
     *            supports. For a list on unsupported content types, see <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     *            >Unsupported Attachment Types</a> in the <i>Amazon SES
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The entire message must be base64-encoded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If any of the MIME parts in your message contain content that
     *            is outside of the 7-bit ASCII character range, we highly
     *            recommend that you encode that content. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     *            >Sending Raw Email</a> in the <i>Amazon SES Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Per <a
     *            href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6"
     *            >RFC 5321</a>, the maximum length of each line of text,
     *            including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     *            </p>
     *            </li>
     *            </ul>
     */
    public SendRawEmailRequest(RawMessage rawMessage) {
        setRawMessage(rawMessage);
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.)
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in<a
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
     * If you specify the <code>Source</code> parameter and have feedback
     * forwarding enabled, then bounces and complaints will be sent to this
     * email address. This takes precedence over any Return-Path header that you
     * might include in the raw text of the message.
     * </p>
     *
     * @return <p>
     *         The identity's email address. If you do not provide a value for
     *         this parameter, you must specify a "From" address in the raw text
     *         of the message. (You can also specify both.)
     *         </p>
     *         <note>
     *         <p>
     *         Amazon SES does not support the SMTPUTF8 extension, as described
     *         in<a href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For
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
     *         <p>
     *         If you specify the <code>Source</code> parameter and have
     *         feedback forwarding enabled, then bounces and complaints will be
     *         sent to this email address. This takes precedence over any
     *         Return-Path header that you might include in the raw text of the
     *         message.
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.)
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in<a
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
     * If you specify the <code>Source</code> parameter and have feedback
     * forwarding enabled, then bounces and complaints will be sent to this
     * email address. This takes precedence over any Return-Path header that you
     * might include in the raw text of the message.
     * </p>
     *
     * @param source <p>
     *            The identity's email address. If you do not provide a value
     *            for this parameter, you must specify a "From" address in the
     *            raw text of the message. (You can also specify both.)
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SES does not support the SMTPUTF8 extension, as
     *            described in<a
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
     *            <p>
     *            If you specify the <code>Source</code> parameter and have
     *            feedback forwarding enabled, then bounces and complaints will
     *            be sent to this email address. This takes precedence over any
     *            Return-Path header that you might include in the raw text of
     *            the message.
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.)
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in<a
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
     * If you specify the <code>Source</code> parameter and have feedback
     * forwarding enabled, then bounces and complaints will be sent to this
     * email address. This takes precedence over any Return-Path header that you
     * might include in the raw text of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The identity's email address. If you do not provide a value
     *            for this parameter, you must specify a "From" address in the
     *            raw text of the message. (You can also specify both.)
     *            </p>
     *            <note>
     *            <p>
     *            Amazon SES does not support the SMTPUTF8 extension, as
     *            described in<a
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
     *            <p>
     *            If you specify the <code>Source</code> parameter and have
     *            feedback forwarding enabled, then bounces and complaints will
     *            be sent to this email address. This takes precedence over any
     *            Return-Path header that you might include in the raw text of
     *            the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     *
     * @return <p>
     *         A list of destinations for the message, consisting of To:, CC:,
     *         and BCC: addresses.
     *         </p>
     */
    public java.util.List<String> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     *
     * @param destinations <p>
     *            A list of destinations for the message, consisting of To:,
     *            CC:, and BCC: addresses.
     *            </p>
     */
    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<String>(destinations);
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations <p>
     *            A list of destinations for the message, consisting of To:,
     *            CC:, and BCC: addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withDestinations(String... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<String>(destinations.length);
        }
        for (String value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations <p>
     *            A list of destinations for the message, consisting of To:,
     *            CC:, and BCC: addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withDestinations(java.util.Collection<String> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The raw email message itself. The message has to meet the following
     * criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by a blank
     * line.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the required header fields must be present in the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each part of a multipart MIME message must be formatted properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * Attachments must be of a content type that Amazon SES supports. For a
     * list on unsupported content types, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     * >Unsupported Attachment Types</a> in the <i>Amazon SES Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be base64-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside
     * of the 7-bit ASCII character range, we highly recommend that you encode
     * that content. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     * >Sending Raw Email</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC
     * 5321</a>, the maximum length of each line of text, including the
     * &lt;CRLF&gt;, must not exceed 1,000 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The raw email message itself. The message has to meet the
     *         following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The message has to contain a header and a body, separated by a
     *         blank line.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All of the required header fields must be present in the message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each part of a multipart MIME message must be formatted properly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Attachments must be of a content type that Amazon SES supports.
     *         For a list on unsupported content types, see <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     *         >Unsupported Attachment Types</a> in the <i>Amazon SES Developer
     *         Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The entire message must be base64-encoded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If any of the MIME parts in your message contain content that is
     *         outside of the 7-bit ASCII character range, we highly recommend
     *         that you encode that content. For more information, see <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     *         >Sending Raw Email</a> in the <i>Amazon SES Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Per <a
     *         href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC
     *         5321</a>, the maximum length of each line of text, including the
     *         &lt;CRLF&gt;, must not exceed 1,000 characters.
     *         </p>
     *         </li>
     *         </ul>
     */
    public RawMessage getRawMessage() {
        return rawMessage;
    }

    /**
     * <p>
     * The raw email message itself. The message has to meet the following
     * criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by a blank
     * line.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the required header fields must be present in the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each part of a multipart MIME message must be formatted properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * Attachments must be of a content type that Amazon SES supports. For a
     * list on unsupported content types, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     * >Unsupported Attachment Types</a> in the <i>Amazon SES Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be base64-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside
     * of the 7-bit ASCII character range, we highly recommend that you encode
     * that content. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     * >Sending Raw Email</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC
     * 5321</a>, the maximum length of each line of text, including the
     * &lt;CRLF&gt;, must not exceed 1,000 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @param rawMessage <p>
     *            The raw email message itself. The message has to meet the
     *            following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The message has to contain a header and a body, separated by a
     *            blank line.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            All of the required header fields must be present in the
     *            message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each part of a multipart MIME message must be formatted
     *            properly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Attachments must be of a content type that Amazon SES
     *            supports. For a list on unsupported content types, see <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     *            >Unsupported Attachment Types</a> in the <i>Amazon SES
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The entire message must be base64-encoded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If any of the MIME parts in your message contain content that
     *            is outside of the 7-bit ASCII character range, we highly
     *            recommend that you encode that content. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     *            >Sending Raw Email</a> in the <i>Amazon SES Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Per <a
     *            href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6"
     *            >RFC 5321</a>, the maximum length of each line of text,
     *            including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRawMessage(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
    }

    /**
     * <p>
     * The raw email message itself. The message has to meet the following
     * criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by a blank
     * line.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the required header fields must be present in the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each part of a multipart MIME message must be formatted properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * Attachments must be of a content type that Amazon SES supports. For a
     * list on unsupported content types, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     * >Unsupported Attachment Types</a> in the <i>Amazon SES Developer
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be base64-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside
     * of the 7-bit ASCII character range, we highly recommend that you encode
     * that content. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     * >Sending Raw Email</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC
     * 5321</a>, the maximum length of each line of text, including the
     * &lt;CRLF&gt;, must not exceed 1,000 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawMessage <p>
     *            The raw email message itself. The message has to meet the
     *            following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The message has to contain a header and a body, separated by a
     *            blank line.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            All of the required header fields must be present in the
     *            message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each part of a multipart MIME message must be formatted
     *            properly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Attachments must be of a content type that Amazon SES
     *            supports. For a list on unsupported content types, see <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     *            >Unsupported Attachment Types</a> in the <i>Amazon SES
     *            Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The entire message must be base64-encoded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If any of the MIME parts in your message contain content that
     *            is outside of the 7-bit ASCII character range, we highly
     *            recommend that you encode that content. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     *            >Sending Raw Email</a> in the <i>Amazon SES Developer
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Per <a
     *            href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6"
     *            >RFC 5321</a>, the maximum length of each line of text,
     *            including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withRawMessage(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to specify a particular "From" address in the header of
     * the raw email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-FROM-ARN</code> in the raw message of the email. If you use
     * both the <code>FromArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>FromArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         This parameter is used only for sending authorization. It is the
     *         ARN of the identity that is associated with the sending
     *         authorization policy that permits you to specify a particular
     *         "From" address in the header of the raw email.
     *         </p>
     *         <p>
     *         Instead of using this parameter, you can use the X-header
     *         <code>X-SES-FROM-ARN</code> in the raw message of the email. If
     *         you use both the <code>FromArn</code> parameter and the
     *         corresponding X-header, Amazon SES uses the value of the
     *         <code>FromArn</code> parameter.
     *         </p>
     *         <note>
     *         <p>
     *         For information about when to use this parameter, see the
     *         description of <code>SendRawEmail</code> in this guide, or see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     *         </note>
     */
    public String getFromArn() {
        return fromArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to specify a particular "From" address in the header of
     * the raw email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-FROM-ARN</code> in the raw message of the email. If you use
     * both the <code>FromArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>FromArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     *
     * @param fromArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to specify a particular
     *            "From" address in the header of the raw email.
     *            </p>
     *            <p>
     *            Instead of using this parameter, you can use the X-header
     *            <code>X-SES-FROM-ARN</code> in the raw message of the email.
     *            If you use both the <code>FromArn</code> parameter and the
     *            corresponding X-header, Amazon SES uses the value of the
     *            <code>FromArn</code> parameter.
     *            </p>
     *            <note>
     *            <p>
     *            For information about when to use this parameter, see the
     *            description of <code>SendRawEmail</code> in this guide, or see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            </note>
     */
    public void setFromArn(String fromArn) {
        this.fromArn = fromArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to specify a particular "From" address in the header of
     * the raw email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-FROM-ARN</code> in the raw message of the email. If you use
     * both the <code>FromArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>FromArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to specify a particular
     *            "From" address in the header of the raw email.
     *            </p>
     *            <p>
     *            Instead of using this parameter, you can use the X-header
     *            <code>X-SES-FROM-ARN</code> in the raw message of the email.
     *            If you use both the <code>FromArn</code> parameter and the
     *            corresponding X-header, Amazon SES uses the value of the
     *            <code>FromArn</code> parameter.
     *            </p>
     *            <note>
     *            <p>
     *            For information about when to use this parameter, see the
     *            description of <code>SendRawEmail</code> in this guide, or see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withFromArn(String fromArn) {
        this.fromArn = fromArn;
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
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you use
     * both the <code>SourceArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
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
     *         Instead of using this parameter, you can use the X-header
     *         <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If
     *         you use both the <code>SourceArn</code> parameter and the
     *         corresponding X-header, Amazon SES uses the value of the
     *         <code>SourceArn</code> parameter.
     *         </p>
     *         <note>
     *         <p>
     *         For information about when to use this parameter, see the
     *         description of <code>SendRawEmail</code> in this guide, or see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     *         </note>
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
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you use
     * both the <code>SourceArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
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
     *            Instead of using this parameter, you can use the X-header
     *            <code>X-SES-SOURCE-ARN</code> in the raw message of the email.
     *            If you use both the <code>SourceArn</code> parameter and the
     *            corresponding X-header, Amazon SES uses the value of the
     *            <code>SourceArn</code> parameter.
     *            </p>
     *            <note>
     *            <p>
     *            For information about when to use this parameter, see the
     *            description of <code>SendRawEmail</code> in this guide, or see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            </note>
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
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you use
     * both the <code>SourceArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
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
     *            Instead of using this parameter, you can use the X-header
     *            <code>X-SES-SOURCE-ARN</code> in the raw message of the email.
     *            If you use both the <code>SourceArn</code> parameter and the
     *            corresponding X-header, Amazon SES uses the value of the
     *            <code>SourceArn</code> parameter.
     *            </p>
     *            <note>
     *            <p>
     *            For information about when to use this parameter, see the
     *            description of <code>SendRawEmail</code> in this guide, or see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withSourceArn(String sourceArn) {
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
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the email. If
     * you use both the <code>ReturnPathArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
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
     *         Instead of using this parameter, you can use the X-header
     *         <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the
     *         email. If you use both the <code>ReturnPathArn</code> parameter
     *         and the corresponding X-header, Amazon SES uses the value of the
     *         <code>ReturnPathArn</code> parameter.
     *         </p>
     *         <note>
     *         <p>
     *         For information about when to use this parameter, see the
     *         description of <code>SendRawEmail</code> in this guide, or see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     *         </note>
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
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the email. If
     * you use both the <code>ReturnPathArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
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
     *            Instead of using this parameter, you can use the X-header
     *            <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the
     *            email. If you use both the <code>ReturnPathArn</code>
     *            parameter and the corresponding X-header, Amazon SES uses the
     *            value of the <code>ReturnPathArn</code> parameter.
     *            </p>
     *            <note>
     *            <p>
     *            For information about when to use this parameter, see the
     *            description of <code>SendRawEmail</code> in this guide, or see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            </note>
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
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the email. If
     * you use both the <code>ReturnPathArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
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
     *            Instead of using this parameter, you can use the X-header
     *            <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the
     *            email. If you use both the <code>ReturnPathArn</code>
     *            parameter and the corresponding X-header, Amazon SES uses the
     *            value of the <code>ReturnPathArn</code> parameter.
     *            </p>
     *            <note>
     *            <p>
     *            For information about when to use this parameter, see the
     *            description of <code>SendRawEmail</code> in this guide, or see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withReturnPathArn(String returnPathArn) {
        this.returnPathArn = returnPathArn;
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendRawEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     *
     * @return <p>
     *         A list of tags, in the form of name/value pairs, to apply to an
     *         email that you send using <code>SendRawEmail</code>. Tags
     *         correspond to characteristics of the email that you define, so
     *         that you can publish email sending events.
     *         </p>
     */
    public java.util.List<MessageTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send using <code>SendRawEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     *
     * @param tags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using <code>SendRawEmail</code>. Tags
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
     * that you send using <code>SendRawEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using <code>SendRawEmail</code>. Tags
     *            correspond to characteristics of the email that you define, so
     *            that you can publish email sending events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withTags(MessageTag... tags) {
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
     * that you send using <code>SendRawEmail</code>. Tags correspond to
     * characteristics of the email that you define, so that you can publish
     * email sending events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send using <code>SendRawEmail</code>. Tags
     *            correspond to characteristics of the email that you define, so
     *            that you can publish email sending events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withTags(java.util.Collection<MessageTag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendRawEmail</code>.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set to use when you send an email
     *         using <code>SendRawEmail</code>.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendRawEmail</code>.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to use when you send an
     *            email using <code>SendRawEmail</code>.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendRawEmail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to use when you send an
     *            email using <code>SendRawEmail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withConfigurationSetName(String configurationSetName) {
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
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
        if (getRawMessage() != null)
            sb.append("RawMessage: " + getRawMessage() + ",");
        if (getFromArn() != null)
            sb.append("FromArn: " + getFromArn() + ",");
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
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getRawMessage() == null) ? 0 : getRawMessage().hashCode());
        hashCode = prime * hashCode + ((getFromArn() == null) ? 0 : getFromArn().hashCode());
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

        if (obj instanceof SendRawEmailRequest == false)
            return false;
        SendRawEmailRequest other = (SendRawEmailRequest) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getRawMessage() == null ^ this.getRawMessage() == null)
            return false;
        if (other.getRawMessage() != null
                && other.getRawMessage().equals(this.getRawMessage()) == false)
            return false;
        if (other.getFromArn() == null ^ this.getFromArn() == null)
            return false;
        if (other.getFromArn() != null && other.getFromArn().equals(this.getFromArn()) == false)
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
