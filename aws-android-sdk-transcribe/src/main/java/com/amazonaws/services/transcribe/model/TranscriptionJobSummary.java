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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Provides a summary of information about a transcription job.
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
     * A timestamp that shows when the job started processing.
     * </p>
     */
    private java.util.Date startTime;

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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
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
     * The content redaction settings of the transcription job.
     * </p>
     */
    private ContentRedaction contentRedaction;

    /**
     * <p>
     * The object used to call your custom language model to your transcription
     * job.
     * </p>
     */
    private ModelSettings modelSettings;

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription
     * job.
     * </p>
     */
    private Boolean identifyLanguage;

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language it identified in the source audio. A higher score indicates that
     * Amazon Transcribe is more confident in the language it identified.
     * </p>
     */
    private Float identifiedLanguageScore;

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
     * A timestamp that shows when the job started processing.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the job started processing.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     *
     * @param startTime <p>
     *            A timestamp that shows when the job started processing.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A timestamp that shows when the job started processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
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
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
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
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
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
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
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
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
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
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     *
     * @return <p>
     *         The content redaction settings of the transcription job.
     *         </p>
     */
    public ContentRedaction getContentRedaction() {
        return contentRedaction;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     *
     * @param contentRedaction <p>
     *            The content redaction settings of the transcription job.
     *            </p>
     */
    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRedaction <p>
     *            The content redaction settings of the transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
        return this;
    }

    /**
     * <p>
     * The object used to call your custom language model to your transcription
     * job.
     * </p>
     *
     * @return <p>
     *         The object used to call your custom language model to your
     *         transcription job.
     *         </p>
     */
    public ModelSettings getModelSettings() {
        return modelSettings;
    }

    /**
     * <p>
     * The object used to call your custom language model to your transcription
     * job.
     * </p>
     *
     * @param modelSettings <p>
     *            The object used to call your custom language model to your
     *            transcription job.
     *            </p>
     */
    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * <p>
     * The object used to call your custom language model to your transcription
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelSettings <p>
     *            The object used to call your custom language model to your
     *            transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
        return this;
    }

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription
     * job.
     * </p>
     *
     * @return <p>
     *         Whether automatic language identification was enabled for a
     *         transcription job.
     *         </p>
     */
    public Boolean isIdentifyLanguage() {
        return identifyLanguage;
    }

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription
     * job.
     * </p>
     *
     * @return <p>
     *         Whether automatic language identification was enabled for a
     *         transcription job.
     *         </p>
     */
    public Boolean getIdentifyLanguage() {
        return identifyLanguage;
    }

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription
     * job.
     * </p>
     *
     * @param identifyLanguage <p>
     *            Whether automatic language identification was enabled for a
     *            transcription job.
     *            </p>
     */
    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * Whether automatic language identification was enabled for a transcription
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifyLanguage <p>
     *            Whether automatic language identification was enabled for a
     *            transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
        return this;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language it identified in the source audio. A higher score indicates that
     * Amazon Transcribe is more confident in the language it identified.
     * </p>
     *
     * @return <p>
     *         A value between zero and one that Amazon Transcribe assigned to
     *         the language it identified in the source audio. A higher score
     *         indicates that Amazon Transcribe is more confident in the
     *         language it identified.
     *         </p>
     */
    public Float getIdentifiedLanguageScore() {
        return identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language it identified in the source audio. A higher score indicates that
     * Amazon Transcribe is more confident in the language it identified.
     * </p>
     *
     * @param identifiedLanguageScore <p>
     *            A value between zero and one that Amazon Transcribe assigned
     *            to the language it identified in the source audio. A higher
     *            score indicates that Amazon Transcribe is more confident in
     *            the language it identified.
     *            </p>
     */
    public void setIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language it identified in the source audio. A higher score indicates that
     * Amazon Transcribe is more confident in the language it identified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifiedLanguageScore <p>
     *            A value between zero and one that Amazon Transcribe assigned
     *            to the language it identified in the source audio. A higher
     *            score indicates that Amazon Transcribe is more confident in
     *            the language it identified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
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
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: " + getTranscriptionJobStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getOutputLocationType() != null)
            sb.append("OutputLocationType: " + getOutputLocationType() + ",");
        if (getContentRedaction() != null)
            sb.append("ContentRedaction: " + getContentRedaction() + ",");
        if (getModelSettings() != null)
            sb.append("ModelSettings: " + getModelSettings() + ",");
        if (getIdentifyLanguage() != null)
            sb.append("IdentifyLanguage: " + getIdentifyLanguage() + ",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: " + getIdentifiedLanguageScore());
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
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
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
        hashCode = prime * hashCode
                + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode
                + ((getModelSettings() == null) ? 0 : getModelSettings().hashCode());
        hashCode = prime * hashCode
                + ((getIdentifyLanguage() == null) ? 0 : getIdentifyLanguage().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore()
                        .hashCode());
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
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
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
        if (other.getContentRedaction() == null ^ this.getContentRedaction() == null)
            return false;
        if (other.getContentRedaction() != null
                && other.getContentRedaction().equals(this.getContentRedaction()) == false)
            return false;
        if (other.getModelSettings() == null ^ this.getModelSettings() == null)
            return false;
        if (other.getModelSettings() != null
                && other.getModelSettings().equals(this.getModelSettings()) == false)
            return false;
        if (other.getIdentifyLanguage() == null ^ this.getIdentifyLanguage() == null)
            return false;
        if (other.getIdentifyLanguage() != null
                && other.getIdentifyLanguage().equals(this.getIdentifyLanguage()) == false)
            return false;
        if (other.getIdentifiedLanguageScore() == null ^ this.getIdentifiedLanguageScore() == null)
            return false;
        if (other.getIdentifiedLanguageScore() != null
                && other.getIdentifiedLanguageScore().equals(this.getIdentifiedLanguageScore()) == false)
            return false;
        return true;
    }
}
