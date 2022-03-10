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
 * The structure holding all the information returned by AnalyzeExpense
 * </p>
 */
public class ExpenseDocument implements Serializable {
    /**
     * <p>
     * Denotes which invoice or receipt in the document the information is
     * coming from. First document will be 1, the second 2, and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer expenseIndex;

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     */
    private java.util.List<ExpenseField> summaryFields;

    /**
     * <p>
     * Information detected on each table of a document, seperated into
     * <code>LineItems</code>.
     * </p>
     */
    private java.util.List<LineItemGroup> lineItemGroups;

    /**
     * <p>
     * Denotes which invoice or receipt in the document the information is
     * coming from. First document will be 1, the second 2, and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Denotes which invoice or receipt in the document the information
     *         is coming from. First document will be 1, the second 2, and so
     *         on.
     *         </p>
     */
    public Integer getExpenseIndex() {
        return expenseIndex;
    }

    /**
     * <p>
     * Denotes which invoice or receipt in the document the information is
     * coming from. First document will be 1, the second 2, and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param expenseIndex <p>
     *            Denotes which invoice or receipt in the document the
     *            information is coming from. First document will be 1, the
     *            second 2, and so on.
     *            </p>
     */
    public void setExpenseIndex(Integer expenseIndex) {
        this.expenseIndex = expenseIndex;
    }

    /**
     * <p>
     * Denotes which invoice or receipt in the document the information is
     * coming from. First document will be 1, the second 2, and so on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param expenseIndex <p>
     *            Denotes which invoice or receipt in the document the
     *            information is coming from. First document will be 1, the
     *            second 2, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseDocument withExpenseIndex(Integer expenseIndex) {
        this.expenseIndex = expenseIndex;
        return this;
    }

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     *
     * @return <p>
     *         Any information found outside of a table by Amazon Textract.
     *         </p>
     */
    public java.util.List<ExpenseField> getSummaryFields() {
        return summaryFields;
    }

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     *
     * @param summaryFields <p>
     *            Any information found outside of a table by Amazon Textract.
     *            </p>
     */
    public void setSummaryFields(java.util.Collection<ExpenseField> summaryFields) {
        if (summaryFields == null) {
            this.summaryFields = null;
            return;
        }

        this.summaryFields = new java.util.ArrayList<ExpenseField>(summaryFields);
    }

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryFields <p>
     *            Any information found outside of a table by Amazon Textract.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseDocument withSummaryFields(ExpenseField... summaryFields) {
        if (getSummaryFields() == null) {
            this.summaryFields = new java.util.ArrayList<ExpenseField>(summaryFields.length);
        }
        for (ExpenseField value : summaryFields) {
            this.summaryFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any information found outside of a table by Amazon Textract.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryFields <p>
     *            Any information found outside of a table by Amazon Textract.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseDocument withSummaryFields(java.util.Collection<ExpenseField> summaryFields) {
        setSummaryFields(summaryFields);
        return this;
    }

    /**
     * <p>
     * Information detected on each table of a document, seperated into
     * <code>LineItems</code>.
     * </p>
     *
     * @return <p>
     *         Information detected on each table of a document, seperated into
     *         <code>LineItems</code>.
     *         </p>
     */
    public java.util.List<LineItemGroup> getLineItemGroups() {
        return lineItemGroups;
    }

    /**
     * <p>
     * Information detected on each table of a document, seperated into
     * <code>LineItems</code>.
     * </p>
     *
     * @param lineItemGroups <p>
     *            Information detected on each table of a document, seperated
     *            into <code>LineItems</code>.
     *            </p>
     */
    public void setLineItemGroups(java.util.Collection<LineItemGroup> lineItemGroups) {
        if (lineItemGroups == null) {
            this.lineItemGroups = null;
            return;
        }

        this.lineItemGroups = new java.util.ArrayList<LineItemGroup>(lineItemGroups);
    }

    /**
     * <p>
     * Information detected on each table of a document, seperated into
     * <code>LineItems</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineItemGroups <p>
     *            Information detected on each table of a document, seperated
     *            into <code>LineItems</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseDocument withLineItemGroups(LineItemGroup... lineItemGroups) {
        if (getLineItemGroups() == null) {
            this.lineItemGroups = new java.util.ArrayList<LineItemGroup>(lineItemGroups.length);
        }
        for (LineItemGroup value : lineItemGroups) {
            this.lineItemGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information detected on each table of a document, seperated into
     * <code>LineItems</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineItemGroups <p>
     *            Information detected on each table of a document, seperated
     *            into <code>LineItems</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseDocument withLineItemGroups(java.util.Collection<LineItemGroup> lineItemGroups) {
        setLineItemGroups(lineItemGroups);
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
        if (getExpenseIndex() != null)
            sb.append("ExpenseIndex: " + getExpenseIndex() + ",");
        if (getSummaryFields() != null)
            sb.append("SummaryFields: " + getSummaryFields() + ",");
        if (getLineItemGroups() != null)
            sb.append("LineItemGroups: " + getLineItemGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExpenseIndex() == null) ? 0 : getExpenseIndex().hashCode());
        hashCode = prime * hashCode
                + ((getSummaryFields() == null) ? 0 : getSummaryFields().hashCode());
        hashCode = prime * hashCode
                + ((getLineItemGroups() == null) ? 0 : getLineItemGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpenseDocument == false)
            return false;
        ExpenseDocument other = (ExpenseDocument) obj;

        if (other.getExpenseIndex() == null ^ this.getExpenseIndex() == null)
            return false;
        if (other.getExpenseIndex() != null
                && other.getExpenseIndex().equals(this.getExpenseIndex()) == false)
            return false;
        if (other.getSummaryFields() == null ^ this.getSummaryFields() == null)
            return false;
        if (other.getSummaryFields() != null
                && other.getSummaryFields().equals(this.getSummaryFields()) == false)
            return false;
        if (other.getLineItemGroups() == null ^ this.getLineItemGroups() == null)
            return false;
        if (other.getLineItemGroups() != null
                && other.getLineItemGroups().equals(this.getLineItemGroups()) == false)
            return false;
        return true;
    }
}
