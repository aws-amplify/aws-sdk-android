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
 * Composes an email message to multiple destinations. The message body is
 * created using an email template.
 * </p>
 * <p>
 * In order to send email using the <code>SendBulkTemplatedEmail</code>
 * operation, your call to the API must meet the following requirements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The call must refer to an existing email template. You can create email
 * templates using the <a>CreateTemplate</a> operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * The message must be sent from a verified email address or domain.
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
 * Each <code>Destination</code> parameter must include at least one recipient
 * email address. The recipient address can be a To: address, a CC: address, or
 * a BCC: address. If a recipient email address is invalid (that is, it is not
 * in the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire
 * message will be rejected, even if the message contains other recipients that
 * are valid.
 * </p>
 * </li>
 * <li>
 * <p>
 * The message may not include more than 50 recipients, across the To:, CC: and
 * BCC: fields. If you need to send an email message to a larger audience, you
 * can divide your recipient list into groups of 50 or fewer, and then call the
 * <code>SendBulkTemplatedEmail</code> operation several times to send the
 * message to each group.
 * </p>
 * </li>
 * <li>
 * <p>
 * The number of destinations you can contact in a single call to the API may be
 * limited by your account's maximum sending rate.
 * </p>
 * </li>
 * </ul>
 */
public class SendBulkTemplatedEmailRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the configuration set to use when you send an email using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send to a destination using <code>SendBulkTemplatedEmail</code>.
     * </p>
     */
    private java.util.List<MessageTag> defaultTags = new java.util.ArrayList<MessageTag>();

    /**
     * <p>
     * The template to use when sending this email.
     * </p>
     */
    private String template;

    /**
     * <p>
     * The ARN of the template to use when sending this email.
     * </p>
     */
    private String templateArn;

    /**
     * <p>
     * A list of replacement values to apply to the template when replacement
     * data is not specified in a Destination object. These values act as a
     * default or fallback option when no other data is available.
     * </p>
     * <p>
     * The template data is a JSON object, typically consisting of key-value
     * pairs in which the keys correspond to replacement tags in the email
     * template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     */
    private String defaultTemplateData;

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a
     * <code>Destination</code> will receive the same version of the email. You
     * can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     */
    private java.util.List<BulkEmailDestination> destinations = new java.util.ArrayList<BulkEmailDestination>();

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
    public SendBulkTemplatedEmailRequest withSource(String source) {
        this.source = source;
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
    public SendBulkTemplatedEmailRequest withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
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
    public SendBulkTemplatedEmailRequest withReplyToAddresses(String... replyToAddresses) {
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
    public SendBulkTemplatedEmailRequest withReplyToAddresses(
            java.util.Collection<String> replyToAddresses) {
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
    public SendBulkTemplatedEmailRequest withReturnPath(String returnPath) {
        this.returnPath = returnPath;
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
    public SendBulkTemplatedEmailRequest withReturnPathArn(String returnPathArn) {
        this.returnPathArn = returnPathArn;
        return this;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set to use when you send an email
     *         using <code>SendBulkTemplatedEmail</code>.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to use when you send an
     *            email using <code>SendBulkTemplatedEmail</code>.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to use when you send an
     *            email using <code>SendBulkTemplatedEmail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailRequest withConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send to a destination using <code>SendBulkTemplatedEmail</code>.
     * </p>
     *
     * @return <p>
     *         A list of tags, in the form of name/value pairs, to apply to an
     *         email that you send to a destination using
     *         <code>SendBulkTemplatedEmail</code>.
     *         </p>
     */
    public java.util.List<MessageTag> getDefaultTags() {
        return defaultTags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send to a destination using <code>SendBulkTemplatedEmail</code>.
     * </p>
     *
     * @param defaultTags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send to a destination using
     *            <code>SendBulkTemplatedEmail</code>.
     *            </p>
     */
    public void setDefaultTags(java.util.Collection<MessageTag> defaultTags) {
        if (defaultTags == null) {
            this.defaultTags = null;
            return;
        }

        this.defaultTags = new java.util.ArrayList<MessageTag>(defaultTags);
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send to a destination using <code>SendBulkTemplatedEmail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultTags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send to a destination using
     *            <code>SendBulkTemplatedEmail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailRequest withDefaultTags(MessageTag... defaultTags) {
        if (getDefaultTags() == null) {
            this.defaultTags = new java.util.ArrayList<MessageTag>(defaultTags.length);
        }
        for (MessageTag value : defaultTags) {
            this.defaultTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email
     * that you send to a destination using <code>SendBulkTemplatedEmail</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultTags <p>
     *            A list of tags, in the form of name/value pairs, to apply to
     *            an email that you send to a destination using
     *            <code>SendBulkTemplatedEmail</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailRequest withDefaultTags(
            java.util.Collection<MessageTag> defaultTags) {
        setDefaultTags(defaultTags);
        return this;
    }

    /**
     * <p>
     * The template to use when sending this email.
     * </p>
     *
     * @return <p>
     *         The template to use when sending this email.
     *         </p>
     */
    public String getTemplate() {
        return template;
    }

    /**
     * <p>
     * The template to use when sending this email.
     * </p>
     *
     * @param template <p>
     *            The template to use when sending this email.
     *            </p>
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The template to use when sending this email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param template <p>
     *            The template to use when sending this email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailRequest withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * <p>
     * The ARN of the template to use when sending this email.
     * </p>
     *
     * @return <p>
     *         The ARN of the template to use when sending this email.
     *         </p>
     */
    public String getTemplateArn() {
        return templateArn;
    }

    /**
     * <p>
     * The ARN of the template to use when sending this email.
     * </p>
     *
     * @param templateArn <p>
     *            The ARN of the template to use when sending this email.
     *            </p>
     */
    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The ARN of the template to use when sending this email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateArn <p>
     *            The ARN of the template to use when sending this email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailRequest withTemplateArn(String templateArn) {
        this.templateArn = templateArn;
        return this;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template when replacement
     * data is not specified in a Destination object. These values act as a
     * default or fallback option when no other data is available.
     * </p>
     * <p>
     * The template data is a JSON object, typically consisting of key-value
     * pairs in which the keys correspond to replacement tags in the email
     * template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @return <p>
     *         A list of replacement values to apply to the template when
     *         replacement data is not specified in a Destination object. These
     *         values act as a default or fallback option when no other data is
     *         available.
     *         </p>
     *         <p>
     *         The template data is a JSON object, typically consisting of
     *         key-value pairs in which the keys correspond to replacement tags
     *         in the email template.
     *         </p>
     */
    public String getDefaultTemplateData() {
        return defaultTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template when replacement
     * data is not specified in a Destination object. These values act as a
     * default or fallback option when no other data is available.
     * </p>
     * <p>
     * The template data is a JSON object, typically consisting of key-value
     * pairs in which the keys correspond to replacement tags in the email
     * template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @param defaultTemplateData <p>
     *            A list of replacement values to apply to the template when
     *            replacement data is not specified in a Destination object.
     *            These values act as a default or fallback option when no other
     *            data is available.
     *            </p>
     *            <p>
     *            The template data is a JSON object, typically consisting of
     *            key-value pairs in which the keys correspond to replacement
     *            tags in the email template.
     *            </p>
     */
    public void setDefaultTemplateData(String defaultTemplateData) {
        this.defaultTemplateData = defaultTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template when replacement
     * data is not specified in a Destination object. These values act as a
     * default or fallback option when no other data is available.
     * </p>
     * <p>
     * The template data is a JSON object, typically consisting of key-value
     * pairs in which the keys correspond to replacement tags in the email
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 262144<br/>
     *
     * @param defaultTemplateData <p>
     *            A list of replacement values to apply to the template when
     *            replacement data is not specified in a Destination object.
     *            These values act as a default or fallback option when no other
     *            data is available.
     *            </p>
     *            <p>
     *            The template data is a JSON object, typically consisting of
     *            key-value pairs in which the keys correspond to replacement
     *            tags in the email template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailRequest withDefaultTemplateData(String defaultTemplateData) {
        this.defaultTemplateData = defaultTemplateData;
        return this;
    }

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a
     * <code>Destination</code> will receive the same version of the email. You
     * can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     *
     * @return <p>
     *         One or more <code>Destination</code> objects. All of the
     *         recipients in a <code>Destination</code> will receive the same
     *         version of the email. You can specify up to 50
     *         <code>Destination</code> objects within a
     *         <code>Destinations</code> array.
     *         </p>
     */
    public java.util.List<BulkEmailDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a
     * <code>Destination</code> will receive the same version of the email. You
     * can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     *
     * @param destinations <p>
     *            One or more <code>Destination</code> objects. All of the
     *            recipients in a <code>Destination</code> will receive the same
     *            version of the email. You can specify up to 50
     *            <code>Destination</code> objects within a
     *            <code>Destinations</code> array.
     *            </p>
     */
    public void setDestinations(java.util.Collection<BulkEmailDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<BulkEmailDestination>(destinations);
    }

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a
     * <code>Destination</code> will receive the same version of the email. You
     * can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations <p>
     *            One or more <code>Destination</code> objects. All of the
     *            recipients in a <code>Destination</code> will receive the same
     *            version of the email. You can specify up to 50
     *            <code>Destination</code> objects within a
     *            <code>Destinations</code> array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailRequest withDestinations(BulkEmailDestination... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<BulkEmailDestination>(destinations.length);
        }
        for (BulkEmailDestination value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a
     * <code>Destination</code> will receive the same version of the email. You
     * can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations <p>
     *            One or more <code>Destination</code> objects. All of the
     *            recipients in a <code>Destination</code> will receive the same
     *            version of the email. You can specify up to 50
     *            <code>Destination</code> objects within a
     *            <code>Destinations</code> array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailRequest withDestinations(
            java.util.Collection<BulkEmailDestination> destinations) {
        setDestinations(destinations);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getReplyToAddresses() != null)
            sb.append("ReplyToAddresses: " + getReplyToAddresses() + ",");
        if (getReturnPath() != null)
            sb.append("ReturnPath: " + getReturnPath() + ",");
        if (getReturnPathArn() != null)
            sb.append("ReturnPathArn: " + getReturnPathArn() + ",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: " + getConfigurationSetName() + ",");
        if (getDefaultTags() != null)
            sb.append("DefaultTags: " + getDefaultTags() + ",");
        if (getTemplate() != null)
            sb.append("Template: " + getTemplate() + ",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: " + getTemplateArn() + ",");
        if (getDefaultTemplateData() != null)
            sb.append("DefaultTemplateData: " + getDefaultTemplateData() + ",");
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode());
        hashCode = prime * hashCode + ((getReturnPath() == null) ? 0 : getReturnPath().hashCode());
        hashCode = prime * hashCode
                + ((getReturnPathArn() == null) ? 0 : getReturnPathArn().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultTags() == null) ? 0 : getDefaultTags().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultTemplateData() == null) ? 0 : getDefaultTemplateData().hashCode());
        hashCode = prime * hashCode
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendBulkTemplatedEmailRequest == false)
            return false;
        SendBulkTemplatedEmailRequest other = (SendBulkTemplatedEmailRequest) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
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
        if (other.getReturnPathArn() == null ^ this.getReturnPathArn() == null)
            return false;
        if (other.getReturnPathArn() != null
                && other.getReturnPathArn().equals(this.getReturnPathArn()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getDefaultTags() == null ^ this.getDefaultTags() == null)
            return false;
        if (other.getDefaultTags() != null
                && other.getDefaultTags().equals(this.getDefaultTags()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null
                && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getDefaultTemplateData() == null ^ this.getDefaultTemplateData() == null)
            return false;
        if (other.getDefaultTemplateData() != null
                && other.getDefaultTemplateData().equals(this.getDefaultTemplateData()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        return true;
    }
}
