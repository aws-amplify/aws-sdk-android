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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the format for a source file or files.
 * </p>
 */
public class UploadSettings implements Serializable {
    /**
     * <p>
     * File format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TSV, CLF, ELF, XLSX, JSON
     */
    private String format;

    /**
     * <p>
     * A row number to start reading data from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer startFromRow;

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     */
    private Boolean containsHeader;

    /**
     * <p>
     * Text qualifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOUBLE_QUOTE, SINGLE_QUOTE
     */
    private String textQualifier;

    /**
     * <p>
     * The delimiter between values in the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     */
    private String delimiter;

    /**
     * <p>
     * File format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TSV, CLF, ELF, XLSX, JSON
     *
     * @return <p>
     *         File format.
     *         </p>
     * @see FileFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * File format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TSV, CLF, ELF, XLSX, JSON
     *
     * @param format <p>
     *            File format.
     *            </p>
     * @see FileFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * File format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TSV, CLF, ELF, XLSX, JSON
     *
     * @param format <p>
     *            File format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileFormat
     */
    public UploadSettings withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * File format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TSV, CLF, ELF, XLSX, JSON
     *
     * @param format <p>
     *            File format.
     *            </p>
     * @see FileFormat
     */
    public void setFormat(FileFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * File format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TSV, CLF, ELF, XLSX, JSON
     *
     * @param format <p>
     *            File format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileFormat
     */
    public UploadSettings withFormat(FileFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A row number to start reading data from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         A row number to start reading data from.
     *         </p>
     */
    public Integer getStartFromRow() {
        return startFromRow;
    }

    /**
     * <p>
     * A row number to start reading data from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param startFromRow <p>
     *            A row number to start reading data from.
     *            </p>
     */
    public void setStartFromRow(Integer startFromRow) {
        this.startFromRow = startFromRow;
    }

    /**
     * <p>
     * A row number to start reading data from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param startFromRow <p>
     *            A row number to start reading data from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadSettings withStartFromRow(Integer startFromRow) {
        this.startFromRow = startFromRow;
        return this;
    }

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     *
     * @return <p>
     *         Whether the file has a header row, or the files each have a
     *         header row.
     *         </p>
     */
    public Boolean isContainsHeader() {
        return containsHeader;
    }

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     *
     * @return <p>
     *         Whether the file has a header row, or the files each have a
     *         header row.
     *         </p>
     */
    public Boolean getContainsHeader() {
        return containsHeader;
    }

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     *
     * @param containsHeader <p>
     *            Whether the file has a header row, or the files each have a
     *            header row.
     *            </p>
     */
    public void setContainsHeader(Boolean containsHeader) {
        this.containsHeader = containsHeader;
    }

    /**
     * <p>
     * Whether the file has a header row, or the files each have a header row.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containsHeader <p>
     *            Whether the file has a header row, or the files each have a
     *            header row.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadSettings withContainsHeader(Boolean containsHeader) {
        this.containsHeader = containsHeader;
        return this;
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOUBLE_QUOTE, SINGLE_QUOTE
     *
     * @return <p>
     *         Text qualifier.
     *         </p>
     * @see TextQualifier
     */
    public String getTextQualifier() {
        return textQualifier;
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOUBLE_QUOTE, SINGLE_QUOTE
     *
     * @param textQualifier <p>
     *            Text qualifier.
     *            </p>
     * @see TextQualifier
     */
    public void setTextQualifier(String textQualifier) {
        this.textQualifier = textQualifier;
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOUBLE_QUOTE, SINGLE_QUOTE
     *
     * @param textQualifier <p>
     *            Text qualifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextQualifier
     */
    public UploadSettings withTextQualifier(String textQualifier) {
        this.textQualifier = textQualifier;
        return this;
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOUBLE_QUOTE, SINGLE_QUOTE
     *
     * @param textQualifier <p>
     *            Text qualifier.
     *            </p>
     * @see TextQualifier
     */
    public void setTextQualifier(TextQualifier textQualifier) {
        this.textQualifier = textQualifier.toString();
    }

    /**
     * <p>
     * Text qualifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOUBLE_QUOTE, SINGLE_QUOTE
     *
     * @param textQualifier <p>
     *            Text qualifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextQualifier
     */
    public UploadSettings withTextQualifier(TextQualifier textQualifier) {
        this.textQualifier = textQualifier.toString();
        return this;
    }

    /**
     * <p>
     * The delimiter between values in the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @return <p>
     *         The delimiter between values in the file.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * The delimiter between values in the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @param delimiter <p>
     *            The delimiter between values in the file.
     *            </p>
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * The delimiter between values in the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @param delimiter <p>
     *            The delimiter between values in the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploadSettings withDelimiter(String delimiter) {
        this.delimiter = delimiter;
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
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getStartFromRow() != null)
            sb.append("StartFromRow: " + getStartFromRow() + ",");
        if (getContainsHeader() != null)
            sb.append("ContainsHeader: " + getContainsHeader() + ",");
        if (getTextQualifier() != null)
            sb.append("TextQualifier: " + getTextQualifier() + ",");
        if (getDelimiter() != null)
            sb.append("Delimiter: " + getDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getStartFromRow() == null) ? 0 : getStartFromRow().hashCode());
        hashCode = prime * hashCode
                + ((getContainsHeader() == null) ? 0 : getContainsHeader().hashCode());
        hashCode = prime * hashCode
                + ((getTextQualifier() == null) ? 0 : getTextQualifier().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadSettings == false)
            return false;
        UploadSettings other = (UploadSettings) obj;

        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getStartFromRow() == null ^ this.getStartFromRow() == null)
            return false;
        if (other.getStartFromRow() != null
                && other.getStartFromRow().equals(this.getStartFromRow()) == false)
            return false;
        if (other.getContainsHeader() == null ^ this.getContainsHeader() == null)
            return false;
        if (other.getContainsHeader() != null
                && other.getContainsHeader().equals(this.getContainsHeader()) == false)
            return false;
        if (other.getTextQualifier() == null ^ this.getTextQualifier() == null)
            return false;
        if (other.getTextQualifier() != null
                && other.getTextQualifier().equals(this.getTextQualifier()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null
                && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        return true;
    }
}
