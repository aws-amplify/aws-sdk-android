/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class AnalyzeExpenseResult implements Serializable {
    /**
     * <p>
     * Information about the input document.
     * </p>
     */
    private DocumentMetadata documentMetadata;

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     */
    private java.util.List<ExpenseDocument> expenseDocuments;

    /**
     * <p>
     * Information about the input document.
     * </p>
     *
     * @return <p>
     *         Information about the input document.
     *         </p>
     */
    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * <p>
     * Information about the input document.
     * </p>
     *
     * @param documentMetadata <p>
     *            Information about the input document.
     *            </p>
     */
    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Information about the input document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadata <p>
     *            Information about the input document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeExpenseResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
        return this;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     *
     * @return <p>
     *         The expenses detected by Amazon Textract.
     *         </p>
     */
    public java.util.List<ExpenseDocument> getExpenseDocuments() {
        return expenseDocuments;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     *
     * @param expenseDocuments <p>
     *            The expenses detected by Amazon Textract.
     *            </p>
     */
    public void setExpenseDocuments(java.util.Collection<ExpenseDocument> expenseDocuments) {
        if (expenseDocuments == null) {
            this.expenseDocuments = null;
            return;
        }

        this.expenseDocuments = new java.util.ArrayList<ExpenseDocument>(expenseDocuments);
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expenseDocuments <p>
     *            The expenses detected by Amazon Textract.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeExpenseResult withExpenseDocuments(ExpenseDocument... expenseDocuments) {
        if (getExpenseDocuments() == null) {
            this.expenseDocuments = new java.util.ArrayList<ExpenseDocument>(
                    expenseDocuments.length);
        }
        for (ExpenseDocument value : expenseDocuments) {
            this.expenseDocuments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expenseDocuments <p>
     *            The expenses detected by Amazon Textract.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeExpenseResult withExpenseDocuments(
            java.util.Collection<ExpenseDocument> expenseDocuments) {
        setExpenseDocuments(expenseDocuments);
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
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: " + getDocumentMetadata() + ",");
        if (getExpenseDocuments() != null)
            sb.append("ExpenseDocuments: " + getExpenseDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getExpenseDocuments() == null) ? 0 : getExpenseDocuments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeExpenseResult == false)
            return false;
        AnalyzeExpenseResult other = (AnalyzeExpenseResult) obj;

        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null
                && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getExpenseDocuments() == null ^ this.getExpenseDocuments() == null)
            return false;
        if (other.getExpenseDocuments() != null
                && other.getExpenseDocuments().equals(this.getExpenseDocuments()) == false)
            return false;
        return true;
    }
}
