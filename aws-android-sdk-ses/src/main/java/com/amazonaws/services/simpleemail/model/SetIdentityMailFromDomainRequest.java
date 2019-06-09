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
 * Enables or disables the custom MAIL FROM domain setup for a verified identity
 * (an email address or a domain).
 * </p>
 * <important>
 * <p>
 * To send emails using the specified MAIL FROM domain, you must add an MX
 * record to your MAIL FROM domain's DNS settings. If you want your emails to
 * pass Sender Policy Framework (SPF) checks, you must also add or update an SPF
 * record. For more information, see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * </important>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class SetIdentityMailFromDomainRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The verified identity for which you want to enable or disable the
     * specified custom MAIL FROM domain.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use.
     * The MAIL FROM domain must 1) be a subdomain of the verified identity, 2)
     * not be used in a "From" address if the MAIL FROM domain is the
     * destination of email feedback forwarding (for more information, see the
     * <a href=
     * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     * >Amazon SES Developer Guide</a>), and 3) not be used to receive emails. A
     * value of <code>null</code> disables the custom MAIL FROM setting for the
     * identity.
     * </p>
     */
    private String mailFromDomain;

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully
     * read the required MX record when you send an email. If you choose
     * <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     * subdomain of that) as the MAIL FROM domain. If you choose
     * <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when
     * the custom MAIL FROM domain setup is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     */
    private String behaviorOnMXFailure;

    /**
     * <p>
     * The verified identity for which you want to enable or disable the
     * specified custom MAIL FROM domain.
     * </p>
     *
     * @return <p>
     *         The verified identity for which you want to enable or disable the
     *         specified custom MAIL FROM domain.
     *         </p>
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * <p>
     * The verified identity for which you want to enable or disable the
     * specified custom MAIL FROM domain.
     * </p>
     *
     * @param identity <p>
     *            The verified identity for which you want to enable or disable
     *            the specified custom MAIL FROM domain.
     *            </p>
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The verified identity for which you want to enable or disable the
     * specified custom MAIL FROM domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity <p>
     *            The verified identity for which you want to enable or disable
     *            the specified custom MAIL FROM domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetIdentityMailFromDomainRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use.
     * The MAIL FROM domain must 1) be a subdomain of the verified identity, 2)
     * not be used in a "From" address if the MAIL FROM domain is the
     * destination of email feedback forwarding (for more information, see the
     * <a href=
     * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     * >Amazon SES Developer Guide</a>), and 3) not be used to receive emails. A
     * value of <code>null</code> disables the custom MAIL FROM setting for the
     * identity.
     * </p>
     *
     * @return <p>
     *         The custom MAIL FROM domain that you want the verified identity
     *         to use. The MAIL FROM domain must 1) be a subdomain of the
     *         verified identity, 2) not be used in a "From" address if the MAIL
     *         FROM domain is the destination of email feedback forwarding (for
     *         more information, see the <a href=
     *         "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *         >Amazon SES Developer Guide</a>), and 3) not be used to receive
     *         emails. A value of <code>null</code> disables the custom MAIL
     *         FROM setting for the identity.
     *         </p>
     */
    public String getMailFromDomain() {
        return mailFromDomain;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use.
     * The MAIL FROM domain must 1) be a subdomain of the verified identity, 2)
     * not be used in a "From" address if the MAIL FROM domain is the
     * destination of email feedback forwarding (for more information, see the
     * <a href=
     * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     * >Amazon SES Developer Guide</a>), and 3) not be used to receive emails. A
     * value of <code>null</code> disables the custom MAIL FROM setting for the
     * identity.
     * </p>
     *
     * @param mailFromDomain <p>
     *            The custom MAIL FROM domain that you want the verified
     *            identity to use. The MAIL FROM domain must 1) be a subdomain
     *            of the verified identity, 2) not be used in a "From" address
     *            if the MAIL FROM domain is the destination of email feedback
     *            forwarding (for more information, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>), and 3) not be used to
     *            receive emails. A value of <code>null</code> disables the
     *            custom MAIL FROM setting for the identity.
     *            </p>
     */
    public void setMailFromDomain(String mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use.
     * The MAIL FROM domain must 1) be a subdomain of the verified identity, 2)
     * not be used in a "From" address if the MAIL FROM domain is the
     * destination of email feedback forwarding (for more information, see the
     * <a href=
     * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     * >Amazon SES Developer Guide</a>), and 3) not be used to receive emails. A
     * value of <code>null</code> disables the custom MAIL FROM setting for the
     * identity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mailFromDomain <p>
     *            The custom MAIL FROM domain that you want the verified
     *            identity to use. The MAIL FROM domain must 1) be a subdomain
     *            of the verified identity, 2) not be used in a "From" address
     *            if the MAIL FROM domain is the destination of email feedback
     *            forwarding (for more information, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>), and 3) not be used to
     *            receive emails. A value of <code>null</code> disables the
     *            custom MAIL FROM setting for the identity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetIdentityMailFromDomainRequest withMailFromDomain(String mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
        return this;
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully
     * read the required MX record when you send an email. If you choose
     * <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     * subdomain of that) as the MAIL FROM domain. If you choose
     * <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when
     * the custom MAIL FROM domain setup is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @return <p>
     *         The action that you want Amazon SES to take if it cannot
     *         successfully read the required MX record when you send an email.
     *         If you choose <code>UseDefaultValue</code>, Amazon SES will use
     *         amazonses.com (or a subdomain of that) as the MAIL FROM domain.
     *         If you choose <code>RejectMessage</code>, Amazon SES will return
     *         a <code>MailFromDomainNotVerified</code> error and not send the
     *         email.
     *         </p>
     *         <p>
     *         The action specified in <code>BehaviorOnMXFailure</code> is taken
     *         when the custom MAIL FROM domain setup is in the
     *         <code>Pending</code>, <code>Failed</code>, and
     *         <code>TemporaryFailure</code> states.
     *         </p>
     * @see BehaviorOnMXFailure
     */
    public String getBehaviorOnMXFailure() {
        return behaviorOnMXFailure;
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully
     * read the required MX record when you send an email. If you choose
     * <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     * subdomain of that) as the MAIL FROM domain. If you choose
     * <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when
     * the custom MAIL FROM domain setup is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @param behaviorOnMXFailure <p>
     *            The action that you want Amazon SES to take if it cannot
     *            successfully read the required MX record when you send an
     *            email. If you choose <code>UseDefaultValue</code>, Amazon SES
     *            will use amazonses.com (or a subdomain of that) as the MAIL
     *            FROM domain. If you choose <code>RejectMessage</code>, Amazon
     *            SES will return a <code>MailFromDomainNotVerified</code> error
     *            and not send the email.
     *            </p>
     *            <p>
     *            The action specified in <code>BehaviorOnMXFailure</code> is
     *            taken when the custom MAIL FROM domain setup is in the
     *            <code>Pending</code>, <code>Failed</code>, and
     *            <code>TemporaryFailure</code> states.
     *            </p>
     * @see BehaviorOnMXFailure
     */
    public void setBehaviorOnMXFailure(String behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure;
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully
     * read the required MX record when you send an email. If you choose
     * <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     * subdomain of that) as the MAIL FROM domain. If you choose
     * <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when
     * the custom MAIL FROM domain setup is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @param behaviorOnMXFailure <p>
     *            The action that you want Amazon SES to take if it cannot
     *            successfully read the required MX record when you send an
     *            email. If you choose <code>UseDefaultValue</code>, Amazon SES
     *            will use amazonses.com (or a subdomain of that) as the MAIL
     *            FROM domain. If you choose <code>RejectMessage</code>, Amazon
     *            SES will return a <code>MailFromDomainNotVerified</code> error
     *            and not send the email.
     *            </p>
     *            <p>
     *            The action specified in <code>BehaviorOnMXFailure</code> is
     *            taken when the custom MAIL FROM domain setup is in the
     *            <code>Pending</code>, <code>Failed</code>, and
     *            <code>TemporaryFailure</code> states.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BehaviorOnMXFailure
     */
    public SetIdentityMailFromDomainRequest withBehaviorOnMXFailure(String behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure;
        return this;
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully
     * read the required MX record when you send an email. If you choose
     * <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     * subdomain of that) as the MAIL FROM domain. If you choose
     * <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when
     * the custom MAIL FROM domain setup is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @param behaviorOnMXFailure <p>
     *            The action that you want Amazon SES to take if it cannot
     *            successfully read the required MX record when you send an
     *            email. If you choose <code>UseDefaultValue</code>, Amazon SES
     *            will use amazonses.com (or a subdomain of that) as the MAIL
     *            FROM domain. If you choose <code>RejectMessage</code>, Amazon
     *            SES will return a <code>MailFromDomainNotVerified</code> error
     *            and not send the email.
     *            </p>
     *            <p>
     *            The action specified in <code>BehaviorOnMXFailure</code> is
     *            taken when the custom MAIL FROM domain setup is in the
     *            <code>Pending</code>, <code>Failed</code>, and
     *            <code>TemporaryFailure</code> states.
     *            </p>
     * @see BehaviorOnMXFailure
     */
    public void setBehaviorOnMXFailure(BehaviorOnMXFailure behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure.toString();
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully
     * read the required MX record when you send an email. If you choose
     * <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     * subdomain of that) as the MAIL FROM domain. If you choose
     * <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when
     * the custom MAIL FROM domain setup is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @param behaviorOnMXFailure <p>
     *            The action that you want Amazon SES to take if it cannot
     *            successfully read the required MX record when you send an
     *            email. If you choose <code>UseDefaultValue</code>, Amazon SES
     *            will use amazonses.com (or a subdomain of that) as the MAIL
     *            FROM domain. If you choose <code>RejectMessage</code>, Amazon
     *            SES will return a <code>MailFromDomainNotVerified</code> error
     *            and not send the email.
     *            </p>
     *            <p>
     *            The action specified in <code>BehaviorOnMXFailure</code> is
     *            taken when the custom MAIL FROM domain setup is in the
     *            <code>Pending</code>, <code>Failed</code>, and
     *            <code>TemporaryFailure</code> states.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BehaviorOnMXFailure
     */
    public SetIdentityMailFromDomainRequest withBehaviorOnMXFailure(
            BehaviorOnMXFailure behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure.toString();
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
        if (getIdentity() != null)
            sb.append("Identity: " + getIdentity() + ",");
        if (getMailFromDomain() != null)
            sb.append("MailFromDomain: " + getMailFromDomain() + ",");
        if (getBehaviorOnMXFailure() != null)
            sb.append("BehaviorOnMXFailure: " + getBehaviorOnMXFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode
                + ((getMailFromDomain() == null) ? 0 : getMailFromDomain().hashCode());
        hashCode = prime * hashCode
                + ((getBehaviorOnMXFailure() == null) ? 0 : getBehaviorOnMXFailure().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityMailFromDomainRequest == false)
            return false;
        SetIdentityMailFromDomainRequest other = (SetIdentityMailFromDomainRequest) obj;

        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getMailFromDomain() == null ^ this.getMailFromDomain() == null)
            return false;
        if (other.getMailFromDomain() != null
                && other.getMailFromDomain().equals(this.getMailFromDomain()) == false)
            return false;
        if (other.getBehaviorOnMXFailure() == null ^ this.getBehaviorOnMXFailure() == null)
            return false;
        if (other.getBehaviorOnMXFailure() != null
                && other.getBehaviorOnMXFailure().equals(this.getBehaviorOnMXFailure()) == false)
            return false;
        return true;
    }
}
