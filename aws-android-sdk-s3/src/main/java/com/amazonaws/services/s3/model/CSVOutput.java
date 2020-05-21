/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Describes how uncompressed comma-separated values (CSV)-formatted results are
 * formatted.
 * </p>
 */
public class CSVOutput implements Serializable {
    /**
     * <p>
     * Indicates whether to use quotation marks around output fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: Always use quotation marks for output fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, ASNEEDED
     */
    private String quoteFields;

    /**
     * <p>
     * The single character used for escaping the quote character inside an
     * already escaped value.
     * </p>
     */
    private String quoteEscapeCharacter;

    /**
     * <p>
     * A single character used to separate individual records in the output.
     * Instead of the default value, you can specify an arbitrary delimiter.
     * </p>
     */
    private String recordDelimiter;

    /**
     * <p>
     * The value used to separate individual fields in a record. You can specify
     * an arbitrary delimiter.
     * </p>
     */
    private String fieldDelimiter;

    /**
     * <p>
     * A single character used for escaping when the field delimiter is part of
     * the value. For example, if the value is <code>a, b</code>, Amazon S3
     * wraps this field value in quotation marks, as follows:
     * <code>" a , b "</code>.
     * </p>
     */
    private String quoteCharacter;

    /**
     * <p>
     * Indicates whether to use quotation marks around output fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: Always use quotation marks for output fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, ASNEEDED
     *
     * @return <p>
     *         Indicates whether to use quotation marks around output fields.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALWAYS</code>: Always use quotation marks for output
     *         fields.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASNEEDED</code>: Use quotation marks for output fields when
     *         needed.
     *         </p>
     *         </li>
     *         </ul>
     * @see QuoteFields
     */
    public String getQuoteFields() {
        return quoteFields;
    }

    /**
     * <p>
     * Indicates whether to use quotation marks around output fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: Always use quotation marks for output fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, ASNEEDED
     *
     * @param quoteFields <p>
     *            Indicates whether to use quotation marks around output fields.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALWAYS</code>: Always use quotation marks for output
     *            fields.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASNEEDED</code>: Use quotation marks for output fields
     *            when needed.
     *            </p>
     *            </li>
     *            </ul>
     * @see QuoteFields
     */
    public void setQuoteFields(String quoteFields) {
        this.quoteFields = quoteFields;
    }

    /**
     * <p>
     * Indicates whether to use quotation marks around output fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: Always use quotation marks for output fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, ASNEEDED
     *
     * @param quoteFields <p>
     *            Indicates whether to use quotation marks around output fields.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALWAYS</code>: Always use quotation marks for output
     *            fields.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASNEEDED</code>: Use quotation marks for output fields
     *            when needed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QuoteFields
     */
    public CSVOutput withQuoteFields(String quoteFields) {
        this.quoteFields = quoteFields;
        return this;
    }

    /**
     * <p>
     * Indicates whether to use quotation marks around output fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: Always use quotation marks for output fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, ASNEEDED
     *
     * @param quoteFields <p>
     *            Indicates whether to use quotation marks around output fields.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALWAYS</code>: Always use quotation marks for output
     *            fields.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASNEEDED</code>: Use quotation marks for output fields
     *            when needed.
     *            </p>
     *            </li>
     *            </ul>
     * @see QuoteFields
     */
    public void setQuoteFields(QuoteFields quoteFields) {
        this.quoteFields = quoteFields.toString();
    }

    /**
     * <p>
     * Indicates whether to use quotation marks around output fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: Always use quotation marks for output fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASNEEDED</code>: Use quotation marks for output fields when needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, ASNEEDED
     *
     * @param quoteFields <p>
     *            Indicates whether to use quotation marks around output fields.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALWAYS</code>: Always use quotation marks for output
     *            fields.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASNEEDED</code>: Use quotation marks for output fields
     *            when needed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QuoteFields
     */
    public CSVOutput withQuoteFields(QuoteFields quoteFields) {
        this.quoteFields = quoteFields.toString();
        return this;
    }

    /**
     * <p>
     * The single character used for escaping the quote character inside an
     * already escaped value.
     * </p>
     *
     * @return <p>
     *         The single character used for escaping the quote character inside
     *         an already escaped value.
     *         </p>
     */
    public String getQuoteEscapeCharacter() {
        return quoteEscapeCharacter;
    }

    /**
     * <p>
     * The single character used for escaping the quote character inside an
     * already escaped value.
     * </p>
     *
     * @param quoteEscapeCharacter <p>
     *            The single character used for escaping the quote character
     *            inside an already escaped value.
     *            </p>
     */
    public void setQuoteEscapeCharacter(String quoteEscapeCharacter) {
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    /**
     * <p>
     * The single character used for escaping the quote character inside an
     * already escaped value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quoteEscapeCharacter <p>
     *            The single character used for escaping the quote character
     *            inside an already escaped value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVOutput withQuoteEscapeCharacter(String quoteEscapeCharacter) {
        this.quoteEscapeCharacter = quoteEscapeCharacter;
        return this;
    }

    /**
     * <p>
     * A single character used to separate individual records in the output.
     * Instead of the default value, you can specify an arbitrary delimiter.
     * </p>
     *
     * @return <p>
     *         A single character used to separate individual records in the
     *         output. Instead of the default value, you can specify an
     *         arbitrary delimiter.
     *         </p>
     */
    public String getRecordDelimiter() {
        return recordDelimiter;
    }

    /**
     * <p>
     * A single character used to separate individual records in the output.
     * Instead of the default value, you can specify an arbitrary delimiter.
     * </p>
     *
     * @param recordDelimiter <p>
     *            A single character used to separate individual records in the
     *            output. Instead of the default value, you can specify an
     *            arbitrary delimiter.
     *            </p>
     */
    public void setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    /**
     * <p>
     * A single character used to separate individual records in the output.
     * Instead of the default value, you can specify an arbitrary delimiter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordDelimiter <p>
     *            A single character used to separate individual records in the
     *            output. Instead of the default value, you can specify an
     *            arbitrary delimiter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVOutput withRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
        return this;
    }

    /**
     * <p>
     * The value used to separate individual fields in a record. You can specify
     * an arbitrary delimiter.
     * </p>
     *
     * @return <p>
     *         The value used to separate individual fields in a record. You can
     *         specify an arbitrary delimiter.
     *         </p>
     */
    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    /**
     * <p>
     * The value used to separate individual fields in a record. You can specify
     * an arbitrary delimiter.
     * </p>
     *
     * @param fieldDelimiter <p>
     *            The value used to separate individual fields in a record. You
     *            can specify an arbitrary delimiter.
     *            </p>
     */
    public void setFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }

    /**
     * <p>
     * The value used to separate individual fields in a record. You can specify
     * an arbitrary delimiter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldDelimiter <p>
     *            The value used to separate individual fields in a record. You
     *            can specify an arbitrary delimiter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVOutput withFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
        return this;
    }

    /**
     * <p>
     * A single character used for escaping when the field delimiter is part of
     * the value. For example, if the value is <code>a, b</code>, Amazon S3
     * wraps this field value in quotation marks, as follows:
     * <code>" a , b "</code>.
     * </p>
     *
     * @return <p>
     *         A single character used for escaping when the field delimiter is
     *         part of the value. For example, if the value is <code>a, b</code>
     *         , Amazon S3 wraps this field value in quotation marks, as
     *         follows: <code>" a , b "</code>.
     *         </p>
     */
    public String getQuoteCharacter() {
        return quoteCharacter;
    }

    /**
     * <p>
     * A single character used for escaping when the field delimiter is part of
     * the value. For example, if the value is <code>a, b</code>, Amazon S3
     * wraps this field value in quotation marks, as follows:
     * <code>" a , b "</code>.
     * </p>
     *
     * @param quoteCharacter <p>
     *            A single character used for escaping when the field delimiter
     *            is part of the value. For example, if the value is
     *            <code>a, b</code>, Amazon S3 wraps this field value in
     *            quotation marks, as follows: <code>" a , b "</code>.
     *            </p>
     */
    public void setQuoteCharacter(String quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
    }

    /**
     * <p>
     * A single character used for escaping when the field delimiter is part of
     * the value. For example, if the value is <code>a, b</code>, Amazon S3
     * wraps this field value in quotation marks, as follows:
     * <code>" a , b "</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quoteCharacter <p>
     *            A single character used for escaping when the field delimiter
     *            is part of the value. For example, if the value is
     *            <code>a, b</code>, Amazon S3 wraps this field value in
     *            quotation marks, as follows: <code>" a , b "</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVOutput withQuoteCharacter(String quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
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
        if (getQuoteFields() != null)
            sb.append("QuoteFields: " + getQuoteFields() + ",");
        if (getQuoteEscapeCharacter() != null)
            sb.append("QuoteEscapeCharacter: " + getQuoteEscapeCharacter() + ",");
        if (getRecordDelimiter() != null)
            sb.append("RecordDelimiter: " + getRecordDelimiter() + ",");
        if (getFieldDelimiter() != null)
            sb.append("FieldDelimiter: " + getFieldDelimiter() + ",");
        if (getQuoteCharacter() != null)
            sb.append("QuoteCharacter: " + getQuoteCharacter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQuoteFields() == null) ? 0 : getQuoteFields().hashCode());
        hashCode = prime * hashCode
                + ((getQuoteEscapeCharacter() == null) ? 0 : getQuoteEscapeCharacter().hashCode());
        hashCode = prime * hashCode
                + ((getRecordDelimiter() == null) ? 0 : getRecordDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getFieldDelimiter() == null) ? 0 : getFieldDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getQuoteCharacter() == null) ? 0 : getQuoteCharacter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CSVOutput == false)
            return false;
        CSVOutput other = (CSVOutput) obj;

        if (other.getQuoteFields() == null ^ this.getQuoteFields() == null)
            return false;
        if (other.getQuoteFields() != null
                && other.getQuoteFields().equals(this.getQuoteFields()) == false)
            return false;
        if (other.getQuoteEscapeCharacter() == null ^ this.getQuoteEscapeCharacter() == null)
            return false;
        if (other.getQuoteEscapeCharacter() != null
                && other.getQuoteEscapeCharacter().equals(this.getQuoteEscapeCharacter()) == false)
            return false;
        if (other.getRecordDelimiter() == null ^ this.getRecordDelimiter() == null)
            return false;
        if (other.getRecordDelimiter() != null
                && other.getRecordDelimiter().equals(this.getRecordDelimiter()) == false)
            return false;
        if (other.getFieldDelimiter() == null ^ this.getFieldDelimiter() == null)
            return false;
        if (other.getFieldDelimiter() != null
                && other.getFieldDelimiter().equals(this.getFieldDelimiter()) == false)
            return false;
        if (other.getQuoteCharacter() == null ^ this.getQuoteCharacter() == null)
            return false;
        if (other.getQuoteCharacter() != null
                && other.getQuoteCharacter().equals(this.getQuoteCharacter()) == false)
            return false;
        return true;
    }
}
