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
 * An attribute returned from an index query.
 * </p>
 */
public class AdditionalResultAttribute implements Serializable {
    /**
     * <p>
     * The key that identifies the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String key;

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_WITH_HIGHLIGHTS_VALUE
     */
    private String valueType;

    /**
     * <p>
     * An object that contains the attribute value.
     * </p>
     */
    private AdditionalResultAttributeValue value;

    /**
     * <p>
     * The key that identifies the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The key that identifies the attribute.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key that identifies the attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param key <p>
     *            The key that identifies the attribute.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key that identifies the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param key <p>
     *            The key that identifies the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdditionalResultAttribute withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_WITH_HIGHLIGHTS_VALUE
     *
     * @return <p>
     *         The data type of the <code>Value</code> property.
     *         </p>
     * @see AdditionalResultAttributeValueType
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_WITH_HIGHLIGHTS_VALUE
     *
     * @param valueType <p>
     *            The data type of the <code>Value</code> property.
     *            </p>
     * @see AdditionalResultAttributeValueType
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_WITH_HIGHLIGHTS_VALUE
     *
     * @param valueType <p>
     *            The data type of the <code>Value</code> property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdditionalResultAttributeValueType
     */
    public AdditionalResultAttribute withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_WITH_HIGHLIGHTS_VALUE
     *
     * @param valueType <p>
     *            The data type of the <code>Value</code> property.
     *            </p>
     * @see AdditionalResultAttributeValueType
     */
    public void setValueType(AdditionalResultAttributeValueType valueType) {
        this.valueType = valueType.toString();
    }

    /**
     * <p>
     * The data type of the <code>Value</code> property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_WITH_HIGHLIGHTS_VALUE
     *
     * @param valueType <p>
     *            The data type of the <code>Value</code> property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdditionalResultAttributeValueType
     */
    public AdditionalResultAttribute withValueType(AdditionalResultAttributeValueType valueType) {
        this.valueType = valueType.toString();
        return this;
    }

    /**
     * <p>
     * An object that contains the attribute value.
     * </p>
     *
     * @return <p>
     *         An object that contains the attribute value.
     *         </p>
     */
    public AdditionalResultAttributeValue getValue() {
        return value;
    }

    /**
     * <p>
     * An object that contains the attribute value.
     * </p>
     *
     * @param value <p>
     *            An object that contains the attribute value.
     *            </p>
     */
    public void setValue(AdditionalResultAttributeValue value) {
        this.value = value;
    }

    /**
     * <p>
     * An object that contains the attribute value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            An object that contains the attribute value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdditionalResultAttribute withValue(AdditionalResultAttributeValue value) {
        this.value = value;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValueType() != null)
            sb.append("ValueType: " + getValueType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalResultAttribute == false)
            return false;
        AdditionalResultAttribute other = (AdditionalResultAttribute) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null
                && other.getValueType().equals(this.getValueType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
