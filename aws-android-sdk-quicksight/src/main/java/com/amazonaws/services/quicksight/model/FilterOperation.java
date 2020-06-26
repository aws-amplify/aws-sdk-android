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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A transform operation that filters rows based on a condition.
 * </p>
 */
public class FilterOperation implements Serializable {
    /**
     * <p>
     * An expression that must evaluate to a Boolean value. Rows for which the
     * expression evaluates to true are kept in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String conditionExpression;

    /**
     * <p>
     * An expression that must evaluate to a Boolean value. Rows for which the
     * expression evaluates to true are kept in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         An expression that must evaluate to a Boolean value. Rows for
     *         which the expression evaluates to true are kept in the dataset.
     *         </p>
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    /**
     * <p>
     * An expression that must evaluate to a Boolean value. Rows for which the
     * expression evaluates to true are kept in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param conditionExpression <p>
     *            An expression that must evaluate to a Boolean value. Rows for
     *            which the expression evaluates to true are kept in the
     *            dataset.
     *            </p>
     */
    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * <p>
     * An expression that must evaluate to a Boolean value. Rows for which the
     * expression evaluates to true are kept in the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param conditionExpression <p>
     *            An expression that must evaluate to a Boolean value. Rows for
     *            which the expression evaluates to true are kept in the
     *            dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterOperation withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
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
        if (getConditionExpression() != null)
            sb.append("ConditionExpression: " + getConditionExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConditionExpression() == null) ? 0 : getConditionExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterOperation == false)
            return false;
        FilterOperation other = (FilterOperation) obj;

        if (other.getConditionExpression() == null ^ this.getConditionExpression() == null)
            return false;
        if (other.getConditionExpression() != null
                && other.getConditionExpression().equals(this.getConditionExpression()) == false)
            return false;
        return true;
    }
}
