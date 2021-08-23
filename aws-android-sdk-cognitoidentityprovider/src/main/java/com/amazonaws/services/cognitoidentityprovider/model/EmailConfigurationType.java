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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The email configuration type.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito has specific regions for use with Amazon SES. For more
 * information on the supported regions, see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html"
 * >Email Settings for Amazon Cognito User Pools</a>.
 * </p>
 * </note>
 */
public class EmailConfigurationType implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a verified email address in Amazon SES.
     * This email address is used in one of the following ways, depending on the
     * value that you specify for the <code>EmailSendingAccount</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this
     * address as the custom FROM address when it emails your users by using its
     * built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users
     * with this address by calling Amazon SES on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String sourceArn;

    /**
     * <p>
     * The destination to which the receiver of the email should reply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+@[\p{L}\p{M}\p{S}\p{N}\p{P}]+
     * <br/>
     */
    private String replyToEmailAddress;

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in
     * email functionality or your Amazon SES email configuration. Specify one
     * of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email
     * functionality. When you use the default option, Amazon Cognito allows
     * only a limited number of emails each day for your user pool. For typical
     * production environments, the default email limit is below the required
     * delivery volume. To achieve a higher delivery volume, specify DEVELOPER
     * to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     * >Limits in Amazon Cognito</a> in the <i>Amazon Cognito Developer
     * Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize
     * the FROM address, provide the ARN of an Amazon SES verified email address
     * for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * If EmailSendingAccount is COGNITO_DEFAULT, the following parameters
     * aren't allowed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EmailVerificationMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * EmailVerificationSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessageByLink
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubject,
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubjectByLink
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DEVELOPER EmailSendingAccount is required.
     * </p>
     * </note></dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES
     * configuration. Amazon Cognito calls Amazon SES on your behalf to send
     * email from your verified email address. When you use this option, the
     * email delivery limits are the same limits that apply to your Amazon SES
     * verified email address in your account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES
     * verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional
     * permissions to call Amazon SES on your behalf. When you update your user
     * pool with this option, Amazon Cognito creates a <i>service-linked
     * role</i>, which is a type of IAM role, in your account. This role
     * contains the permissions that allow Amazon Cognito to access Amazon SES
     * and send email messages with your address. For more information about the
     * service-linked role that Amazon Cognito creates, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COGNITO_DEFAULT, DEVELOPER
     */
    private String emailSendingAccount;

    /**
     * <p>
     * Identifies either the sender’s email address or the sender’s name with
     * their email address. For example, <code>testuser@example.com</code> or
     * <code>Test User &lt;testuser@example.com&gt;</code>. This address will
     * appear before the body of the email.
     * </p>
     */
    private String from;

    /**
     * <p>
     * The set of configuration rules that can be applied to emails sent using
     * Amazon SES. A configuration set is applied to an email by including a
     * reference to the configuration set in the headers of the email. Once
     * applied, all of the rules in that configuration set are applied to the
     * email. Configuration sets can be used to apply the following types of
     * rules to emails:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Event publishing – Amazon SES can track the number of send, delivery,
     * open, click, bounce, and complaint events for each email sent. Use event
     * publishing to send information about these events to other Amazon Web
     * Services services such as SNS and CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * IP pool management – When leasing dedicated IP addresses with Amazon SES,
     * you can create groups of IP addresses, called dedicated IP pools. You can
     * then associate the dedicated IP pools with configuration sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     */
    private String configurationSet;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a verified email address in Amazon SES.
     * This email address is used in one of the following ways, depending on the
     * value that you specify for the <code>EmailSendingAccount</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this
     * address as the custom FROM address when it emails your users by using its
     * built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users
     * with this address by calling Amazon SES on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a verified email address in
     *         Amazon SES. This email address is used in one of the following
     *         ways, depending on the value that you specify for the
     *         <code>EmailSendingAccount</code> parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses
     *         this address as the custom FROM address when it emails your users
     *         by using its built-in email account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify <code>DEVELOPER</code>, Amazon Cognito emails your
     *         users with this address by calling Amazon SES on your behalf.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a verified email address in Amazon SES.
     * This email address is used in one of the following ways, depending on the
     * value that you specify for the <code>EmailSendingAccount</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this
     * address as the custom FROM address when it emails your users by using its
     * built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users
     * with this address by calling Amazon SES on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of a verified email address in
     *            Amazon SES. This email address is used in one of the following
     *            ways, depending on the value that you specify for the
     *            <code>EmailSendingAccount</code> parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito
     *            uses this address as the custom FROM address when it emails
     *            your users by using its built-in email account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify <code>DEVELOPER</code>, Amazon Cognito emails
     *            your users with this address by calling Amazon SES on your
     *            behalf.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a verified email address in Amazon SES.
     * This email address is used in one of the following ways, depending on the
     * value that you specify for the <code>EmailSendingAccount</code>
     * parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this
     * address as the custom FROM address when it emails your users by using its
     * built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users
     * with this address by calling Amazon SES on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of a verified email address in
     *            Amazon SES. This email address is used in one of the following
     *            ways, depending on the value that you specify for the
     *            <code>EmailSendingAccount</code> parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito
     *            uses this address as the custom FROM address when it emails
     *            your users by using its built-in email account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify <code>DEVELOPER</code>, Amazon Cognito emails
     *            your users with this address by calling Amazon SES on your
     *            behalf.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailConfigurationType withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+@[\p{L}\p{M}\p{S}\p{N}\p{P}]+
     * <br/>
     *
     * @return <p>
     *         The destination to which the receiver of the email should reply
     *         to.
     *         </p>
     */
    public String getReplyToEmailAddress() {
        return replyToEmailAddress;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+@[\p{L}\p{M}\p{S}\p{N}\p{P}]+
     * <br/>
     *
     * @param replyToEmailAddress <p>
     *            The destination to which the receiver of the email should
     *            reply to.
     *            </p>
     */
    public void setReplyToEmailAddress(String replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+@[\p{L}\p{M}\p{S}\p{N}\p{P}]+
     * <br/>
     *
     * @param replyToEmailAddress <p>
     *            The destination to which the receiver of the email should
     *            reply to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailConfigurationType withReplyToEmailAddress(String replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in
     * email functionality or your Amazon SES email configuration. Specify one
     * of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email
     * functionality. When you use the default option, Amazon Cognito allows
     * only a limited number of emails each day for your user pool. For typical
     * production environments, the default email limit is below the required
     * delivery volume. To achieve a higher delivery volume, specify DEVELOPER
     * to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     * >Limits in Amazon Cognito</a> in the <i>Amazon Cognito Developer
     * Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize
     * the FROM address, provide the ARN of an Amazon SES verified email address
     * for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * If EmailSendingAccount is COGNITO_DEFAULT, the following parameters
     * aren't allowed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EmailVerificationMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * EmailVerificationSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessageByLink
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubject,
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubjectByLink
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DEVELOPER EmailSendingAccount is required.
     * </p>
     * </note></dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES
     * configuration. Amazon Cognito calls Amazon SES on your behalf to send
     * email from your verified email address. When you use this option, the
     * email delivery limits are the same limits that apply to your Amazon SES
     * verified email address in your account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES
     * verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional
     * permissions to call Amazon SES on your behalf. When you update your user
     * pool with this option, Amazon Cognito creates a <i>service-linked
     * role</i>, which is a type of IAM role, in your account. This role
     * contains the permissions that allow Amazon Cognito to access Amazon SES
     * and send email messages with your address. For more information about the
     * service-linked role that Amazon Cognito creates, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COGNITO_DEFAULT, DEVELOPER
     *
     * @return <p>
     *         Specifies whether Amazon Cognito emails your users by using its
     *         built-in email functionality or your Amazon SES email
     *         configuration. Specify one of the following values:
     *         </p>
     *         <dl>
     *         <dt>COGNITO_DEFAULT</dt>
     *         <dd>
     *         <p>
     *         When Amazon Cognito emails your users, it uses its built-in email
     *         functionality. When you use the default option, Amazon Cognito
     *         allows only a limited number of emails each day for your user
     *         pool. For typical production environments, the default email
     *         limit is below the required delivery volume. To achieve a higher
     *         delivery volume, specify DEVELOPER to use your Amazon SES email
     *         configuration.
     *         </p>
     *         <p>
     *         To look up the email delivery limit for the default option, see
     *         <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     *         >Limits in Amazon Cognito</a> in the <i>Amazon Cognito Developer
     *         Guide</i>.
     *         </p>
     *         <p>
     *         The default FROM address is no-reply@verificationemail.com. To
     *         customize the FROM address, provide the ARN of an Amazon SES
     *         verified email address for the <code>SourceArn</code> parameter.
     *         </p>
     *         <p>
     *         If EmailSendingAccount is COGNITO_DEFAULT, the following
     *         parameters aren't allowed:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         EmailVerificationMessage
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EmailVerificationSubject
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InviteMessageTemplate.EmailMessage
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         InviteMessageTemplate.EmailSubject
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VerificationMessageTemplate.EmailMessage
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VerificationMessageTemplate.EmailMessageByLink
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VerificationMessageTemplate.EmailSubject,
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VerificationMessageTemplate.EmailSubjectByLink
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         DEVELOPER EmailSendingAccount is required.
     *         </p>
     *         </note></dd>
     *         <dt>DEVELOPER</dt>
     *         <dd>
     *         <p>
     *         When Amazon Cognito emails your users, it uses your Amazon SES
     *         configuration. Amazon Cognito calls Amazon SES on your behalf to
     *         send email from your verified email address. When you use this
     *         option, the email delivery limits are the same limits that apply
     *         to your Amazon SES verified email address in your account.
     *         </p>
     *         <p>
     *         If you use this option, you must provide the ARN of an Amazon SES
     *         verified email address for the <code>SourceArn</code> parameter.
     *         </p>
     *         <p>
     *         Before Amazon Cognito can email your users, it requires
     *         additional permissions to call Amazon SES on your behalf. When
     *         you update your user pool with this option, Amazon Cognito
     *         creates a <i>service-linked role</i>, which is a type of IAM
     *         role, in your account. This role contains the permissions that
     *         allow Amazon Cognito to access Amazon SES and send email messages
     *         with your address. For more information about the service-linked
     *         role that Amazon Cognito creates, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     *         >Using Service-Linked Roles for Amazon Cognito</a> in the
     *         <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         </dd>
     *         </dl>
     * @see EmailSendingAccountType
     */
    public String getEmailSendingAccount() {
        return emailSendingAccount;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in
     * email functionality or your Amazon SES email configuration. Specify one
     * of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email
     * functionality. When you use the default option, Amazon Cognito allows
     * only a limited number of emails each day for your user pool. For typical
     * production environments, the default email limit is below the required
     * delivery volume. To achieve a higher delivery volume, specify DEVELOPER
     * to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     * >Limits in Amazon Cognito</a> in the <i>Amazon Cognito Developer
     * Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize
     * the FROM address, provide the ARN of an Amazon SES verified email address
     * for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * If EmailSendingAccount is COGNITO_DEFAULT, the following parameters
     * aren't allowed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EmailVerificationMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * EmailVerificationSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessageByLink
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubject,
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubjectByLink
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DEVELOPER EmailSendingAccount is required.
     * </p>
     * </note></dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES
     * configuration. Amazon Cognito calls Amazon SES on your behalf to send
     * email from your verified email address. When you use this option, the
     * email delivery limits are the same limits that apply to your Amazon SES
     * verified email address in your account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES
     * verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional
     * permissions to call Amazon SES on your behalf. When you update your user
     * pool with this option, Amazon Cognito creates a <i>service-linked
     * role</i>, which is a type of IAM role, in your account. This role
     * contains the permissions that allow Amazon Cognito to access Amazon SES
     * and send email messages with your address. For more information about the
     * service-linked role that Amazon Cognito creates, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COGNITO_DEFAULT, DEVELOPER
     *
     * @param emailSendingAccount <p>
     *            Specifies whether Amazon Cognito emails your users by using
     *            its built-in email functionality or your Amazon SES email
     *            configuration. Specify one of the following values:
     *            </p>
     *            <dl>
     *            <dt>COGNITO_DEFAULT</dt>
     *            <dd>
     *            <p>
     *            When Amazon Cognito emails your users, it uses its built-in
     *            email functionality. When you use the default option, Amazon
     *            Cognito allows only a limited number of emails each day for
     *            your user pool. For typical production environments, the
     *            default email limit is below the required delivery volume. To
     *            achieve a higher delivery volume, specify DEVELOPER to use
     *            your Amazon SES email configuration.
     *            </p>
     *            <p>
     *            To look up the email delivery limit for the default option,
     *            see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     *            >Limits in Amazon Cognito</a> in the <i>Amazon Cognito
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            The default FROM address is no-reply@verificationemail.com. To
     *            customize the FROM address, provide the ARN of an Amazon SES
     *            verified email address for the <code>SourceArn</code>
     *            parameter.
     *            </p>
     *            <p>
     *            If EmailSendingAccount is COGNITO_DEFAULT, the following
     *            parameters aren't allowed:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            EmailVerificationMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EmailVerificationSubject
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InviteMessageTemplate.EmailMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InviteMessageTemplate.EmailSubject
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailMessageByLink
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailSubject,
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailSubjectByLink
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            DEVELOPER EmailSendingAccount is required.
     *            </p>
     *            </note></dd>
     *            <dt>DEVELOPER</dt>
     *            <dd>
     *            <p>
     *            When Amazon Cognito emails your users, it uses your Amazon SES
     *            configuration. Amazon Cognito calls Amazon SES on your behalf
     *            to send email from your verified email address. When you use
     *            this option, the email delivery limits are the same limits
     *            that apply to your Amazon SES verified email address in your
     *            account.
     *            </p>
     *            <p>
     *            If you use this option, you must provide the ARN of an Amazon
     *            SES verified email address for the <code>SourceArn</code>
     *            parameter.
     *            </p>
     *            <p>
     *            Before Amazon Cognito can email your users, it requires
     *            additional permissions to call Amazon SES on your behalf. When
     *            you update your user pool with this option, Amazon Cognito
     *            creates a <i>service-linked role</i>, which is a type of IAM
     *            role, in your account. This role contains the permissions that
     *            allow Amazon Cognito to access Amazon SES and send email
     *            messages with your address. For more information about the
     *            service-linked role that Amazon Cognito creates, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon Cognito</a> in the
     *            <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            </dd>
     *            </dl>
     * @see EmailSendingAccountType
     */
    public void setEmailSendingAccount(String emailSendingAccount) {
        this.emailSendingAccount = emailSendingAccount;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in
     * email functionality or your Amazon SES email configuration. Specify one
     * of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email
     * functionality. When you use the default option, Amazon Cognito allows
     * only a limited number of emails each day for your user pool. For typical
     * production environments, the default email limit is below the required
     * delivery volume. To achieve a higher delivery volume, specify DEVELOPER
     * to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     * >Limits in Amazon Cognito</a> in the <i>Amazon Cognito Developer
     * Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize
     * the FROM address, provide the ARN of an Amazon SES verified email address
     * for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * If EmailSendingAccount is COGNITO_DEFAULT, the following parameters
     * aren't allowed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EmailVerificationMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * EmailVerificationSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessageByLink
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubject,
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubjectByLink
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DEVELOPER EmailSendingAccount is required.
     * </p>
     * </note></dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES
     * configuration. Amazon Cognito calls Amazon SES on your behalf to send
     * email from your verified email address. When you use this option, the
     * email delivery limits are the same limits that apply to your Amazon SES
     * verified email address in your account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES
     * verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional
     * permissions to call Amazon SES on your behalf. When you update your user
     * pool with this option, Amazon Cognito creates a <i>service-linked
     * role</i>, which is a type of IAM role, in your account. This role
     * contains the permissions that allow Amazon Cognito to access Amazon SES
     * and send email messages with your address. For more information about the
     * service-linked role that Amazon Cognito creates, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COGNITO_DEFAULT, DEVELOPER
     *
     * @param emailSendingAccount <p>
     *            Specifies whether Amazon Cognito emails your users by using
     *            its built-in email functionality or your Amazon SES email
     *            configuration. Specify one of the following values:
     *            </p>
     *            <dl>
     *            <dt>COGNITO_DEFAULT</dt>
     *            <dd>
     *            <p>
     *            When Amazon Cognito emails your users, it uses its built-in
     *            email functionality. When you use the default option, Amazon
     *            Cognito allows only a limited number of emails each day for
     *            your user pool. For typical production environments, the
     *            default email limit is below the required delivery volume. To
     *            achieve a higher delivery volume, specify DEVELOPER to use
     *            your Amazon SES email configuration.
     *            </p>
     *            <p>
     *            To look up the email delivery limit for the default option,
     *            see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     *            >Limits in Amazon Cognito</a> in the <i>Amazon Cognito
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            The default FROM address is no-reply@verificationemail.com. To
     *            customize the FROM address, provide the ARN of an Amazon SES
     *            verified email address for the <code>SourceArn</code>
     *            parameter.
     *            </p>
     *            <p>
     *            If EmailSendingAccount is COGNITO_DEFAULT, the following
     *            parameters aren't allowed:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            EmailVerificationMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EmailVerificationSubject
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InviteMessageTemplate.EmailMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InviteMessageTemplate.EmailSubject
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailMessageByLink
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailSubject,
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailSubjectByLink
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            DEVELOPER EmailSendingAccount is required.
     *            </p>
     *            </note></dd>
     *            <dt>DEVELOPER</dt>
     *            <dd>
     *            <p>
     *            When Amazon Cognito emails your users, it uses your Amazon SES
     *            configuration. Amazon Cognito calls Amazon SES on your behalf
     *            to send email from your verified email address. When you use
     *            this option, the email delivery limits are the same limits
     *            that apply to your Amazon SES verified email address in your
     *            account.
     *            </p>
     *            <p>
     *            If you use this option, you must provide the ARN of an Amazon
     *            SES verified email address for the <code>SourceArn</code>
     *            parameter.
     *            </p>
     *            <p>
     *            Before Amazon Cognito can email your users, it requires
     *            additional permissions to call Amazon SES on your behalf. When
     *            you update your user pool with this option, Amazon Cognito
     *            creates a <i>service-linked role</i>, which is a type of IAM
     *            role, in your account. This role contains the permissions that
     *            allow Amazon Cognito to access Amazon SES and send email
     *            messages with your address. For more information about the
     *            service-linked role that Amazon Cognito creates, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon Cognito</a> in the
     *            <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EmailSendingAccountType
     */
    public EmailConfigurationType withEmailSendingAccount(String emailSendingAccount) {
        this.emailSendingAccount = emailSendingAccount;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in
     * email functionality or your Amazon SES email configuration. Specify one
     * of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email
     * functionality. When you use the default option, Amazon Cognito allows
     * only a limited number of emails each day for your user pool. For typical
     * production environments, the default email limit is below the required
     * delivery volume. To achieve a higher delivery volume, specify DEVELOPER
     * to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     * >Limits in Amazon Cognito</a> in the <i>Amazon Cognito Developer
     * Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize
     * the FROM address, provide the ARN of an Amazon SES verified email address
     * for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * If EmailSendingAccount is COGNITO_DEFAULT, the following parameters
     * aren't allowed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EmailVerificationMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * EmailVerificationSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessageByLink
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubject,
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubjectByLink
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DEVELOPER EmailSendingAccount is required.
     * </p>
     * </note></dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES
     * configuration. Amazon Cognito calls Amazon SES on your behalf to send
     * email from your verified email address. When you use this option, the
     * email delivery limits are the same limits that apply to your Amazon SES
     * verified email address in your account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES
     * verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional
     * permissions to call Amazon SES on your behalf. When you update your user
     * pool with this option, Amazon Cognito creates a <i>service-linked
     * role</i>, which is a type of IAM role, in your account. This role
     * contains the permissions that allow Amazon Cognito to access Amazon SES
     * and send email messages with your address. For more information about the
     * service-linked role that Amazon Cognito creates, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COGNITO_DEFAULT, DEVELOPER
     *
     * @param emailSendingAccount <p>
     *            Specifies whether Amazon Cognito emails your users by using
     *            its built-in email functionality or your Amazon SES email
     *            configuration. Specify one of the following values:
     *            </p>
     *            <dl>
     *            <dt>COGNITO_DEFAULT</dt>
     *            <dd>
     *            <p>
     *            When Amazon Cognito emails your users, it uses its built-in
     *            email functionality. When you use the default option, Amazon
     *            Cognito allows only a limited number of emails each day for
     *            your user pool. For typical production environments, the
     *            default email limit is below the required delivery volume. To
     *            achieve a higher delivery volume, specify DEVELOPER to use
     *            your Amazon SES email configuration.
     *            </p>
     *            <p>
     *            To look up the email delivery limit for the default option,
     *            see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     *            >Limits in Amazon Cognito</a> in the <i>Amazon Cognito
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            The default FROM address is no-reply@verificationemail.com. To
     *            customize the FROM address, provide the ARN of an Amazon SES
     *            verified email address for the <code>SourceArn</code>
     *            parameter.
     *            </p>
     *            <p>
     *            If EmailSendingAccount is COGNITO_DEFAULT, the following
     *            parameters aren't allowed:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            EmailVerificationMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EmailVerificationSubject
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InviteMessageTemplate.EmailMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InviteMessageTemplate.EmailSubject
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailMessageByLink
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailSubject,
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailSubjectByLink
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            DEVELOPER EmailSendingAccount is required.
     *            </p>
     *            </note></dd>
     *            <dt>DEVELOPER</dt>
     *            <dd>
     *            <p>
     *            When Amazon Cognito emails your users, it uses your Amazon SES
     *            configuration. Amazon Cognito calls Amazon SES on your behalf
     *            to send email from your verified email address. When you use
     *            this option, the email delivery limits are the same limits
     *            that apply to your Amazon SES verified email address in your
     *            account.
     *            </p>
     *            <p>
     *            If you use this option, you must provide the ARN of an Amazon
     *            SES verified email address for the <code>SourceArn</code>
     *            parameter.
     *            </p>
     *            <p>
     *            Before Amazon Cognito can email your users, it requires
     *            additional permissions to call Amazon SES on your behalf. When
     *            you update your user pool with this option, Amazon Cognito
     *            creates a <i>service-linked role</i>, which is a type of IAM
     *            role, in your account. This role contains the permissions that
     *            allow Amazon Cognito to access Amazon SES and send email
     *            messages with your address. For more information about the
     *            service-linked role that Amazon Cognito creates, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon Cognito</a> in the
     *            <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            </dd>
     *            </dl>
     * @see EmailSendingAccountType
     */
    public void setEmailSendingAccount(EmailSendingAccountType emailSendingAccount) {
        this.emailSendingAccount = emailSendingAccount.toString();
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in
     * email functionality or your Amazon SES email configuration. Specify one
     * of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email
     * functionality. When you use the default option, Amazon Cognito allows
     * only a limited number of emails each day for your user pool. For typical
     * production environments, the default email limit is below the required
     * delivery volume. To achieve a higher delivery volume, specify DEVELOPER
     * to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     * >Limits in Amazon Cognito</a> in the <i>Amazon Cognito Developer
     * Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize
     * the FROM address, provide the ARN of an Amazon SES verified email address
     * for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * If EmailSendingAccount is COGNITO_DEFAULT, the following parameters
     * aren't allowed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EmailVerificationMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * EmailVerificationSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * InviteMessageTemplate.EmailSubject
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessage
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailMessageByLink
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubject,
     * </p>
     * </li>
     * <li>
     * <p>
     * VerificationMessageTemplate.EmailSubjectByLink
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DEVELOPER EmailSendingAccount is required.
     * </p>
     * </note></dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES
     * configuration. Amazon Cognito calls Amazon SES on your behalf to send
     * email from your verified email address. When you use this option, the
     * email delivery limits are the same limits that apply to your Amazon SES
     * verified email address in your account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES
     * verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional
     * permissions to call Amazon SES on your behalf. When you update your user
     * pool with this option, Amazon Cognito creates a <i>service-linked
     * role</i>, which is a type of IAM role, in your account. This role
     * contains the permissions that allow Amazon Cognito to access Amazon SES
     * and send email messages with your address. For more information about the
     * service-linked role that Amazon Cognito creates, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon
     * Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COGNITO_DEFAULT, DEVELOPER
     *
     * @param emailSendingAccount <p>
     *            Specifies whether Amazon Cognito emails your users by using
     *            its built-in email functionality or your Amazon SES email
     *            configuration. Specify one of the following values:
     *            </p>
     *            <dl>
     *            <dt>COGNITO_DEFAULT</dt>
     *            <dd>
     *            <p>
     *            When Amazon Cognito emails your users, it uses its built-in
     *            email functionality. When you use the default option, Amazon
     *            Cognito allows only a limited number of emails each day for
     *            your user pool. For typical production environments, the
     *            default email limit is below the required delivery volume. To
     *            achieve a higher delivery volume, specify DEVELOPER to use
     *            your Amazon SES email configuration.
     *            </p>
     *            <p>
     *            To look up the email delivery limit for the default option,
     *            see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html"
     *            >Limits in Amazon Cognito</a> in the <i>Amazon Cognito
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            The default FROM address is no-reply@verificationemail.com. To
     *            customize the FROM address, provide the ARN of an Amazon SES
     *            verified email address for the <code>SourceArn</code>
     *            parameter.
     *            </p>
     *            <p>
     *            If EmailSendingAccount is COGNITO_DEFAULT, the following
     *            parameters aren't allowed:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            EmailVerificationMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EmailVerificationSubject
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InviteMessageTemplate.EmailMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            InviteMessageTemplate.EmailSubject
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailMessage
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailMessageByLink
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailSubject,
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VerificationMessageTemplate.EmailSubjectByLink
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            DEVELOPER EmailSendingAccount is required.
     *            </p>
     *            </note></dd>
     *            <dt>DEVELOPER</dt>
     *            <dd>
     *            <p>
     *            When Amazon Cognito emails your users, it uses your Amazon SES
     *            configuration. Amazon Cognito calls Amazon SES on your behalf
     *            to send email from your verified email address. When you use
     *            this option, the email delivery limits are the same limits
     *            that apply to your Amazon SES verified email address in your
     *            account.
     *            </p>
     *            <p>
     *            If you use this option, you must provide the ARN of an Amazon
     *            SES verified email address for the <code>SourceArn</code>
     *            parameter.
     *            </p>
     *            <p>
     *            Before Amazon Cognito can email your users, it requires
     *            additional permissions to call Amazon SES on your behalf. When
     *            you update your user pool with this option, Amazon Cognito
     *            creates a <i>service-linked role</i>, which is a type of IAM
     *            role, in your account. This role contains the permissions that
     *            allow Amazon Cognito to access Amazon SES and send email
     *            messages with your address. For more information about the
     *            service-linked role that Amazon Cognito creates, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon Cognito</a> in the
     *            <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EmailSendingAccountType
     */
    public EmailConfigurationType withEmailSendingAccount(
            EmailSendingAccountType emailSendingAccount) {
        this.emailSendingAccount = emailSendingAccount.toString();
        return this;
    }

    /**
     * <p>
     * Identifies either the sender’s email address or the sender’s name with
     * their email address. For example, <code>testuser@example.com</code> or
     * <code>Test User &lt;testuser@example.com&gt;</code>. This address will
     * appear before the body of the email.
     * </p>
     *
     * @return <p>
     *         Identifies either the sender’s email address or the sender’s name
     *         with their email address. For example,
     *         <code>testuser@example.com</code> or
     *         <code>Test User &lt;testuser@example.com&gt;</code>. This address
     *         will appear before the body of the email.
     *         </p>
     */
    public String getFrom() {
        return from;
    }

    /**
     * <p>
     * Identifies either the sender’s email address or the sender’s name with
     * their email address. For example, <code>testuser@example.com</code> or
     * <code>Test User &lt;testuser@example.com&gt;</code>. This address will
     * appear before the body of the email.
     * </p>
     *
     * @param from <p>
     *            Identifies either the sender’s email address or the sender’s
     *            name with their email address. For example,
     *            <code>testuser@example.com</code> or
     *            <code>Test User &lt;testuser@example.com&gt;</code>. This
     *            address will appear before the body of the email.
     *            </p>
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * Identifies either the sender’s email address or the sender’s name with
     * their email address. For example, <code>testuser@example.com</code> or
     * <code>Test User &lt;testuser@example.com&gt;</code>. This address will
     * appear before the body of the email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param from <p>
     *            Identifies either the sender’s email address or the sender’s
     *            name with their email address. For example,
     *            <code>testuser@example.com</code> or
     *            <code>Test User &lt;testuser@example.com&gt;</code>. This
     *            address will appear before the body of the email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailConfigurationType withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * <p>
     * The set of configuration rules that can be applied to emails sent using
     * Amazon SES. A configuration set is applied to an email by including a
     * reference to the configuration set in the headers of the email. Once
     * applied, all of the rules in that configuration set are applied to the
     * email. Configuration sets can be used to apply the following types of
     * rules to emails:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Event publishing – Amazon SES can track the number of send, delivery,
     * open, click, bounce, and complaint events for each email sent. Use event
     * publishing to send information about these events to other Amazon Web
     * Services services such as SNS and CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * IP pool management – When leasing dedicated IP addresses with Amazon SES,
     * you can create groups of IP addresses, called dedicated IP pools. You can
     * then associate the dedicated IP pools with configuration sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @return <p>
     *         The set of configuration rules that can be applied to emails sent
     *         using Amazon SES. A configuration set is applied to an email by
     *         including a reference to the configuration set in the headers of
     *         the email. Once applied, all of the rules in that configuration
     *         set are applied to the email. Configuration sets can be used to
     *         apply the following types of rules to emails:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Event publishing – Amazon SES can track the number of send,
     *         delivery, open, click, bounce, and complaint events for each
     *         email sent. Use event publishing to send information about these
     *         events to other Amazon Web Services services such as SNS and
     *         CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP pool management – When leasing dedicated IP addresses with
     *         Amazon SES, you can create groups of IP addresses, called
     *         dedicated IP pools. You can then associate the dedicated IP pools
     *         with configuration sets.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getConfigurationSet() {
        return configurationSet;
    }

    /**
     * <p>
     * The set of configuration rules that can be applied to emails sent using
     * Amazon SES. A configuration set is applied to an email by including a
     * reference to the configuration set in the headers of the email. Once
     * applied, all of the rules in that configuration set are applied to the
     * email. Configuration sets can be used to apply the following types of
     * rules to emails:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Event publishing – Amazon SES can track the number of send, delivery,
     * open, click, bounce, and complaint events for each email sent. Use event
     * publishing to send information about these events to other Amazon Web
     * Services services such as SNS and CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * IP pool management – When leasing dedicated IP addresses with Amazon SES,
     * you can create groups of IP addresses, called dedicated IP pools. You can
     * then associate the dedicated IP pools with configuration sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param configurationSet <p>
     *            The set of configuration rules that can be applied to emails
     *            sent using Amazon SES. A configuration set is applied to an
     *            email by including a reference to the configuration set in the
     *            headers of the email. Once applied, all of the rules in that
     *            configuration set are applied to the email. Configuration sets
     *            can be used to apply the following types of rules to emails:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Event publishing – Amazon SES can track the number of send,
     *            delivery, open, click, bounce, and complaint events for each
     *            email sent. Use event publishing to send information about
     *            these events to other Amazon Web Services services such as SNS
     *            and CloudWatch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IP pool management – When leasing dedicated IP addresses with
     *            Amazon SES, you can create groups of IP addresses, called
     *            dedicated IP pools. You can then associate the dedicated IP
     *            pools with configuration sets.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * The set of configuration rules that can be applied to emails sent using
     * Amazon SES. A configuration set is applied to an email by including a
     * reference to the configuration set in the headers of the email. Once
     * applied, all of the rules in that configuration set are applied to the
     * email. Configuration sets can be used to apply the following types of
     * rules to emails:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Event publishing – Amazon SES can track the number of send, delivery,
     * open, click, bounce, and complaint events for each email sent. Use event
     * publishing to send information about these events to other Amazon Web
     * Services services such as SNS and CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * IP pool management – When leasing dedicated IP addresses with Amazon SES,
     * you can create groups of IP addresses, called dedicated IP pools. You can
     * then associate the dedicated IP pools with configuration sets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param configurationSet <p>
     *            The set of configuration rules that can be applied to emails
     *            sent using Amazon SES. A configuration set is applied to an
     *            email by including a reference to the configuration set in the
     *            headers of the email. Once applied, all of the rules in that
     *            configuration set are applied to the email. Configuration sets
     *            can be used to apply the following types of rules to emails:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Event publishing – Amazon SES can track the number of send,
     *            delivery, open, click, bounce, and complaint events for each
     *            email sent. Use event publishing to send information about
     *            these events to other Amazon Web Services services such as SNS
     *            and CloudWatch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IP pool management – When leasing dedicated IP addresses with
     *            Amazon SES, you can create groups of IP addresses, called
     *            dedicated IP pools. You can then associate the dedicated IP
     *            pools with configuration sets.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailConfigurationType withConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
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
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getReplyToEmailAddress() != null)
            sb.append("ReplyToEmailAddress: " + getReplyToEmailAddress() + ",");
        if (getEmailSendingAccount() != null)
            sb.append("EmailSendingAccount: " + getEmailSendingAccount() + ",");
        if (getFrom() != null)
            sb.append("From: " + getFrom() + ",");
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: " + getConfigurationSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getReplyToEmailAddress() == null) ? 0 : getReplyToEmailAddress().hashCode());
        hashCode = prime * hashCode
                + ((getEmailSendingAccount() == null) ? 0 : getEmailSendingAccount().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailConfigurationType == false)
            return false;
        EmailConfigurationType other = (EmailConfigurationType) obj;

        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getReplyToEmailAddress() == null ^ this.getReplyToEmailAddress() == null)
            return false;
        if (other.getReplyToEmailAddress() != null
                && other.getReplyToEmailAddress().equals(this.getReplyToEmailAddress()) == false)
            return false;
        if (other.getEmailSendingAccount() == null ^ this.getEmailSendingAccount() == null)
            return false;
        if (other.getEmailSendingAccount() != null
                && other.getEmailSendingAccount().equals(this.getEmailSendingAccount()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null
                && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
            return false;
        return true;
    }
}
