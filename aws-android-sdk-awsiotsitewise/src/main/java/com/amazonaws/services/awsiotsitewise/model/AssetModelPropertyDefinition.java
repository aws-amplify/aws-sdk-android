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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an asset model property definition. This property definition is
 * applied to all assets created from the asset model.
 * </p>
 */
public class AssetModelPropertyDefinition implements Serializable {
    /**
     * <p>
     * The name of the property definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String name;

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     */
    private String dataType;

    /**
     * <p>
     * The unit of the property definition, such as <code>Newtons</code> or
     * <code>RPM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String unit;

    /**
     * <p>
     * The property definition type (see <code>PropertyType</code>). You can
     * only specify one type in a property definition.
     * </p>
     */
    private PropertyType type;

    /**
     * <p>
     * The name of the property definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The name of the property definition.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the property definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param name <p>
     *            The name of the property definition.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the property definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param name <p>
     *            The name of the property definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelPropertyDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @return <p>
     *         The data type of the property definition.
     *         </p>
     * @see PropertyDataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @param dataType <p>
     *            The data type of the property definition.
     *            </p>
     * @see PropertyDataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @param dataType <p>
     *            The data type of the property definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyDataType
     */
    public AssetModelPropertyDefinition withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @param dataType <p>
     *            The data type of the property definition.
     *            </p>
     * @see PropertyDataType
     */
    public void setDataType(PropertyDataType dataType) {
        this.dataType = dataType.toString();
    }

    /**
     * <p>
     * The data type of the property definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, DOUBLE, BOOLEAN
     *
     * @param dataType <p>
     *            The data type of the property definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyDataType
     */
    public AssetModelPropertyDefinition withDataType(PropertyDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The unit of the property definition, such as <code>Newtons</code> or
     * <code>RPM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The unit of the property definition, such as <code>Newtons</code>
     *         or <code>RPM</code>.
     *         </p>
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of the property definition, such as <code>Newtons</code> or
     * <code>RPM</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param unit <p>
     *            The unit of the property definition, such as
     *            <code>Newtons</code> or <code>RPM</code>.
     *            </p>
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the property definition, such as <code>Newtons</code> or
     * <code>RPM</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param unit <p>
     *            The unit of the property definition, such as
     *            <code>Newtons</code> or <code>RPM</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelPropertyDefinition withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The property definition type (see <code>PropertyType</code>). You can
     * only specify one type in a property definition.
     * </p>
     *
     * @return <p>
     *         The property definition type (see <code>PropertyType</code>). You
     *         can only specify one type in a property definition.
     *         </p>
     */
    public PropertyType getType() {
        return type;
    }

    /**
     * <p>
     * The property definition type (see <code>PropertyType</code>). You can
     * only specify one type in a property definition.
     * </p>
     *
     * @param type <p>
     *            The property definition type (see <code>PropertyType</code>).
     *            You can only specify one type in a property definition.
     *            </p>
     */
    public void setType(PropertyType type) {
        this.type = type;
    }

    /**
     * <p>
     * The property definition type (see <code>PropertyType</code>). You can
     * only specify one type in a property definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The property definition type (see <code>PropertyType</code>).
     *            You can only specify one type in a property definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelPropertyDefinition withType(PropertyType type) {
        this.type = type;
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
            sb.append("name: " + getName() + ",");
        if (getDataType() != null)
            sb.append("dataType: " + getDataType() + ",");
        if (getUnit() != null)
            sb.append("unit: " + getUnit() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelPropertyDefinition == false)
            return false;
        AssetModelPropertyDefinition other = (AssetModelPropertyDefinition) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
