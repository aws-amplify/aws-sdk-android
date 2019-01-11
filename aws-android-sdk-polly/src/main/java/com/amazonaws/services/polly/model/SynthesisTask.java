/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

/**
 * <p>
 * SynthesisTask object that provides information about a speech synthesis task.
 * </p>
 */
public class SynthesisTask implements Serializable {
    /**
     * <p>
     * The Amazon Polly generated identifier for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String taskId;

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     */
    private String taskStatus;

    /**
     * <p>
     * Reason for the current status of a specific speech synthesis task,
     * including errors if the task has failed.
     * </p>
     */
    private String taskStatusReason;

    /**
     * <p>
     * Pathway for the output speech file.
     * </p>
     */
    private String outputUri;

    /**
     * <p>
     * Timestamp for the time the synthesis task was started.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Number of billable characters synthesized.
     * </p>
     */
    private Integer requestCharacters;

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification
     * for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:.*:\w{12}:.+$<br/>
     */
    private String snsTopicArn;

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     */
    private java.util.List<String> lexiconNames;

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     */
    private String outputFormat;

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050".
     * The default value is "22050".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     */
    private String sampleRate;

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     */
    private java.util.List<String> speechMarkTypes;

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     */
    private String textType;

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     */
    private String voiceId;

    /**
     * <p>
     * Optional language code for a synthesis task. This is only necessary if
     * using a bilingual voice, such as Aditi, which can be used for either
     * Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     */
    private String languageCode;

    /**
     * <p>
     * The Amazon Polly generated identifier for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The Amazon Polly generated identifier for a speech synthesis
     *         task.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The Amazon Polly generated identifier for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param taskId <p>
     *            The Amazon Polly generated identifier for a speech synthesis
     *            task.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The Amazon Polly generated identifier for a speech synthesis task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param taskId <p>
     *            The Amazon Polly generated identifier for a speech synthesis
     *            task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @return <p>
     *         Current status of the individual speech synthesis task.
     *         </p>
     * @see TaskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @param taskStatus <p>
     *            Current status of the individual speech synthesis task.
     *            </p>
     * @see TaskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @param taskStatus <p>
     *            Current status of the individual speech synthesis task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatus
     */
    public SynthesisTask withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @param taskStatus <p>
     *            Current status of the individual speech synthesis task.
     *            </p>
     * @see TaskStatus
     */
    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
    }

    /**
     * <p>
     * Current status of the individual speech synthesis task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>scheduled, inProgress, completed, failed
     *
     * @param taskStatus <p>
     *            Current status of the individual speech synthesis task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStatus
     */
    public SynthesisTask withTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reason for the current status of a specific speech synthesis task,
     * including errors if the task has failed.
     * </p>
     *
     * @return <p>
     *         Reason for the current status of a specific speech synthesis
     *         task, including errors if the task has failed.
     *         </p>
     */
    public String getTaskStatusReason() {
        return taskStatusReason;
    }

    /**
     * <p>
     * Reason for the current status of a specific speech synthesis task,
     * including errors if the task has failed.
     * </p>
     *
     * @param taskStatusReason <p>
     *            Reason for the current status of a specific speech synthesis
     *            task, including errors if the task has failed.
     *            </p>
     */
    public void setTaskStatusReason(String taskStatusReason) {
        this.taskStatusReason = taskStatusReason;
    }

    /**
     * <p>
     * Reason for the current status of a specific speech synthesis task,
     * including errors if the task has failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskStatusReason <p>
     *            Reason for the current status of a specific speech synthesis
     *            task, including errors if the task has failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withTaskStatusReason(String taskStatusReason) {
        this.taskStatusReason = taskStatusReason;
        return this;
    }

    /**
     * <p>
     * Pathway for the output speech file.
     * </p>
     *
     * @return <p>
     *         Pathway for the output speech file.
     *         </p>
     */
    public String getOutputUri() {
        return outputUri;
    }

    /**
     * <p>
     * Pathway for the output speech file.
     * </p>
     *
     * @param outputUri <p>
     *            Pathway for the output speech file.
     *            </p>
     */
    public void setOutputUri(String outputUri) {
        this.outputUri = outputUri;
    }

    /**
     * <p>
     * Pathway for the output speech file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputUri <p>
     *            Pathway for the output speech file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withOutputUri(String outputUri) {
        this.outputUri = outputUri;
        return this;
    }

    /**
     * <p>
     * Timestamp for the time the synthesis task was started.
     * </p>
     *
     * @return <p>
     *         Timestamp for the time the synthesis task was started.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * Timestamp for the time the synthesis task was started.
     * </p>
     *
     * @param creationTime <p>
     *            Timestamp for the time the synthesis task was started.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Timestamp for the time the synthesis task was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            Timestamp for the time the synthesis task was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Number of billable characters synthesized.
     * </p>
     *
     * @return <p>
     *         Number of billable characters synthesized.
     *         </p>
     */
    public Integer getRequestCharacters() {
        return requestCharacters;
    }

    /**
     * <p>
     * Number of billable characters synthesized.
     * </p>
     *
     * @param requestCharacters <p>
     *            Number of billable characters synthesized.
     *            </p>
     */
    public void setRequestCharacters(Integer requestCharacters) {
        this.requestCharacters = requestCharacters;
    }

    /**
     * <p>
     * Number of billable characters synthesized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestCharacters <p>
     *            Number of billable characters synthesized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withRequestCharacters(Integer requestCharacters) {
        this.requestCharacters = requestCharacters;
        return this;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification
     * for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:.*:\w{12}:.+$<br/>
     *
     * @return <p>
     *         ARN for the SNS topic optionally used for providing status
     *         notification for a speech synthesis task.
     *         </p>
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification
     * for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:.*:\w{12}:.+$<br/>
     *
     * @param snsTopicArn <p>
     *            ARN for the SNS topic optionally used for providing status
     *            notification for a speech synthesis task.
     *            </p>
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification
     * for a speech synthesis task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:.*:\w{12}:.+$<br/>
     *
     * @param snsTopicArn <p>
     *            ARN for the SNS topic optionally used for providing status
     *            notification for a speech synthesis task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     *
     * @return <p>
     *         List of one or more pronunciation lexicon names you want the
     *         service to apply during synthesis. Lexicons are applied only if
     *         the language of the lexicon is the same as the language of the
     *         voice.
     *         </p>
     */
    public java.util.List<String> getLexiconNames() {
        return lexiconNames;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the
     *            service to apply during synthesis. Lexicons are applied only
     *            if the language of the lexicon is the same as the language of
     *            the voice.
     *            </p>
     */
    public void setLexiconNames(java.util.Collection<String> lexiconNames) {
        if (lexiconNames == null) {
            this.lexiconNames = null;
            return;
        }

        this.lexiconNames = new java.util.ArrayList<String>(lexiconNames);
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the
     *            service to apply during synthesis. Lexicons are applied only
     *            if the language of the lexicon is the same as the language of
     *            the voice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withLexiconNames(String... lexiconNames) {
        if (getLexiconNames() == null) {
            this.lexiconNames = new java.util.ArrayList<String>(lexiconNames.length);
        }
        for (String value : lexiconNames) {
            this.lexiconNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the
     *            service to apply during synthesis. Lexicons are applied only
     *            if the language of the lexicon is the same as the language of
     *            the voice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withLexiconNames(java.util.Collection<String> lexiconNames) {
        setLexiconNames(lexiconNames);
        return this;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @return <p>
     *         The format in which the returned output will be encoded. For
     *         audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *         marks, this will be json.
     *         </p>
     * @see OutputFormat
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The format in which the returned output will be encoded. For
     *            audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *            marks, this will be json.
     *            </p>
     * @see OutputFormat
     */
    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The format in which the returned output will be encoded. For
     *            audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *            marks, this will be json.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputFormat
     */
    public SynthesisTask withOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The format in which the returned output will be encoded. For
     *            audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *            marks, this will be json.
     *            </p>
     * @see OutputFormat
     */
    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The format in which the returned output will be encoded. For
     *            audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *            marks, this will be json.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputFormat
     */
    public SynthesisTask withOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050".
     * The default value is "22050".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     *
     * @return <p>
     *         The audio frequency specified in Hz.
     *         </p>
     *         <p>
     *         The valid values for mp3 and ogg_vorbis are "8000", "16000", and
     *         "22050". The default value is "22050".
     *         </p>
     *         <p>
     *         Valid values for pcm are "8000" and "16000" The default value is
     *         "16000".
     *         </p>
     */
    public String getSampleRate() {
        return sampleRate;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050".
     * The default value is "22050".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     *
     * @param sampleRate <p>
     *            The audio frequency specified in Hz.
     *            </p>
     *            <p>
     *            The valid values for mp3 and ogg_vorbis are "8000", "16000",
     *            and "22050". The default value is "22050".
     *            </p>
     *            <p>
     *            Valid values for pcm are "8000" and "16000" The default value
     *            is "16000".
     *            </p>
     */
    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050".
     * The default value is "22050".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleRate <p>
     *            The audio frequency specified in Hz.
     *            </p>
     *            <p>
     *            The valid values for mp3 and ogg_vorbis are "8000", "16000",
     *            and "22050". The default value is "22050".
     *            </p>
     *            <p>
     *            Valid values for pcm are "8000" and "16000" The default value
     *            is "16000".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     *
     * @return <p>
     *         The type of speech marks returned for the input text.
     *         </p>
     */
    public java.util.List<String> getSpeechMarkTypes() {
        return speechMarkTypes;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     *
     * @param speechMarkTypes <p>
     *            The type of speech marks returned for the input text.
     *            </p>
     */
    public void setSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        if (speechMarkTypes == null) {
            this.speechMarkTypes = null;
            return;
        }

        this.speechMarkTypes = new java.util.ArrayList<String>(speechMarkTypes);
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param speechMarkTypes <p>
     *            The type of speech marks returned for the input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withSpeechMarkTypes(String... speechMarkTypes) {
        if (getSpeechMarkTypes() == null) {
            this.speechMarkTypes = new java.util.ArrayList<String>(speechMarkTypes.length);
        }
        for (String value : speechMarkTypes) {
            this.speechMarkTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param speechMarkTypes <p>
     *            The type of speech marks returned for the input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesisTask withSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        setSpeechMarkTypes(speechMarkTypes);
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @return <p>
     *         Specifies whether the input text is plain text or SSML. The
     *         default value is plain text.
     *         </p>
     * @see TextType
     */
    public String getTextType() {
        return textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text.
     *            </p>
     * @see TextType
     */
    public void setTextType(String textType) {
        this.textType = textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextType
     */
    public SynthesisTask withTextType(String textType) {
        this.textType = textType;
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text.
     *            </p>
     * @see TextType
     */
    public void setTextType(TextType textType) {
        this.textType = textType.toString();
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextType
     */
    public SynthesisTask withTextType(TextType textType) {
        this.textType = textType.toString();
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @return <p>
     *         Voice ID to use for the synthesis.
     *         </p>
     * @see VoiceId
     */
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis.
     *            </p>
     * @see VoiceId
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceId
     */
    public SynthesisTask withVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis.
     *            </p>
     * @see VoiceId
     */
    public void setVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceId
     */
    public SynthesisTask withVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
        return this;
    }

    /**
     * <p>
     * Optional language code for a synthesis task. This is only necessary if
     * using a bilingual voice, such as Aditi, which can be used for either
     * Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @return <p>
     *         Optional language code for a synthesis task. This is only
     *         necessary if using a bilingual voice, such as Aditi, which can be
     *         used for either Indian English (en-IN) or Hindi (hi-IN).
     *         </p>
     *         <p>
     *         If a bilingual voice is used and no language code is specified,
     *         Amazon Polly will use the default language of the bilingual
     *         voice. The default language for any voice is the one returned by
     *         the <a href=
     *         "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *         >DescribeVoices</a> operation for the <code>LanguageCode</code>
     *         parameter. For example, if no language code is specified, Aditi
     *         will use Indian English rather than Hindi.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * Optional language code for a synthesis task. This is only necessary if
     * using a bilingual voice, such as Aditi, which can be used for either
     * Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Optional language code for a synthesis task. This is only
     *            necessary if using a bilingual voice, such as Aditi, which can
     *            be used for either Indian English (en-IN) or Hindi (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly will use the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Optional language code for a synthesis task. This is only necessary if
     * using a bilingual voice, such as Aditi, which can be used for either
     * Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Optional language code for a synthesis task. This is only
     *            necessary if using a bilingual voice, such as Aditi, which can
     *            be used for either Indian English (en-IN) or Hindi (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly will use the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public SynthesisTask withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * Optional language code for a synthesis task. This is only necessary if
     * using a bilingual voice, such as Aditi, which can be used for either
     * Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Optional language code for a synthesis task. This is only
     *            necessary if using a bilingual voice, such as Aditi, which can
     *            be used for either Indian English (en-IN) or Hindi (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly will use the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * Optional language code for a synthesis task. This is only necessary if
     * using a bilingual voice, such as Aditi, which can be used for either
     * Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Optional language code for a synthesis task. This is only
     *            necessary if using a bilingual voice, such as Aditi, which can
     *            be used for either Indian English (en-IN) or Hindi (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly will use the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public SynthesisTask withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getTaskId() != null)
            sb.append("TaskId: " + getTaskId() + ",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: " + getTaskStatus() + ",");
        if (getTaskStatusReason() != null)
            sb.append("TaskStatusReason: " + getTaskStatusReason() + ",");
        if (getOutputUri() != null)
            sb.append("OutputUri: " + getOutputUri() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getRequestCharacters() != null)
            sb.append("RequestCharacters: " + getRequestCharacters() + ",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: " + getSnsTopicArn() + ",");
        if (getLexiconNames() != null)
            sb.append("LexiconNames: " + getLexiconNames() + ",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: " + getOutputFormat() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
        if (getSpeechMarkTypes() != null)
            sb.append("SpeechMarkTypes: " + getSpeechMarkTypes() + ",");
        if (getTextType() != null)
            sb.append("TextType: " + getTextType() + ",");
        if (getVoiceId() != null)
            sb.append("VoiceId: " + getVoiceId() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTaskStatusReason() == null) ? 0 : getTaskStatusReason().hashCode());
        hashCode = prime * hashCode + ((getOutputUri() == null) ? 0 : getOutputUri().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharacters() == null) ? 0 : getRequestCharacters().hashCode());
        hashCode = prime * hashCode
                + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getLexiconNames() == null) ? 0 : getLexiconNames().hashCode());
        hashCode = prime * hashCode
                + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode
                + ((getSpeechMarkTypes() == null) ? 0 : getSpeechMarkTypes().hashCode());
        hashCode = prime * hashCode + ((getTextType() == null) ? 0 : getTextType().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SynthesisTask == false)
            return false;
        SynthesisTask other = (SynthesisTask) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null
                && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getTaskStatusReason() == null ^ this.getTaskStatusReason() == null)
            return false;
        if (other.getTaskStatusReason() != null
                && other.getTaskStatusReason().equals(this.getTaskStatusReason()) == false)
            return false;
        if (other.getOutputUri() == null ^ this.getOutputUri() == null)
            return false;
        if (other.getOutputUri() != null
                && other.getOutputUri().equals(this.getOutputUri()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getRequestCharacters() == null ^ this.getRequestCharacters() == null)
            return false;
        if (other.getRequestCharacters() != null
                && other.getRequestCharacters().equals(this.getRequestCharacters()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null
                && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getLexiconNames() == null ^ this.getLexiconNames() == null)
            return false;
        if (other.getLexiconNames() != null
                && other.getLexiconNames().equals(this.getLexiconNames()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null
                && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSpeechMarkTypes() == null ^ this.getSpeechMarkTypes() == null)
            return false;
        if (other.getSpeechMarkTypes() != null
                && other.getSpeechMarkTypes().equals(this.getSpeechMarkTypes()) == false)
            return false;
        if (other.getTextType() == null ^ this.getTextType() == null)
            return false;
        if (other.getTextType() != null && other.getTextType().equals(this.getTextType()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }
}
