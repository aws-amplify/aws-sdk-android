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
 * Provides optional settings for the <code>CallAnalyticsJob</code> operation.
 * </p>
 */
public class CallAnalyticsJobSettings implements Serializable {
    /**
     * <p>
     * The name of a vocabulary to use when processing the call analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * The name of the vocabulary filter to use when running a call analytics
     * job. The filter that you specify must have the same language code as the
     * analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it
     * with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     */
    private String vocabularyFilterMethod;

    /**
     * <p>
     * The structure used to describe a custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String languageModelName;

    /**
     * <p>
     * Settings for content redaction within a transcription job.
     * </p>
     */
    private ContentRedaction contentRedaction;

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in
     * the audio, or you can have Amazon Transcribe identify the language for
     * you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you
     * don't know the language, you can leave this field blank and Amazon
     * Transcribe will use machine learning to identify the language for you. To
     * improve the ability of Amazon Transcribe to correctly identify the
     * language, you can provide an array of the languages that can be present
     * in the audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
     * </p>
     */
    private java.util.List<String> languageOptions;

    /**
     * <p>
     * The language identification settings associated with your call analytics
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     */
    private java.util.Map<String, LanguageIdSettings> languageIdSettings;

    /**
     * <p>
     * The name of a vocabulary to use when processing the call analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of a vocabulary to use when processing the call
     *         analytics job.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of a vocabulary to use when processing the call analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of a vocabulary to use when processing the call
     *            analytics job.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of a vocabulary to use when processing the call analytics job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of a vocabulary to use when processing the call
     *            analytics job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobSettings withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when running a call analytics
     * job. The filter that you specify must have the same language code as the
     * analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary filter to use when running a call
     *         analytics job. The filter that you specify must have the same
     *         language code as the analytics job.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when running a call analytics
     * job. The filter that you specify must have the same language code as the
     * analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the vocabulary filter to use when running a call
     *            analytics job. The filter that you specify must have the same
     *            language code as the analytics job.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when running a call analytics
     * job. The filter that you specify must have the same language code as the
     * analytics job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the vocabulary filter to use when running a call
     *            analytics job. The filter that you specify must have the same
     *            language code as the analytics job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobSettings withVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
        return this;
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it
     * with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @return <p>
     *         Set to mask to remove filtered text from the transcript and
     *         replace it with three asterisks ("***") as placeholder text. Set
     *         to <code>remove</code> to remove filtered text from the
     *         transcript without using placeholder text. Set to
     *         <code>tag</code> to mark the word in the transcription output
     *         that matches the vocabulary filter. When you set the filter
     *         method to <code>tag</code>, the words matching your vocabulary
     *         filter are not masked or removed.
     *         </p>
     * @see VocabularyFilterMethod
     */
    public String getVocabularyFilterMethod() {
        return vocabularyFilterMethod;
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it
     * with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Set to mask to remove filtered text from the transcript and
     *            replace it with three asterisks ("***") as placeholder text.
     *            Set to <code>remove</code> to remove filtered text from the
     *            transcript without using placeholder text. Set to
     *            <code>tag</code> to mark the word in the transcription output
     *            that matches the vocabulary filter. When you set the filter
     *            method to <code>tag</code>, the words matching your vocabulary
     *            filter are not masked or removed.
     *            </p>
     * @see VocabularyFilterMethod
     */
    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it
     * with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Set to mask to remove filtered text from the transcript and
     *            replace it with three asterisks ("***") as placeholder text.
     *            Set to <code>remove</code> to remove filtered text from the
     *            transcript without using placeholder text. Set to
     *            <code>tag</code> to mark the word in the transcription output
     *            that matches the vocabulary filter. When you set the filter
     *            method to <code>tag</code>, the words matching your vocabulary
     *            filter are not masked or removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyFilterMethod
     */
    public CallAnalyticsJobSettings withVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
        return this;
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it
     * with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Set to mask to remove filtered text from the transcript and
     *            replace it with three asterisks ("***") as placeholder text.
     *            Set to <code>remove</code> to remove filtered text from the
     *            transcript without using placeholder text. Set to
     *            <code>tag</code> to mark the word in the transcription output
     *            that matches the vocabulary filter. When you set the filter
     *            method to <code>tag</code>, the words matching your vocabulary
     *            filter are not masked or removed.
     *            </p>
     * @see VocabularyFilterMethod
     */
    public void setVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it
     * with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Set to mask to remove filtered text from the transcript and
     *            replace it with three asterisks ("***") as placeholder text.
     *            Set to <code>remove</code> to remove filtered text from the
     *            transcript without using placeholder text. Set to
     *            <code>tag</code> to mark the word in the transcription output
     *            that matches the vocabulary filter. When you set the filter
     *            method to <code>tag</code>, the words matching your vocabulary
     *            filter are not masked or removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyFilterMethod
     */
    public CallAnalyticsJobSettings withVocabularyFilterMethod(
            VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
        return this;
    }

    /**
     * <p>
     * The structure used to describe a custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The structure used to describe a custom language model.
     *         </p>
     */
    public String getLanguageModelName() {
        return languageModelName;
    }

    /**
     * <p>
     * The structure used to describe a custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param languageModelName <p>
     *            The structure used to describe a custom language model.
     *            </p>
     */
    public void setLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
    }

    /**
     * <p>
     * The structure used to describe a custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param languageModelName <p>
     *            The structure used to describe a custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobSettings withLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
        return this;
    }

    /**
     * <p>
     * Settings for content redaction within a transcription job.
     * </p>
     *
     * @return <p>
     *         Settings for content redaction within a transcription job.
     *         </p>
     */
    public ContentRedaction getContentRedaction() {
        return contentRedaction;
    }

    /**
     * <p>
     * Settings for content redaction within a transcription job.
     * </p>
     *
     * @param contentRedaction <p>
     *            Settings for content redaction within a transcription job.
     *            </p>
     */
    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * Settings for content redaction within a transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRedaction <p>
     *            Settings for content redaction within a transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobSettings withContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
        return this;
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in
     * the audio, or you can have Amazon Transcribe identify the language for
     * you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you
     * don't know the language, you can leave this field blank and Amazon
     * Transcribe will use machine learning to identify the language for you. To
     * improve the ability of Amazon Transcribe to correctly identify the
     * language, you can provide an array of the languages that can be present
     * in the audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
     * </p>
     *
     * @return <p>
     *         When you run a call analytics job, you can specify the language
     *         spoken in the audio, or you can have Amazon Transcribe identify
     *         the language for you.
     *         </p>
     *         <p>
     *         To specify a language, specify an array with one language code.
     *         If you don't know the language, you can leave this field blank
     *         and Amazon Transcribe will use machine learning to identify the
     *         language for you. To improve the ability of Amazon Transcribe to
     *         correctly identify the language, you can provide an array of the
     *         languages that can be present in the audio. Refer to <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a> for additional information.
     *         </p>
     */
    public java.util.List<String> getLanguageOptions() {
        return languageOptions;
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in
     * the audio, or you can have Amazon Transcribe identify the language for
     * you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you
     * don't know the language, you can leave this field blank and Amazon
     * Transcribe will use machine learning to identify the language for you. To
     * improve the ability of Amazon Transcribe to correctly identify the
     * language, you can provide an array of the languages that can be present
     * in the audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
     * </p>
     *
     * @param languageOptions <p>
     *            When you run a call analytics job, you can specify the
     *            language spoken in the audio, or you can have Amazon
     *            Transcribe identify the language for you.
     *            </p>
     *            <p>
     *            To specify a language, specify an array with one language
     *            code. If you don't know the language, you can leave this field
     *            blank and Amazon Transcribe will use machine learning to
     *            identify the language for you. To improve the ability of
     *            Amazon Transcribe to correctly identify the language, you can
     *            provide an array of the languages that can be present in the
     *            audio. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> for additional information.
     *            </p>
     */
    public void setLanguageOptions(java.util.Collection<String> languageOptions) {
        if (languageOptions == null) {
            this.languageOptions = null;
            return;
        }

        this.languageOptions = new java.util.ArrayList<String>(languageOptions);
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in
     * the audio, or you can have Amazon Transcribe identify the language for
     * you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you
     * don't know the language, you can leave this field blank and Amazon
     * Transcribe will use machine learning to identify the language for you. To
     * improve the ability of Amazon Transcribe to correctly identify the
     * language, you can provide an array of the languages that can be present
     * in the audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            When you run a call analytics job, you can specify the
     *            language spoken in the audio, or you can have Amazon
     *            Transcribe identify the language for you.
     *            </p>
     *            <p>
     *            To specify a language, specify an array with one language
     *            code. If you don't know the language, you can leave this field
     *            blank and Amazon Transcribe will use machine learning to
     *            identify the language for you. To improve the ability of
     *            Amazon Transcribe to correctly identify the language, you can
     *            provide an array of the languages that can be present in the
     *            audio. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> for additional information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobSettings withLanguageOptions(String... languageOptions) {
        if (getLanguageOptions() == null) {
            this.languageOptions = new java.util.ArrayList<String>(languageOptions.length);
        }
        for (String value : languageOptions) {
            this.languageOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in
     * the audio, or you can have Amazon Transcribe identify the language for
     * you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you
     * don't know the language, you can leave this field blank and Amazon
     * Transcribe will use machine learning to identify the language for you. To
     * improve the ability of Amazon Transcribe to correctly identify the
     * language, you can provide an array of the languages that can be present
     * in the audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            When you run a call analytics job, you can specify the
     *            language spoken in the audio, or you can have Amazon
     *            Transcribe identify the language for you.
     *            </p>
     *            <p>
     *            To specify a language, specify an array with one language
     *            code. If you don't know the language, you can leave this field
     *            blank and Amazon Transcribe will use machine learning to
     *            identify the language for you. To improve the ability of
     *            Amazon Transcribe to correctly identify the language, you can
     *            provide an array of the languages that can be present in the
     *            audio. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> for additional information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobSettings withLanguageOptions(java.util.Collection<String> languageOptions) {
        setLanguageOptions(languageOptions);
        return this;
    }

    /**
     * <p>
     * The language identification settings associated with your call analytics
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     *
     * @return <p>
     *         The language identification settings associated with your call
     *         analytics job. These settings include <code>VocabularyName</code>, <code>VocabularyFilterName</code>, and
     *         <code>LanguageModelName</code>.
     *         </p>
     */
    public java.util.Map<String, LanguageIdSettings> getLanguageIdSettings() {
        return languageIdSettings;
    }

    /**
     * <p>
     * The language identification settings associated with your call analytics
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     *
     * @param languageIdSettings <p>
     *            The language identification settings associated with your call
     *            analytics job. These settings include
     *            <code>VocabularyName</code>, <code>VocabularyFilterName</code>
     *            , and <code>LanguageModelName</code>.
     *            </p>
     */
    public void setLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
    }

    /**
     * <p>
     * The language identification settings associated with your call analytics
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageIdSettings <p>
     *            The language identification settings associated with your call
     *            analytics job. These settings include
     *            <code>VocabularyName</code>, <code>VocabularyFilterName</code>
     *            , and <code>LanguageModelName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobSettings withLanguageIdSettings(
            java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
        return this;
    }

    /**
     * <p>
     * The language identification settings associated with your call analytics
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into LanguageIdSettings parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into LanguageIdSettings.
     * @param value The corresponding value of the entry to be added into
     *            LanguageIdSettings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJobSettings addLanguageIdSettingsEntry(String key, LanguageIdSettings value) {
        if (null == this.languageIdSettings) {
            this.languageIdSettings = new java.util.HashMap<String, LanguageIdSettings>();
        }
        if (this.languageIdSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.languageIdSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LanguageIdSettings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CallAnalyticsJobSettings clearLanguageIdSettingsEntries() {
        this.languageIdSettings = null;
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: " + getVocabularyName() + ",");
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: " + getVocabularyFilterName() + ",");
        if (getVocabularyFilterMethod() != null)
            sb.append("VocabularyFilterMethod: " + getVocabularyFilterMethod() + ",");
        if (getLanguageModelName() != null)
            sb.append("LanguageModelName: " + getLanguageModelName() + ",");
        if (getContentRedaction() != null)
            sb.append("ContentRedaction: " + getContentRedaction() + ",");
        if (getLanguageOptions() != null)
            sb.append("LanguageOptions: " + getLanguageOptions() + ",");
        if (getLanguageIdSettings() != null)
            sb.append("LanguageIdSettings: " + getLanguageIdSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime
                * hashCode
                + ((getVocabularyFilterMethod() == null) ? 0 : getVocabularyFilterMethod()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLanguageModelName() == null) ? 0 : getLanguageModelName().hashCode());
        hashCode = prime * hashCode
                + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageOptions() == null) ? 0 : getLanguageOptions().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageIdSettings() == null) ? 0 : getLanguageIdSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJobSettings == false)
            return false;
        CallAnalyticsJobSettings other = (CallAnalyticsJobSettings) obj;

        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null
                && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null
                && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getVocabularyFilterMethod() == null ^ this.getVocabularyFilterMethod() == null)
            return false;
        if (other.getVocabularyFilterMethod() != null
                && other.getVocabularyFilterMethod().equals(this.getVocabularyFilterMethod()) == false)
            return false;
        if (other.getLanguageModelName() == null ^ this.getLanguageModelName() == null)
            return false;
        if (other.getLanguageModelName() != null
                && other.getLanguageModelName().equals(this.getLanguageModelName()) == false)
            return false;
        if (other.getContentRedaction() == null ^ this.getContentRedaction() == null)
            return false;
        if (other.getContentRedaction() != null
                && other.getContentRedaction().equals(this.getContentRedaction()) == false)
            return false;
        if (other.getLanguageOptions() == null ^ this.getLanguageOptions() == null)
            return false;
        if (other.getLanguageOptions() != null
                && other.getLanguageOptions().equals(this.getLanguageOptions()) == false)
            return false;
        if (other.getLanguageIdSettings() == null ^ this.getLanguageIdSettings() == null)
            return false;
        if (other.getLanguageIdSettings() != null
                && other.getLanguageIdSettings().equals(this.getLanguageIdSettings()) == false)
            return false;
        return true;
    }
}
