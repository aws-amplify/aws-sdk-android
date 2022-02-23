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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that holds information about the different lines found in a
 * document's tables.
 * </p>
 */
public class LineItemFields implements Serializable {
    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     */
    private java.util.List<ExpenseField> lineItemExpenseFields;

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     *
     * @return <p>
     *         ExpenseFields used to show information from detected lines on a
     *         table.
     *         </p>
     */
    public java.util.List<ExpenseField> getLineItemExpenseFields() {
        return lineItemExpenseFields;
    }

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     *
     * @param lineItemExpenseFields <p>
     *            ExpenseFields used to show information from detected lines on
     *            a table.
     *            </p>
     */
    public void setLineItemExpenseFields(java.util.Collection<ExpenseField> lineItemExpenseFields) {
        if (lineItemExpenseFields == null) {
            this.lineItemExpenseFields = null;
            return;
        }

        this.lineItemExpenseFields = new java.util.ArrayList<ExpenseField>(lineItemExpenseFields);
    }

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineItemExpenseFields <p>
     *            ExpenseFields used to show information from detected lines on
     *            a table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LineItemFields withLineItemExpenseFields(ExpenseField... lineItemExpenseFields) {
        if (getLineItemExpenseFields() == null) {
            this.lineItemExpenseFields = new java.util.ArrayList<ExpenseField>(
                    lineItemExpenseFields.length);
        }
        for (ExpenseField value : lineItemExpenseFields) {
            this.lineItemExpenseFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineItemExpenseFields <p>
     *            ExpenseFields used to show information from detected lines on
     *            a table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LineItemFields withLineItemExpenseFields(
            java.util.Collection<ExpenseField> lineItemExpenseFields) {
        setLineItemExpenseFields(lineItemExpenseFields);
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
        if (getLineItemExpenseFields() != null)
            sb.append("LineItemExpenseFields: " + getLineItemExpenseFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLineItemExpenseFields() == null) ? 0 : getLineItemExpenseFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineItemFields == false)
            return false;
        LineItemFields other = (LineItemFields) obj;

        if (other.getLineItemExpenseFields() == null ^ this.getLineItemExpenseFields() == null)
            return false;
        if (other.getLineItemExpenseFields() != null
                && other.getLineItemExpenseFields().equals(this.getLineItemExpenseFields()) == false)
            return false;
        return true;
    }
}
