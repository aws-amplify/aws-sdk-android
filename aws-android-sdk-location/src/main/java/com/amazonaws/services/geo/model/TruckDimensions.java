/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details about the truck dimensions in the unit of measurement that
 * you specify. Used to filter out roads that can't support or allow the
 * specified dimensions for requests that specify <code>TravelMode</code> as
 * <code>Truck</code>.
 * </p>
 */
public class TruckDimensions implements Serializable {
    /**
     * <p>
     * The height of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double height;

    /**
     * <p>
     * The length of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>15.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double length;

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Meters, Feet
     */
    private String unit;

    /**
     * <p>
     * The width of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double width;

    /**
     * <p>
     * The height of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The height of the truck.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>4.5</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Double getHeight() {
        return height;
    }

    /**
     * <p>
     * The height of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param height <p>
     *            The height of the truck.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, <code>4.5</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * <p>
     * The height of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param height <p>
     *            The height of the truck.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, <code>4.5</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TruckDimensions withHeight(Double height) {
        this.height = height;
        return this;
    }

    /**
     * <p>
     * The length of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>15.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The length of the truck.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>15.5</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Double getLength() {
        return length;
    }

    /**
     * <p>
     * The length of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>15.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param length <p>
     *            The length of the truck.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, <code>15.5</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * <p>
     * The length of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>15.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param length <p>
     *            The length of the truck.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, <code>15.5</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TruckDimensions withLength(Double length) {
        this.length = length;
        return this;
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Meters, Feet
     *
     * @return <p>
     *         Specifies the unit of measurement for the truck dimensions.
     *         </p>
     *         <p>
     *         Default Value: <code>Meters</code>
     *         </p>
     * @see DimensionUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Meters, Feet
     *
     * @param unit <p>
     *            Specifies the unit of measurement for the truck dimensions.
     *            </p>
     *            <p>
     *            Default Value: <code>Meters</code>
     *            </p>
     * @see DimensionUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Meters, Feet
     *
     * @param unit <p>
     *            Specifies the unit of measurement for the truck dimensions.
     *            </p>
     *            <p>
     *            Default Value: <code>Meters</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionUnit
     */
    public TruckDimensions withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Meters, Feet
     *
     * @param unit <p>
     *            Specifies the unit of measurement for the truck dimensions.
     *            </p>
     *            <p>
     *            Default Value: <code>Meters</code>
     *            </p>
     * @see DimensionUnit
     */
    public void setUnit(DimensionUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * Specifies the unit of measurement for the truck dimensions.
     * </p>
     * <p>
     * Default Value: <code>Meters</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Meters, Feet
     *
     * @param unit <p>
     *            Specifies the unit of measurement for the truck dimensions.
     *            </p>
     *            <p>
     *            Default Value: <code>Meters</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionUnit
     */
    public TruckDimensions withUnit(DimensionUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The width of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The width of the truck.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>4.5</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Double getWidth() {
        return width;
    }

    /**
     * <p>
     * The width of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param width <p>
     *            The width of the truck.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, <code>4.5</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * <p>
     * The width of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>4.5</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param width <p>
     *            The width of the truck.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, <code>4.5</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TruckDimensions withWidth(Double width) {
        this.width = width;
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
        if (getHeight() != null)
            sb.append("Height: " + getHeight() + ",");
        if (getLength() != null)
            sb.append("Length: " + getLength() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit() + ",");
        if (getWidth() != null)
            sb.append("Width: " + getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TruckDimensions == false)
            return false;
        TruckDimensions other = (TruckDimensions) obj;

        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }
}
