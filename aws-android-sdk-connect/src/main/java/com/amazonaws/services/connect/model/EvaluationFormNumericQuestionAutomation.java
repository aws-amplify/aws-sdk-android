/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the automation configuration in numeric questions.
 * </p>
 */
public class EvaluationFormNumericQuestionAutomation implements Serializable {
    /**
     * <p>
     * The property value of the automation.
     * </p>
     */
    private NumericQuestionPropertyValueAutomation propertyValue;

    /**
     * <p>
     * The property value of the automation.
     * </p>
     *
     * @return <p>
     *         The property value of the automation.
     *         </p>
     */
    public NumericQuestionPropertyValueAutomation getPropertyValue() {
        return propertyValue;
    }

    /**
     * <p>
     * The property value of the automation.
     * </p>
     *
     * @param propertyValue <p>
     *            The property value of the automation.
     *            </p>
     */
    public void setPropertyValue(NumericQuestionPropertyValueAutomation propertyValue) {
        this.propertyValue = propertyValue;
    }

    /**
     * <p>
     * The property value of the automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyValue <p>
     *            The property value of the automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormNumericQuestionAutomation withPropertyValue(
            NumericQuestionPropertyValueAutomation propertyValue) {
        this.propertyValue = propertyValue;
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
        if (getPropertyValue() != null)
            sb.append("PropertyValue: " + getPropertyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPropertyValue() == null) ? 0 : getPropertyValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormNumericQuestionAutomation == false)
            return false;
        EvaluationFormNumericQuestionAutomation other = (EvaluationFormNumericQuestionAutomation) obj;

        if (other.getPropertyValue() == null ^ this.getPropertyValue() == null)
            return false;
        if (other.getPropertyValue() != null
                && other.getPropertyValue().equals(this.getPropertyValue()) == false)
            return false;
        return true;
    }
}
