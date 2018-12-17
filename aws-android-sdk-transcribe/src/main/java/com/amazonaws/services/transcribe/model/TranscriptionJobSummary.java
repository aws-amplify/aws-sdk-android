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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Provides a summary of information about a transcription job. Note that en-AU,
 * en-UK, and fr-CA languages are in preview and are only available to
 * whitelisted customers.
 * </p>
 */
public class TranscriptionJobSummary implements Serializable {
    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String transcriptionJobName;

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     */
    private java.util.Date completionTime;

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     */
    private String languageCode;

    /**
     * <p>
     * The status of the transcription job. When the status is
     * <code>COMPLETED</code>, use the <code>GetTranscriptionJob</code>
     * operation to get the results of the transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     */
    private String transcriptionJobStatus;

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * a description of the error.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3
     * bucket specified in the <code>outputBucketName</code> field when the
     * transcription job was started with the <code>StartTranscriptionJob</code>
     * operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by
     * Amazon Transcribe and can be retrieved using the URI in the
     * <code>GetTranscriptionJob</code> response's
     * <code>TranscriptFileUri</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     */
    private String outputLocationType;

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the transcription job.
     *         </p>
     */
    public String getTranscriptionJobName() {
        return transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param transcriptionJobName <p>
     *            The name of the transcription job.
     *            </p>
     */
    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param transcriptionJobName <p>
     *            The name of the transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the job was completed.
     *         </p>
     */
    public java.util.Date getCompletionTime() {
        return completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     *
     * @param completionTime <p>
     *            A timestamp that shows when the job was completed.
     *            </p>
     */
    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionTime <p>
     *            A timestamp that shows when the job was completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @return <p>
     *         The language code for the input speech.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @param languageCode <p>
     *            The language code for the input speech.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @param languageCode <p>
     *            The language code for the input speech.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public TranscriptionJobSummary withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @param languageCode <p>
     *            The language code for the input speech.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @param languageCode <p>
     *            The language code for the input speech.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public TranscriptionJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the transcription job. When the status is
     * <code>COMPLETED</code>, use the <code>GetTranscriptionJob</code>
     * operation to get the results of the transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         The status of the transcription job. When the status is
     *         <code>COMPLETED</code>, use the <code>GetTranscriptionJob</code>
     *         operation to get the results of the transcription.
     *         </p>
     * @see TranscriptionJobStatus
     */
    public String getTranscriptionJobStatus() {
        return transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the transcription job. When the status is
     * <code>COMPLETED</code>, use the <code>GetTranscriptionJob</code>
     * operation to get the results of the transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the transcription job. When the status is
     *            <code>COMPLETED</code>, use the
     *            <code>GetTranscriptionJob</code> operation to get the results
     *            of the transcription.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the transcription job. When the status is
     * <code>COMPLETED</code>, use the <code>GetTranscriptionJob</code>
     * operation to get the results of the transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the transcription job. When the status is
     *            <code>COMPLETED</code>, use the
     *            <code>GetTranscriptionJob</code> operation to get the results
     *            of the transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public TranscriptionJobSummary withTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the transcription job. When the status is
     * <code>COMPLETED</code>, use the <code>GetTranscriptionJob</code>
     * operation to get the results of the transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the transcription job. When the status is
     *            <code>COMPLETED</code>, use the
     *            <code>GetTranscriptionJob</code> operation to get the results
     *            of the transcription.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
    }

    /**
     * <p>
     * The status of the transcription job. When the status is
     * <code>COMPLETED</code>, use the <code>GetTranscriptionJob</code>
     * operation to get the results of the transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the transcription job. When the status is
     *            <code>COMPLETED</code>, use the
     *            <code>GetTranscriptionJob</code> operation to get the results
     *            of the transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public TranscriptionJobSummary withTranscriptionJobStatus(
            TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * a description of the error.
     * </p>
     *
     * @return <p>
     *         If the <code>TranscriptionJobStatus</code> field is
     *         <code>FAILED</code>, a description of the error.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * a description of the error.
     * </p>
     *
     * @param failureReason <p>
     *            If the <code>TranscriptionJobStatus</code> field is
     *            <code>FAILED</code>, a description of the error.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * a description of the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If the <code>TranscriptionJobStatus</code> field is
     *            <code>FAILED</code>, a description of the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3
     * bucket specified in the <code>outputBucketName</code> field when the
     * transcription job was started with the <code>StartTranscriptionJob</code>
     * operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by
     * Amazon Transcribe and can be retrieved using the URI in the
     * <code>GetTranscriptionJob</code> response's
     * <code>TranscriptFileUri</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @return <p>
     *         Indicates the location of the output of the transcription job.
     *         </p>
     *         <p>
     *         If the value is <code>CUSTOMER_BUCKET</code> then the location is
     *         the S3 bucket specified in the <code>outputBucketName</code>
     *         field when the transcription job was started with the
     *         <code>StartTranscriptionJob</code> operation.
     *         </p>
     *         <p>
     *         If the value is <code>SERVICE_BUCKET</code> then the output is
     *         stored by Amazon Transcribe and can be retrieved using the URI in
     *         the <code>GetTranscriptionJob</code> response's
     *         <code>TranscriptFileUri</code> field.
     *         </p>
     * @see OutputLocationType
     */
    public String getOutputLocationType() {
        return outputLocationType;
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3
     * bucket specified in the <code>outputBucketName</code> field when the
     * transcription job was started with the <code>StartTranscriptionJob</code>
     * operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by
     * Amazon Transcribe and can be retrieved using the URI in the
     * <code>GetTranscriptionJob</code> response's
     * <code>TranscriptFileUri</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates the location of the output of the transcription job.
     *            </p>
     *            <p>
     *            If the value is <code>CUSTOMER_BUCKET</code> then the location
     *            is the S3 bucket specified in the
     *            <code>outputBucketName</code> field when the transcription job
     *            was started with the <code>StartTranscriptionJob</code>
     *            operation.
     *            </p>
     *            <p>
     *            If the value is <code>SERVICE_BUCKET</code> then the output is
     *            stored by Amazon Transcribe and can be retrieved using the URI
     *            in the <code>GetTranscriptionJob</code> response's
     *            <code>TranscriptFileUri</code> field.
     *            </p>
     * @see OutputLocationType
     */
    public void setOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3
     * bucket specified in the <code>outputBucketName</code> field when the
     * transcription job was started with the <code>StartTranscriptionJob</code>
     * operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by
     * Amazon Transcribe and can be retrieved using the URI in the
     * <code>GetTranscriptionJob</code> response's
     * <code>TranscriptFileUri</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates the location of the output of the transcription job.
     *            </p>
     *            <p>
     *            If the value is <code>CUSTOMER_BUCKET</code> then the location
     *            is the S3 bucket specified in the
     *            <code>outputBucketName</code> field when the transcription job
     *            was started with the <code>StartTranscriptionJob</code>
     *            operation.
     *            </p>
     *            <p>
     *            If the value is <code>SERVICE_BUCKET</code> then the output is
     *            stored by Amazon Transcribe and can be retrieved using the URI
     *            in the <code>GetTranscriptionJob</code> response's
     *            <code>TranscriptFileUri</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputLocationType
     */
    public TranscriptionJobSummary withOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
        return this;
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3
     * bucket specified in the <code>outputBucketName</code> field when the
     * transcription job was started with the <code>StartTranscriptionJob</code>
     * operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by
     * Amazon Transcribe and can be retrieved using the URI in the
     * <code>GetTranscriptionJob</code> response's
     * <code>TranscriptFileUri</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates the location of the output of the transcription job.
     *            </p>
     *            <p>
     *            If the value is <code>CUSTOMER_BUCKET</code> then the location
     *            is the S3 bucket specified in the
     *            <code>outputBucketName</code> field when the transcription job
     *            was started with the <code>StartTranscriptionJob</code>
     *            operation.
     *            </p>
     *            <p>
     *            If the value is <code>SERVICE_BUCKET</code> then the output is
     *            stored by Amazon Transcribe and can be retrieved using the URI
     *            in the <code>GetTranscriptionJob</code> response's
     *            <code>TranscriptFileUri</code> field.
     *            </p>
     * @see OutputLocationType
     */
    public void setOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
    }

    /**
     * <p>
     * Indicates the location of the output of the transcription job.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code> then the location is the S3
     * bucket specified in the <code>outputBucketName</code> field when the
     * transcription job was started with the <code>StartTranscriptionJob</code>
     * operation.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code> then the output is stored by
     * Amazon Transcribe and can be retrieved using the URI in the
     * <code>GetTranscriptionJob</code> response's
     * <code>TranscriptFileUri</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates the location of the output of the transcription job.
     *            </p>
     *            <p>
     *            If the value is <code>CUSTOMER_BUCKET</code> then the location
     *            is the S3 bucket specified in the
     *            <code>outputBucketName</code> field when the transcription job
     *            was started with the <code>StartTranscriptionJob</code>
     *            operation.
     *            </p>
     *            <p>
     *            If the value is <code>SERVICE_BUCKET</code> then the output is
     *            stored by Amazon Transcribe and can be retrieved using the URI
     *            in the <code>GetTranscriptionJob</code> response's
     *            <code>TranscriptFileUri</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputLocationType
     */
    public TranscriptionJobSummary withOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
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
        if (getTranscriptionJobName() != null)
            sb.append("TranscriptionJobName: " + getTranscriptionJobName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: " + getTranscriptionJobStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getOutputLocationType() != null)
            sb.append("OutputLocationType: " + getOutputLocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptionJobName() == null) ? 0 : getTranscriptionJobName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getOutputLocationType() == null) ? 0 : getOutputLocationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptionJobSummary == false)
            return false;
        TranscriptionJobSummary other = (TranscriptionJobSummary) obj;

        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null
                && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null
                && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getTranscriptionJobStatus() == null ^ this.getTranscriptionJobStatus() == null)
            return false;
        if (other.getTranscriptionJobStatus() != null
                && other.getTranscriptionJobStatus().equals(this.getTranscriptionJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getOutputLocationType() == null ^ this.getOutputLocationType() == null)
            return false;
        if (other.getOutputLocationType() != null
                && other.getOutputLocationType().equals(this.getOutputLocationType()) == false)
            return false;
        return true;
    }
}
