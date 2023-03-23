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

public class GetLendingAnalysisResult implements Serializable {
    /**
     * <p>
     * Information about the input document.
     * </p>
     */
    private DocumentMetadata documentMetadata;

    /**
     * <p>
     * The current status of the lending analysis job.
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
     * lending results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document
     * analysis operations for the pinstripe.
     * </p>
     */
    private java.util.List<LendingResult> results;

    /**
     * <p>
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     */
    private java.util.List<Warning> warnings;

    /**
     * <p>
     * Returns if the lending analysis job could not be completed. Contains
     * explanation for what error occurred.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The current model version of the Analyze Lending API.
     * </p>
     */
    private String analyzeLendingModelVersion;

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
    public GetLendingAnalysisResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
        return this;
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @return <p>
     *         The current status of the lending analysis job.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @param jobStatus <p>
     *            The current status of the lending analysis job.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @param jobStatus <p>
     *            The current status of the lending analysis job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public GetLendingAnalysisResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @param jobStatus <p>
     *            The current status of the lending analysis job.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The current status of the lending analysis job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS
     *
     * @param jobStatus <p>
     *            The current status of the lending analysis job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public GetLendingAnalysisResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can
     * use this token in the subsequent request to retrieve the next set of
     * lending results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Textract returns this token.
     *         You can use this token in the subsequent request to retrieve the
     *         next set of lending results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can
     * use this token in the subsequent request to retrieve the next set of
     * lending results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Textract returns this
     *            token. You can use this token in the subsequent request to
     *            retrieve the next set of lending results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Textract returns this token. You can
     * use this token in the subsequent request to retrieve the next set of
     * lending results.
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
     *            retrieve the next set of lending results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document
     * analysis operations for the pinstripe.
     * </p>
     *
     * @return <p>
     *         Holds the information returned by one of AmazonTextract's
     *         document analysis operations for the pinstripe.
     *         </p>
     */
    public java.util.List<LendingResult> getResults() {
        return results;
    }

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document
     * analysis operations for the pinstripe.
     * </p>
     *
     * @param results <p>
     *            Holds the information returned by one of AmazonTextract's
     *            document analysis operations for the pinstripe.
     *            </p>
     */
    public void setResults(java.util.Collection<LendingResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<LendingResult>(results);
    }

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document
     * analysis operations for the pinstripe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            Holds the information returned by one of AmazonTextract's
     *            document analysis operations for the pinstripe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisResult withResults(LendingResult... results) {
        if (getResults() == null) {
            this.results = new java.util.ArrayList<LendingResult>(results.length);
        }
        for (LendingResult value : results) {
            this.results.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Holds the information returned by one of AmazonTextract's document
     * analysis operations for the pinstripe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            Holds the information returned by one of AmazonTextract's
     *            document analysis operations for the pinstripe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisResult withResults(java.util.Collection<LendingResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     *
     * @return <p>
     *         A list of warnings that occurred during the lending analysis
     *         operation.
     *         </p>
     */
    public java.util.List<Warning> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     *
     * @param warnings <p>
     *            A list of warnings that occurred during the lending analysis
     *            operation.
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
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            A list of warnings that occurred during the lending analysis
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisResult withWarnings(Warning... warnings) {
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
     * A list of warnings that occurred during the lending analysis operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            A list of warnings that occurred during the lending analysis
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisResult withWarnings(java.util.Collection<Warning> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * Returns if the lending analysis job could not be completed. Contains
     * explanation for what error occurred.
     * </p>
     *
     * @return <p>
     *         Returns if the lending analysis job could not be completed.
     *         Contains explanation for what error occurred.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * Returns if the lending analysis job could not be completed. Contains
     * explanation for what error occurred.
     * </p>
     *
     * @param statusMessage <p>
     *            Returns if the lending analysis job could not be completed.
     *            Contains explanation for what error occurred.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Returns if the lending analysis job could not be completed. Contains
     * explanation for what error occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            Returns if the lending analysis job could not be completed.
     *            Contains explanation for what error occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The current model version of the Analyze Lending API.
     * </p>
     *
     * @return <p>
     *         The current model version of the Analyze Lending API.
     *         </p>
     */
    public String getAnalyzeLendingModelVersion() {
        return analyzeLendingModelVersion;
    }

    /**
     * <p>
     * The current model version of the Analyze Lending API.
     * </p>
     *
     * @param analyzeLendingModelVersion <p>
     *            The current model version of the Analyze Lending API.
     *            </p>
     */
    public void setAnalyzeLendingModelVersion(String analyzeLendingModelVersion) {
        this.analyzeLendingModelVersion = analyzeLendingModelVersion;
    }

    /**
     * <p>
     * The current model version of the Analyze Lending API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzeLendingModelVersion <p>
     *            The current model version of the Analyze Lending API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisResult withAnalyzeLendingModelVersion(String analyzeLendingModelVersion) {
        this.analyzeLendingModelVersion = analyzeLendingModelVersion;
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
        if (getResults() != null)
            sb.append("Results: " + getResults() + ",");
        if (getWarnings() != null)
            sb.append("Warnings: " + getWarnings() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getAnalyzeLendingModelVersion() != null)
            sb.append("AnalyzeLendingModelVersion: " + getAnalyzeLendingModelVersion());
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
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime
                * hashCode
                + ((getAnalyzeLendingModelVersion() == null) ? 0 : getAnalyzeLendingModelVersion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLendingAnalysisResult == false)
            return false;
        GetLendingAnalysisResult other = (GetLendingAnalysisResult) obj;

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
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
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
        if (other.getAnalyzeLendingModelVersion() == null
                ^ this.getAnalyzeLendingModelVersion() == null)
            return false;
        if (other.getAnalyzeLendingModelVersion() != null
                && other.getAnalyzeLendingModelVersion().equals(
                        this.getAnalyzeLendingModelVersion()) == false)
            return false;
        return true;
    }
}
