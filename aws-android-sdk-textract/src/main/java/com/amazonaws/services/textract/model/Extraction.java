/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information extracted by an analysis operation after using
 * StartLendingAnalysis.
 * </p>
 */
public class Extraction implements Serializable {
    /**
     * <p>
     * Holds the structured data returned by AnalyzeDocument for lending
     * documents.
     * </p>
     */
    private LendingDocument lendingDocument;

    /**
     * <p>
     * The structure holding all the information returned by AnalyzeExpense
     * </p>
     */
    private ExpenseDocument expenseDocument;

    /**
     * <p>
     * The structure that lists each document processed in an AnalyzeID
     * operation.
     * </p>
     */
    private IdentityDocument identityDocument;

    /**
     * <p>
     * Holds the structured data returned by AnalyzeDocument for lending
     * documents.
     * </p>
     *
     * @return <p>
     *         Holds the structured data returned by AnalyzeDocument for lending
     *         documents.
     *         </p>
     */
    public LendingDocument getLendingDocument() {
        return lendingDocument;
    }

    /**
     * <p>
     * Holds the structured data returned by AnalyzeDocument for lending
     * documents.
     * </p>
     *
     * @param lendingDocument <p>
     *            Holds the structured data returned by AnalyzeDocument for
     *            lending documents.
     *            </p>
     */
    public void setLendingDocument(LendingDocument lendingDocument) {
        this.lendingDocument = lendingDocument;
    }

    /**
     * <p>
     * Holds the structured data returned by AnalyzeDocument for lending
     * documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lendingDocument <p>
     *            Holds the structured data returned by AnalyzeDocument for
     *            lending documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Extraction withLendingDocument(LendingDocument lendingDocument) {
        this.lendingDocument = lendingDocument;
        return this;
    }

    /**
     * <p>
     * The structure holding all the information returned by AnalyzeExpense
     * </p>
     *
     * @return <p>
     *         The structure holding all the information returned by
     *         AnalyzeExpense
     *         </p>
     */
    public ExpenseDocument getExpenseDocument() {
        return expenseDocument;
    }

    /**
     * <p>
     * The structure holding all the information returned by AnalyzeExpense
     * </p>
     *
     * @param expenseDocument <p>
     *            The structure holding all the information returned by
     *            AnalyzeExpense
     *            </p>
     */
    public void setExpenseDocument(ExpenseDocument expenseDocument) {
        this.expenseDocument = expenseDocument;
    }

    /**
     * <p>
     * The structure holding all the information returned by AnalyzeExpense
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expenseDocument <p>
     *            The structure holding all the information returned by
     *            AnalyzeExpense
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Extraction withExpenseDocument(ExpenseDocument expenseDocument) {
        this.expenseDocument = expenseDocument;
        return this;
    }

    /**
     * <p>
     * The structure that lists each document processed in an AnalyzeID
     * operation.
     * </p>
     *
     * @return <p>
     *         The structure that lists each document processed in an AnalyzeID
     *         operation.
     *         </p>
     */
    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    /**
     * <p>
     * The structure that lists each document processed in an AnalyzeID
     * operation.
     * </p>
     *
     * @param identityDocument <p>
     *            The structure that lists each document processed in an
     *            AnalyzeID operation.
     *            </p>
     */
    public void setIdentityDocument(IdentityDocument identityDocument) {
        this.identityDocument = identityDocument;
    }

    /**
     * <p>
     * The structure that lists each document processed in an AnalyzeID
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityDocument <p>
     *            The structure that lists each document processed in an
     *            AnalyzeID operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Extraction withIdentityDocument(IdentityDocument identityDocument) {
        this.identityDocument = identityDocument;
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
        if (getLendingDocument() != null)
            sb.append("LendingDocument: " + getLendingDocument() + ",");
        if (getExpenseDocument() != null)
            sb.append("ExpenseDocument: " + getExpenseDocument() + ",");
        if (getIdentityDocument() != null)
            sb.append("IdentityDocument: " + getIdentityDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLendingDocument() == null) ? 0 : getLendingDocument().hashCode());
        hashCode = prime * hashCode
                + ((getExpenseDocument() == null) ? 0 : getExpenseDocument().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityDocument() == null) ? 0 : getIdentityDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Extraction == false)
            return false;
        Extraction other = (Extraction) obj;

        if (other.getLendingDocument() == null ^ this.getLendingDocument() == null)
            return false;
        if (other.getLendingDocument() != null
                && other.getLendingDocument().equals(this.getLendingDocument()) == false)
            return false;
        if (other.getExpenseDocument() == null ^ this.getExpenseDocument() == null)
            return false;
        if (other.getExpenseDocument() != null
                && other.getExpenseDocument().equals(this.getExpenseDocument()) == false)
            return false;
        if (other.getIdentityDocument() == null ^ this.getIdentityDocument() == null)
            return false;
        if (other.getIdentityDocument() != null
                && other.getIdentityDocument().equals(this.getIdentityDocument()) == false)
            return false;
        return true;
    }
}
