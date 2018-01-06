/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Composes an email message based on input data, and then immediately queues
 * the message for sending.
 * </p>
 * <p>
 * There are several important points to know about <code>SendEmail</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can only send email from verified email addresses and domains; otherwise,
 * you will get an "Email address not verified" error. If your account is still
 * in the Amazon SES sandbox, you must also verify every recipient email address
 * except for the recipients provided by the Amazon SES mailbox simulator. For
 * more information, go to the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The total size of the message cannot exceed 10 MB. This includes any
 * attachments that are part of the message.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SES has a limit on the total number of recipients per message. The
 * combined number of To:, CC: and BCC: email addresses cannot exceed 50. If you
 * need to send an email message to a larger audience, you can divide your
 * recipient list into groups of 50 or fewer, and then call Amazon SES
 * repeatedly to send the message to each group.
 * </p>
 * </li>
 * <li>
 * <p>
 * For every message that you send, the total number of recipients (To:, CC: and
 * BCC:) is counted against your sending quota - the maximum number of emails
 * you can send in a 24-hour period. For information about your sending quota,
 * go to the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
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
     * <p>
     * In all cases, the email address must be 7-bit ASCII. If the text must
     * contain any other characters, then you must use MIME encoded-word syntax
     * (RFC 2047) instead of a literal string. MIME encoded-word syntax uses the
     * following form: <code>=?charset?encoding?encoded-text?=</code>. For more
     * information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>.
     * </p>
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
     * The email address to which bounces and complaints are to be forwarded
     * when feedback forwarding is enabled. If the message cannot be delivered
     * to the recipient, then an error message will be returned from the
     * recipient's ISP; this message will then be forwarded to the email address
     * specified by the <code>ReturnPath</code> parameter. The
     * <code>ReturnPath</code> parameter is never overwritten. This email
     * address must be either individually verified with Amazon SES, or from a
     * domain that has been verified with Amazon SES.
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
     *            <p>
     *            In all cases, the email address must be 7-bit ASCII. If the
     *            text must contain any other characters, then you must use MIME
     *            encoded-word syntax (RFC 2047) instead of a literal string.
     *            MIME encoded-word syntax uses the following form:
     *            <code>=?charset?encoding?encoded-text?=</code>. For more
     *            information, see <a
     *            href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     *            </p>
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
     * <p>
     * In all cases, the email address must be 7-bit ASCII. If the text must
     * contain any other characters, then you must use MIME encoded-word syntax
     * (RFC 2047) instead of a literal string. MIME encoded-word syntax uses the
     * following form: <code>=?charset?encoding?encoded-text?=</code>. For more
     * information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>.
     * </p>
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
     *         <p>
     *         In all cases, the email address must be 7-bit ASCII. If the text
     *         must contain any other characters, then you must use MIME
     *         encoded-word syntax (RFC 2047) instead of a literal string. MIME
     *         encoded-word syntax uses the following form:
     *         <code>=?charset?encoding?encoded-text?=</code>. For more
     *         information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     *         2047</a>.
     *         </p>
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
     * <p>
     * In all cases, the email address must be 7-bit ASCII. If the text must
     * contain any other characters, then you must use MIME encoded-word syntax
     * (RFC 2047) instead of a literal string. MIME encoded-word syntax uses the
     * following form: <code>=?charset?encoding?encoded-text?=</code>. For more
     * information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>.
     * </p>
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
     *            <p>
     *            In all cases, the email address must be 7-bit ASCII. If the
     *            text must contain any other characters, then you must use MIME
     *            encoded-word syntax (RFC 2047) instead of a literal string.
     *            MIME encoded-word syntax uses the following form:
     *            <code>=?charset?encoding?encoded-text?=</code>. For more
     *            information, see <a
     *            href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     *            </p>
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
     * <p>
     * In all cases, the email address must be 7-bit ASCII. If the text must
     * contain any other characters, then you must use MIME encoded-word syntax
     * (RFC 2047) instead of a literal string. MIME encoded-word syntax uses the
     * following form: <code>=?charset?encoding?encoded-text?=</code>. For more
     * information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>.
     * </p>
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
     *            <p>
     *            In all cases, the email address must be 7-bit ASCII. If the
     *            text must contain any other characters, then you must use MIME
     *            encoded-word syntax (RFC 2047) instead of a literal string.
     *            MIME encoded-word syntax uses the following form:
     *            <code>=?charset?encoding?encoded-text?=</code>. For more
     *            information, see <a
     *            href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     *            </p>
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
     * The email address to which bounces and complaints are to be forwarded
     * when feedback forwarding is enabled. If the message cannot be delivered
     * to the recipient, then an error message will be returned from the
     * recipient's ISP; this message will then be forwarded to the email address
     * specified by the <code>ReturnPath</code> parameter. The
     * <code>ReturnPath</code> parameter is never overwritten. This email
     * address must be either individually verified with Amazon SES, or from a
     * domain that has been verified with Amazon SES.
     * </p>
     *
     * @return <p>
     *         The email address to which bounces and complaints are to be
     *         forwarded when feedback forwarding is enabled. If the message
     *         cannot be delivered to the recipient, then an error message will
     *         be returned from the recipient's ISP; this message will then be
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
     * The email address to which bounces and complaints are to be forwarded
     * when feedback forwarding is enabled. If the message cannot be delivered
     * to the recipient, then an error message will be returned from the
     * recipient's ISP; this message will then be forwarded to the email address
     * specified by the <code>ReturnPath</code> parameter. The
     * <code>ReturnPath</code> parameter is never overwritten. This email
     * address must be either individually verified with Amazon SES, or from a
     * domain that has been verified with Amazon SES.
     * </p>
     *
     * @param returnPath <p>
     *            The email address to which bounces and complaints are to be
     *            forwarded when feedback forwarding is enabled. If the message
     *            cannot be delivered to the recipient, then an error message
     *            will be returned from the recipient's ISP; this message will
     *            then be forwarded to the email address specified by the
     *            <code>ReturnPath</code> parameter. The <code>ReturnPath</code>
     *            parameter is never overwritten. This email address must be
     *            either individually verified with Amazon SES, or from a domain
     *            that has been verified with Amazon SES.
     *            </p>
     */
    public void setReturnPath(String returnPath) {
        this.returnPath = returnPath;
    }

    /**
     * <p>
     * The email address to which bounces and complaints are to be forwarded
     * when feedback forwarding is enabled. If the message cannot be delivered
     * to the recipient, then an error message will be returned from the
     * recipient's ISP; this message will then be forwarded to the email address
     * specified by the <code>ReturnPath</code> parameter. The
     * <code>ReturnPath</code> parameter is never overwritten. This email
     * address must be either individually verified with Amazon SES, or from a
     * domain that has been verified with Amazon SES.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnPath <p>
     *            The email address to which bounces and complaints are to be
     *            forwarded when feedback forwarding is enabled. If the message
     *            cannot be delivered to the recipient, then an error message
     *            will be returned from the recipient's ISP; this message will
     *            then be forwarded to the email address specified by the
     *            <code>ReturnPath</code> parameter. The <code>ReturnPath</code>
     *            parameter is never overwritten. This email address must be
     *            either individually verified with Amazon SES, or from a domain
     *            that has been verified with Amazon SES.
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
            sb.append("ReturnPathArn: " + getReturnPathArn());
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
        return true;
    }
}
