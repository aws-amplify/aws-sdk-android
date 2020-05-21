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
 * Describes how an uncompressed comma-separated values (CSV)-formatted input
 * object is formatted.
 * </p>
 */
public class CSVInput implements Serializable {
    /**
     * <p>
     * Describes the first line of input. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: First line is not a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IGNORE</code>: First line is a header, but you can't use the header
     * values to indicate the column in an expression. You can use column
     * position (such as _1, _2, …) to indicate the column (
     * <code>SELECT s._1 FROM OBJECT s</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Use</code>: First line is a header, and you can use the header
     * value to identify a column in an expression (
     * <code>SELECT "name" FROM OBJECT</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE, IGNORE, NONE
     */
    private String fileHeaderInfo;

    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the
     * character is present at the start of that row. You can specify any
     * character to indicate a comment line.
     * </p>
     */
    private String comments;

    /**
     * <p>
     * A single character used for escaping the quotation mark character inside
     * an already escaped value. For example, the value """ a , b """ is parsed
     * as " a , b ".
     * </p>
     */
    private String quoteEscapeCharacter;

    /**
     * <p>
     * A single character used to separate individual records in the input.
     * Instead of the default value, you can specify an arbitrary delimiter.
     * </p>
     */
    private String recordDelimiter;

    /**
     * <p>
     * A single character used to separate individual fields in a record. You
     * can specify an arbitrary delimiter.
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
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: <code>"</code>
     * </p>
     * <p>
     * Ancestors: <code>CSV</code>
     * </p>
     */
    private String quoteCharacter;

    /**
     * <p>
     * Specifies that CSV field values may contain quoted record delimiters and
     * such records should be allowed. Default value is FALSE. Setting this
     * value to TRUE may lower performance.
     * </p>
     */
    private Boolean allowQuotedRecordDelimiter;

    /**
     * <p>
     * Describes the first line of input. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: First line is not a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IGNORE</code>: First line is a header, but you can't use the header
     * values to indicate the column in an expression. You can use column
     * position (such as _1, _2, …) to indicate the column (
     * <code>SELECT s._1 FROM OBJECT s</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Use</code>: First line is a header, and you can use the header
     * value to identify a column in an expression (
     * <code>SELECT "name" FROM OBJECT</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE, IGNORE, NONE
     *
     * @return <p>
     *         Describes the first line of input. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: First line is not a header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IGNORE</code>: First line is a header, but you can't use
     *         the header values to indicate the column in an expression. You
     *         can use column position (such as _1, _2, …) to indicate the
     *         column (<code>SELECT s._1 FROM OBJECT s</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Use</code>: First line is a header, and you can use the
     *         header value to identify a column in an expression (
     *         <code>SELECT "name" FROM OBJECT</code>).
     *         </p>
     *         </li>
     *         </ul>
     * @see FileHeaderInfo
     */
    public String getFileHeaderInfo() {
        return fileHeaderInfo;
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: First line is not a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IGNORE</code>: First line is a header, but you can't use the header
     * values to indicate the column in an expression. You can use column
     * position (such as _1, _2, …) to indicate the column (
     * <code>SELECT s._1 FROM OBJECT s</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Use</code>: First line is a header, and you can use the header
     * value to identify a column in an expression (
     * <code>SELECT "name" FROM OBJECT</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE, IGNORE, NONE
     *
     * @param fileHeaderInfo <p>
     *            Describes the first line of input. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: First line is not a header.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IGNORE</code>: First line is a header, but you can't use
     *            the header values to indicate the column in an expression. You
     *            can use column position (such as _1, _2, …) to indicate the
     *            column (<code>SELECT s._1 FROM OBJECT s</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Use</code>: First line is a header, and you can use the
     *            header value to identify a column in an expression (
     *            <code>SELECT "name" FROM OBJECT</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @see FileHeaderInfo
     */
    public void setFileHeaderInfo(String fileHeaderInfo) {
        this.fileHeaderInfo = fileHeaderInfo;
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: First line is not a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IGNORE</code>: First line is a header, but you can't use the header
     * values to indicate the column in an expression. You can use column
     * position (such as _1, _2, …) to indicate the column (
     * <code>SELECT s._1 FROM OBJECT s</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Use</code>: First line is a header, and you can use the header
     * value to identify a column in an expression (
     * <code>SELECT "name" FROM OBJECT</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE, IGNORE, NONE
     *
     * @param fileHeaderInfo <p>
     *            Describes the first line of input. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: First line is not a header.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IGNORE</code>: First line is a header, but you can't use
     *            the header values to indicate the column in an expression. You
     *            can use column position (such as _1, _2, …) to indicate the
     *            column (<code>SELECT s._1 FROM OBJECT s</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Use</code>: First line is a header, and you can use the
     *            header value to identify a column in an expression (
     *            <code>SELECT "name" FROM OBJECT</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileHeaderInfo
     */
    public CSVInput withFileHeaderInfo(String fileHeaderInfo) {
        this.fileHeaderInfo = fileHeaderInfo;
        return this;
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: First line is not a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IGNORE</code>: First line is a header, but you can't use the header
     * values to indicate the column in an expression. You can use column
     * position (such as _1, _2, …) to indicate the column (
     * <code>SELECT s._1 FROM OBJECT s</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Use</code>: First line is a header, and you can use the header
     * value to identify a column in an expression (
     * <code>SELECT "name" FROM OBJECT</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE, IGNORE, NONE
     *
     * @param fileHeaderInfo <p>
     *            Describes the first line of input. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: First line is not a header.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IGNORE</code>: First line is a header, but you can't use
     *            the header values to indicate the column in an expression. You
     *            can use column position (such as _1, _2, …) to indicate the
     *            column (<code>SELECT s._1 FROM OBJECT s</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Use</code>: First line is a header, and you can use the
     *            header value to identify a column in an expression (
     *            <code>SELECT "name" FROM OBJECT</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @see FileHeaderInfo
     */
    public void setFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        this.fileHeaderInfo = fileHeaderInfo.toString();
    }

    /**
     * <p>
     * Describes the first line of input. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: First line is not a header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IGNORE</code>: First line is a header, but you can't use the header
     * values to indicate the column in an expression. You can use column
     * position (such as _1, _2, …) to indicate the column (
     * <code>SELECT s._1 FROM OBJECT s</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Use</code>: First line is a header, and you can use the header
     * value to identify a column in an expression (
     * <code>SELECT "name" FROM OBJECT</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE, IGNORE, NONE
     *
     * @param fileHeaderInfo <p>
     *            Describes the first line of input. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: First line is not a header.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IGNORE</code>: First line is a header, but you can't use
     *            the header values to indicate the column in an expression. You
     *            can use column position (such as _1, _2, …) to indicate the
     *            column (<code>SELECT s._1 FROM OBJECT s</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Use</code>: First line is a header, and you can use the
     *            header value to identify a column in an expression (
     *            <code>SELECT "name" FROM OBJECT</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileHeaderInfo
     */
    public CSVInput withFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        this.fileHeaderInfo = fileHeaderInfo.toString();
        return this;
    }

    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the
     * character is present at the start of that row. You can specify any
     * character to indicate a comment line.
     * </p>
     *
     * @return <p>
     *         A single character used to indicate that a row should be ignored
     *         when the character is present at the start of that row. You can
     *         specify any character to indicate a comment line.
     *         </p>
     */
    public String getComments() {
        return comments;
    }

    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the
     * character is present at the start of that row. You can specify any
     * character to indicate a comment line.
     * </p>
     *
     * @param comments <p>
     *            A single character used to indicate that a row should be
     *            ignored when the character is present at the start of that
     *            row. You can specify any character to indicate a comment line.
     *            </p>
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * <p>
     * A single character used to indicate that a row should be ignored when the
     * character is present at the start of that row. You can specify any
     * character to indicate a comment line.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comments <p>
     *            A single character used to indicate that a row should be
     *            ignored when the character is present at the start of that
     *            row. You can specify any character to indicate a comment line.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVInput withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * <p>
     * A single character used for escaping the quotation mark character inside
     * an already escaped value. For example, the value """ a , b """ is parsed
     * as " a , b ".
     * </p>
     *
     * @return <p>
     *         A single character used for escaping the quotation mark character
     *         inside an already escaped value. For example, the value
     *         """ a , b """ is parsed as " a , b ".
     *         </p>
     */
    public String getQuoteEscapeCharacter() {
        return quoteEscapeCharacter;
    }

    /**
     * <p>
     * A single character used for escaping the quotation mark character inside
     * an already escaped value. For example, the value """ a , b """ is parsed
     * as " a , b ".
     * </p>
     *
     * @param quoteEscapeCharacter <p>
     *            A single character used for escaping the quotation mark
     *            character inside an already escaped value. For example, the
     *            value """ a , b """ is parsed as " a , b ".
     *            </p>
     */
    public void setQuoteEscapeCharacter(String quoteEscapeCharacter) {
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    /**
     * <p>
     * A single character used for escaping the quotation mark character inside
     * an already escaped value. For example, the value """ a , b """ is parsed
     * as " a , b ".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quoteEscapeCharacter <p>
     *            A single character used for escaping the quotation mark
     *            character inside an already escaped value. For example, the
     *            value """ a , b """ is parsed as " a , b ".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVInput withQuoteEscapeCharacter(String quoteEscapeCharacter) {
        this.quoteEscapeCharacter = quoteEscapeCharacter;
        return this;
    }

    /**
     * <p>
     * A single character used to separate individual records in the input.
     * Instead of the default value, you can specify an arbitrary delimiter.
     * </p>
     *
     * @return <p>
     *         A single character used to separate individual records in the
     *         input. Instead of the default value, you can specify an arbitrary
     *         delimiter.
     *         </p>
     */
    public String getRecordDelimiter() {
        return recordDelimiter;
    }

    /**
     * <p>
     * A single character used to separate individual records in the input.
     * Instead of the default value, you can specify an arbitrary delimiter.
     * </p>
     *
     * @param recordDelimiter <p>
     *            A single character used to separate individual records in the
     *            input. Instead of the default value, you can specify an
     *            arbitrary delimiter.
     *            </p>
     */
    public void setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    /**
     * <p>
     * A single character used to separate individual records in the input.
     * Instead of the default value, you can specify an arbitrary delimiter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordDelimiter <p>
     *            A single character used to separate individual records in the
     *            input. Instead of the default value, you can specify an
     *            arbitrary delimiter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVInput withRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
        return this;
    }

    /**
     * <p>
     * A single character used to separate individual fields in a record. You
     * can specify an arbitrary delimiter.
     * </p>
     *
     * @return <p>
     *         A single character used to separate individual fields in a
     *         record. You can specify an arbitrary delimiter.
     *         </p>
     */
    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    /**
     * <p>
     * A single character used to separate individual fields in a record. You
     * can specify an arbitrary delimiter.
     * </p>
     *
     * @param fieldDelimiter <p>
     *            A single character used to separate individual fields in a
     *            record. You can specify an arbitrary delimiter.
     *            </p>
     */
    public void setFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }

    /**
     * <p>
     * A single character used to separate individual fields in a record. You
     * can specify an arbitrary delimiter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldDelimiter <p>
     *            A single character used to separate individual fields in a
     *            record. You can specify an arbitrary delimiter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVInput withFieldDelimiter(String fieldDelimiter) {
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
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: <code>"</code>
     * </p>
     * <p>
     * Ancestors: <code>CSV</code>
     * </p>
     *
     * @return <p>
     *         A single character used for escaping when the field delimiter is
     *         part of the value. For example, if the value is <code>a, b</code>
     *         , Amazon S3 wraps this field value in quotation marks, as
     *         follows: <code>" a , b "</code>.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: <code>"</code>
     *         </p>
     *         <p>
     *         Ancestors: <code>CSV</code>
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
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: <code>"</code>
     * </p>
     * <p>
     * Ancestors: <code>CSV</code>
     * </p>
     *
     * @param quoteCharacter <p>
     *            A single character used for escaping when the field delimiter
     *            is part of the value. For example, if the value is
     *            <code>a, b</code>, Amazon S3 wraps this field value in
     *            quotation marks, as follows: <code>" a , b "</code>.
     *            </p>
     *            <p>
     *            Type: String
     *            </p>
     *            <p>
     *            Default: <code>"</code>
     *            </p>
     *            <p>
     *            Ancestors: <code>CSV</code>
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
     * Type: String
     * </p>
     * <p>
     * Default: <code>"</code>
     * </p>
     * <p>
     * Ancestors: <code>CSV</code>
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
     *            <p>
     *            Type: String
     *            </p>
     *            <p>
     *            Default: <code>"</code>
     *            </p>
     *            <p>
     *            Ancestors: <code>CSV</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVInput withQuoteCharacter(String quoteCharacter) {
        this.quoteCharacter = quoteCharacter;
        return this;
    }

    /**
     * <p>
     * Specifies that CSV field values may contain quoted record delimiters and
     * such records should be allowed. Default value is FALSE. Setting this
     * value to TRUE may lower performance.
     * </p>
     *
     * @return <p>
     *         Specifies that CSV field values may contain quoted record
     *         delimiters and such records should be allowed. Default value is
     *         FALSE. Setting this value to TRUE may lower performance.
     *         </p>
     */
    public Boolean isAllowQuotedRecordDelimiter() {
        return allowQuotedRecordDelimiter;
    }

    /**
     * <p>
     * Specifies that CSV field values may contain quoted record delimiters and
     * such records should be allowed. Default value is FALSE. Setting this
     * value to TRUE may lower performance.
     * </p>
     *
     * @return <p>
     *         Specifies that CSV field values may contain quoted record
     *         delimiters and such records should be allowed. Default value is
     *         FALSE. Setting this value to TRUE may lower performance.
     *         </p>
     */
    public Boolean getAllowQuotedRecordDelimiter() {
        return allowQuotedRecordDelimiter;
    }

    /**
     * <p>
     * Specifies that CSV field values may contain quoted record delimiters and
     * such records should be allowed. Default value is FALSE. Setting this
     * value to TRUE may lower performance.
     * </p>
     *
     * @param allowQuotedRecordDelimiter <p>
     *            Specifies that CSV field values may contain quoted record
     *            delimiters and such records should be allowed. Default value
     *            is FALSE. Setting this value to TRUE may lower performance.
     *            </p>
     */
    public void setAllowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter) {
        this.allowQuotedRecordDelimiter = allowQuotedRecordDelimiter;
    }

    /**
     * <p>
     * Specifies that CSV field values may contain quoted record delimiters and
     * such records should be allowed. Default value is FALSE. Setting this
     * value to TRUE may lower performance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowQuotedRecordDelimiter <p>
     *            Specifies that CSV field values may contain quoted record
     *            delimiters and such records should be allowed. Default value
     *            is FALSE. Setting this value to TRUE may lower performance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CSVInput withAllowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter) {
        this.allowQuotedRecordDelimiter = allowQuotedRecordDelimiter;
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
        if (getFileHeaderInfo() != null)
            sb.append("FileHeaderInfo: " + getFileHeaderInfo() + ",");
        if (getComments() != null)
            sb.append("Comments: " + getComments() + ",");
        if (getQuoteEscapeCharacter() != null)
            sb.append("QuoteEscapeCharacter: " + getQuoteEscapeCharacter() + ",");
        if (getRecordDelimiter() != null)
            sb.append("RecordDelimiter: " + getRecordDelimiter() + ",");
        if (getFieldDelimiter() != null)
            sb.append("FieldDelimiter: " + getFieldDelimiter() + ",");
        if (getQuoteCharacter() != null)
            sb.append("QuoteCharacter: " + getQuoteCharacter() + ",");
        if (getAllowQuotedRecordDelimiter() != null)
            sb.append("AllowQuotedRecordDelimiter: " + getAllowQuotedRecordDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileHeaderInfo() == null) ? 0 : getFileHeaderInfo().hashCode());
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        hashCode = prime * hashCode
                + ((getQuoteEscapeCharacter() == null) ? 0 : getQuoteEscapeCharacter().hashCode());
        hashCode = prime * hashCode
                + ((getRecordDelimiter() == null) ? 0 : getRecordDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getFieldDelimiter() == null) ? 0 : getFieldDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getQuoteCharacter() == null) ? 0 : getQuoteCharacter().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowQuotedRecordDelimiter() == null) ? 0 : getAllowQuotedRecordDelimiter()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CSVInput == false)
            return false;
        CSVInput other = (CSVInput) obj;

        if (other.getFileHeaderInfo() == null ^ this.getFileHeaderInfo() == null)
            return false;
        if (other.getFileHeaderInfo() != null
                && other.getFileHeaderInfo().equals(this.getFileHeaderInfo()) == false)
            return false;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
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
        if (other.getAllowQuotedRecordDelimiter() == null
                ^ this.getAllowQuotedRecordDelimiter() == null)
            return false;
        if (other.getAllowQuotedRecordDelimiter() != null
                && other.getAllowQuotedRecordDelimiter().equals(
                        this.getAllowQuotedRecordDelimiter()) == false)
            return false;
        return true;
    }
}
