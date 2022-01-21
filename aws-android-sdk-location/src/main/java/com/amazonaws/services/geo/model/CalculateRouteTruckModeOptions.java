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
 * Contains details about additional route preferences for requests that specify
 * <code>TravelMode</code> as <code>Truck</code>.
 * </p>
 */
public class CalculateRouteTruckModeOptions implements Serializable {
    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     */
    private Boolean avoidFerries;

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     */
    private Boolean avoidTolls;

    /**
     * <p>
     * Specifies the truck's dimension specifications including length, height,
     * width, and unit of measurement. Used to avoid roads that can't support
     * the truck's dimensions.
     * </p>
     */
    private TruckDimensions dimensions;

    /**
     * <p>
     * Specifies the truck's weight specifications including total weight and
     * unit of measurement. Used to avoid roads that can't support the truck's
     * weight.
     * </p>
     */
    private TruckWeight weight;

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @return <p>
     *         Avoids ferries when calculating routes.
     *         </p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     *         </p>
     */
    public Boolean isAvoidFerries() {
        return avoidFerries;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @return <p>
     *         Avoids ferries when calculating routes.
     *         </p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     *         </p>
     */
    public Boolean getAvoidFerries() {
        return avoidFerries;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @param avoidFerries <p>
     *            Avoids ferries when calculating routes.
     *            </p>
     *            <p>
     *            Default Value: <code>false</code>
     *            </p>
     *            <p>
     *            Valid Values: <code>false</code> | <code>true</code>
     *            </p>
     */
    public void setAvoidFerries(Boolean avoidFerries) {
        this.avoidFerries = avoidFerries;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param avoidFerries <p>
     *            Avoids ferries when calculating routes.
     *            </p>
     *            <p>
     *            Default Value: <code>false</code>
     *            </p>
     *            <p>
     *            Valid Values: <code>false</code> | <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteTruckModeOptions withAvoidFerries(Boolean avoidFerries) {
        this.avoidFerries = avoidFerries;
        return this;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @return <p>
     *         Avoids ferries when calculating routes.
     *         </p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     *         </p>
     */
    public Boolean isAvoidTolls() {
        return avoidTolls;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @return <p>
     *         Avoids ferries when calculating routes.
     *         </p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     *         </p>
     */
    public Boolean getAvoidTolls() {
        return avoidTolls;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @param avoidTolls <p>
     *            Avoids ferries when calculating routes.
     *            </p>
     *            <p>
     *            Default Value: <code>false</code>
     *            </p>
     *            <p>
     *            Valid Values: <code>false</code> | <code>true</code>
     *            </p>
     */
    public void setAvoidTolls(Boolean avoidTolls) {
        this.avoidTolls = avoidTolls;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param avoidTolls <p>
     *            Avoids ferries when calculating routes.
     *            </p>
     *            <p>
     *            Default Value: <code>false</code>
     *            </p>
     *            <p>
     *            Valid Values: <code>false</code> | <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteTruckModeOptions withAvoidTolls(Boolean avoidTolls) {
        this.avoidTolls = avoidTolls;
        return this;
    }

    /**
     * <p>
     * Specifies the truck's dimension specifications including length, height,
     * width, and unit of measurement. Used to avoid roads that can't support
     * the truck's dimensions.
     * </p>
     *
     * @return <p>
     *         Specifies the truck's dimension specifications including length,
     *         height, width, and unit of measurement. Used to avoid roads that
     *         can't support the truck's dimensions.
     *         </p>
     */
    public TruckDimensions getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * Specifies the truck's dimension specifications including length, height,
     * width, and unit of measurement. Used to avoid roads that can't support
     * the truck's dimensions.
     * </p>
     *
     * @param dimensions <p>
     *            Specifies the truck's dimension specifications including
     *            length, height, width, and unit of measurement. Used to avoid
     *            roads that can't support the truck's dimensions.
     *            </p>
     */
    public void setDimensions(TruckDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * Specifies the truck's dimension specifications including length, height,
     * width, and unit of measurement. Used to avoid roads that can't support
     * the truck's dimensions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            Specifies the truck's dimension specifications including
     *            length, height, width, and unit of measurement. Used to avoid
     *            roads that can't support the truck's dimensions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteTruckModeOptions withDimensions(TruckDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * <p>
     * Specifies the truck's weight specifications including total weight and
     * unit of measurement. Used to avoid roads that can't support the truck's
     * weight.
     * </p>
     *
     * @return <p>
     *         Specifies the truck's weight specifications including total
     *         weight and unit of measurement. Used to avoid roads that can't
     *         support the truck's weight.
     *         </p>
     */
    public TruckWeight getWeight() {
        return weight;
    }

    /**
     * <p>
     * Specifies the truck's weight specifications including total weight and
     * unit of measurement. Used to avoid roads that can't support the truck's
     * weight.
     * </p>
     *
     * @param weight <p>
     *            Specifies the truck's weight specifications including total
     *            weight and unit of measurement. Used to avoid roads that can't
     *            support the truck's weight.
     *            </p>
     */
    public void setWeight(TruckWeight weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * Specifies the truck's weight specifications including total weight and
     * unit of measurement. Used to avoid roads that can't support the truck's
     * weight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param weight <p>
     *            Specifies the truck's weight specifications including total
     *            weight and unit of measurement. Used to avoid roads that can't
     *            support the truck's weight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteTruckModeOptions withWeight(TruckWeight weight) {
        this.weight = weight;
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
        if (getAvoidFerries() != null)
            sb.append("AvoidFerries: " + getAvoidFerries() + ",");
        if (getAvoidTolls() != null)
            sb.append("AvoidTolls: " + getAvoidTolls() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getWeight() != null)
            sb.append("Weight: " + getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvoidFerries() == null) ? 0 : getAvoidFerries().hashCode());
        hashCode = prime * hashCode + ((getAvoidTolls() == null) ? 0 : getAvoidTolls().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteTruckModeOptions == false)
            return false;
        CalculateRouteTruckModeOptions other = (CalculateRouteTruckModeOptions) obj;

        if (other.getAvoidFerries() == null ^ this.getAvoidFerries() == null)
            return false;
        if (other.getAvoidFerries() != null
                && other.getAvoidFerries().equals(this.getAvoidFerries()) == false)
            return false;
        if (other.getAvoidTolls() == null ^ this.getAvoidTolls() == null)
            return false;
        if (other.getAvoidTolls() != null
                && other.getAvoidTolls().equals(this.getAvoidTolls()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }
}
