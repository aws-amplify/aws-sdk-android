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
 * Contains a property type, which can be one of <code>attribute</code>,
 * <code>measurement</code>, <code>metric</code>, or <code>transform</code>.
 * </p>
 */
public class PropertyType implements Serializable {
    /**
     * <p>
     * Specifies an asset attribute property. An attribute generally contains
     * static information, such as the serial number of an <a href=
     * "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
     * >IIoT</a> wind turbine.
     * </p>
     */
    private Attribute attribute;

    /**
     * <p>
     * Specifies an asset measurement property. A measurement represents a
     * device's raw sensor data stream, such as timestamped temperature values
     * or timestamped power values.
     * </p>
     */
    private Measurement measurement;

    /**
     * <p>
     * Specifies an asset transform property. A transform contains a
     * mathematical expression that maps a property's data points from one form
     * to another, such as a unit conversion from Celsius to Fahrenheit.
     * </p>
     */
    private Transform transform;

    /**
     * <p>
     * Specifies an asset metric property. A metric contains a mathematical
     * expression that uses aggregate functions to process all input data points
     * over a time interval and output a single data point, such as to calculate
     * the average hourly temperature.
     * </p>
     */
    private Metric metric;

    /**
     * <p>
     * Specifies an asset attribute property. An attribute generally contains
     * static information, such as the serial number of an <a href=
     * "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
     * >IIoT</a> wind turbine.
     * </p>
     *
     * @return <p>
     *         Specifies an asset attribute property. An attribute generally
     *         contains static information, such as the serial number of an <a
     *         href=
     *         "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
     *         >IIoT</a> wind turbine.
     *         </p>
     */
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * <p>
     * Specifies an asset attribute property. An attribute generally contains
     * static information, such as the serial number of an <a href=
     * "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
     * >IIoT</a> wind turbine.
     * </p>
     *
     * @param attribute <p>
     *            Specifies an asset attribute property. An attribute generally
     *            contains static information, such as the serial number of an
     *            <a href=
     *            "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
     *            >IIoT</a> wind turbine.
     *            </p>
     */
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * Specifies an asset attribute property. An attribute generally contains
     * static information, such as the serial number of an <a href=
     * "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
     * >IIoT</a> wind turbine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attribute <p>
     *            Specifies an asset attribute property. An attribute generally
     *            contains static information, such as the serial number of an
     *            <a href=
     *            "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
     *            >IIoT</a> wind turbine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyType withAttribute(Attribute attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * <p>
     * Specifies an asset measurement property. A measurement represents a
     * device's raw sensor data stream, such as timestamped temperature values
     * or timestamped power values.
     * </p>
     *
     * @return <p>
     *         Specifies an asset measurement property. A measurement represents
     *         a device's raw sensor data stream, such as timestamped
     *         temperature values or timestamped power values.
     *         </p>
     */
    public Measurement getMeasurement() {
        return measurement;
    }

    /**
     * <p>
     * Specifies an asset measurement property. A measurement represents a
     * device's raw sensor data stream, such as timestamped temperature values
     * or timestamped power values.
     * </p>
     *
     * @param measurement <p>
     *            Specifies an asset measurement property. A measurement
     *            represents a device's raw sensor data stream, such as
     *            timestamped temperature values or timestamped power values.
     *            </p>
     */
    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    /**
     * <p>
     * Specifies an asset measurement property. A measurement represents a
     * device's raw sensor data stream, such as timestamped temperature values
     * or timestamped power values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param measurement <p>
     *            Specifies an asset measurement property. A measurement
     *            represents a device's raw sensor data stream, such as
     *            timestamped temperature values or timestamped power values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyType withMeasurement(Measurement measurement) {
        this.measurement = measurement;
        return this;
    }

    /**
     * <p>
     * Specifies an asset transform property. A transform contains a
     * mathematical expression that maps a property's data points from one form
     * to another, such as a unit conversion from Celsius to Fahrenheit.
     * </p>
     *
     * @return <p>
     *         Specifies an asset transform property. A transform contains a
     *         mathematical expression that maps a property's data points from
     *         one form to another, such as a unit conversion from Celsius to
     *         Fahrenheit.
     *         </p>
     */
    public Transform getTransform() {
        return transform;
    }

    /**
     * <p>
     * Specifies an asset transform property. A transform contains a
     * mathematical expression that maps a property's data points from one form
     * to another, such as a unit conversion from Celsius to Fahrenheit.
     * </p>
     *
     * @param transform <p>
     *            Specifies an asset transform property. A transform contains a
     *            mathematical expression that maps a property's data points
     *            from one form to another, such as a unit conversion from
     *            Celsius to Fahrenheit.
     *            </p>
     */
    public void setTransform(Transform transform) {
        this.transform = transform;
    }

    /**
     * <p>
     * Specifies an asset transform property. A transform contains a
     * mathematical expression that maps a property's data points from one form
     * to another, such as a unit conversion from Celsius to Fahrenheit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transform <p>
     *            Specifies an asset transform property. A transform contains a
     *            mathematical expression that maps a property's data points
     *            from one form to another, such as a unit conversion from
     *            Celsius to Fahrenheit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyType withTransform(Transform transform) {
        this.transform = transform;
        return this;
    }

    /**
     * <p>
     * Specifies an asset metric property. A metric contains a mathematical
     * expression that uses aggregate functions to process all input data points
     * over a time interval and output a single data point, such as to calculate
     * the average hourly temperature.
     * </p>
     *
     * @return <p>
     *         Specifies an asset metric property. A metric contains a
     *         mathematical expression that uses aggregate functions to process
     *         all input data points over a time interval and output a single
     *         data point, such as to calculate the average hourly temperature.
     *         </p>
     */
    public Metric getMetric() {
        return metric;
    }

    /**
     * <p>
     * Specifies an asset metric property. A metric contains a mathematical
     * expression that uses aggregate functions to process all input data points
     * over a time interval and output a single data point, such as to calculate
     * the average hourly temperature.
     * </p>
     *
     * @param metric <p>
     *            Specifies an asset metric property. A metric contains a
     *            mathematical expression that uses aggregate functions to
     *            process all input data points over a time interval and output
     *            a single data point, such as to calculate the average hourly
     *            temperature.
     *            </p>
     */
    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * Specifies an asset metric property. A metric contains a mathematical
     * expression that uses aggregate functions to process all input data points
     * over a time interval and output a single data point, such as to calculate
     * the average hourly temperature.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metric <p>
     *            Specifies an asset metric property. A metric contains a
     *            mathematical expression that uses aggregate functions to
     *            process all input data points over a time interval and output
     *            a single data point, such as to calculate the average hourly
     *            temperature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyType withMetric(Metric metric) {
        this.metric = metric;
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
        if (getAttribute() != null)
            sb.append("attribute: " + getAttribute() + ",");
        if (getMeasurement() != null)
            sb.append("measurement: " + getMeasurement() + ",");
        if (getTransform() != null)
            sb.append("transform: " + getTransform() + ",");
        if (getMetric() != null)
            sb.append("metric: " + getMetric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode
                + ((getMeasurement() == null) ? 0 : getMeasurement().hashCode());
        hashCode = prime * hashCode + ((getTransform() == null) ? 0 : getTransform().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyType == false)
            return false;
        PropertyType other = (PropertyType) obj;

        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getMeasurement() == null ^ this.getMeasurement() == null)
            return false;
        if (other.getMeasurement() != null
                && other.getMeasurement().equals(this.getMeasurement()) == false)
            return false;
        if (other.getTransform() == null ^ this.getTransform() == null)
            return false;
        if (other.getTransform() != null
                && other.getTransform().equals(this.getTransform()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        return true;
    }
}
