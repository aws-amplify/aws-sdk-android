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
 * Recipient-related information to include in the Delivery Status Notification
 * (DSN) when an email that Amazon SES receives on your behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class RecipientDsnFields implements Serializable {
    /**
     * <p>
     * The email address that the message was ultimately delivered to. This
     * corresponds to the <code>Final-Recipient</code> in the DSN. If not
     * specified, <code>FinalRecipient</code> will be set to the
     * <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code>
     * structure. Either <code>FinalRecipient</code> or the recipient in
     * <code>BouncedRecipientInfo</code> must be a recipient of the original
     * bounced message.
     * </p>
     * <note>
     * <p>
     * Do not prepend the <code>FinalRecipient</code> email address with
     * <code>rfc 822;</code>, as described in <a
     * href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     * </p>
     * </note>
     */
    private String finalRecipient;

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a
     * result of its attempt to deliver the message to the recipient address.
     * This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>failed, delayed, delivered, relayed, expanded
     */
    private String action;

    /**
     * <p>
     * The MTA to which the remote MTA attempted to deliver the message,
     * formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     * <code>mta-name-type; mta-name</code>). This parameter typically applies
     * only to propagating synchronous bounces.
     * </p>
     */
    private String remoteMta;

    /**
     * <p>
     * The status code that indicates what went wrong. This is required by <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * An extended explanation of what went wrong; this is usually an SMTP
     * response. See <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>
     * for the correct formatting of this parameter.
     * </p>
     */
    private String diagnosticCode;

    /**
     * <p>
     * The time the final delivery attempt was made, in <a
     * href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * </p>
     */
    private java.util.Date lastAttemptDate;

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     */
    private java.util.List<ExtensionField> extensionFields = new java.util.ArrayList<ExtensionField>();

    /**
     * <p>
     * The email address that the message was ultimately delivered to. This
     * corresponds to the <code>Final-Recipient</code> in the DSN. If not
     * specified, <code>FinalRecipient</code> will be set to the
     * <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code>
     * structure. Either <code>FinalRecipient</code> or the recipient in
     * <code>BouncedRecipientInfo</code> must be a recipient of the original
     * bounced message.
     * </p>
     * <note>
     * <p>
     * Do not prepend the <code>FinalRecipient</code> email address with
     * <code>rfc 822;</code>, as described in <a
     * href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The email address that the message was ultimately delivered to.
     *         This corresponds to the <code>Final-Recipient</code> in the DSN.
     *         If not specified, <code>FinalRecipient</code> will be set to the
     *         <code>Recipient</code> specified in the
     *         <code>BouncedRecipientInfo</code> structure. Either
     *         <code>FinalRecipient</code> or the recipient in
     *         <code>BouncedRecipientInfo</code> must be a recipient of the
     *         original bounced message.
     *         </p>
     *         <note>
     *         <p>
     *         Do not prepend the <code>FinalRecipient</code> email address with
     *         <code>rfc 822;</code>, as described in <a
     *         href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     *         </p>
     *         </note>
     */
    public String getFinalRecipient() {
        return finalRecipient;
    }

    /**
     * <p>
     * The email address that the message was ultimately delivered to. This
     * corresponds to the <code>Final-Recipient</code> in the DSN. If not
     * specified, <code>FinalRecipient</code> will be set to the
     * <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code>
     * structure. Either <code>FinalRecipient</code> or the recipient in
     * <code>BouncedRecipientInfo</code> must be a recipient of the original
     * bounced message.
     * </p>
     * <note>
     * <p>
     * Do not prepend the <code>FinalRecipient</code> email address with
     * <code>rfc 822;</code>, as described in <a
     * href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     * </p>
     * </note>
     *
     * @param finalRecipient <p>
     *            The email address that the message was ultimately delivered
     *            to. This corresponds to the <code>Final-Recipient</code> in
     *            the DSN. If not specified, <code>FinalRecipient</code> will be
     *            set to the <code>Recipient</code> specified in the
     *            <code>BouncedRecipientInfo</code> structure. Either
     *            <code>FinalRecipient</code> or the recipient in
     *            <code>BouncedRecipientInfo</code> must be a recipient of the
     *            original bounced message.
     *            </p>
     *            <note>
     *            <p>
     *            Do not prepend the <code>FinalRecipient</code> email address
     *            with <code>rfc 822;</code>, as described in <a
     *            href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     *            </p>
     *            </note>
     */
    public void setFinalRecipient(String finalRecipient) {
        this.finalRecipient = finalRecipient;
    }

    /**
     * <p>
     * The email address that the message was ultimately delivered to. This
     * corresponds to the <code>Final-Recipient</code> in the DSN. If not
     * specified, <code>FinalRecipient</code> will be set to the
     * <code>Recipient</code> specified in the <code>BouncedRecipientInfo</code>
     * structure. Either <code>FinalRecipient</code> or the recipient in
     * <code>BouncedRecipientInfo</code> must be a recipient of the original
     * bounced message.
     * </p>
     * <note>
     * <p>
     * Do not prepend the <code>FinalRecipient</code> email address with
     * <code>rfc 822;</code>, as described in <a
     * href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalRecipient <p>
     *            The email address that the message was ultimately delivered
     *            to. This corresponds to the <code>Final-Recipient</code> in
     *            the DSN. If not specified, <code>FinalRecipient</code> will be
     *            set to the <code>Recipient</code> specified in the
     *            <code>BouncedRecipientInfo</code> structure. Either
     *            <code>FinalRecipient</code> or the recipient in
     *            <code>BouncedRecipientInfo</code> must be a recipient of the
     *            original bounced message.
     *            </p>
     *            <note>
     *            <p>
     *            Do not prepend the <code>FinalRecipient</code> email address
     *            with <code>rfc 822;</code>, as described in <a
     *            href="https://tools.ietf.org/html/rfc3798">RFC 3798</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecipientDsnFields withFinalRecipient(String finalRecipient) {
        this.finalRecipient = finalRecipient;
        return this;
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a
     * result of its attempt to deliver the message to the recipient address.
     * This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>failed, delayed, delivered, relayed, expanded
     *
     * @return <p>
     *         The action performed by the reporting mail transfer agent (MTA)
     *         as a result of its attempt to deliver the message to the
     *         recipient address. This is required by <a
     *         href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     *         </p>
     * @see DsnAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a
     * result of its attempt to deliver the message to the recipient address.
     * This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>failed, delayed, delivered, relayed, expanded
     *
     * @param action <p>
     *            The action performed by the reporting mail transfer agent
     *            (MTA) as a result of its attempt to deliver the message to the
     *            recipient address. This is required by <a
     *            href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     *            </p>
     * @see DsnAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a
     * result of its attempt to deliver the message to the recipient address.
     * This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>failed, delayed, delivered, relayed, expanded
     *
     * @param action <p>
     *            The action performed by the reporting mail transfer agent
     *            (MTA) as a result of its attempt to deliver the message to the
     *            recipient address. This is required by <a
     *            href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DsnAction
     */
    public RecipientDsnFields withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a
     * result of its attempt to deliver the message to the recipient address.
     * This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>failed, delayed, delivered, relayed, expanded
     *
     * @param action <p>
     *            The action performed by the reporting mail transfer agent
     *            (MTA) as a result of its attempt to deliver the message to the
     *            recipient address. This is required by <a
     *            href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     *            </p>
     * @see DsnAction
     */
    public void setAction(DsnAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action performed by the reporting mail transfer agent (MTA) as a
     * result of its attempt to deliver the message to the recipient address.
     * This is required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     * 3464</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>failed, delayed, delivered, relayed, expanded
     *
     * @param action <p>
     *            The action performed by the reporting mail transfer agent
     *            (MTA) as a result of its attempt to deliver the message to the
     *            recipient address. This is required by <a
     *            href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DsnAction
     */
    public RecipientDsnFields withAction(DsnAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The MTA to which the remote MTA attempted to deliver the message,
     * formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     * <code>mta-name-type; mta-name</code>). This parameter typically applies
     * only to propagating synchronous bounces.
     * </p>
     *
     * @return <p>
     *         The MTA to which the remote MTA attempted to deliver the message,
     *         formatted as specified in <a
     *         href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     *         <code>mta-name-type; mta-name</code>). This parameter typically
     *         applies only to propagating synchronous bounces.
     *         </p>
     */
    public String getRemoteMta() {
        return remoteMta;
    }

    /**
     * <p>
     * The MTA to which the remote MTA attempted to deliver the message,
     * formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     * <code>mta-name-type; mta-name</code>). This parameter typically applies
     * only to propagating synchronous bounces.
     * </p>
     *
     * @param remoteMta <p>
     *            The MTA to which the remote MTA attempted to deliver the
     *            message, formatted as specified in <a
     *            href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     *            <code>mta-name-type; mta-name</code>). This parameter
     *            typically applies only to propagating synchronous bounces.
     *            </p>
     */
    public void setRemoteMta(String remoteMta) {
        this.remoteMta = remoteMta;
    }

    /**
     * <p>
     * The MTA to which the remote MTA attempted to deliver the message,
     * formatted as specified in <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     * <code>mta-name-type; mta-name</code>). This parameter typically applies
     * only to propagating synchronous bounces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remoteMta <p>
     *            The MTA to which the remote MTA attempted to deliver the
     *            message, formatted as specified in <a
     *            href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     *            <code>mta-name-type; mta-name</code>). This parameter
     *            typically applies only to propagating synchronous bounces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecipientDsnFields withRemoteMta(String remoteMta) {
        this.remoteMta = remoteMta;
        return this;
    }

    /**
     * <p>
     * The status code that indicates what went wrong. This is required by <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     *
     * @return <p>
     *         The status code that indicates what went wrong. This is required
     *         by <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status code that indicates what went wrong. This is required by <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     *
     * @param status <p>
     *            The status code that indicates what went wrong. This is
     *            required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     *            3464</a>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code that indicates what went wrong. This is required by <a
     * href="https://tools.ietf.org/html/rfc3464">RFC 3464</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status code that indicates what went wrong. This is
     *            required by <a href="https://tools.ietf.org/html/rfc3464">RFC
     *            3464</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecipientDsnFields withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * An extended explanation of what went wrong; this is usually an SMTP
     * response. See <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>
     * for the correct formatting of this parameter.
     * </p>
     *
     * @return <p>
     *         An extended explanation of what went wrong; this is usually an
     *         SMTP response. See <a
     *         href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for the
     *         correct formatting of this parameter.
     *         </p>
     */
    public String getDiagnosticCode() {
        return diagnosticCode;
    }

    /**
     * <p>
     * An extended explanation of what went wrong; this is usually an SMTP
     * response. See <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>
     * for the correct formatting of this parameter.
     * </p>
     *
     * @param diagnosticCode <p>
     *            An extended explanation of what went wrong; this is usually an
     *            SMTP response. See <a
     *            href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for
     *            the correct formatting of this parameter.
     *            </p>
     */
    public void setDiagnosticCode(String diagnosticCode) {
        this.diagnosticCode = diagnosticCode;
    }

    /**
     * <p>
     * An extended explanation of what went wrong; this is usually an SMTP
     * response. See <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>
     * for the correct formatting of this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diagnosticCode <p>
     *            An extended explanation of what went wrong; this is usually an
     *            SMTP response. See <a
     *            href="https://tools.ietf.org/html/rfc3463">RFC 3463</a> for
     *            the correct formatting of this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecipientDsnFields withDiagnosticCode(String diagnosticCode) {
        this.diagnosticCode = diagnosticCode;
        return this;
    }

    /**
     * <p>
     * The time the final delivery attempt was made, in <a
     * href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * </p>
     *
     * @return <p>
     *         The time the final delivery attempt was made, in <a
     *         href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time
     *         format.
     *         </p>
     */
    public java.util.Date getLastAttemptDate() {
        return lastAttemptDate;
    }

    /**
     * <p>
     * The time the final delivery attempt was made, in <a
     * href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * </p>
     *
     * @param lastAttemptDate <p>
     *            The time the final delivery attempt was made, in <a
     *            href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     *            date-time format.
     *            </p>
     */
    public void setLastAttemptDate(java.util.Date lastAttemptDate) {
        this.lastAttemptDate = lastAttemptDate;
    }

    /**
     * <p>
     * The time the final delivery attempt was made, in <a
     * href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAttemptDate <p>
     *            The time the final delivery attempt was made, in <a
     *            href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     *            date-time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecipientDsnFields withLastAttemptDate(java.util.Date lastAttemptDate) {
        this.lastAttemptDate = lastAttemptDate;
        return this;
    }

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     *
     * @return <p>
     *         Additional X-headers to include in the DSN.
     *         </p>
     */
    public java.util.List<ExtensionField> getExtensionFields() {
        return extensionFields;
    }

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     *
     * @param extensionFields <p>
     *            Additional X-headers to include in the DSN.
     *            </p>
     */
    public void setExtensionFields(java.util.Collection<ExtensionField> extensionFields) {
        if (extensionFields == null) {
            this.extensionFields = null;
            return;
        }

        this.extensionFields = new java.util.ArrayList<ExtensionField>(extensionFields);
    }

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extensionFields <p>
     *            Additional X-headers to include in the DSN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecipientDsnFields withExtensionFields(ExtensionField... extensionFields) {
        if (getExtensionFields() == null) {
            this.extensionFields = new java.util.ArrayList<ExtensionField>(extensionFields.length);
        }
        for (ExtensionField value : extensionFields) {
            this.extensionFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extensionFields <p>
     *            Additional X-headers to include in the DSN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecipientDsnFields withExtensionFields(
            java.util.Collection<ExtensionField> extensionFields) {
        setExtensionFields(extensionFields);
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
        if (getFinalRecipient() != null)
            sb.append("FinalRecipient: " + getFinalRecipient() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getRemoteMta() != null)
            sb.append("RemoteMta: " + getRemoteMta() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDiagnosticCode() != null)
            sb.append("DiagnosticCode: " + getDiagnosticCode() + ",");
        if (getLastAttemptDate() != null)
            sb.append("LastAttemptDate: " + getLastAttemptDate() + ",");
        if (getExtensionFields() != null)
            sb.append("ExtensionFields: " + getExtensionFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFinalRecipient() == null) ? 0 : getFinalRecipient().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRemoteMta() == null) ? 0 : getRemoteMta().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDiagnosticCode() == null) ? 0 : getDiagnosticCode().hashCode());
        hashCode = prime * hashCode
                + ((getLastAttemptDate() == null) ? 0 : getLastAttemptDate().hashCode());
        hashCode = prime * hashCode
                + ((getExtensionFields() == null) ? 0 : getExtensionFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecipientDsnFields == false)
            return false;
        RecipientDsnFields other = (RecipientDsnFields) obj;

        if (other.getFinalRecipient() == null ^ this.getFinalRecipient() == null)
            return false;
        if (other.getFinalRecipient() != null
                && other.getFinalRecipient().equals(this.getFinalRecipient()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRemoteMta() == null ^ this.getRemoteMta() == null)
            return false;
        if (other.getRemoteMta() != null
                && other.getRemoteMta().equals(this.getRemoteMta()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDiagnosticCode() == null ^ this.getDiagnosticCode() == null)
            return false;
        if (other.getDiagnosticCode() != null
                && other.getDiagnosticCode().equals(this.getDiagnosticCode()) == false)
            return false;
        if (other.getLastAttemptDate() == null ^ this.getLastAttemptDate() == null)
            return false;
        if (other.getLastAttemptDate() != null
                && other.getLastAttemptDate().equals(this.getLastAttemptDate()) == false)
            return false;
        if (other.getExtensionFields() == null ^ this.getExtensionFields() == null)
            return false;
        if (other.getExtensionFields() != null
                && other.getExtensionFields().equals(this.getExtensionFields()) == false)
            return false;
        return true;
    }
}
