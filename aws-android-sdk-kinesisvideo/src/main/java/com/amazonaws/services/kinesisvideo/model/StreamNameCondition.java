/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

public class StreamNameCondition implements Serializable {
    /**
     * The new value for the comparisonOperator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     */
    private String comparisonOperator;

    /**
     * The new value for the comparisonValue property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String comparisonValue;

    /**
     * Returns the value of the comparisonOperator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @return The value of the comparisonOperator property for this object.
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of comparisonOperator
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @param comparisonOperator The new value for the comparisonOperator
     *            property for this object.
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @param comparisonOperator The new value for the comparisonOperator
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public StreamNameCondition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * Sets the value of comparisonOperator
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @param comparisonOperator The new value for the comparisonOperator
     *            property for this object.
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * Sets the value of the comparisonOperator property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @param comparisonOperator The new value for the comparisonOperator
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public StreamNameCondition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * Returns the value of the comparisonValue property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the comparisonValue property for this object.
     */
    public String getComparisonValue() {
        return comparisonValue;
    }

    /**
     * Sets the value of comparisonValue
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param comparisonValue The new value for the comparisonValue property for
     *            this object.
     */
    public void setComparisonValue(String comparisonValue) {
        this.comparisonValue = comparisonValue;
    }

    /**
     * Sets the value of the comparisonValue property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param comparisonValue The new value for the comparisonValue property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamNameCondition withComparisonValue(String comparisonValue) {
        this.comparisonValue = comparisonValue;
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
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator() + ",");
        if (getComparisonValue() != null)
            sb.append("ComparisonValue: " + getComparisonValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode
                + ((getComparisonValue() == null) ? 0 : getComparisonValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamNameCondition == false)
            return false;
        StreamNameCondition other = (StreamNameCondition) obj;

        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getComparisonValue() == null ^ this.getComparisonValue() == null)
            return false;
        if (other.getComparisonValue() != null
                && other.getComparisonValue().equals(this.getComparisonValue()) == false)
            return false;
        return true;
    }
}
