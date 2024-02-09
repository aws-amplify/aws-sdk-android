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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Provides detailed information about a Medical Scribe job.
 * </p>
 * <p>
 * To view the status of the specified Medical Scribe job, check the
 * <code>MedicalScribeJobStatus</code> field. If the status is
 * <code>COMPLETED</code>, the job is finished and you can find the results at
 * the locations specified in <code>MedicalScribeOutput</code>. If the status is
 * <code>FAILED</code>, <code>FailureReason</code> provides details on why your
 * Medical Scribe job failed.
 * </p>
 */
public class MedicalScribeJob implements Serializable {
    /**
     * <p>
     * The name of the Medical Scribe job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String medicalScribeJobName;

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your Medical Scribe
     * job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String medicalScribeJobStatus;

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (
     * <code>en-US</code>) is the only supported language for Medical Scribe
     * jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     */
    private String languageCode;

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     * <p>
     * For information on supported media formats, refer to the
     * <code>MediaFormat</code> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * The location of the output of your Medical Scribe job.
     * <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for the Clinical
     * Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for
     * the Transcript.
     * </p>
     */
    private MedicalScribeOutput medicalScribeOutput;

    /**
     * <p>
     * The date and time your Medical Scribe job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time the specified Medical Scribe job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time the specified Medical Scribe job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe
     * job that finished processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date completionTime;

    /**
     * <p>
     * If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job failed. See also: <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed
     * using a <code>MedicalScribeSettings</code> object. Specify
     * <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are
     * set. Enabled <code>ShowSpeakerLabels</code> if
     * <code>ChannelIdentification</code> and <code>ChannelDefinitions</code>
     * are not set. One and only one of <code>ChannelIdentification</code> and
     * <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must
     * also be set. Use <code>Settings</code> to specify a vocabulary or
     * vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code>
     * must be specified if <code>VocabularyFilterName</code> is set.
     * </p>
     */
    private MedicalScribeSettings settings;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files, write to the
     * output bucket, and use your KMS key if supplied. If the role that you
     * specify doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     */
    private java.util.List<MedicalScribeChannelDefinition> channelDefinitions;

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the Medical Scribe job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the Medical Scribe job. Job names are case sensitive
     *         and must be unique within an Amazon Web Services account.
     *         </p>
     */
    public String getMedicalScribeJobName() {
        return medicalScribeJobName;
    }

    /**
     * <p>
     * The name of the Medical Scribe job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalScribeJobName <p>
     *            The name of the Medical Scribe job. Job names are case
     *            sensitive and must be unique within an Amazon Web Services
     *            account.
     *            </p>
     */
    public void setMedicalScribeJobName(String medicalScribeJobName) {
        this.medicalScribeJobName = medicalScribeJobName;
    }

    /**
     * <p>
     * The name of the Medical Scribe job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalScribeJobName <p>
     *            The name of the Medical Scribe job. Job names are case
     *            sensitive and must be unique within an Amazon Web Services
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withMedicalScribeJobName(String medicalScribeJobName) {
        this.medicalScribeJobName = medicalScribeJobName;
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your Medical Scribe
     * job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         Provides the status of the specified Medical Scribe job.
     *         </p>
     *         <p>
     *         If the status is <code>COMPLETED</code>, the job is finished and
     *         you can find the results at the location specified in
     *         <code>MedicalScribeOutput</code> If the status is
     *         <code>FAILED</code>, <code>FailureReason</code> provides details
     *         on why your Medical Scribe job failed.
     *         </p>
     * @see MedicalScribeJobStatus
     */
    public String getMedicalScribeJobStatus() {
        return medicalScribeJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your Medical Scribe
     * job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param medicalScribeJobStatus <p>
     *            Provides the status of the specified Medical Scribe job.
     *            </p>
     *            <p>
     *            If the status is <code>COMPLETED</code>, the job is finished
     *            and you can find the results at the location specified in
     *            <code>MedicalScribeOutput</code> If the status is
     *            <code>FAILED</code>, <code>FailureReason</code> provides
     *            details on why your Medical Scribe job failed.
     *            </p>
     * @see MedicalScribeJobStatus
     */
    public void setMedicalScribeJobStatus(String medicalScribeJobStatus) {
        this.medicalScribeJobStatus = medicalScribeJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your Medical Scribe
     * job failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param medicalScribeJobStatus <p>
     *            Provides the status of the specified Medical Scribe job.
     *            </p>
     *            <p>
     *            If the status is <code>COMPLETED</code>, the job is finished
     *            and you can find the results at the location specified in
     *            <code>MedicalScribeOutput</code> If the status is
     *            <code>FAILED</code>, <code>FailureReason</code> provides
     *            details on why your Medical Scribe job failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalScribeJobStatus
     */
    public MedicalScribeJob withMedicalScribeJobStatus(String medicalScribeJobStatus) {
        this.medicalScribeJobStatus = medicalScribeJobStatus;
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your Medical Scribe
     * job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param medicalScribeJobStatus <p>
     *            Provides the status of the specified Medical Scribe job.
     *            </p>
     *            <p>
     *            If the status is <code>COMPLETED</code>, the job is finished
     *            and you can find the results at the location specified in
     *            <code>MedicalScribeOutput</code> If the status is
     *            <code>FAILED</code>, <code>FailureReason</code> provides
     *            details on why your Medical Scribe job failed.
     *            </p>
     * @see MedicalScribeJobStatus
     */
    public void setMedicalScribeJobStatus(MedicalScribeJobStatus medicalScribeJobStatus) {
        this.medicalScribeJobStatus = medicalScribeJobStatus.toString();
    }

    /**
     * <p>
     * Provides the status of the specified Medical Scribe job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>MedicalScribeOutput</code> If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your Medical Scribe
     * job failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param medicalScribeJobStatus <p>
     *            Provides the status of the specified Medical Scribe job.
     *            </p>
     *            <p>
     *            If the status is <code>COMPLETED</code>, the job is finished
     *            and you can find the results at the location specified in
     *            <code>MedicalScribeOutput</code> If the status is
     *            <code>FAILED</code>, <code>FailureReason</code> provides
     *            details on why your Medical Scribe job failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalScribeJobStatus
     */
    public MedicalScribeJob withMedicalScribeJobStatus(MedicalScribeJobStatus medicalScribeJobStatus) {
        this.medicalScribeJobStatus = medicalScribeJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (
     * <code>en-US</code>) is the only supported language for Medical Scribe
     * jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @return <p>
     *         The language code used to create your Medical Scribe job. US
     *         English (<code>en-US</code>) is the only supported language for
     *         Medical Scribe jobs.
     *         </p>
     * @see MedicalScribeLanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (
     * <code>en-US</code>) is the only supported language for Medical Scribe
     * jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @param languageCode <p>
     *            The language code used to create your Medical Scribe job. US
     *            English (<code>en-US</code>) is the only supported language
     *            for Medical Scribe jobs.
     *            </p>
     * @see MedicalScribeLanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (
     * <code>en-US</code>) is the only supported language for Medical Scribe
     * jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @param languageCode <p>
     *            The language code used to create your Medical Scribe job. US
     *            English (<code>en-US</code>) is the only supported language
     *            for Medical Scribe jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalScribeLanguageCode
     */
    public MedicalScribeJob withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (
     * <code>en-US</code>) is the only supported language for Medical Scribe
     * jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @param languageCode <p>
     *            The language code used to create your Medical Scribe job. US
     *            English (<code>en-US</code>) is the only supported language
     *            for Medical Scribe jobs.
     *            </p>
     * @see MedicalScribeLanguageCode
     */
    public void setLanguageCode(MedicalScribeLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code used to create your Medical Scribe job. US English (
     * <code>en-US</code>) is the only supported language for Medical Scribe
     * jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @param languageCode <p>
     *            The language code used to create your Medical Scribe job. US
     *            English (<code>en-US</code>) is the only supported language
     *            for Medical Scribe jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalScribeLanguageCode
     */
    public MedicalScribeJob withLanguageCode(MedicalScribeLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     * <p>
     * For information on supported media formats, refer to the
     * <code>MediaFormat</code> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     *
     * @return <p>
     *         Describes the Amazon S3 location of the media file you want to
     *         use in your request.
     *         </p>
     *         <p>
     *         For information on supported media formats, refer to the
     *         <code>MediaFormat</code> parameter or the <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     *         >Media formats</a> section in the Amazon S3 Developer Guide.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     * <p>
     * For information on supported media formats, refer to the
     * <code>MediaFormat</code> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your request.
     *            </p>
     *            <p>
     *            For information on supported media formats, refer to the
     *            <code>MediaFormat</code> parameter or the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     *            >Media formats</a> section in the Amazon S3 Developer Guide.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     * <p>
     * For information on supported media formats, refer to the
     * <code>MediaFormat</code> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your request.
     *            </p>
     *            <p>
     *            For information on supported media formats, refer to the
     *            <code>MediaFormat</code> parameter or the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     *            >Media formats</a> section in the Amazon S3 Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * The location of the output of your Medical Scribe job.
     * <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for the Clinical
     * Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for
     * the Transcript.
     * </p>
     *
     * @return <p>
     *         The location of the output of your Medical Scribe job.
     *         <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for the
     *         Clinical Document and <code>TranscriptFileUri</code> holds the
     *         Amazon S3 URI for the Transcript.
     *         </p>
     */
    public MedicalScribeOutput getMedicalScribeOutput() {
        return medicalScribeOutput;
    }

    /**
     * <p>
     * The location of the output of your Medical Scribe job.
     * <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for the Clinical
     * Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for
     * the Transcript.
     * </p>
     *
     * @param medicalScribeOutput <p>
     *            The location of the output of your Medical Scribe job.
     *            <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for
     *            the Clinical Document and <code>TranscriptFileUri</code> holds
     *            the Amazon S3 URI for the Transcript.
     *            </p>
     */
    public void setMedicalScribeOutput(MedicalScribeOutput medicalScribeOutput) {
        this.medicalScribeOutput = medicalScribeOutput;
    }

    /**
     * <p>
     * The location of the output of your Medical Scribe job.
     * <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for the Clinical
     * Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for
     * the Transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param medicalScribeOutput <p>
     *            The location of the output of your Medical Scribe job.
     *            <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for
     *            the Clinical Document and <code>TranscriptFileUri</code> holds
     *            the Amazon S3 URI for the Transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withMedicalScribeOutput(MedicalScribeOutput medicalScribeOutput) {
        this.medicalScribeOutput = medicalScribeOutput;
        return this;
    }

    /**
     * <p>
     * The date and time your Medical Scribe job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time your Medical Scribe job began processing.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.789000-07:00</code> represents a
     *         Medical Scribe job that started processing at 12:32 PM UTC-7 on
     *         May 4, 2022.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The date and time your Medical Scribe job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param startTime <p>
     *            The date and time your Medical Scribe job began processing.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.789000-07:00</code> represents a
     *            Medical Scribe job that started processing at 12:32 PM UTC-7
     *            on May 4, 2022.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time your Medical Scribe job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a Medical Scribe
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The date and time your Medical Scribe job began processing.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.789000-07:00</code> represents a
     *            Medical Scribe job that started processing at 12:32 PM UTC-7
     *            on May 4, 2022.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified Medical Scribe job request was
     *         made.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *         Medical Scribe job that started processing at 12:32 PM UTC-7 on
     *         May 4, 2022.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time the specified Medical Scribe job request was
     *            made.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *            Medical Scribe job that started processing at 12:32 PM UTC-7
     *            on May 4, 2022.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time the specified Medical Scribe job request was
     *            made.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *            Medical Scribe job that started processing at 12:32 PM UTC-7
     *            on May 4, 2022.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe
     * job that finished processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified Medical Scribe job finished
     *         processing.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *         Medical Scribe job that finished processing at 12:32 PM UTC-7 on
     *         May 4, 2022.
     *         </p>
     */
    public java.util.Date getCompletionTime() {
        return completionTime;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe
     * job that finished processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param completionTime <p>
     *            The date and time the specified Medical Scribe job finished
     *            processing.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *            Medical Scribe job that finished processing at 12:32 PM UTC-7
     *            on May 4, 2022.
     *            </p>
     */
    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The date and time the specified Medical Scribe job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a Medical Scribe
     * job that finished processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionTime <p>
     *            The date and time the specified Medical Scribe job finished
     *            processing.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *            Medical Scribe job that finished processing at 12:32 PM UTC-7
     *            on May 4, 2022.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * <p>
     * If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job failed. See also: <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     *
     * @return <p>
     *         If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>,
     *         <code>FailureReason</code> contains information about why the
     *         transcription job failed. See also: <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     *         >Common Errors</a>.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job failed. See also: <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     *
     * @param failureReason <p>
     *            If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>,
     *            <code>FailureReason</code> contains information about why the
     *            transcription job failed. See also: <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     *            >Common Errors</a>.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job failed. See also: <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If <code>MedicalScribeJobStatus</code> is <code>FAILED</code>,
     *            <code>FailureReason</code> contains information about why the
     *            transcription job failed. See also: <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     *            >Common Errors</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed
     * using a <code>MedicalScribeSettings</code> object. Specify
     * <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are
     * set. Enabled <code>ShowSpeakerLabels</code> if
     * <code>ChannelIdentification</code> and <code>ChannelDefinitions</code>
     * are not set. One and only one of <code>ChannelIdentification</code> and
     * <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must
     * also be set. Use <code>Settings</code> to specify a vocabulary or
     * vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code>
     * must be specified if <code>VocabularyFilterName</code> is set.
     * </p>
     *
     * @return <p>
     *         Makes it possible to control how your Medical Scribe job is
     *         processed using a <code>MedicalScribeSettings</code> object.
     *         Specify <code>ChannelIdentification</code> if
     *         <code>ChannelDefinitions</code> are set. Enabled
     *         <code>ShowSpeakerLabels</code> if
     *         <code>ChannelIdentification</code> and
     *         <code>ChannelDefinitions</code> are not set. One and only one of
     *         <code>ChannelIdentification</code> and
     *         <code>ShowSpeakerLabels</code> must be set. If
     *         <code>ShowSpeakerLabels</code> is set,
     *         <code>MaxSpeakerLabels</code> must also be set. Use
     *         <code>Settings</code> to specify a vocabulary or vocabulary
     *         filter or both using <code>VocabularyName</code>,
     *         <code>VocabularyFilterName</code>.
     *         <code>VocabularyFilterMethod</code> must be specified if
     *         <code>VocabularyFilterName</code> is set.
     *         </p>
     */
    public MedicalScribeSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed
     * using a <code>MedicalScribeSettings</code> object. Specify
     * <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are
     * set. Enabled <code>ShowSpeakerLabels</code> if
     * <code>ChannelIdentification</code> and <code>ChannelDefinitions</code>
     * are not set. One and only one of <code>ChannelIdentification</code> and
     * <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must
     * also be set. Use <code>Settings</code> to specify a vocabulary or
     * vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code>
     * must be specified if <code>VocabularyFilterName</code> is set.
     * </p>
     *
     * @param settings <p>
     *            Makes it possible to control how your Medical Scribe job is
     *            processed using a <code>MedicalScribeSettings</code> object.
     *            Specify <code>ChannelIdentification</code> if
     *            <code>ChannelDefinitions</code> are set. Enabled
     *            <code>ShowSpeakerLabels</code> if
     *            <code>ChannelIdentification</code> and
     *            <code>ChannelDefinitions</code> are not set. One and only one
     *            of <code>ChannelIdentification</code> and
     *            <code>ShowSpeakerLabels</code> must be set. If
     *            <code>ShowSpeakerLabels</code> is set,
     *            <code>MaxSpeakerLabels</code> must also be set. Use
     *            <code>Settings</code> to specify a vocabulary or vocabulary
     *            filter or both using <code>VocabularyName</code>,
     *            <code>VocabularyFilterName</code>.
     *            <code>VocabularyFilterMethod</code> must be specified if
     *            <code>VocabularyFilterName</code> is set.
     *            </p>
     */
    public void setSettings(MedicalScribeSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed
     * using a <code>MedicalScribeSettings</code> object. Specify
     * <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are
     * set. Enabled <code>ShowSpeakerLabels</code> if
     * <code>ChannelIdentification</code> and <code>ChannelDefinitions</code>
     * are not set. One and only one of <code>ChannelIdentification</code> and
     * <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must
     * also be set. Use <code>Settings</code> to specify a vocabulary or
     * vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code>
     * must be specified if <code>VocabularyFilterName</code> is set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Makes it possible to control how your Medical Scribe job is
     *            processed using a <code>MedicalScribeSettings</code> object.
     *            Specify <code>ChannelIdentification</code> if
     *            <code>ChannelDefinitions</code> are set. Enabled
     *            <code>ShowSpeakerLabels</code> if
     *            <code>ChannelIdentification</code> and
     *            <code>ChannelDefinitions</code> are not set. One and only one
     *            of <code>ChannelIdentification</code> and
     *            <code>ShowSpeakerLabels</code> must be set. If
     *            <code>ShowSpeakerLabels</code> is set,
     *            <code>MaxSpeakerLabels</code> must also be set. Use
     *            <code>Settings</code> to specify a vocabulary or vocabulary
     *            filter or both using <code>VocabularyName</code>,
     *            <code>VocabularyFilterName</code>.
     *            <code>VocabularyFilterMethod</code> must be specified if
     *            <code>VocabularyFilterName</code> is set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withSettings(MedicalScribeSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files, write to the
     * output bucket, and use your KMS key if supplied. If the role that you
     * specify doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role that has
     *         permissions to access the Amazon S3 bucket that contains your
     *         input files, write to the output bucket, and use your KMS key if
     *         supplied. If the role that you specify doesn’t have the
     *         appropriate permissions your request fails.
     *         </p>
     *         <p>
     *         IAM role ARNs have the format
     *         <code>arn:partition:iam::account:role/role-name-with-path</code>.
     *         For example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *         >IAM ARNs</a>.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files, write to the
     * output bucket, and use your KMS key if supplied. If the role that you
     * specify doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that has
     *            permissions to access the Amazon S3 bucket that contains your
     *            input files, write to the output bucket, and use your KMS key
     *            if supplied. If the role that you specify doesn’t have the
     *            appropriate permissions your request fails.
     *            </p>
     *            <p>
     *            IAM role ARNs have the format
     *            <code>arn:partition:iam::account:role/role-name-with-path</code>
     *            . For example:
     *            <code>arn:aws:iam::111122223333:role/Admin</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files, write to the
     * output bucket, and use your KMS key if supplied. If the role that you
     * specify doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that has
     *            permissions to access the Amazon S3 bucket that contains your
     *            input files, write to the output bucket, and use your KMS key
     *            if supplied. If the role that you specify doesn’t have the
     *            appropriate permissions your request fails.
     *            </p>
     *            <p>
     *            IAM role ARNs have the format
     *            <code>arn:partition:iam::account:role/role-name-with-path</code>
     *            . For example:
     *            <code>arn:aws:iam::111122223333:role/Admin</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     *
     * @return <p>
     *         Makes it possible to specify which speaker is on which channel.
     *         For example, if the clinician is the first participant to speak,
     *         you would set <code>ChannelId</code> of the first
     *         <code>ChannelDefinition</code> in the list to <code>0</code> (to
     *         indicate the first channel) and <code>ParticipantRole</code> to
     *         <code>CLINICIAN</code> (to indicate that it's the clinician
     *         speaking). Then you would set the <code>ChannelId</code> of the
     *         second <code>ChannelDefinition</code> in the list to
     *         <code>1</code> (to indicate the second channel) and
     *         <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate
     *         that it's the patient speaking).
     *         </p>
     */
    public java.util.List<MedicalScribeChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if the clinician is the first
     *            participant to speak, you would set <code>ChannelId</code> of
     *            the first <code>ChannelDefinition</code> in the list to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>CLINICIAN</code> (to
     *            indicate that it's the clinician speaking). Then you would set
     *            the <code>ChannelId</code> of the second
     *            <code>ChannelDefinition</code> in the list to <code>1</code>
     *            (to indicate the second channel) and
     *            <code>ParticipantRole</code> to <code>PATIENT</code> (to
     *            indicate that it's the patient speaking).
     *            </p>
     */
    public void setChannelDefinitions(
            java.util.Collection<MedicalScribeChannelDefinition> channelDefinitions) {
        if (channelDefinitions == null) {
            this.channelDefinitions = null;
            return;
        }

        this.channelDefinitions = new java.util.ArrayList<MedicalScribeChannelDefinition>(
                channelDefinitions);
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if the clinician is the first
     *            participant to speak, you would set <code>ChannelId</code> of
     *            the first <code>ChannelDefinition</code> in the list to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>CLINICIAN</code> (to
     *            indicate that it's the clinician speaking). Then you would set
     *            the <code>ChannelId</code> of the second
     *            <code>ChannelDefinition</code> in the list to <code>1</code>
     *            (to indicate the second channel) and
     *            <code>ParticipantRole</code> to <code>PATIENT</code> (to
     *            indicate that it's the patient speaking).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withChannelDefinitions(
            MedicalScribeChannelDefinition... channelDefinitions) {
        if (getChannelDefinitions() == null) {
            this.channelDefinitions = new java.util.ArrayList<MedicalScribeChannelDefinition>(
                    channelDefinitions.length);
        }
        for (MedicalScribeChannelDefinition value : channelDefinitions) {
            this.channelDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if the clinician is the first
     *            participant to speak, you would set <code>ChannelId</code> of
     *            the first <code>ChannelDefinition</code> in the list to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>CLINICIAN</code> (to
     *            indicate that it's the clinician speaking). Then you would set
     *            the <code>ChannelId</code> of the second
     *            <code>ChannelDefinition</code> in the list to <code>1</code>
     *            (to indicate the second channel) and
     *            <code>ParticipantRole</code> to <code>PATIENT</code> (to
     *            indicate that it's the patient speaking).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withChannelDefinitions(
            java.util.Collection<MedicalScribeChannelDefinition> channelDefinitions) {
        setChannelDefinitions(channelDefinitions);
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @return <p>
     *         Adds one or more custom tags, each in the form of a key:value
     *         pair, to the Medica Scribe job.
     *         </p>
     *         <p>
     *         To learn more about using tags with Amazon Transcribe, refer to
     *         <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     *         >Tagging resources</a>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to the Medica Scribe job.
     *            </p>
     *            <p>
     *            To learn more about using tags with Amazon Transcribe, refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     *            >Tagging resources</a>.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to the Medica Scribe job.
     *            </p>
     *            <p>
     *            To learn more about using tags with Amazon Transcribe, refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     *            >Tagging resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withTags(Tag... tags) {
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
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to the Medica Scribe job.
     *            </p>
     *            <p>
     *            To learn more about using tags with Amazon Transcribe, refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     *            >Tagging resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeJob withTags(java.util.Collection<Tag> tags) {
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
        if (getMedicalScribeJobName() != null)
            sb.append("MedicalScribeJobName: " + getMedicalScribeJobName() + ",");
        if (getMedicalScribeJobStatus() != null)
            sb.append("MedicalScribeJobStatus: " + getMedicalScribeJobStatus() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getMedia() != null)
            sb.append("Media: " + getMedia() + ",");
        if (getMedicalScribeOutput() != null)
            sb.append("MedicalScribeOutput: " + getMedicalScribeOutput() + ",");
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
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getChannelDefinitions() != null)
            sb.append("ChannelDefinitions: " + getChannelDefinitions() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMedicalScribeJobName() == null) ? 0 : getMedicalScribeJobName().hashCode());
        hashCode = prime
                * hashCode
                + ((getMedicalScribeJobStatus() == null) ? 0 : getMedicalScribeJobStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode
                + ((getMedicalScribeOutput() == null) ? 0 : getMedicalScribeOutput().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalScribeJob == false)
            return false;
        MedicalScribeJob other = (MedicalScribeJob) obj;

        if (other.getMedicalScribeJobName() == null ^ this.getMedicalScribeJobName() == null)
            return false;
        if (other.getMedicalScribeJobName() != null
                && other.getMedicalScribeJobName().equals(this.getMedicalScribeJobName()) == false)
            return false;
        if (other.getMedicalScribeJobStatus() == null ^ this.getMedicalScribeJobStatus() == null)
            return false;
        if (other.getMedicalScribeJobStatus() != null
                && other.getMedicalScribeJobStatus().equals(this.getMedicalScribeJobStatus()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getMedicalScribeOutput() == null ^ this.getMedicalScribeOutput() == null)
            return false;
        if (other.getMedicalScribeOutput() != null
                && other.getMedicalScribeOutput().equals(this.getMedicalScribeOutput()) == false)
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
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getChannelDefinitions() == null ^ this.getChannelDefinitions() == null)
            return false;
        if (other.getChannelDefinitions() != null
                && other.getChannelDefinitions().equals(this.getChannelDefinitions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
