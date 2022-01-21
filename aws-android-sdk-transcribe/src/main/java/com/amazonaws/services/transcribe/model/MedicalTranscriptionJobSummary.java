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
 * Provides summary information about a transcription job.
 * </p>
 */
public class MedicalTranscriptionJobSummary implements Serializable {
    /**
     * <p>
     * The name of a medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String medicalTranscriptionJobName;

    /**
     * <p>
     * A timestamp that shows when the medical transcription job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A timestamp that shows when the job began processing.
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
     * The language of the transcript in the source audio file.
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
     * The status of the medical transcription job.
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
     * Indicates the location of the transcription job's output. This field must
     * be the path of an S3 bucket; if you don't already have an S3 bucket, one
     * is created based on the path you add.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     */
    private String outputLocationType;

    /**
     * <p>
     * The medical specialty of the transcription job. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     */
    private String specialty;

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical
     * to identify in a transcription job. If the value is <code>PHI</code>,
     * you've configured the transcription job to identify personal health
     * information (PHI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     */
    private String contentIdentificationType;

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     */
    private String type;

    /**
     * <p>
     * The name of a medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of a medical transcription job.
     *         </p>
     */
    public String getMedicalTranscriptionJobName() {
        return medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of a medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            The name of a medical transcription job.
     *            </p>
     */
    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of a medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            The name of a medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJobSummary withMedicalTranscriptionJobName(
            String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the medical transcription job was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the medical transcription job was
     *         created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the medical transcription job was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the medical transcription job was
     *            created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the medical transcription job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the medical transcription job was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the job began processing.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     *
     * @param startTime <p>
     *            A timestamp that shows when the job began processing.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A timestamp that shows when the job began processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJobSummary withStartTime(java.util.Date startTime) {
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
    public MedicalTranscriptionJobSummary withCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
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
     *         The language of the transcript in the source audio file.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
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
     *            The language of the transcript in the source audio file.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
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
     *            The language of the transcript in the source audio file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public MedicalTranscriptionJobSummary withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
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
     *            The language of the transcript in the source audio file.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
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
     *            The language of the transcript in the source audio file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public MedicalTranscriptionJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         The status of the medical transcription job.
     *         </p>
     * @see TranscriptionJobStatus
     */
    public String getTranscriptionJobStatus() {
        return transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the medical transcription job.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public MedicalTranscriptionJobSummary withTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the medical transcription job.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
    }

    /**
     * <p>
     * The status of the medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public MedicalTranscriptionJobSummary withTranscriptionJobStatus(
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
    public MedicalTranscriptionJobSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output. This field must
     * be the path of an S3 bucket; if you don't already have an S3 bucket, one
     * is created based on the path you add.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @return <p>
     *         Indicates the location of the transcription job's output. This
     *         field must be the path of an S3 bucket; if you don't already have
     *         an S3 bucket, one is created based on the path you add.
     *         </p>
     * @see OutputLocationType
     */
    public String getOutputLocationType() {
        return outputLocationType;
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output. This field must
     * be the path of an S3 bucket; if you don't already have an S3 bucket, one
     * is created based on the path you add.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates the location of the transcription job's output. This
     *            field must be the path of an S3 bucket; if you don't already
     *            have an S3 bucket, one is created based on the path you add.
     *            </p>
     * @see OutputLocationType
     */
    public void setOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output. This field must
     * be the path of an S3 bucket; if you don't already have an S3 bucket, one
     * is created based on the path you add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates the location of the transcription job's output. This
     *            field must be the path of an S3 bucket; if you don't already
     *            have an S3 bucket, one is created based on the path you add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputLocationType
     */
    public MedicalTranscriptionJobSummary withOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
        return this;
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output. This field must
     * be the path of an S3 bucket; if you don't already have an S3 bucket, one
     * is created based on the path you add.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates the location of the transcription job's output. This
     *            field must be the path of an S3 bucket; if you don't already
     *            have an S3 bucket, one is created based on the path you add.
     *            </p>
     * @see OutputLocationType
     */
    public void setOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
    }

    /**
     * <p>
     * Indicates the location of the transcription job's output. This field must
     * be the path of an S3 bucket; if you don't already have an S3 bucket, one
     * is created based on the path you add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates the location of the transcription job's output. This
     *            field must be the path of an S3 bucket; if you don't already
     *            have an S3 bucket, one is created based on the path you add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputLocationType
     */
    public MedicalTranscriptionJobSummary withOutputLocationType(
            OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
        return this;
    }

    /**
     * <p>
     * The medical specialty of the transcription job. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @return <p>
     *         The medical specialty of the transcription job. Refer to <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     *         >Transcribing a medical conversation</a>for a list of supported
     *         specialties.
     *         </p>
     * @see Specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * <p>
     * The medical specialty of the transcription job. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of the transcription job. Refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     *            >Transcribing a medical conversation</a>for a list of
     *            supported specialties.
     *            </p>
     * @see Specialty
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * The medical specialty of the transcription job. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of the transcription job. Refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     *            >Transcribing a medical conversation</a>for a list of
     *            supported specialties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Specialty
     */
    public MedicalTranscriptionJobSummary withSpecialty(String specialty) {
        this.specialty = specialty;
        return this;
    }

    /**
     * <p>
     * The medical specialty of the transcription job. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of the transcription job. Refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     *            >Transcribing a medical conversation</a>for a list of
     *            supported specialties.
     *            </p>
     * @see Specialty
     */
    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
    }

    /**
     * <p>
     * The medical specialty of the transcription job. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of the transcription job. Refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     *            >Transcribing a medical conversation</a>for a list of
     *            supported specialties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Specialty
     */
    public MedicalTranscriptionJobSummary withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical
     * to identify in a transcription job. If the value is <code>PHI</code>,
     * you've configured the transcription job to identify personal health
     * information (PHI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @return <p>
     *         Shows the type of information you've configured Amazon Transcribe
     *         Medical to identify in a transcription job. If the value is
     *         <code>PHI</code>, you've configured the transcription job to
     *         identify personal health information (PHI).
     *         </p>
     * @see MedicalContentIdentificationType
     */
    public String getContentIdentificationType() {
        return contentIdentificationType;
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical
     * to identify in a transcription job. If the value is <code>PHI</code>,
     * you've configured the transcription job to identify personal health
     * information (PHI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Shows the type of information you've configured Amazon
     *            Transcribe Medical to identify in a transcription job. If the
     *            value is <code>PHI</code>, you've configured the transcription
     *            job to identify personal health information (PHI).
     *            </p>
     * @see MedicalContentIdentificationType
     */
    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical
     * to identify in a transcription job. If the value is <code>PHI</code>,
     * you've configured the transcription job to identify personal health
     * information (PHI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Shows the type of information you've configured Amazon
     *            Transcribe Medical to identify in a transcription job. If the
     *            value is <code>PHI</code>, you've configured the transcription
     *            job to identify personal health information (PHI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalContentIdentificationType
     */
    public MedicalTranscriptionJobSummary withContentIdentificationType(
            String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
        return this;
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical
     * to identify in a transcription job. If the value is <code>PHI</code>,
     * you've configured the transcription job to identify personal health
     * information (PHI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Shows the type of information you've configured Amazon
     *            Transcribe Medical to identify in a transcription job. If the
     *            value is <code>PHI</code>, you've configured the transcription
     *            job to identify personal health information (PHI).
     *            </p>
     * @see MedicalContentIdentificationType
     */
    public void setContentIdentificationType(
            MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
    }

    /**
     * <p>
     * Shows the type of information you've configured Amazon Transcribe Medical
     * to identify in a transcription job. If the value is <code>PHI</code>,
     * you've configured the transcription job to identify personal health
     * information (PHI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Shows the type of information you've configured Amazon
     *            Transcribe Medical to identify in a transcription job. If the
     *            value is <code>PHI</code>, you've configured the transcription
     *            job to identify personal health information (PHI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalContentIdentificationType
     */
    public MedicalTranscriptionJobSummary withContentIdentificationType(
            MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @return <p>
     *         The speech of the clinician in the input audio.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The speech of the clinician in the input audio.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The speech of the clinician in the input audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public MedicalTranscriptionJobSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The speech of the clinician in the input audio.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The speech of the clinician in the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The speech of the clinician in the input audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public MedicalTranscriptionJobSummary withType(Type type) {
        this.type = type.toString();
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
        if (getMedicalTranscriptionJobName() != null)
            sb.append("MedicalTranscriptionJobName: " + getMedicalTranscriptionJobName() + ",");
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
        if (getSpecialty() != null)
            sb.append("Specialty: " + getSpecialty() + ",");
        if (getContentIdentificationType() != null)
            sb.append("ContentIdentificationType: " + getContentIdentificationType() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMedicalTranscriptionJobName() == null) ? 0
                        : getMedicalTranscriptionJobName().hashCode());
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
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType()
                        .hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalTranscriptionJobSummary == false)
            return false;
        MedicalTranscriptionJobSummary other = (MedicalTranscriptionJobSummary) obj;

        if (other.getMedicalTranscriptionJobName() == null
                ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null
                && other.getMedicalTranscriptionJobName().equals(
                        this.getMedicalTranscriptionJobName()) == false)
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
        if (other.getSpecialty() == null ^ this.getSpecialty() == null)
            return false;
        if (other.getSpecialty() != null
                && other.getSpecialty().equals(this.getSpecialty()) == false)
            return false;
        if (other.getContentIdentificationType() == null
                ^ this.getContentIdentificationType() == null)
            return false;
        if (other.getContentIdentificationType() != null
                && other.getContentIdentificationType().equals(this.getContentIdentificationType()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
