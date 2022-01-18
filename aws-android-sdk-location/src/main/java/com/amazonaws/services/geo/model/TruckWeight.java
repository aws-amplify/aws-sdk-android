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
 * Contains details about the truck's weight specifications. Used to avoid roads
 * that can't support or allow the total weight for requests that specify
 * <code>TravelMode</code> as <code>Truck</code>.
 * </p>
 */
public class TruckWeight implements Serializable {
    /**
     * <p>
     * The total weight of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>3500</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double total;

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilograms, Pounds
     */
    private String unit;

    /**
     * <p>
     * The total weight of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>3500</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total weight of the truck.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>3500</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Double getTotal() {
        return total;
    }

    /**
     * <p>
     * The total weight of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>3500</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param total <p>
     *            The total weight of the truck.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, <code>3500</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * <p>
     * The total weight of the truck.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>3500</code>.
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
     * @param total <p>
     *            The total weight of the truck.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example, <code>3500</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TruckWeight withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilograms, Pounds
     *
     * @return <p>
     *         The unit of measurement to use for the truck weight.
     *         </p>
     *         <p>
     *         Default Value: <code>Kilograms</code>
     *         </p>
     * @see VehicleWeightUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilograms, Pounds
     *
     * @param unit <p>
     *            The unit of measurement to use for the truck weight.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilograms</code>
     *            </p>
     * @see VehicleWeightUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilograms, Pounds
     *
     * @param unit <p>
     *            The unit of measurement to use for the truck weight.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilograms</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VehicleWeightUnit
     */
    public TruckWeight withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilograms, Pounds
     *
     * @param unit <p>
     *            The unit of measurement to use for the truck weight.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilograms</code>
     *            </p>
     * @see VehicleWeightUnit
     */
    public void setUnit(VehicleWeightUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit of measurement to use for the truck weight.
     * </p>
     * <p>
     * Default Value: <code>Kilograms</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilograms, Pounds
     *
     * @param unit <p>
     *            The unit of measurement to use for the truck weight.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilograms</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VehicleWeightUnit
     */
    public TruckWeight withUnit(VehicleWeightUnit unit) {
        this.unit = unit.toString();
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
        if (getTotal() != null)
            sb.append("Total: " + getTotal() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TruckWeight == false)
            return false;
        TruckWeight other = (TruckWeight) obj;

        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
