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
 * Represents the custom MAIL FROM domain attributes of a verified identity
 * (email address or domain).
 * </p>
 */
public class IdentityMailFromDomainAttributes implements Serializable {
    /**
     * <p>
     * The custom MAIL FROM domain that the identity is configured to use.
     * </p>
     */
    private String mailFromDomain;

    /**
     * <p>
     * The state that indicates whether Amazon SES has successfully read the MX
     * record required for custom MAIL FROM domain setup. If the state is
     * <code>Success</code>, Amazon SES uses the specified custom MAIL FROM
     * domain when the verified identity sends an email. All other states
     * indicate that Amazon SES takes the action described by
     * <code>BehaviorOnMXFailure</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure
     */
    private String mailFromDomainStatus;

    /**
     * <p>
     * The action that Amazon SES takes if it cannot successfully read the
     * required MX record when you send an email. A value of
     * <code>UseDefaultValue</code> indicates that if Amazon SES cannot read the
     * required MX record, it uses amazonses.com (or a subdomain of that) as the
     * MAIL FROM domain. A value of <code>RejectMessage</code> indicates that if
     * Amazon SES cannot read the required MX record, Amazon SES returns a
     * <code>MailFromDomainNotVerified</code> error and does not send the email.
     * </p>
     * <p>
     * The custom MAIL FROM setup states that result in this behavior are
     * <code>Pending</code>, <code>Failed</code>, and
     * <code>TemporaryFailure</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     */
    private String behaviorOnMXFailure;

    /**
     * <p>
     * The custom MAIL FROM domain that the identity is configured to use.
     * </p>
     *
     * @return <p>
     *         The custom MAIL FROM domain that the identity is configured to
     *         use.
     *         </p>
     */
    public String getMailFromDomain() {
        return mailFromDomain;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that the identity is configured to use.
     * </p>
     *
     * @param mailFromDomain <p>
     *            The custom MAIL FROM domain that the identity is configured to
     *            use.
     *            </p>
     */
    public void setMailFromDomain(String mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that the identity is configured to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mailFromDomain <p>
     *            The custom MAIL FROM domain that the identity is configured to
     *            use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityMailFromDomainAttributes withMailFromDomain(String mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
        return this;
    }

    /**
     * <p>
     * The state that indicates whether Amazon SES has successfully read the MX
     * record required for custom MAIL FROM domain setup. If the state is
     * <code>Success</code>, Amazon SES uses the specified custom MAIL FROM
     * domain when the verified identity sends an email. All other states
     * indicate that Amazon SES takes the action described by
     * <code>BehaviorOnMXFailure</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure
     *
     * @return <p>
     *         The state that indicates whether Amazon SES has successfully read
     *         the MX record required for custom MAIL FROM domain setup. If the
     *         state is <code>Success</code>, Amazon SES uses the specified
     *         custom MAIL FROM domain when the verified identity sends an
     *         email. All other states indicate that Amazon SES takes the action
     *         described by <code>BehaviorOnMXFailure</code>.
     *         </p>
     * @see CustomMailFromStatus
     */
    public String getMailFromDomainStatus() {
        return mailFromDomainStatus;
    }

    /**
     * <p>
     * The state that indicates whether Amazon SES has successfully read the MX
     * record required for custom MAIL FROM domain setup. If the state is
     * <code>Success</code>, Amazon SES uses the specified custom MAIL FROM
     * domain when the verified identity sends an email. All other states
     * indicate that Amazon SES takes the action described by
     * <code>BehaviorOnMXFailure</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure
     *
     * @param mailFromDomainStatus <p>
     *            The state that indicates whether Amazon SES has successfully
     *            read the MX record required for custom MAIL FROM domain setup.
     *            If the state is <code>Success</code>, Amazon SES uses the
     *            specified custom MAIL FROM domain when the verified identity
     *            sends an email. All other states indicate that Amazon SES
     *            takes the action described by <code>BehaviorOnMXFailure</code>
     *            .
     *            </p>
     * @see CustomMailFromStatus
     */
    public void setMailFromDomainStatus(String mailFromDomainStatus) {
        this.mailFromDomainStatus = mailFromDomainStatus;
    }

    /**
     * <p>
     * The state that indicates whether Amazon SES has successfully read the MX
     * record required for custom MAIL FROM domain setup. If the state is
     * <code>Success</code>, Amazon SES uses the specified custom MAIL FROM
     * domain when the verified identity sends an email. All other states
     * indicate that Amazon SES takes the action described by
     * <code>BehaviorOnMXFailure</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure
     *
     * @param mailFromDomainStatus <p>
     *            The state that indicates whether Amazon SES has successfully
     *            read the MX record required for custom MAIL FROM domain setup.
     *            If the state is <code>Success</code>, Amazon SES uses the
     *            specified custom MAIL FROM domain when the verified identity
     *            sends an email. All other states indicate that Amazon SES
     *            takes the action described by <code>BehaviorOnMXFailure</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomMailFromStatus
     */
    public IdentityMailFromDomainAttributes withMailFromDomainStatus(String mailFromDomainStatus) {
        this.mailFromDomainStatus = mailFromDomainStatus;
        return this;
    }

    /**
     * <p>
     * The state that indicates whether Amazon SES has successfully read the MX
     * record required for custom MAIL FROM domain setup. If the state is
     * <code>Success</code>, Amazon SES uses the specified custom MAIL FROM
     * domain when the verified identity sends an email. All other states
     * indicate that Amazon SES takes the action described by
     * <code>BehaviorOnMXFailure</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure
     *
     * @param mailFromDomainStatus <p>
     *            The state that indicates whether Amazon SES has successfully
     *            read the MX record required for custom MAIL FROM domain setup.
     *            If the state is <code>Success</code>, Amazon SES uses the
     *            specified custom MAIL FROM domain when the verified identity
     *            sends an email. All other states indicate that Amazon SES
     *            takes the action described by <code>BehaviorOnMXFailure</code>
     *            .
     *            </p>
     * @see CustomMailFromStatus
     */
    public void setMailFromDomainStatus(CustomMailFromStatus mailFromDomainStatus) {
        this.mailFromDomainStatus = mailFromDomainStatus.toString();
    }

    /**
     * <p>
     * The state that indicates whether Amazon SES has successfully read the MX
     * record required for custom MAIL FROM domain setup. If the state is
     * <code>Success</code>, Amazon SES uses the specified custom MAIL FROM
     * domain when the verified identity sends an email. All other states
     * indicate that Amazon SES takes the action described by
     * <code>BehaviorOnMXFailure</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure
     *
     * @param mailFromDomainStatus <p>
     *            The state that indicates whether Amazon SES has successfully
     *            read the MX record required for custom MAIL FROM domain setup.
     *            If the state is <code>Success</code>, Amazon SES uses the
     *            specified custom MAIL FROM domain when the verified identity
     *            sends an email. All other states indicate that Amazon SES
     *            takes the action described by <code>BehaviorOnMXFailure</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomMailFromStatus
     */
    public IdentityMailFromDomainAttributes withMailFromDomainStatus(
            CustomMailFromStatus mailFromDomainStatus) {
        this.mailFromDomainStatus = mailFromDomainStatus.toString();
        return this;
    }

    /**
     * <p>
     * The action that Amazon SES takes if it cannot successfully read the
     * required MX record when you send an email. A value of
     * <code>UseDefaultValue</code> indicates that if Amazon SES cannot read the
     * required MX record, it uses amazonses.com (or a subdomain of that) as the
     * MAIL FROM domain. A value of <code>RejectMessage</code> indicates that if
     * Amazon SES cannot read the required MX record, Amazon SES returns a
     * <code>MailFromDomainNotVerified</code> error and does not send the email.
     * </p>
     * <p>
     * The custom MAIL FROM setup states that result in this behavior are
     * <code>Pending</code>, <code>Failed</code>, and
     * <code>TemporaryFailure</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @return <p>
     *         The action that Amazon SES takes if it cannot successfully read
     *         the required MX record when you send an email. A value of
     *         <code>UseDefaultValue</code> indicates that if Amazon SES cannot
     *         read the required MX record, it uses amazonses.com (or a
     *         subdomain of that) as the MAIL FROM domain. A value of
     *         <code>RejectMessage</code> indicates that if Amazon SES cannot
     *         read the required MX record, Amazon SES returns a
     *         <code>MailFromDomainNotVerified</code> error and does not send
     *         the email.
     *         </p>
     *         <p>
     *         The custom MAIL FROM setup states that result in this behavior
     *         are <code>Pending</code>, <code>Failed</code>, and
     *         <code>TemporaryFailure</code>.
     *         </p>
     * @see BehaviorOnMXFailure
     */
    public String getBehaviorOnMXFailure() {
        return behaviorOnMXFailure;
    }

    /**
     * <p>
     * The action that Amazon SES takes if it cannot successfully read the
     * required MX record when you send an email. A value of
     * <code>UseDefaultValue</code> indicates that if Amazon SES cannot read the
     * required MX record, it uses amazonses.com (or a subdomain of that) as the
     * MAIL FROM domain. A value of <code>RejectMessage</code> indicates that if
     * Amazon SES cannot read the required MX record, Amazon SES returns a
     * <code>MailFromDomainNotVerified</code> error and does not send the email.
     * </p>
     * <p>
     * The custom MAIL FROM setup states that result in this behavior are
     * <code>Pending</code>, <code>Failed</code>, and
     * <code>TemporaryFailure</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @param behaviorOnMXFailure <p>
     *            The action that Amazon SES takes if it cannot successfully
     *            read the required MX record when you send an email. A value of
     *            <code>UseDefaultValue</code> indicates that if Amazon SES
     *            cannot read the required MX record, it uses amazonses.com (or
     *            a subdomain of that) as the MAIL FROM domain. A value of
     *            <code>RejectMessage</code> indicates that if Amazon SES cannot
     *            read the required MX record, Amazon SES returns a
     *            <code>MailFromDomainNotVerified</code> error and does not send
     *            the email.
     *            </p>
     *            <p>
     *            The custom MAIL FROM setup states that result in this behavior
     *            are <code>Pending</code>, <code>Failed</code>, and
     *            <code>TemporaryFailure</code>.
     *            </p>
     * @see BehaviorOnMXFailure
     */
    public void setBehaviorOnMXFailure(String behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure;
    }

    /**
     * <p>
     * The action that Amazon SES takes if it cannot successfully read the
     * required MX record when you send an email. A value of
     * <code>UseDefaultValue</code> indicates that if Amazon SES cannot read the
     * required MX record, it uses amazonses.com (or a subdomain of that) as the
     * MAIL FROM domain. A value of <code>RejectMessage</code> indicates that if
     * Amazon SES cannot read the required MX record, Amazon SES returns a
     * <code>MailFromDomainNotVerified</code> error and does not send the email.
     * </p>
     * <p>
     * The custom MAIL FROM setup states that result in this behavior are
     * <code>Pending</code>, <code>Failed</code>, and
     * <code>TemporaryFailure</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @param behaviorOnMXFailure <p>
     *            The action that Amazon SES takes if it cannot successfully
     *            read the required MX record when you send an email. A value of
     *            <code>UseDefaultValue</code> indicates that if Amazon SES
     *            cannot read the required MX record, it uses amazonses.com (or
     *            a subdomain of that) as the MAIL FROM domain. A value of
     *            <code>RejectMessage</code> indicates that if Amazon SES cannot
     *            read the required MX record, Amazon SES returns a
     *            <code>MailFromDomainNotVerified</code> error and does not send
     *            the email.
     *            </p>
     *            <p>
     *            The custom MAIL FROM setup states that result in this behavior
     *            are <code>Pending</code>, <code>Failed</code>, and
     *            <code>TemporaryFailure</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BehaviorOnMXFailure
     */
    public IdentityMailFromDomainAttributes withBehaviorOnMXFailure(String behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure;
        return this;
    }

    /**
     * <p>
     * The action that Amazon SES takes if it cannot successfully read the
     * required MX record when you send an email. A value of
     * <code>UseDefaultValue</code> indicates that if Amazon SES cannot read the
     * required MX record, it uses amazonses.com (or a subdomain of that) as the
     * MAIL FROM domain. A value of <code>RejectMessage</code> indicates that if
     * Amazon SES cannot read the required MX record, Amazon SES returns a
     * <code>MailFromDomainNotVerified</code> error and does not send the email.
     * </p>
     * <p>
     * The custom MAIL FROM setup states that result in this behavior are
     * <code>Pending</code>, <code>Failed</code>, and
     * <code>TemporaryFailure</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @param behaviorOnMXFailure <p>
     *            The action that Amazon SES takes if it cannot successfully
     *            read the required MX record when you send an email. A value of
     *            <code>UseDefaultValue</code> indicates that if Amazon SES
     *            cannot read the required MX record, it uses amazonses.com (or
     *            a subdomain of that) as the MAIL FROM domain. A value of
     *            <code>RejectMessage</code> indicates that if Amazon SES cannot
     *            read the required MX record, Amazon SES returns a
     *            <code>MailFromDomainNotVerified</code> error and does not send
     *            the email.
     *            </p>
     *            <p>
     *            The custom MAIL FROM setup states that result in this behavior
     *            are <code>Pending</code>, <code>Failed</code>, and
     *            <code>TemporaryFailure</code>.
     *            </p>
     * @see BehaviorOnMXFailure
     */
    public void setBehaviorOnMXFailure(BehaviorOnMXFailure behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure.toString();
    }

    /**
     * <p>
     * The action that Amazon SES takes if it cannot successfully read the
     * required MX record when you send an email. A value of
     * <code>UseDefaultValue</code> indicates that if Amazon SES cannot read the
     * required MX record, it uses amazonses.com (or a subdomain of that) as the
     * MAIL FROM domain. A value of <code>RejectMessage</code> indicates that if
     * Amazon SES cannot read the required MX record, Amazon SES returns a
     * <code>MailFromDomainNotVerified</code> error and does not send the email.
     * </p>
     * <p>
     * The custom MAIL FROM setup states that result in this behavior are
     * <code>Pending</code>, <code>Failed</code>, and
     * <code>TemporaryFailure</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UseDefaultValue, RejectMessage
     *
     * @param behaviorOnMXFailure <p>
     *            The action that Amazon SES takes if it cannot successfully
     *            read the required MX record when you send an email. A value of
     *            <code>UseDefaultValue</code> indicates that if Amazon SES
     *            cannot read the required MX record, it uses amazonses.com (or
     *            a subdomain of that) as the MAIL FROM domain. A value of
     *            <code>RejectMessage</code> indicates that if Amazon SES cannot
     *            read the required MX record, Amazon SES returns a
     *            <code>MailFromDomainNotVerified</code> error and does not send
     *            the email.
     *            </p>
     *            <p>
     *            The custom MAIL FROM setup states that result in this behavior
     *            are <code>Pending</code>, <code>Failed</code>, and
     *            <code>TemporaryFailure</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BehaviorOnMXFailure
     */
    public IdentityMailFromDomainAttributes withBehaviorOnMXFailure(
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
        if (getMailFromDomain() != null)
            sb.append("MailFromDomain: " + getMailFromDomain() + ",");
        if (getMailFromDomainStatus() != null)
            sb.append("MailFromDomainStatus: " + getMailFromDomainStatus() + ",");
        if (getBehaviorOnMXFailure() != null)
            sb.append("BehaviorOnMXFailure: " + getBehaviorOnMXFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMailFromDomain() == null) ? 0 : getMailFromDomain().hashCode());
        hashCode = prime * hashCode
                + ((getMailFromDomainStatus() == null) ? 0 : getMailFromDomainStatus().hashCode());
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

        if (obj instanceof IdentityMailFromDomainAttributes == false)
            return false;
        IdentityMailFromDomainAttributes other = (IdentityMailFromDomainAttributes) obj;

        if (other.getMailFromDomain() == null ^ this.getMailFromDomain() == null)
            return false;
        if (other.getMailFromDomain() != null
                && other.getMailFromDomain().equals(this.getMailFromDomain()) == false)
            return false;
        if (other.getMailFromDomainStatus() == null ^ this.getMailFromDomainStatus() == null)
            return false;
        if (other.getMailFromDomainStatus() != null
                && other.getMailFromDomainStatus().equals(this.getMailFromDomainStatus()) == false)
            return false;
        if (other.getBehaviorOnMXFailure() == null ^ this.getBehaviorOnMXFailure() == null)
            return false;
        if (other.getBehaviorOnMXFailure() != null
                && other.getBehaviorOnMXFailure().equals(this.getBehaviorOnMXFailure()) == false)
            return false;
        return true;
    }
}
