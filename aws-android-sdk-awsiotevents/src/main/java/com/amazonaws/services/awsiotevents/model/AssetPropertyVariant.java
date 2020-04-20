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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that contains an asset property value. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html"
 * >Variant</a> in the <i>AWS IoT SiteWise API Reference</i>.
 * </p>
 * <important>
 * <p>
 * You must specify one of the following value types, depending on the
 * <code>dataType</code> of the specified asset property. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetProperty.html"
 * >AssetProperty</a> in the <i>AWS IoT SiteWise API Reference</i>.
 * </p>
 * </important>
 * <p>
 * For parameters that are string data type, you can specify the following
 * options:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use a string. For example, the <code>doubleValue</code> value can be
 * <code>'47.9'</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use an expression. For example, the <code>doubleValue</code> value can be
 * <code>$input.TemperatureInput.sensorData.temperature</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html"
 * >Expressions</a> in the <i>AWS IoT Events Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 */
public class AssetPropertyVariant implements Serializable {
    /**
     * <p>
     * The asset property value is a string. You can also specify an expression.
     * If you use an expression, the evaluated result should be a string.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * The asset property value is an integer. You can also specify an
     * expression. If you use an expression, the evaluated result should be an
     * integer.
     * </p>
     */
    private String integerValue;

    /**
     * <p>
     * The asset property value is a double. You can also specify an expression.
     * If you use an expression, the evaluated result should be a double.
     * </p>
     */
    private String doubleValue;

    /**
     * <p>
     * The asset property value is a Boolean value that must be
     * <code>TRUE</code> or <code>FALSE</code>. You can also specify an
     * expression. If you use an expression, the evaluated result should be a
     * Boolean value.
     * </p>
     */
    private String booleanValue;

    /**
     * <p>
     * The asset property value is a string. You can also specify an expression.
     * If you use an expression, the evaluated result should be a string.
     * </p>
     *
     * @return <p>
     *         The asset property value is a string. You can also specify an
     *         expression. If you use an expression, the evaluated result should
     *         be a string.
     *         </p>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <p>
     * The asset property value is a string. You can also specify an expression.
     * If you use an expression, the evaluated result should be a string.
     * </p>
     *
     * @param stringValue <p>
     *            The asset property value is a string. You can also specify an
     *            expression. If you use an expression, the evaluated result
     *            should be a string.
     *            </p>
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The asset property value is a string. You can also specify an expression.
     * If you use an expression, the evaluated result should be a string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValue <p>
     *            The asset property value is a string. You can also specify an
     *            expression. If you use an expression, the evaluated result
     *            should be a string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyVariant withStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * <p>
     * The asset property value is an integer. You can also specify an
     * expression. If you use an expression, the evaluated result should be an
     * integer.
     * </p>
     *
     * @return <p>
     *         The asset property value is an integer. You can also specify an
     *         expression. If you use an expression, the evaluated result should
     *         be an integer.
     *         </p>
     */
    public String getIntegerValue() {
        return integerValue;
    }

    /**
     * <p>
     * The asset property value is an integer. You can also specify an
     * expression. If you use an expression, the evaluated result should be an
     * integer.
     * </p>
     *
     * @param integerValue <p>
     *            The asset property value is an integer. You can also specify
     *            an expression. If you use an expression, the evaluated result
     *            should be an integer.
     *            </p>
     */
    public void setIntegerValue(String integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * The asset property value is an integer. You can also specify an
     * expression. If you use an expression, the evaluated result should be an
     * integer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integerValue <p>
     *            The asset property value is an integer. You can also specify
     *            an expression. If you use an expression, the evaluated result
     *            should be an integer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyVariant withIntegerValue(String integerValue) {
        this.integerValue = integerValue;
        return this;
    }

    /**
     * <p>
     * The asset property value is a double. You can also specify an expression.
     * If you use an expression, the evaluated result should be a double.
     * </p>
     *
     * @return <p>
     *         The asset property value is a double. You can also specify an
     *         expression. If you use an expression, the evaluated result should
     *         be a double.
     *         </p>
     */
    public String getDoubleValue() {
        return doubleValue;
    }

    /**
     * <p>
     * The asset property value is a double. You can also specify an expression.
     * If you use an expression, the evaluated result should be a double.
     * </p>
     *
     * @param doubleValue <p>
     *            The asset property value is a double. You can also specify an
     *            expression. If you use an expression, the evaluated result
     *            should be a double.
     *            </p>
     */
    public void setDoubleValue(String doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * The asset property value is a double. You can also specify an expression.
     * If you use an expression, the evaluated result should be a double.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param doubleValue <p>
     *            The asset property value is a double. You can also specify an
     *            expression. If you use an expression, the evaluated result
     *            should be a double.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyVariant withDoubleValue(String doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * <p>
     * The asset property value is a Boolean value that must be
     * <code>TRUE</code> or <code>FALSE</code>. You can also specify an
     * expression. If you use an expression, the evaluated result should be a
     * Boolean value.
     * </p>
     *
     * @return <p>
     *         The asset property value is a Boolean value that must be
     *         <code>TRUE</code> or <code>FALSE</code>. You can also specify an
     *         expression. If you use an expression, the evaluated result should
     *         be a Boolean value.
     *         </p>
     */
    public String getBooleanValue() {
        return booleanValue;
    }

    /**
     * <p>
     * The asset property value is a Boolean value that must be
     * <code>TRUE</code> or <code>FALSE</code>. You can also specify an
     * expression. If you use an expression, the evaluated result should be a
     * Boolean value.
     * </p>
     *
     * @param booleanValue <p>
     *            The asset property value is a Boolean value that must be
     *            <code>TRUE</code> or <code>FALSE</code>. You can also specify
     *            an expression. If you use an expression, the evaluated result
     *            should be a Boolean value.
     *            </p>
     */
    public void setBooleanValue(String booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * The asset property value is a Boolean value that must be
     * <code>TRUE</code> or <code>FALSE</code>. You can also specify an
     * expression. If you use an expression, the evaluated result should be a
     * Boolean value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param booleanValue <p>
     *            The asset property value is a Boolean value that must be
     *            <code>TRUE</code> or <code>FALSE</code>. You can also specify
     *            an expression. If you use an expression, the evaluated result
     *            should be a Boolean value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyVariant withBooleanValue(String booleanValue) {
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

        if (obj instanceof AssetPropertyVariant == false)
            return false;
        AssetPropertyVariant other = (AssetPropertyVariant) obj;

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
