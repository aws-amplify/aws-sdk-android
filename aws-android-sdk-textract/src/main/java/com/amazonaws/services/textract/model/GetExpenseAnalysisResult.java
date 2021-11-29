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

public class GetExpenseAnalysisResult implements Serializable {
    /**
     * <p>
     * Information about a document that Amazon Textract processed.
     * <code>DocumentMetadata</code> is returned in every page of paginated
     * responses from an Amazon Textract operation.
     * </p>
     */
    private DocumentMetadata documentMetadata;

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     */
    private String jobStatus;

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can
     * use this token in the subsequent request to retrieve the next set of
     * text-detection results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The expenses detected by Amazon Textract.
     * </p>
     */
    private java.util.List<ExpenseDocument> expenseDocuments;

    /**
     * <p>
     * A list of warnings that occurred during the text-detection operation for
     * the document.
     * </p>
     */
    private java.util.List<Warning> warnings;

    /**
     * <p>
     * Returns if the detection job could not be completed. Contains explanation
     * for what error occured.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The current model version of AnalyzeExpense.
     * </p>
     */
    private String analyzeExpenseModelVersion;

    /**
     * <p>
     * Information about a document that Amazon Textract processed.
     * <code>DocumentMetadata</code> is returned in every page of paginated
     * responses from an Amazon Textract operation.
     * </p>
     *
     * @return <p>
     *         Information about a document that Amazon Textract processed.
     *         <code>DocumentMetadata</code> is returned in every page of
     *         paginated responses from an Amazon Textract operation.
     *         </p>
     */
    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * <p>
     * Information about a document that Amazon Textract processed.
     * <code>DocumentMetadata</code> is returned in every page of paginated
     * responses from an Amazon Textract operation.
     * </p>
     *
     * @param documentMetadata <p>
     *            Information about a document that Amazon Textract processed.
     *            <code>DocumentMetadata</code> is returned in every page of
     *            paginated responses from an Amazon Textract operation.
     *            </p>
     */
    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Information about a document that Amazon Textract processed.
     * <code>DocumentMetadata</code> is returned in every page of paginated
     * responses from an Amazon Textract operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadata <p>
     *            Information about a document that Amazon Textract processed.
     *            <code>DocumentMetadata</code> is returned in every page of
     *            paginated responses from an Amazon Textract operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExpenseAnalysisResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
        return this;
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @return <p>
     *         The current status of the text detection job.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @param jobStatus <p>
     *            The current status of the text detection job.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @param jobStatus <p>
     *            The current status of the text detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public GetExpenseAnalysisResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @param jobStatus <p>
     *            The current status of the text detection job.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The current status of the text detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @param jobStatus <p>
     *            The current status of the text detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public GetExpenseAnalysisResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can
     * use this token in the subsequent request to retrieve the next set of
     * text-detection results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Textract returns this token.
     *         You can use this token in the subsequent request to retrieve the
     *         next set of text-detection results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can
     * use this token in the subsequent request to retrieve the next set of
     * text-detection results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Textract returns this
     *            token. You can use this token in the subsequent request to
     *            retrieve the next set of text-detection results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can
     * use this token in the subsequent request to retrieve the next set of
     * text-detection results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Textract returns this
     *            token. You can use this token in the subsequent request to
     *            retrieve the next set of text-detection results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExpenseAnalysisResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
    public GetExpenseAnalysisResult withExpenseDocuments(ExpenseDocument... expenseDocuments) {
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
    public GetExpenseAnalysisResult withExpenseDocuments(
            java.util.Collection<ExpenseDocument> expenseDocuments) {
        setExpenseDocuments(expenseDocuments);
        return this;
    }

    /**
     * <p>
     * A list of warnings that occurred during the text-detection operation for
     * the document.
     * </p>
     *
     * @return <p>
     *         A list of warnings that occurred during the text-detection
     *         operation for the document.
     *         </p>
     */
    public java.util.List<Warning> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warnings that occurred during the text-detection operation for
     * the document.
     * </p>
     *
     * @param warnings <p>
     *            A list of warnings that occurred during the text-detection
     *            operation for the document.
     *            </p>
     */
    public void setWarnings(java.util.Collection<Warning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<Warning>(warnings);
    }

    /**
     * <p>
     * A list of warnings that occurred during the text-detection operation for
     * the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            A list of warnings that occurred during the text-detection
     *            operation for the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExpenseAnalysisResult withWarnings(Warning... warnings) {
        if (getWarnings() == null) {
            this.warnings = new java.util.ArrayList<Warning>(warnings.length);
        }
        for (Warning value : warnings) {
            this.warnings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of warnings that occurred during the text-detection operation for
     * the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            A list of warnings that occurred during the text-detection
     *            operation for the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExpenseAnalysisResult withWarnings(java.util.Collection<Warning> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * Returns if the detection job could not be completed. Contains explanation
     * for what error occured.
     * </p>
     *
     * @return <p>
     *         Returns if the detection job could not be completed. Contains
     *         explanation for what error occured.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * Returns if the detection job could not be completed. Contains explanation
     * for what error occured.
     * </p>
     *
     * @param statusMessage <p>
     *            Returns if the detection job could not be completed. Contains
     *            explanation for what error occured.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Returns if the detection job could not be completed. Contains explanation
     * for what error occured.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            Returns if the detection job could not be completed. Contains
     *            explanation for what error occured.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExpenseAnalysisResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The current model version of AnalyzeExpense.
     * </p>
     *
     * @return <p>
     *         The current model version of AnalyzeExpense.
     *         </p>
     */
    public String getAnalyzeExpenseModelVersion() {
        return analyzeExpenseModelVersion;
    }

    /**
     * <p>
     * The current model version of AnalyzeExpense.
     * </p>
     *
     * @param analyzeExpenseModelVersion <p>
     *            The current model version of AnalyzeExpense.
     *            </p>
     */
    public void setAnalyzeExpenseModelVersion(String analyzeExpenseModelVersion) {
        this.analyzeExpenseModelVersion = analyzeExpenseModelVersion;
    }

    /**
     * <p>
     * The current model version of AnalyzeExpense.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzeExpenseModelVersion <p>
     *            The current model version of AnalyzeExpense.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExpenseAnalysisResult withAnalyzeExpenseModelVersion(String analyzeExpenseModelVersion) {
        this.analyzeExpenseModelVersion = analyzeExpenseModelVersion;
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
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getExpenseDocuments() != null)
            sb.append("ExpenseDocuments: " + getExpenseDocuments() + ",");
        if (getWarnings() != null)
            sb.append("Warnings: " + getWarnings() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getAnalyzeExpenseModelVersion() != null)
            sb.append("AnalyzeExpenseModelVersion: " + getAnalyzeExpenseModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getExpenseDocuments() == null) ? 0 : getExpenseDocuments().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime
                * hashCode
                + ((getAnalyzeExpenseModelVersion() == null) ? 0 : getAnalyzeExpenseModelVersion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExpenseAnalysisResult == false)
            return false;
        GetExpenseAnalysisResult other = (GetExpenseAnalysisResult) obj;

        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null
                && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getExpenseDocuments() == null ^ this.getExpenseDocuments() == null)
            return false;
        if (other.getExpenseDocuments() != null
                && other.getExpenseDocuments().equals(this.getExpenseDocuments()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getAnalyzeExpenseModelVersion() == null
                ^ this.getAnalyzeExpenseModelVersion() == null)
            return false;
        if (other.getAnalyzeExpenseModelVersion() != null
                && other.getAnalyzeExpenseModelVersion().equals(
                        this.getAnalyzeExpenseModelVersion()) == false)
            return false;
        return true;
    }
}
