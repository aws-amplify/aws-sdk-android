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
 * The data structure that contains the information for a medical transcription
 * job.
 * </p>
 */
public class MedicalTranscriptionJob implements Serializable {
    /**
     * <p>
     * The name for a given medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String medicalTranscriptionJobName;

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String transcriptionJobStatus;

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US
     * English (en-US) is the only supported language for medical
     * transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
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
     * The sample rate, in Hertz, of the source audio containing medical
     * information.
     * </p>
     * <p>
     * If you don't specify the sample rate, Amazon Transcribe Medical
     * determines it for you. If you choose to specify the sample rate, it must
     * match the rate detected by Amazon Transcribe Medical.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     */
    private Integer mediaSampleRateHertz;

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     */
    private String mediaFormat;

    /**
     * <p>
     * Describes the input media file in a transcription request.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * An object that contains the <code>MedicalTranscript</code>. The
     * <code>MedicalTranscript</code> contains the
     * <code>TranscriptFileUri</code>.
     * </p>
     */
    private MedicalTranscript transcript;

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     */
    private java.util.Date startTime;

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
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * this field contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>- The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * - The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>- The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * - The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>- The size of your
     * audio file is larger than what Amazon Transcribe Medical can process. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and Quotas</a> in the <i>Amazon Transcribe Medical Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>-
     * Your audio contains more channels than Amazon Transcribe Medical is
     * configured to process. To request additional channels, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html"
     * >Amazon Transcribe Medical Endpoints and Quotas</a> in the <i>Amazon Web
     * Services General Reference</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;

    /**
     * <p>
     * Object that contains object.
     * </p>
     */
    private MedicalTranscriptionSetting settings;

    /**
     * <p>
     * Shows the type of content that you've configured Amazon Transcribe
     * Medical to identify in a transcription job. If the value is
     * <code>PHI</code>, you've configured the job to identify personal health
     * information (PHI) in the transcription output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     */
    private String contentIdentificationType;

    /**
     * <p>
     * The medical specialty of any clinicians providing a dictation or having a
     * conversation. Refer to <a href=
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
     * The type of speech in the transcription job. <code>CONVERSATION</code> is
     * generally used for patient-physician dialogues. <code>DICTATION</code> is
     * the setting for physicians speaking their notes after seeing a patient.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     * >What is Amazon Transcribe Medical?</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     */
    private String type;

    /**
     * <p>
     * A key:value pair assigned to a given medical transcription job.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for a given medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name for a given medical transcription job.
     *         </p>
     */
    public String getMedicalTranscriptionJobName() {
        return medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name for a given medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            The name for a given medical transcription job.
     *            </p>
     */
    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name for a given medical transcription job.
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
     *            The name for a given medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJob withMedicalTranscriptionJobName(
            String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
        return this;
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         The completion status of a medical transcription job.
     *         </p>
     * @see TranscriptionJobStatus
     */
    public String getTranscriptionJobStatus() {
        return transcriptionJobStatus;
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The completion status of a medical transcription job.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The completion status of a medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public MedicalTranscriptionJob withTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
        return this;
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The completion status of a medical transcription job.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The completion status of a medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public MedicalTranscriptionJob withTranscriptionJobStatus(
            TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US
     * English (en-US) is the only supported language for medical
     * transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
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
     *         The language code for the language spoken in the source audio
     *         file. US English (en-US) is the only supported language for
     *         medical transcriptions. Any other value you enter for language
     *         code results in a <code>BadRequestException</code> error.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US
     * English (en-US) is the only supported language for medical
     * transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
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
     *            The language code for the language spoken in the source audio
     *            file. US English (en-US) is the only supported language for
     *            medical transcriptions. Any other value you enter for language
     *            code results in a <code>BadRequestException</code> error.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US
     * English (en-US) is the only supported language for medical
     * transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
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
     *            The language code for the language spoken in the source audio
     *            file. US English (en-US) is the only supported language for
     *            medical transcriptions. Any other value you enter for language
     *            code results in a <code>BadRequestException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public MedicalTranscriptionJob withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US
     * English (en-US) is the only supported language for medical
     * transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
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
     *            The language code for the language spoken in the source audio
     *            file. US English (en-US) is the only supported language for
     *            medical transcriptions. Any other value you enter for language
     *            code results in a <code>BadRequestException</code> error.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US
     * English (en-US) is the only supported language for medical
     * transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
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
     *            The language code for the language spoken in the source audio
     *            file. US English (en-US) is the only supported language for
     *            medical transcriptions. Any other value you enter for language
     *            code results in a <code>BadRequestException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public MedicalTranscriptionJob withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the source audio containing medical
     * information.
     * </p>
     * <p>
     * If you don't specify the sample rate, Amazon Transcribe Medical
     * determines it for you. If you choose to specify the sample rate, it must
     * match the rate detected by Amazon Transcribe Medical.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in Hertz, of the source audio containing medical
     *         information.
     *         </p>
     *         <p>
     *         If you don't specify the sample rate, Amazon Transcribe Medical
     *         determines it for you. If you choose to specify the sample rate,
     *         it must match the rate detected by Amazon Transcribe Medical.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the source audio containing medical
     * information.
     * </p>
     * <p>
     * If you don't specify the sample rate, Amazon Transcribe Medical
     * determines it for you. If you choose to specify the sample rate, it must
     * match the rate detected by Amazon Transcribe Medical.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the source audio containing
     *            medical information.
     *            </p>
     *            <p>
     *            If you don't specify the sample rate, Amazon Transcribe
     *            Medical determines it for you. If you choose to specify the
     *            sample rate, it must match the rate detected by Amazon
     *            Transcribe Medical.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the source audio containing medical
     * information.
     * </p>
     * <p>
     * If you don't specify the sample rate, Amazon Transcribe Medical
     * determines it for you. If you choose to specify the sample rate, it must
     * match the rate detected by Amazon Transcribe Medical.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the source audio containing
     *            medical information.
     *            </p>
     *            <p>
     *            If you don't specify the sample rate, Amazon Transcribe
     *            Medical determines it for you. If you choose to specify the
     *            sample rate, it must match the rate detected by Amazon
     *            Transcribe Medical.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJob withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @return <p>
     *         The format of the input media file.
     *         </p>
     * @see MediaFormat
     */
    public String getMediaFormat() {
        return mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaFormat
     */
    public MedicalTranscriptionJob withMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaFormat
     */
    public MedicalTranscriptionJob withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * Describes the input media file in a transcription request.
     * </p>
     *
     * @return <p>
     *         Describes the input media file in a transcription request.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * Describes the input media file in a transcription request.
     * </p>
     *
     * @param media <p>
     *            Describes the input media file in a transcription request.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Describes the input media file in a transcription request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            Describes the input media file in a transcription request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJob withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * An object that contains the <code>MedicalTranscript</code>. The
     * <code>MedicalTranscript</code> contains the
     * <code>TranscriptFileUri</code>.
     * </p>
     *
     * @return <p>
     *         An object that contains the <code>MedicalTranscript</code>. The
     *         <code>MedicalTranscript</code> contains the
     *         <code>TranscriptFileUri</code>.
     *         </p>
     */
    public MedicalTranscript getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * An object that contains the <code>MedicalTranscript</code>. The
     * <code>MedicalTranscript</code> contains the
     * <code>TranscriptFileUri</code>.
     * </p>
     *
     * @param transcript <p>
     *            An object that contains the <code>MedicalTranscript</code>.
     *            The <code>MedicalTranscript</code> contains the
     *            <code>TranscriptFileUri</code>.
     *            </p>
     */
    public void setTranscript(MedicalTranscript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * An object that contains the <code>MedicalTranscript</code>. The
     * <code>MedicalTranscript</code> contains the
     * <code>TranscriptFileUri</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            An object that contains the <code>MedicalTranscript</code>.
     *            The <code>MedicalTranscript</code> contains the
     *            <code>TranscriptFileUri</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJob withTranscript(MedicalTranscript transcript) {
        this.transcript = transcript;
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
    public MedicalTranscriptionJob withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
    public MedicalTranscriptionJob withCreationTime(java.util.Date creationTime) {
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
    public MedicalTranscriptionJob withCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * this field contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>- The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * - The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>- The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * - The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>- The size of your
     * audio file is larger than what Amazon Transcribe Medical can process. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and Quotas</a> in the <i>Amazon Transcribe Medical Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>-
     * Your audio contains more channels than Amazon Transcribe Medical is
     * configured to process. To request additional channels, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html"
     * >Amazon Transcribe Medical Endpoints and Quotas</a> in the <i>Amazon Web
     * Services General Reference</i>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         If the <code>TranscriptionJobStatus</code> field is
     *         <code>FAILED</code>, this field contains information about why
     *         the job failed.
     *         </p>
     *         <p>
     *         The <code>FailureReason</code> field contains one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unsupported media format</code>- The media format specified
     *         in the <code>MediaFormat</code> field of the request isn't valid.
     *         See the description of the <code>MediaFormat</code> field for a
     *         list of valid values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The media format provided does not match the detected media format</code>
     *         - The media format of the audio file doesn't match the format
     *         specified in the <code>MediaFormat</code> field in the request.
     *         Check the media format of your media file and make sure the two
     *         values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid sample rate for audio file</code>- The sample rate
     *         specified in the <code>MediaSampleRateHertz</code> of the request
     *         isn't valid. The sample rate must be between 8,000 and 48,000
     *         Hertz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The sample rate provided does not match the detected sample rate</code>
     *         - The sample rate in the audio file doesn't match the sample rate
     *         specified in the <code>MediaSampleRateHertz</code> field in the
     *         request. Check the sample rate of your media file and make sure
     *         that the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid file size: file size too large</code>- The size of
     *         your audio file is larger than what Amazon Transcribe Medical can
     *         process. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *         >Guidelines and Quotas</a> in the <i>Amazon Transcribe Medical
     *         Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid number of channels: number of channels too large</code>
     *         - Your audio contains more channels than Amazon Transcribe
     *         Medical is configured to process. To request additional channels,
     *         see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html"
     *         >Amazon Transcribe Medical Endpoints and Quotas</a> in the
     *         <i>Amazon Web Services General Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * this field contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>- The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * - The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>- The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * - The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>- The size of your
     * audio file is larger than what Amazon Transcribe Medical can process. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and Quotas</a> in the <i>Amazon Transcribe Medical Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>-
     * Your audio contains more channels than Amazon Transcribe Medical is
     * configured to process. To request additional channels, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html"
     * >Amazon Transcribe Medical Endpoints and Quotas</a> in the <i>Amazon Web
     * Services General Reference</i>.
     * </p>
     * </li>
     * </ul>
     *
     * @param failureReason <p>
     *            If the <code>TranscriptionJobStatus</code> field is
     *            <code>FAILED</code>, this field contains information about why
     *            the job failed.
     *            </p>
     *            <p>
     *            The <code>FailureReason</code> field contains one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unsupported media format</code>- The media format
     *            specified in the <code>MediaFormat</code> field of the request
     *            isn't valid. See the description of the
     *            <code>MediaFormat</code> field for a list of valid values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The media format provided does not match the detected media format</code>
     *            - The media format of the audio file doesn't match the format
     *            specified in the <code>MediaFormat</code> field in the
     *            request. Check the media format of your media file and make
     *            sure the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid sample rate for audio file</code>- The sample
     *            rate specified in the <code>MediaSampleRateHertz</code> of the
     *            request isn't valid. The sample rate must be between 8,000 and
     *            48,000 Hertz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The sample rate provided does not match the detected sample rate</code>
     *            - The sample rate in the audio file doesn't match the sample
     *            rate specified in the <code>MediaSampleRateHertz</code> field
     *            in the request. Check the sample rate of your media file and
     *            make sure that the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid file size: file size too large</code>- The size
     *            of your audio file is larger than what Amazon Transcribe
     *            Medical can process. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *            >Guidelines and Quotas</a> in the <i>Amazon Transcribe Medical
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid number of channels: number of channels too large</code>
     *            - Your audio contains more channels than Amazon Transcribe
     *            Medical is configured to process. To request additional
     *            channels, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html"
     *            >Amazon Transcribe Medical Endpoints and Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * this field contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>- The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * - The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>- The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * - The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>- The size of your
     * audio file is larger than what Amazon Transcribe Medical can process. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and Quotas</a> in the <i>Amazon Transcribe Medical Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>-
     * Your audio contains more channels than Amazon Transcribe Medical is
     * configured to process. To request additional channels, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html"
     * >Amazon Transcribe Medical Endpoints and Quotas</a> in the <i>Amazon Web
     * Services General Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If the <code>TranscriptionJobStatus</code> field is
     *            <code>FAILED</code>, this field contains information about why
     *            the job failed.
     *            </p>
     *            <p>
     *            The <code>FailureReason</code> field contains one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unsupported media format</code>- The media format
     *            specified in the <code>MediaFormat</code> field of the request
     *            isn't valid. See the description of the
     *            <code>MediaFormat</code> field for a list of valid values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The media format provided does not match the detected media format</code>
     *            - The media format of the audio file doesn't match the format
     *            specified in the <code>MediaFormat</code> field in the
     *            request. Check the media format of your media file and make
     *            sure the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid sample rate for audio file</code>- The sample
     *            rate specified in the <code>MediaSampleRateHertz</code> of the
     *            request isn't valid. The sample rate must be between 8,000 and
     *            48,000 Hertz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The sample rate provided does not match the detected sample rate</code>
     *            - The sample rate in the audio file doesn't match the sample
     *            rate specified in the <code>MediaSampleRateHertz</code> field
     *            in the request. Check the sample rate of your media file and
     *            make sure that the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid file size: file size too large</code>- The size
     *            of your audio file is larger than what Amazon Transcribe
     *            Medical can process. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *            >Guidelines and Quotas</a> in the <i>Amazon Transcribe Medical
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid number of channels: number of channels too large</code>
     *            - Your audio contains more channels than Amazon Transcribe
     *            Medical is configured to process. To request additional
     *            channels, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html"
     *            >Amazon Transcribe Medical Endpoints and Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJob withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Object that contains object.
     * </p>
     *
     * @return <p>
     *         Object that contains object.
     *         </p>
     */
    public MedicalTranscriptionSetting getSettings() {
        return settings;
    }

    /**
     * <p>
     * Object that contains object.
     * </p>
     *
     * @param settings <p>
     *            Object that contains object.
     *            </p>
     */
    public void setSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Object that contains object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Object that contains object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJob withSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * Shows the type of content that you've configured Amazon Transcribe
     * Medical to identify in a transcription job. If the value is
     * <code>PHI</code>, you've configured the job to identify personal health
     * information (PHI) in the transcription output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @return <p>
     *         Shows the type of content that you've configured Amazon
     *         Transcribe Medical to identify in a transcription job. If the
     *         value is <code>PHI</code>, you've configured the job to identify
     *         personal health information (PHI) in the transcription output.
     *         </p>
     * @see MedicalContentIdentificationType
     */
    public String getContentIdentificationType() {
        return contentIdentificationType;
    }

    /**
     * <p>
     * Shows the type of content that you've configured Amazon Transcribe
     * Medical to identify in a transcription job. If the value is
     * <code>PHI</code>, you've configured the job to identify personal health
     * information (PHI) in the transcription output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Shows the type of content that you've configured Amazon
     *            Transcribe Medical to identify in a transcription job. If the
     *            value is <code>PHI</code>, you've configured the job to
     *            identify personal health information (PHI) in the
     *            transcription output.
     *            </p>
     * @see MedicalContentIdentificationType
     */
    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Shows the type of content that you've configured Amazon Transcribe
     * Medical to identify in a transcription job. If the value is
     * <code>PHI</code>, you've configured the job to identify personal health
     * information (PHI) in the transcription output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Shows the type of content that you've configured Amazon
     *            Transcribe Medical to identify in a transcription job. If the
     *            value is <code>PHI</code>, you've configured the job to
     *            identify personal health information (PHI) in the
     *            transcription output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalContentIdentificationType
     */
    public MedicalTranscriptionJob withContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
        return this;
    }

    /**
     * <p>
     * Shows the type of content that you've configured Amazon Transcribe
     * Medical to identify in a transcription job. If the value is
     * <code>PHI</code>, you've configured the job to identify personal health
     * information (PHI) in the transcription output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Shows the type of content that you've configured Amazon
     *            Transcribe Medical to identify in a transcription job. If the
     *            value is <code>PHI</code>, you've configured the job to
     *            identify personal health information (PHI) in the
     *            transcription output.
     *            </p>
     * @see MedicalContentIdentificationType
     */
    public void setContentIdentificationType(
            MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
    }

    /**
     * <p>
     * Shows the type of content that you've configured Amazon Transcribe
     * Medical to identify in a transcription job. If the value is
     * <code>PHI</code>, you've configured the job to identify personal health
     * information (PHI) in the transcription output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Shows the type of content that you've configured Amazon
     *            Transcribe Medical to identify in a transcription job. If the
     *            value is <code>PHI</code>, you've configured the job to
     *            identify personal health information (PHI) in the
     *            transcription output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalContentIdentificationType
     */
    public MedicalTranscriptionJob withContentIdentificationType(
            MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
        return this;
    }

    /**
     * <p>
     * The medical specialty of any clinicians providing a dictation or having a
     * conversation. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @return <p>
     *         The medical specialty of any clinicians providing a dictation or
     *         having a conversation. Refer to <a href=
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
     * The medical specialty of any clinicians providing a dictation or having a
     * conversation. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of any clinicians providing a dictation
     *            or having a conversation. Refer to <a href=
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
     * The medical specialty of any clinicians providing a dictation or having a
     * conversation. Refer to <a href=
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
     *            The medical specialty of any clinicians providing a dictation
     *            or having a conversation. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     *            >Transcribing a medical conversation</a>for a list of
     *            supported specialties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Specialty
     */
    public MedicalTranscriptionJob withSpecialty(String specialty) {
        this.specialty = specialty;
        return this;
    }

    /**
     * <p>
     * The medical specialty of any clinicians providing a dictation or having a
     * conversation. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     * >Transcribing a medical conversation</a>for a list of supported
     * specialties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of any clinicians providing a dictation
     *            or having a conversation. Refer to <a href=
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
     * The medical specialty of any clinicians providing a dictation or having a
     * conversation. Refer to <a href=
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
     *            The medical specialty of any clinicians providing a dictation
     *            or having a conversation. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-medical-conversation.html"
     *            >Transcribing a medical conversation</a>for a list of
     *            supported specialties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Specialty
     */
    public MedicalTranscriptionJob withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is
     * generally used for patient-physician dialogues. <code>DICTATION</code> is
     * the setting for physicians speaking their notes after seeing a patient.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     * >What is Amazon Transcribe Medical?</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @return <p>
     *         The type of speech in the transcription job.
     *         <code>CONVERSATION</code> is generally used for patient-physician
     *         dialogues. <code>DICTATION</code> is the setting for physicians
     *         speaking their notes after seeing a patient. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     *         >What is Amazon Transcribe Medical?</a>.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is
     * generally used for patient-physician dialogues. <code>DICTATION</code> is
     * the setting for physicians speaking their notes after seeing a patient.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     * >What is Amazon Transcribe Medical?</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The type of speech in the transcription job.
     *            <code>CONVERSATION</code> is generally used for
     *            patient-physician dialogues. <code>DICTATION</code> is the
     *            setting for physicians speaking their notes after seeing a
     *            patient. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     *            >What is Amazon Transcribe Medical?</a>.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is
     * generally used for patient-physician dialogues. <code>DICTATION</code> is
     * the setting for physicians speaking their notes after seeing a patient.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     * >What is Amazon Transcribe Medical?</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The type of speech in the transcription job.
     *            <code>CONVERSATION</code> is generally used for
     *            patient-physician dialogues. <code>DICTATION</code> is the
     *            setting for physicians speaking their notes after seeing a
     *            patient. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     *            >What is Amazon Transcribe Medical?</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public MedicalTranscriptionJob withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is
     * generally used for patient-physician dialogues. <code>DICTATION</code> is
     * the setting for physicians speaking their notes after seeing a patient.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     * >What is Amazon Transcribe Medical?</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The type of speech in the transcription job.
     *            <code>CONVERSATION</code> is generally used for
     *            patient-physician dialogues. <code>DICTATION</code> is the
     *            setting for physicians speaking their notes after seeing a
     *            patient. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     *            >What is Amazon Transcribe Medical?</a>.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is
     * generally used for patient-physician dialogues. <code>DICTATION</code> is
     * the setting for physicians speaking their notes after seeing a patient.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     * >What is Amazon Transcribe Medical?</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The type of speech in the transcription job.
     *            <code>CONVERSATION</code> is generally used for
     *            patient-physician dialogues. <code>DICTATION</code> is the
     *            setting for physicians speaking their notes after seeing a
     *            patient. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/what-is-transcribe-med.html"
     *            >What is Amazon Transcribe Medical?</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public MedicalTranscriptionJob withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A key:value pair assigned to a given medical transcription job.
     * </p>
     *
     * @return <p>
     *         A key:value pair assigned to a given medical transcription job.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A key:value pair assigned to a given medical transcription job.
     * </p>
     *
     * @param tags <p>
     *            A key:value pair assigned to a given medical transcription
     *            job.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A key:value pair assigned to a given medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A key:value pair assigned to a given medical transcription
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJob withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A key:value pair assigned to a given medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A key:value pair assigned to a given medical transcription
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscriptionJob withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: " + getTranscriptionJobStatus() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: " + getMediaSampleRateHertz() + ",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: " + getMediaFormat() + ",");
        if (getMedia() != null)
            sb.append("Media: " + getMedia() + ",");
        if (getTranscript() != null)
            sb.append("Transcript: " + getTranscript() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getContentIdentificationType() != null)
            sb.append("ContentIdentificationType: " + getContentIdentificationType() + ",");
        if (getSpecialty() != null)
            sb.append("Specialty: " + getSpecialty() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime
                * hashCode
                + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode
                + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType()
                        .hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalTranscriptionJob == false)
            return false;
        MedicalTranscriptionJob other = (MedicalTranscriptionJob) obj;

        if (other.getMedicalTranscriptionJobName() == null
                ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null
                && other.getMedicalTranscriptionJobName().equals(
                        this.getMedicalTranscriptionJobName()) == false)
            return false;
        if (other.getTranscriptionJobStatus() == null ^ this.getTranscriptionJobStatus() == null)
            return false;
        if (other.getTranscriptionJobStatus() != null
                && other.getTranscriptionJobStatus().equals(this.getTranscriptionJobStatus()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getMediaSampleRateHertz() == null ^ this.getMediaSampleRateHertz() == null)
            return false;
        if (other.getMediaSampleRateHertz() != null
                && other.getMediaSampleRateHertz().equals(this.getMediaSampleRateHertz()) == false)
            return false;
        if (other.getMediaFormat() == null ^ this.getMediaFormat() == null)
            return false;
        if (other.getMediaFormat() != null
                && other.getMediaFormat().equals(this.getMediaFormat()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null
                && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
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
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getContentIdentificationType() == null
                ^ this.getContentIdentificationType() == null)
            return false;
        if (other.getContentIdentificationType() != null
                && other.getContentIdentificationType().equals(this.getContentIdentificationType()) == false)
            return false;
        if (other.getSpecialty() == null ^ this.getSpecialty() == null)
            return false;
        if (other.getSpecialty() != null
                && other.getSpecialty().equals(this.getSpecialty()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
