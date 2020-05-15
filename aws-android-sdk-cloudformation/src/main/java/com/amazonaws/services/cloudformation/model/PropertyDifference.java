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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a resource property whose actual value differs from its
 * expected value, as defined in the stack template and any values specified as
 * template parameters. These will be present only for resources whose
 * <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
 * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
 * </p>
 */
public class PropertyDifference implements Serializable {
    /**
     * <p>
     * The fully-qualified path to the resource property.
     * </p>
     */
    private String propertyPath;

    /**
     * <p>
     * The expected property value of the resource property, as defined in the
     * stack template and any values specified as template parameters.
     * </p>
     */
    private String expectedValue;

    /**
     * <p>
     * The actual property value of the resource property.
     * </p>
     */
    private String actualValue;

    /**
     * <p>
     * The type of property difference.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code>: A value has been added to a resource property that is
     * an array or list data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code>: The property has been removed from the current
     * resource configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EQUAL</code>: The current property value differs from its
     * expected value (as defined in the stack template and any values specified
     * as template parameters).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, REMOVE, NOT_EQUAL
     */
    private String differenceType;

    /**
     * <p>
     * The fully-qualified path to the resource property.
     * </p>
     *
     * @return <p>
     *         The fully-qualified path to the resource property.
     *         </p>
     */
    public String getPropertyPath() {
        return propertyPath;
    }

    /**
     * <p>
     * The fully-qualified path to the resource property.
     * </p>
     *
     * @param propertyPath <p>
     *            The fully-qualified path to the resource property.
     *            </p>
     */
    public void setPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
    }

    /**
     * <p>
     * The fully-qualified path to the resource property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyPath <p>
     *            The fully-qualified path to the resource property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyDifference withPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
        return this;
    }

    /**
     * <p>
     * The expected property value of the resource property, as defined in the
     * stack template and any values specified as template parameters.
     * </p>
     *
     * @return <p>
     *         The expected property value of the resource property, as defined
     *         in the stack template and any values specified as template
     *         parameters.
     *         </p>
     */
    public String getExpectedValue() {
        return expectedValue;
    }

    /**
     * <p>
     * The expected property value of the resource property, as defined in the
     * stack template and any values specified as template parameters.
     * </p>
     *
     * @param expectedValue <p>
     *            The expected property value of the resource property, as
     *            defined in the stack template and any values specified as
     *            template parameters.
     *            </p>
     */
    public void setExpectedValue(String expectedValue) {
        this.expectedValue = expectedValue;
    }

    /**
     * <p>
     * The expected property value of the resource property, as defined in the
     * stack template and any values specified as template parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedValue <p>
     *            The expected property value of the resource property, as
     *            defined in the stack template and any values specified as
     *            template parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyDifference withExpectedValue(String expectedValue) {
        this.expectedValue = expectedValue;
        return this;
    }

    /**
     * <p>
     * The actual property value of the resource property.
     * </p>
     *
     * @return <p>
     *         The actual property value of the resource property.
     *         </p>
     */
    public String getActualValue() {
        return actualValue;
    }

    /**
     * <p>
     * The actual property value of the resource property.
     * </p>
     *
     * @param actualValue <p>
     *            The actual property value of the resource property.
     *            </p>
     */
    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * <p>
     * The actual property value of the resource property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actualValue <p>
     *            The actual property value of the resource property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyDifference withActualValue(String actualValue) {
        this.actualValue = actualValue;
        return this;
    }

    /**
     * <p>
     * The type of property difference.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code>: A value has been added to a resource property that is
     * an array or list data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code>: The property has been removed from the current
     * resource configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EQUAL</code>: The current property value differs from its
     * expected value (as defined in the stack template and any values specified
     * as template parameters).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, REMOVE, NOT_EQUAL
     *
     * @return <p>
     *         The type of property difference.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ADD</code>: A value has been added to a resource property
     *         that is an array or list data type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVE</code>: The property has been removed from the
     *         current resource configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_EQUAL</code>: The current property value differs from
     *         its expected value (as defined in the stack template and any
     *         values specified as template parameters).
     *         </p>
     *         </li>
     *         </ul>
     * @see DifferenceType
     */
    public String getDifferenceType() {
        return differenceType;
    }

    /**
     * <p>
     * The type of property difference.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code>: A value has been added to a resource property that is
     * an array or list data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code>: The property has been removed from the current
     * resource configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EQUAL</code>: The current property value differs from its
     * expected value (as defined in the stack template and any values specified
     * as template parameters).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, REMOVE, NOT_EQUAL
     *
     * @param differenceType <p>
     *            The type of property difference.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ADD</code>: A value has been added to a resource
     *            property that is an array or list data type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>REMOVE</code>: The property has been removed from the
     *            current resource configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_EQUAL</code>: The current property value differs
     *            from its expected value (as defined in the stack template and
     *            any values specified as template parameters).
     *            </p>
     *            </li>
     *            </ul>
     * @see DifferenceType
     */
    public void setDifferenceType(String differenceType) {
        this.differenceType = differenceType;
    }

    /**
     * <p>
     * The type of property difference.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code>: A value has been added to a resource property that is
     * an array or list data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code>: The property has been removed from the current
     * resource configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EQUAL</code>: The current property value differs from its
     * expected value (as defined in the stack template and any values specified
     * as template parameters).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, REMOVE, NOT_EQUAL
     *
     * @param differenceType <p>
     *            The type of property difference.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ADD</code>: A value has been added to a resource
     *            property that is an array or list data type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>REMOVE</code>: The property has been removed from the
     *            current resource configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_EQUAL</code>: The current property value differs
     *            from its expected value (as defined in the stack template and
     *            any values specified as template parameters).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DifferenceType
     */
    public PropertyDifference withDifferenceType(String differenceType) {
        this.differenceType = differenceType;
        return this;
    }

    /**
     * <p>
     * The type of property difference.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code>: A value has been added to a resource property that is
     * an array or list data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code>: The property has been removed from the current
     * resource configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EQUAL</code>: The current property value differs from its
     * expected value (as defined in the stack template and any values specified
     * as template parameters).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, REMOVE, NOT_EQUAL
     *
     * @param differenceType <p>
     *            The type of property difference.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ADD</code>: A value has been added to a resource
     *            property that is an array or list data type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>REMOVE</code>: The property has been removed from the
     *            current resource configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_EQUAL</code>: The current property value differs
     *            from its expected value (as defined in the stack template and
     *            any values specified as template parameters).
     *            </p>
     *            </li>
     *            </ul>
     * @see DifferenceType
     */
    public void setDifferenceType(DifferenceType differenceType) {
        this.differenceType = differenceType.toString();
    }

    /**
     * <p>
     * The type of property difference.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADD</code>: A value has been added to a resource property that is
     * an array or list data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code>: The property has been removed from the current
     * resource configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EQUAL</code>: The current property value differs from its
     * expected value (as defined in the stack template and any values specified
     * as template parameters).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, REMOVE, NOT_EQUAL
     *
     * @param differenceType <p>
     *            The type of property difference.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ADD</code>: A value has been added to a resource
     *            property that is an array or list data type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>REMOVE</code>: The property has been removed from the
     *            current resource configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_EQUAL</code>: The current property value differs
     *            from its expected value (as defined in the stack template and
     *            any values specified as template parameters).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DifferenceType
     */
    public PropertyDifference withDifferenceType(DifferenceType differenceType) {
        this.differenceType = differenceType.toString();
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
        if (getPropertyPath() != null)
            sb.append("PropertyPath: " + getPropertyPath() + ",");
        if (getExpectedValue() != null)
            sb.append("ExpectedValue: " + getExpectedValue() + ",");
        if (getActualValue() != null)
            sb.append("ActualValue: " + getActualValue() + ",");
        if (getDifferenceType() != null)
            sb.append("DifferenceType: " + getDifferenceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPropertyPath() == null) ? 0 : getPropertyPath().hashCode());
        hashCode = prime * hashCode
                + ((getExpectedValue() == null) ? 0 : getExpectedValue().hashCode());
        hashCode = prime * hashCode
                + ((getActualValue() == null) ? 0 : getActualValue().hashCode());
        hashCode = prime * hashCode
                + ((getDifferenceType() == null) ? 0 : getDifferenceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyDifference == false)
            return false;
        PropertyDifference other = (PropertyDifference) obj;

        if (other.getPropertyPath() == null ^ this.getPropertyPath() == null)
            return false;
        if (other.getPropertyPath() != null
                && other.getPropertyPath().equals(this.getPropertyPath()) == false)
            return false;
        if (other.getExpectedValue() == null ^ this.getExpectedValue() == null)
            return false;
        if (other.getExpectedValue() != null
                && other.getExpectedValue().equals(this.getExpectedValue()) == false)
            return false;
        if (other.getActualValue() == null ^ this.getActualValue() == null)
            return false;
        if (other.getActualValue() != null
                && other.getActualValue().equals(this.getActualValue()) == false)
            return false;
        if (other.getDifferenceType() == null ^ this.getDifferenceType() == null)
            return false;
        if (other.getDifferenceType() != null
                && other.getDifferenceType().equals(this.getDifferenceType()) == false)
            return false;
        return true;
    }
}
