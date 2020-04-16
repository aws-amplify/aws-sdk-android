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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * An object that defines the value of the key and its type in the
 * OperationalData map.
 * </p>
 */
public class OpsItemDataValue implements Serializable {
    /**
     * <p>
     * The value of the OperationalData key.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of key-value pair. Valid types include
     * <code>SearchableString</code> and <code>String</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SearchableString, String
     */
    private String type;

    /**
     * <p>
     * The value of the OperationalData key.
     * </p>
     *
     * @return <p>
     *         The value of the OperationalData key.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the OperationalData key.
     * </p>
     *
     * @param value <p>
     *            The value of the OperationalData key.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the OperationalData key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the OperationalData key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemDataValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include
     * <code>SearchableString</code> and <code>String</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SearchableString, String
     *
     * @return <p>
     *         The type of key-value pair. Valid types include
     *         <code>SearchableString</code> and <code>String</code>.
     *         </p>
     * @see OpsItemDataType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include
     * <code>SearchableString</code> and <code>String</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SearchableString, String
     *
     * @param type <p>
     *            The type of key-value pair. Valid types include
     *            <code>SearchableString</code> and <code>String</code>.
     *            </p>
     * @see OpsItemDataType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include
     * <code>SearchableString</code> and <code>String</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SearchableString, String
     *
     * @param type <p>
     *            The type of key-value pair. Valid types include
     *            <code>SearchableString</code> and <code>String</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemDataType
     */
    public OpsItemDataValue withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include
     * <code>SearchableString</code> and <code>String</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SearchableString, String
     *
     * @param type <p>
     *            The type of key-value pair. Valid types include
     *            <code>SearchableString</code> and <code>String</code>.
     *            </p>
     * @see OpsItemDataType
     */
    public void setType(OpsItemDataType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of key-value pair. Valid types include
     * <code>SearchableString</code> and <code>String</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SearchableString, String
     *
     * @param type <p>
     *            The type of key-value pair. Valid types include
     *            <code>SearchableString</code> and <code>String</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemDataType
     */
    public OpsItemDataValue withType(OpsItemDataType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsItemDataValue == false)
            return false;
        OpsItemDataValue other = (OpsItemDataValue) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
