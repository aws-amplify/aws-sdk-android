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

package com.amazonaws.services.honeycode.model;

import java.io.Serializable;

/**
 * <p>
 * The data in a particular data cell defined on the screen.
 * </p>
 */
public class DataItem implements Serializable {
    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row
     * of data has a different format for the data than the default format
     * defined on the screen or the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME,
     * PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK
     */
    private String overrideFormat;

    /**
     * <p>
     * The raw value of the data. e.g. jsmith@example.com
     * </p>
     */
    private String rawValue;

    /**
     * <p>
     * The formatted value of the data. e.g. John Smith.
     * </p>
     */
    private String formattedValue;

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row
     * of data has a different format for the data than the default format
     * defined on the screen or the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME,
     * PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK
     *
     * @return <p>
     *         The overrideFormat is optional and is specified only if a
     *         particular row of data has a different format for the data than
     *         the default format defined on the screen or the table.
     *         </p>
     * @see Format
     */
    public String getOverrideFormat() {
        return overrideFormat;
    }

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row
     * of data has a different format for the data than the default format
     * defined on the screen or the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME,
     * PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK
     *
     * @param overrideFormat <p>
     *            The overrideFormat is optional and is specified only if a
     *            particular row of data has a different format for the data
     *            than the default format defined on the screen or the table.
     *            </p>
     * @see Format
     */
    public void setOverrideFormat(String overrideFormat) {
        this.overrideFormat = overrideFormat;
    }

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row
     * of data has a different format for the data than the default format
     * defined on the screen or the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME,
     * PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK
     *
     * @param overrideFormat <p>
     *            The overrideFormat is optional and is specified only if a
     *            particular row of data has a different format for the data
     *            than the default format defined on the screen or the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public DataItem withOverrideFormat(String overrideFormat) {
        this.overrideFormat = overrideFormat;
        return this;
    }

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row
     * of data has a different format for the data than the default format
     * defined on the screen or the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME,
     * PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK
     *
     * @param overrideFormat <p>
     *            The overrideFormat is optional and is specified only if a
     *            particular row of data has a different format for the data
     *            than the default format defined on the screen or the table.
     *            </p>
     * @see Format
     */
    public void setOverrideFormat(Format overrideFormat) {
        this.overrideFormat = overrideFormat.toString();
    }

    /**
     * <p>
     * The overrideFormat is optional and is specified only if a particular row
     * of data has a different format for the data than the default format
     * defined on the screen or the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME,
     * PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK
     *
     * @param overrideFormat <p>
     *            The overrideFormat is optional and is specified only if a
     *            particular row of data has a different format for the data
     *            than the default format defined on the screen or the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public DataItem withOverrideFormat(Format overrideFormat) {
        this.overrideFormat = overrideFormat.toString();
        return this;
    }

    /**
     * <p>
     * The raw value of the data. e.g. jsmith@example.com
     * </p>
     *
     * @return <p>
     *         The raw value of the data. e.g. jsmith@example.com
     *         </p>
     */
    public String getRawValue() {
        return rawValue;
    }

    /**
     * <p>
     * The raw value of the data. e.g. jsmith@example.com
     * </p>
     *
     * @param rawValue <p>
     *            The raw value of the data. e.g. jsmith@example.com
     *            </p>
     */
    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

    /**
     * <p>
     * The raw value of the data. e.g. jsmith@example.com
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawValue <p>
     *            The raw value of the data. e.g. jsmith@example.com
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataItem withRawValue(String rawValue) {
        this.rawValue = rawValue;
        return this;
    }

    /**
     * <p>
     * The formatted value of the data. e.g. John Smith.
     * </p>
     *
     * @return <p>
     *         The formatted value of the data. e.g. John Smith.
     *         </p>
     */
    public String getFormattedValue() {
        return formattedValue;
    }

    /**
     * <p>
     * The formatted value of the data. e.g. John Smith.
     * </p>
     *
     * @param formattedValue <p>
     *            The formatted value of the data. e.g. John Smith.
     *            </p>
     */
    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    /**
     * <p>
     * The formatted value of the data. e.g. John Smith.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param formattedValue <p>
     *            The formatted value of the data. e.g. John Smith.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataItem withFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
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
        if (getOverrideFormat() != null)
            sb.append("overrideFormat: " + getOverrideFormat() + ",");
        if (getRawValue() != null)
            sb.append("rawValue: " + getRawValue() + ",");
        if (getFormattedValue() != null)
            sb.append("formattedValue: " + getFormattedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOverrideFormat() == null) ? 0 : getOverrideFormat().hashCode());
        hashCode = prime * hashCode + ((getRawValue() == null) ? 0 : getRawValue().hashCode());
        hashCode = prime * hashCode
                + ((getFormattedValue() == null) ? 0 : getFormattedValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataItem == false)
            return false;
        DataItem other = (DataItem) obj;

        if (other.getOverrideFormat() == null ^ this.getOverrideFormat() == null)
            return false;
        if (other.getOverrideFormat() != null
                && other.getOverrideFormat().equals(this.getOverrideFormat()) == false)
            return false;
        if (other.getRawValue() == null ^ this.getRawValue() == null)
            return false;
        if (other.getRawValue() != null && other.getRawValue().equals(this.getRawValue()) == false)
            return false;
        if (other.getFormattedValue() == null ^ this.getFormattedValue() == null)
            return false;
        if (other.getFormattedValue() != null
                && other.getFormattedValue().equals(this.getFormattedValue()) == false)
            return false;
        return true;
    }
}
