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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a custom CSV classifier for <code>CreateClassifier</code> to
 * create.
 * </p>
 */
public class CreateCsvClassifierRequest implements Serializable {
    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[^\r\n]<br/>
     */
    private String delimiter;

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column
     * value. Must be different from the column delimiter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[^\r\n]<br/>
     */
    private String quoteSymbol;

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, PRESENT, ABSENT
     */
    private String containsHeader;

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     */
    private java.util.List<String> header;

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column
     * values. The default value is true.
     * </p>
     */
    private Boolean disableValueTrimming;

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     */
    private Boolean allowSingleColumn;

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the classifier.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the classifier.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCsvClassifierRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[^\r\n]<br/>
     *
     * @return <p>
     *         A custom symbol to denote what separates each column entry in the
     *         row.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[^\r\n]<br/>
     *
     * @param delimiter <p>
     *            A custom symbol to denote what separates each column entry in
     *            the row.
     *            </p>
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * A custom symbol to denote what separates each column entry in the row.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[^\r\n]<br/>
     *
     * @param delimiter <p>
     *            A custom symbol to denote what separates each column entry in
     *            the row.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCsvClassifierRequest withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column
     * value. Must be different from the column delimiter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[^\r\n]<br/>
     *
     * @return <p>
     *         A custom symbol to denote what combines content into a single
     *         column value. Must be different from the column delimiter.
     *         </p>
     */
    public String getQuoteSymbol() {
        return quoteSymbol;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column
     * value. Must be different from the column delimiter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[^\r\n]<br/>
     *
     * @param quoteSymbol <p>
     *            A custom symbol to denote what combines content into a single
     *            column value. Must be different from the column delimiter.
     *            </p>
     */
    public void setQuoteSymbol(String quoteSymbol) {
        this.quoteSymbol = quoteSymbol;
    }

    /**
     * <p>
     * A custom symbol to denote what combines content into a single column
     * value. Must be different from the column delimiter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[^\r\n]<br/>
     *
     * @param quoteSymbol <p>
     *            A custom symbol to denote what combines content into a single
     *            column value. Must be different from the column delimiter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCsvClassifierRequest withQuoteSymbol(String quoteSymbol) {
        this.quoteSymbol = quoteSymbol;
        return this;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, PRESENT, ABSENT
     *
     * @return <p>
     *         Indicates whether the CSV file contains a header.
     *         </p>
     * @see CsvHeaderOption
     */
    public String getContainsHeader() {
        return containsHeader;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, PRESENT, ABSENT
     *
     * @param containsHeader <p>
     *            Indicates whether the CSV file contains a header.
     *            </p>
     * @see CsvHeaderOption
     */
    public void setContainsHeader(String containsHeader) {
        this.containsHeader = containsHeader;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, PRESENT, ABSENT
     *
     * @param containsHeader <p>
     *            Indicates whether the CSV file contains a header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CsvHeaderOption
     */
    public CreateCsvClassifierRequest withContainsHeader(String containsHeader) {
        this.containsHeader = containsHeader;
        return this;
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, PRESENT, ABSENT
     *
     * @param containsHeader <p>
     *            Indicates whether the CSV file contains a header.
     *            </p>
     * @see CsvHeaderOption
     */
    public void setContainsHeader(CsvHeaderOption containsHeader) {
        this.containsHeader = containsHeader.toString();
    }

    /**
     * <p>
     * Indicates whether the CSV file contains a header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, PRESENT, ABSENT
     *
     * @param containsHeader <p>
     *            Indicates whether the CSV file contains a header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CsvHeaderOption
     */
    public CreateCsvClassifierRequest withContainsHeader(CsvHeaderOption containsHeader) {
        this.containsHeader = containsHeader.toString();
        return this;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     *
     * @return <p>
     *         A list of strings representing column names.
     *         </p>
     */
    public java.util.List<String> getHeader() {
        return header;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     *
     * @param header <p>
     *            A list of strings representing column names.
     *            </p>
     */
    public void setHeader(java.util.Collection<String> header) {
        if (header == null) {
            this.header = null;
            return;
        }

        this.header = new java.util.ArrayList<String>(header);
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param header <p>
     *            A list of strings representing column names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCsvClassifierRequest withHeader(String... header) {
        if (getHeader() == null) {
            this.header = new java.util.ArrayList<String>(header.length);
        }
        for (String value : header) {
            this.header.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings representing column names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param header <p>
     *            A list of strings representing column names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCsvClassifierRequest withHeader(java.util.Collection<String> header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column
     * values. The default value is true.
     * </p>
     *
     * @return <p>
     *         Specifies not to trim values before identifying the type of
     *         column values. The default value is true.
     *         </p>
     */
    public Boolean isDisableValueTrimming() {
        return disableValueTrimming;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column
     * values. The default value is true.
     * </p>
     *
     * @return <p>
     *         Specifies not to trim values before identifying the type of
     *         column values. The default value is true.
     *         </p>
     */
    public Boolean getDisableValueTrimming() {
        return disableValueTrimming;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column
     * values. The default value is true.
     * </p>
     *
     * @param disableValueTrimming <p>
     *            Specifies not to trim values before identifying the type of
     *            column values. The default value is true.
     *            </p>
     */
    public void setDisableValueTrimming(Boolean disableValueTrimming) {
        this.disableValueTrimming = disableValueTrimming;
    }

    /**
     * <p>
     * Specifies not to trim values before identifying the type of column
     * values. The default value is true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableValueTrimming <p>
     *            Specifies not to trim values before identifying the type of
     *            column values. The default value is true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCsvClassifierRequest withDisableValueTrimming(Boolean disableValueTrimming) {
        this.disableValueTrimming = disableValueTrimming;
        return this;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     *
     * @return <p>
     *         Enables the processing of files that contain only one column.
     *         </p>
     */
    public Boolean isAllowSingleColumn() {
        return allowSingleColumn;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     *
     * @return <p>
     *         Enables the processing of files that contain only one column.
     *         </p>
     */
    public Boolean getAllowSingleColumn() {
        return allowSingleColumn;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     *
     * @param allowSingleColumn <p>
     *            Enables the processing of files that contain only one column.
     *            </p>
     */
    public void setAllowSingleColumn(Boolean allowSingleColumn) {
        this.allowSingleColumn = allowSingleColumn;
    }

    /**
     * <p>
     * Enables the processing of files that contain only one column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowSingleColumn <p>
     *            Enables the processing of files that contain only one column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCsvClassifierRequest withAllowSingleColumn(Boolean allowSingleColumn) {
        this.allowSingleColumn = allowSingleColumn;
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
        if (getDelimiter() != null)
            sb.append("Delimiter: " + getDelimiter() + ",");
        if (getQuoteSymbol() != null)
            sb.append("QuoteSymbol: " + getQuoteSymbol() + ",");
        if (getContainsHeader() != null)
            sb.append("ContainsHeader: " + getContainsHeader() + ",");
        if (getHeader() != null)
            sb.append("Header: " + getHeader() + ",");
        if (getDisableValueTrimming() != null)
            sb.append("DisableValueTrimming: " + getDisableValueTrimming() + ",");
        if (getAllowSingleColumn() != null)
            sb.append("AllowSingleColumn: " + getAllowSingleColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getQuoteSymbol() == null) ? 0 : getQuoteSymbol().hashCode());
        hashCode = prime * hashCode
                + ((getContainsHeader() == null) ? 0 : getContainsHeader().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode
                + ((getDisableValueTrimming() == null) ? 0 : getDisableValueTrimming().hashCode());
        hashCode = prime * hashCode
                + ((getAllowSingleColumn() == null) ? 0 : getAllowSingleColumn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCsvClassifierRequest == false)
            return false;
        CreateCsvClassifierRequest other = (CreateCsvClassifierRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null
                && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getQuoteSymbol() == null ^ this.getQuoteSymbol() == null)
            return false;
        if (other.getQuoteSymbol() != null
                && other.getQuoteSymbol().equals(this.getQuoteSymbol()) == false)
            return false;
        if (other.getContainsHeader() == null ^ this.getContainsHeader() == null)
            return false;
        if (other.getContainsHeader() != null
                && other.getContainsHeader().equals(this.getContainsHeader()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getDisableValueTrimming() == null ^ this.getDisableValueTrimming() == null)
            return false;
        if (other.getDisableValueTrimming() != null
                && other.getDisableValueTrimming().equals(this.getDisableValueTrimming()) == false)
            return false;
        if (other.getAllowSingleColumn() == null ^ this.getAllowSingleColumn() == null)
            return false;
        if (other.getAllowSingleColumn() != null
                && other.getAllowSingleColumn().equals(this.getAllowSingleColumn()) == false)
            return false;
        return true;
    }
}
