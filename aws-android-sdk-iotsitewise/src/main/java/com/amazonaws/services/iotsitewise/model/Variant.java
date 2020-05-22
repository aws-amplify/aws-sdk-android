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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an asset property value (of a single type only).
 * </p>
 */
public class Variant implements Serializable {
    /**
     * <p>
     * Asset property data of type string (sequence of characters).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String stringValue;

    /**
     * <p>
     * Asset property data of type integer (whole number).
     * </p>
     */
    private Integer integerValue;

    /**
     * <p>
     * Asset property data of type double (floating point number).
     * </p>
     */
    private Double doubleValue;

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     */
    private Boolean booleanValue;

    /**
     * <p>
     * Asset property data of type string (sequence of characters).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         Asset property data of type string (sequence of characters).
     *         </p>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <p>
     * Asset property data of type string (sequence of characters).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param stringValue <p>
     *            Asset property data of type string (sequence of characters).
     *            </p>
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * Asset property data of type string (sequence of characters).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param stringValue <p>
     *            Asset property data of type string (sequence of characters).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Variant withStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * <p>
     * Asset property data of type integer (whole number).
     * </p>
     *
     * @return <p>
     *         Asset property data of type integer (whole number).
     *         </p>
     */
    public Integer getIntegerValue() {
        return integerValue;
    }

    /**
     * <p>
     * Asset property data of type integer (whole number).
     * </p>
     *
     * @param integerValue <p>
     *            Asset property data of type integer (whole number).
     *            </p>
     */
    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * Asset property data of type integer (whole number).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integerValue <p>
     *            Asset property data of type integer (whole number).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Variant withIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
        return this;
    }

    /**
     * <p>
     * Asset property data of type double (floating point number).
     * </p>
     *
     * @return <p>
     *         Asset property data of type double (floating point number).
     *         </p>
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * <p>
     * Asset property data of type double (floating point number).
     * </p>
     *
     * @param doubleValue <p>
     *            Asset property data of type double (floating point number).
     *            </p>
     */
    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * Asset property data of type double (floating point number).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param doubleValue <p>
     *            Asset property data of type double (floating point number).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Variant withDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     *
     * @return <p>
     *         Asset property data of type Boolean (true or false).
     *         </p>
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     *
     * @return <p>
     *         Asset property data of type Boolean (true or false).
     *         </p>
     */
    public Boolean getBooleanValue() {
        return booleanValue;
    }

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     *
     * @param booleanValue <p>
     *            Asset property data of type Boolean (true or false).
     *            </p>
     */
    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * Asset property data of type Boolean (true or false).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param booleanValue <p>
     *            Asset property data of type Boolean (true or false).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Variant withBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
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
            sb.append("stringValue: " + getStringValue() + ",");
        if (getIntegerValue() != null)
            sb.append("integerValue: " + getIntegerValue() + ",");
        if (getDoubleValue() != null)
            sb.append("doubleValue: " + getDoubleValue() + ",");
        if (getBooleanValue() != null)
            sb.append("booleanValue: " + getBooleanValue());
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
                + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode
                + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode
                + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Variant == false)
            return false;
        Variant other = (Variant) obj;

        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null
                && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null
                && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null
                && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getBooleanValue() == null ^ this.getBooleanValue() == null)
            return false;
        if (other.getBooleanValue() != null
                && other.getBooleanValue().equals(this.getBooleanValue()) == false)
            return false;
        return true;
    }
}
