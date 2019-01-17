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
 * Receipt rules enable you to specify which actions Amazon SES should take when
 * it receives mail on behalf of one or more email addresses or domains that you
 * own.
 * </p>
 * <p>
 * Each receipt rule defines a set of email addresses or domains that it applies
 * to. If the email addresses or domains match at least one recipient address of
 * the message, Amazon SES executes all of the receipt rule's actions on the
 * message.
 * </p>
 * <p>
 * For information about setting up receipt rules, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class ReceiptRule implements Serializable {
    /**
     * <p>
     * The name of the receipt rule. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String name;

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is
     * <code>false</code>.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     * bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     */
    private String tlsPolicy;

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies
     * to. If this field is not specified, this rule will match all recipients
     * under all verified domains.
     * </p>
     */
    private java.util.List<String> recipients = new java.util.ArrayList<String>();

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one
     * of the recipient email addresses or domains specified in the receipt
     * rule.
     * </p>
     */
    private java.util.List<ReceiptAction> actions = new java.util.ArrayList<ReceiptAction>();

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are
     * scanned for spam and viruses. The default value is <code>false</code>.
     * </p>
     */
    private Boolean scanEnabled;

    /**
     * <p>
     * The name of the receipt rule. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the receipt rule. The name must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers
     *         (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start and end with a letter or number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 64 characters.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the receipt rule. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @param name <p>
     *            The name of the receipt rule. The name must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Start and end with a letter or number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 64 characters.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the receipt rule. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the receipt rule. The name must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Start and end with a letter or number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 64 characters.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the receipt rule is active. The default
     *         value is <code>false</code>.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the receipt rule is active. The default
     *         value is <code>false</code>.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is
     * <code>false</code>.
     * </p>
     *
     * @param enabled <p>
     *            If <code>true</code>, the receipt rule is active. The default
     *            value is <code>false</code>.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If <code>true</code>, the receipt rule is active. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            If <code>true</code>, the receipt rule is active. The default
     *            value is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     * bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @return <p>
     *         Specifies whether Amazon SES should require that incoming email
     *         is delivered over a connection encrypted with Transport Layer
     *         Security (TLS). If this parameter is set to <code>Require</code>,
     *         Amazon SES will bounce emails that are not received over TLS. The
     *         default is <code>Optional</code>.
     *         </p>
     * @see TlsPolicy
     */
    public String getTlsPolicy() {
        return tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     * bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy <p>
     *            Specifies whether Amazon SES should require that incoming
     *            email is delivered over a connection encrypted with Transport
     *            Layer Security (TLS). If this parameter is set to
     *            <code>Require</code>, Amazon SES will bounce emails that are
     *            not received over TLS. The default is <code>Optional</code>.
     *            </p>
     * @see TlsPolicy
     */
    public void setTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     * bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy <p>
     *            Specifies whether Amazon SES should require that incoming
     *            email is delivered over a connection encrypted with Transport
     *            Layer Security (TLS). If this parameter is set to
     *            <code>Require</code>, Amazon SES will bounce emails that are
     *            not received over TLS. The default is <code>Optional</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TlsPolicy
     */
    public ReceiptRule withTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     * bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy <p>
     *            Specifies whether Amazon SES should require that incoming
     *            email is delivered over a connection encrypted with Transport
     *            Layer Security (TLS). If this parameter is set to
     *            <code>Require</code>, Amazon SES will bounce emails that are
     *            not received over TLS. The default is <code>Optional</code>.
     *            </p>
     * @see TlsPolicy
     */
    public void setTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
    }

    /**
     * <p>
     * Specifies whether Amazon SES should require that incoming email is
     * delivered over a connection encrypted with Transport Layer Security
     * (TLS). If this parameter is set to <code>Require</code>, Amazon SES will
     * bounce emails that are not received over TLS. The default is
     * <code>Optional</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy <p>
     *            Specifies whether Amazon SES should require that incoming
     *            email is delivered over a connection encrypted with Transport
     *            Layer Security (TLS). If this parameter is set to
     *            <code>Require</code>, Amazon SES will bounce emails that are
     *            not received over TLS. The default is <code>Optional</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TlsPolicy
     */
    public ReceiptRule withTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies
     * to. If this field is not specified, this rule will match all recipients
     * under all verified domains.
     * </p>
     *
     * @return <p>
     *         The recipient domains and email addresses that the receipt rule
     *         applies to. If this field is not specified, this rule will match
     *         all recipients under all verified domains.
     *         </p>
     */
    public java.util.List<String> getRecipients() {
        return recipients;
    }

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies
     * to. If this field is not specified, this rule will match all recipients
     * under all verified domains.
     * </p>
     *
     * @param recipients <p>
     *            The recipient domains and email addresses that the receipt
     *            rule applies to. If this field is not specified, this rule
     *            will match all recipients under all verified domains.
     *            </p>
     */
    public void setRecipients(java.util.Collection<String> recipients) {
        if (recipients == null) {
            this.recipients = null;
            return;
        }

        this.recipients = new java.util.ArrayList<String>(recipients);
    }

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies
     * to. If this field is not specified, this rule will match all recipients
     * under all verified domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipients <p>
     *            The recipient domains and email addresses that the receipt
     *            rule applies to. If this field is not specified, this rule
     *            will match all recipients under all verified domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRule withRecipients(String... recipients) {
        if (getRecipients() == null) {
            this.recipients = new java.util.ArrayList<String>(recipients.length);
        }
        for (String value : recipients) {
            this.recipients.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The recipient domains and email addresses that the receipt rule applies
     * to. If this field is not specified, this rule will match all recipients
     * under all verified domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipients <p>
     *            The recipient domains and email addresses that the receipt
     *            rule applies to. If this field is not specified, this rule
     *            will match all recipients under all verified domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRule withRecipients(java.util.Collection<String> recipients) {
        setRecipients(recipients);
        return this;
    }

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one
     * of the recipient email addresses or domains specified in the receipt
     * rule.
     * </p>
     *
     * @return <p>
     *         An ordered list of actions to perform on messages that match at
     *         least one of the recipient email addresses or domains specified
     *         in the receipt rule.
     *         </p>
     */
    public java.util.List<ReceiptAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one
     * of the recipient email addresses or domains specified in the receipt
     * rule.
     * </p>
     *
     * @param actions <p>
     *            An ordered list of actions to perform on messages that match
     *            at least one of the recipient email addresses or domains
     *            specified in the receipt rule.
     *            </p>
     */
    public void setActions(java.util.Collection<ReceiptAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<ReceiptAction>(actions);
    }

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one
     * of the recipient email addresses or domains specified in the receipt
     * rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            An ordered list of actions to perform on messages that match
     *            at least one of the recipient email addresses or domains
     *            specified in the receipt rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRule withActions(ReceiptAction... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<ReceiptAction>(actions.length);
        }
        for (ReceiptAction value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An ordered list of actions to perform on messages that match at least one
     * of the recipient email addresses or domains specified in the receipt
     * rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            An ordered list of actions to perform on messages that match
     *            at least one of the recipient email addresses or domains
     *            specified in the receipt rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRule withActions(java.util.Collection<ReceiptAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are
     * scanned for spam and viruses. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, then messages that this receipt rule
     *         applies to are scanned for spam and viruses. The default value is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isScanEnabled() {
        return scanEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are
     * scanned for spam and viruses. The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, then messages that this receipt rule
     *         applies to are scanned for spam and viruses. The default value is
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getScanEnabled() {
        return scanEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are
     * scanned for spam and viruses. The default value is <code>false</code>.
     * </p>
     *
     * @param scanEnabled <p>
     *            If <code>true</code>, then messages that this receipt rule
     *            applies to are scanned for spam and viruses. The default value
     *            is <code>false</code>.
     *            </p>
     */
    public void setScanEnabled(Boolean scanEnabled) {
        this.scanEnabled = scanEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, then messages that this receipt rule applies to are
     * scanned for spam and viruses. The default value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scanEnabled <p>
     *            If <code>true</code>, then messages that this receipt rule
     *            applies to are scanned for spam and viruses. The default value
     *            is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRule withScanEnabled(Boolean scanEnabled) {
        this.scanEnabled = scanEnabled;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getTlsPolicy() != null)
            sb.append("TlsPolicy: " + getTlsPolicy() + ",");
        if (getRecipients() != null)
            sb.append("Recipients: " + getRecipients() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions() + ",");
        if (getScanEnabled() != null)
            sb.append("ScanEnabled: " + getScanEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getTlsPolicy() == null) ? 0 : getTlsPolicy().hashCode());
        hashCode = prime * hashCode + ((getRecipients() == null) ? 0 : getRecipients().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode
                + ((getScanEnabled() == null) ? 0 : getScanEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiptRule == false)
            return false;
        ReceiptRule other = (ReceiptRule) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getTlsPolicy() == null ^ this.getTlsPolicy() == null)
            return false;
        if (other.getTlsPolicy() != null
                && other.getTlsPolicy().equals(this.getTlsPolicy()) == false)
            return false;
        if (other.getRecipients() == null ^ this.getRecipients() == null)
            return false;
        if (other.getRecipients() != null
                && other.getRecipients().equals(this.getRecipients()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getScanEnabled() == null ^ this.getScanEnabled() == null)
            return false;
        if (other.getScanEnabled() != null
                && other.getScanEnabled().equals(this.getScanEnabled()) == false)
            return false;
        return true;
    }
}
