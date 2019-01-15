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
 * Message-related information to include in the Delivery Status Notification
 * (DSN) when an email that Amazon SES receives on your behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class MessageDsn implements Serializable {
    /**
     * <p>
     * The reporting MTA that attempted to deliver the message, formatted as
     * specified in <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     * <code>mta-name-type; mta-name</code>). The default value is
     * <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * </p>
     */
    private String reportingMta;

    /**
     * <p>
     * When the message was received by the reporting mail transfer agent (MTA),
     * in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time
     * format.
     * </p>
     */
    private java.util.Date arrivalDate;

    /**
     * <p>
     * Additional X-headers to include in the DSN.
     * </p>
     */
    private java.util.List<ExtensionField> extensionFields = new java.util.ArrayList<ExtensionField>();

    /**
     * <p>
     * The reporting MTA that attempted to deliver the message, formatted as
     * specified in <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     * <code>mta-name-type; mta-name</code>). The default value is
     * <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * </p>
     *
     * @return <p>
     *         The reporting MTA that attempted to deliver the message,
     *         formatted as specified in <a
     *         href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     *         <code>mta-name-type; mta-name</code>). The default value is
     *         <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     *         </p>
     */
    public String getReportingMta() {
        return reportingMta;
    }

    /**
     * <p>
     * The reporting MTA that attempted to deliver the message, formatted as
     * specified in <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     * <code>mta-name-type; mta-name</code>). The default value is
     * <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * </p>
     *
     * @param reportingMta <p>
     *            The reporting MTA that attempted to deliver the message,
     *            formatted as specified in <a
     *            href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     *            <code>mta-name-type; mta-name</code>). The default value is
     *            <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     *            </p>
     */
    public void setReportingMta(String reportingMta) {
        this.reportingMta = reportingMta;
    }

    /**
     * <p>
     * The reporting MTA that attempted to deliver the message, formatted as
     * specified in <a href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     * <code>mta-name-type; mta-name</code>). The default value is
     * <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportingMta <p>
     *            The reporting MTA that attempted to deliver the message,
     *            formatted as specified in <a
     *            href="https://tools.ietf.org/html/rfc3464">RFC 3464</a> (
     *            <code>mta-name-type; mta-name</code>). The default value is
     *            <code>dns; inbound-smtp.[region].amazonaws.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageDsn withReportingMta(String reportingMta) {
        this.reportingMta = reportingMta;
        return this;
    }

    /**
     * <p>
     * When the message was received by the reporting mail transfer agent (MTA),
     * in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time
     * format.
     * </p>
     *
     * @return <p>
     *         When the message was received by the reporting mail transfer
     *         agent (MTA), in <a
     *         href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time
     *         format.
     *         </p>
     */
    public java.util.Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * <p>
     * When the message was received by the reporting mail transfer agent (MTA),
     * in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time
     * format.
     * </p>
     *
     * @param arrivalDate <p>
     *            When the message was received by the reporting mail transfer
     *            agent (MTA), in <a
     *            href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     *            date-time format.
     *            </p>
     */
    public void setArrivalDate(java.util.Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * <p>
     * When the message was received by the reporting mail transfer agent (MTA),
     * in <a href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a> date-time
     * format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arrivalDate <p>
     *            When the message was received by the reporting mail transfer
     *            agent (MTA), in <a
     *            href="https://www.ietf.org/rfc/rfc0822.txt">RFC 822</a>
     *            date-time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageDsn withArrivalDate(java.util.Date arrivalDate) {
        this.arrivalDate = arrivalDate;
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
    public MessageDsn withExtensionFields(ExtensionField... extensionFields) {
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
    public MessageDsn withExtensionFields(java.util.Collection<ExtensionField> extensionFields) {
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
        if (getReportingMta() != null)
            sb.append("ReportingMta: " + getReportingMta() + ",");
        if (getArrivalDate() != null)
            sb.append("ArrivalDate: " + getArrivalDate() + ",");
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
                + ((getReportingMta() == null) ? 0 : getReportingMta().hashCode());
        hashCode = prime * hashCode
                + ((getArrivalDate() == null) ? 0 : getArrivalDate().hashCode());
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

        if (obj instanceof MessageDsn == false)
            return false;
        MessageDsn other = (MessageDsn) obj;

        if (other.getReportingMta() == null ^ this.getReportingMta() == null)
            return false;
        if (other.getReportingMta() != null
                && other.getReportingMta().equals(this.getReportingMta()) == false)
            return false;
        if (other.getArrivalDate() == null ^ this.getArrivalDate() == null)
            return false;
        if (other.getArrivalDate() != null
                && other.getArrivalDate().equals(this.getArrivalDate()) == false)
            return false;
        if (other.getExtensionFields() == null ^ this.getExtensionFields() == null)
            return false;
        if (other.getExtensionFields() != null
                && other.getExtensionFields().equals(this.getExtensionFields()) == false)
            return false;
        return true;
    }
}
