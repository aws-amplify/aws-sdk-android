/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Specifies the condition that streams must satisfy to be returned when you
 * list streams (see the <code>ListStreams</code> API). A condition has a
 * comparison operation and a value. Currently, you can specify only the
 * <code>BEGINS_WITH</code> operator, which finds streams whose names start with
 * a given prefix.
 * </p>
 */
public class StreamNameCondition implements Serializable {
    /**
     * <p>
     * A comparison operator. Currently, you can specify only the
     * <code>BEGINS_WITH</code> operator, which finds streams whose names start
     * with a given prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     */
    private String comparisonOperator;

    /**
     * <p>
     * A value to compare.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String comparisonValue;

    /**
     * <p>
     * A comparison operator. Currently, you can specify only the
     * <code>BEGINS_WITH</code> operator, which finds streams whose names start
     * with a given prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @return <p>
     *         A comparison operator. Currently, you can specify only the
     *         <code>BEGINS_WITH</code> operator, which finds streams whose
     *         names start with a given prefix.
     *         </p>
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * <p>
     * A comparison operator. Currently, you can specify only the
     * <code>BEGINS_WITH</code> operator, which finds streams whose names start
     * with a given prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @param comparisonOperator <p>
     *            A comparison operator. Currently, you can specify only the
     *            <code>BEGINS_WITH</code> operator, which finds streams whose
     *            names start with a given prefix.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * A comparison operator. Currently, you can specify only the
     * <code>BEGINS_WITH</code> operator, which finds streams whose names start
     * with a given prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @param comparisonOperator <p>
     *            A comparison operator. Currently, you can specify only the
     *            <code>BEGINS_WITH</code> operator, which finds streams whose
     *            names start with a given prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public StreamNameCondition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * <p>
     * A comparison operator. Currently, you can specify only the
     * <code>BEGINS_WITH</code> operator, which finds streams whose names start
     * with a given prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @param comparisonOperator <p>
     *            A comparison operator. Currently, you can specify only the
     *            <code>BEGINS_WITH</code> operator, which finds streams whose
     *            names start with a given prefix.
     *            </p>
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * A comparison operator. Currently, you can specify only the
     * <code>BEGINS_WITH</code> operator, which finds streams whose names start
     * with a given prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BEGINS_WITH
     *
     * @param comparisonOperator <p>
     *            A comparison operator. Currently, you can specify only the
     *            <code>BEGINS_WITH</code> operator, which finds streams whose
     *            names start with a given prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */
    public StreamNameCondition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * A value to compare.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         A value to compare.
     *         </p>
     */
    public String getComparisonValue() {
        return comparisonValue;
    }

    /**
     * <p>
     * A value to compare.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param comparisonValue <p>
     *            A value to compare.
     *            </p>
     */
    public void setComparisonValue(String comparisonValue) {
        this.comparisonValue = comparisonValue;
    }

    /**
     * <p>
     * A value to compare.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param comparisonValue <p>
     *            A value to compare.
     *            </p>
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
