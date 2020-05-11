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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * The value of a custom document attribute. You can only provide one value for
 * a custom attribute.
 * </p>
 */
public class DocumentAttributeValue implements Serializable {
    /**
     * <p>
     * A string, such as "department".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String stringValue;

    /**
     * <p>
     * A list of strings.
     * </p>
     */
    private java.util.List<String> stringListValue;

    /**
     * <p>
     * A long integer value.
     * </p>
     */
    private Long longValue;

    /**
     * <p>
     * A date value expressed as seconds from the Unix epoch.
     * </p>
     */
    private java.util.Date dateValue;

    /**
     * <p>
     * A string, such as "department".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A string, such as "department".
     *         </p>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <p>
     * A string, such as "department".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param stringValue <p>
     *            A string, such as "department".
     *            </p>
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * A string, such as "department".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param stringValue <p>
     *            A string, such as "department".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentAttributeValue withStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     *
     * @return <p>
     *         A list of strings.
     *         </p>
     */
    public java.util.List<String> getStringListValue() {
        return stringListValue;
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     *
     * @param stringListValue <p>
     *            A list of strings.
     *            </p>
     */
    public void setStringListValue(java.util.Collection<String> stringListValue) {
        if (stringListValue == null) {
            this.stringListValue = null;
            return;
        }

        this.stringListValue = new java.util.ArrayList<String>(stringListValue);
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringListValue <p>
     *            A list of strings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentAttributeValue withStringListValue(String... stringListValue) {
        if (getStringListValue() == null) {
            this.stringListValue = new java.util.ArrayList<String>(stringListValue.length);
        }
        for (String value : stringListValue) {
            this.stringListValue.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringListValue <p>
     *            A list of strings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentAttributeValue withStringListValue(java.util.Collection<String> stringListValue) {
        setStringListValue(stringListValue);
        return this;
    }

    /**
     * <p>
     * A long integer value.
     * </p>
     *
     * @return <p>
     *         A long integer value.
     *         </p>
     */
    public Long getLongValue() {
        return longValue;
    }

    /**
     * <p>
     * A long integer value.
     * </p>
     *
     * @param longValue <p>
     *            A long integer value.
     *            </p>
     */
    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    /**
     * <p>
     * A long integer value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param longValue <p>
     *            A long integer value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentAttributeValue withLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }

    /**
     * <p>
     * A date value expressed as seconds from the Unix epoch.
     * </p>
     *
     * @return <p>
     *         A date value expressed as seconds from the Unix epoch.
     *         </p>
     */
    public java.util.Date getDateValue() {
        return dateValue;
    }

    /**
     * <p>
     * A date value expressed as seconds from the Unix epoch.
     * </p>
     *
     * @param dateValue <p>
     *            A date value expressed as seconds from the Unix epoch.
     *            </p>
     */
    public void setDateValue(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * A date value expressed as seconds from the Unix epoch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateValue <p>
     *            A date value expressed as seconds from the Unix epoch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentAttributeValue withDateValue(java.util.Date dateValue) {
        this.dateValue = dateValue;
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
        if (getStringValue() != null)
            sb.append("StringValue: " + getStringValue() + ",");
        if (getStringListValue() != null)
            sb.append("StringListValue: " + getStringListValue() + ",");
        if (getLongValue() != null)
            sb.append("LongValue: " + getLongValue() + ",");
        if (getDateValue() != null)
            sb.append("DateValue: " + getDateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode
                + ((getStringListValue() == null) ? 0 : getStringListValue().hashCode());
        hashCode = prime * hashCode + ((getLongValue() == null) ? 0 : getLongValue().hashCode());
        hashCode = prime * hashCode + ((getDateValue() == null) ? 0 : getDateValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentAttributeValue == false)
            return false;
        DocumentAttributeValue other = (DocumentAttributeValue) obj;

        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null
                && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getStringListValue() == null ^ this.getStringListValue() == null)
            return false;
        if (other.getStringListValue() != null
                && other.getStringListValue().equals(this.getStringListValue()) == false)
            return false;
        if (other.getLongValue() == null ^ this.getLongValue() == null)
            return false;
        if (other.getLongValue() != null
                && other.getLongValue().equals(this.getLongValue()) == false)
            return false;
        if (other.getDateValue() == null ^ this.getDateValue() == null)
            return false;
        if (other.getDateValue() != null
                && other.getDateValue().equals(this.getDateValue()) == false)
            return false;
        return true;
    }
}
