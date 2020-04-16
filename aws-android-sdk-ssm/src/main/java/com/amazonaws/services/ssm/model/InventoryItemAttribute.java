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
 * Attributes are the entries within the inventory item content. It contains
 * name and value.
 * </p>
 */
public class InventoryItemAttribute implements Serializable {
    /**
     * <p>
     * Name of the inventory item attribute.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, number
     */
    private String dataType;

    /**
     * <p>
     * Name of the inventory item attribute.
     * </p>
     *
     * @return <p>
     *         Name of the inventory item attribute.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the inventory item attribute.
     * </p>
     *
     * @param name <p>
     *            Name of the inventory item attribute.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the inventory item attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Name of the inventory item attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryItemAttribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, number
     *
     * @return <p>
     *         The data type of the inventory item attribute.
     *         </p>
     * @see InventoryAttributeDataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, number
     *
     * @param dataType <p>
     *            The data type of the inventory item attribute.
     *            </p>
     * @see InventoryAttributeDataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, number
     *
     * @param dataType <p>
     *            The data type of the inventory item attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryAttributeDataType
     */
    public InventoryItemAttribute withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, number
     *
     * @param dataType <p>
     *            The data type of the inventory item attribute.
     *            </p>
     * @see InventoryAttributeDataType
     */
    public void setDataType(InventoryAttributeDataType dataType) {
        this.dataType = dataType.toString();
    }

    /**
     * <p>
     * The data type of the inventory item attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, number
     *
     * @param dataType <p>
     *            The data type of the inventory item attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryAttributeDataType
     */
    public InventoryItemAttribute withDataType(InventoryAttributeDataType dataType) {
        this.dataType = dataType.toString();
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
        if (getDataType() != null)
            sb.append("DataType: " + getDataType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryItemAttribute == false)
            return false;
        InventoryItemAttribute other = (InventoryItemAttribute) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        return true;
    }
}
