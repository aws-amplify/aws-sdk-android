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
 * Provides additional optional settings for your request, including content
 * redaction, automatic language identification; allows you to apply custom
 * language models, custom vocabulary filters, and custom vocabularies.
 * </p>
 */
public class CallAnalyticsJobSettings implements Serializable {
    /**
     * <p>
     * The name of the custom vocabulary you want to include in your Call
     * Analytics transcription request. Custom vocabulary names are case
     * sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * The name of the custom vocabulary filter you want to include in your Call
     * Analytics transcription request. Custom vocabulary filter names are case
     * sensitive.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your
     * request, you must also include <code>VocabularyFilterMethod</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your
     * transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     */
    private String vocabularyFilterMethod;

    /**
     * <p>
     * The name of the custom language model you want to use when processing
     * your Call Analytics job. Note that custom language model names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom language model must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom language model isn't applied. There are
     * no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String languageModelName;

    /**
     * <p>
     * Makes it possible to redact or flag specified personally identifiable
     * information (PII) in your transcript. If you use
     * <code>ContentRedaction</code>, you must also include the sub-parameters:
     * <code>PiiEntityTypes</code>, <code>RedactionOutput</code>, and
     * <code>RedactionType</code>.
     * </p>
     */
    private ContentRedaction contentRedaction;

    /**
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media. Including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * Including language options can improve the accuracy of language
     * identification.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     */
    private java.util.List<String> languageOptions;

    /**
     * <p>
     * If using automatic language identification in your request and you want
     * to apply a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, include <code>LanguageIdSettings</code> with the
     * relevant sub-parameters (<code>VocabularyName</code>,
     * <code>LanguageModelName</code>, and <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each
     * language code you include can have an associated custom language model,
     * custom vocabulary, and custom vocabulary filter. The language codes that
     * you specify must match the languages of the associated custom language
     * models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using
     * <code>LanguageIdSettings</code> to ensure that the correct language
     * dialect is identified. For example, if you specify a custom vocabulary
     * that is in <code>en-US</code> but Amazon Transcribe determines that the
     * language spoken in your media is <code>en-AU</code>, your custom
     * vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only
     * English language dialect, your custom vocabulary <i>is</i> applied to
     * your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model, custom vocabulary, or
     * custom vocabulary filter with your request but <b>do not</b> want to use
     * automatic language identification, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code>, or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages and language-specific features</a>.
     * </p>
     */
    private java.util.Map<String, LanguageIdSettings> languageIdSettings;

    /**
     * <p>
     * The name of the custom vocabulary you want to include in your Call
     * Analytics transcription request. Custom vocabulary names are case
     * sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom vocabulary you want to include in your
     *         Call Analytics transcription request. Custom vocabulary names are
     *         case sensitive.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to include in your Call
     * Analytics transcription request. Custom vocabulary names are case
     * sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the custom vocabulary you want to include in your
     *            Call Analytics transcription request. Custom vocabulary names
     *            are case sensitive.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to include in your Call
     * Analytics transcription request. Custom vocabulary names are case
     * sensitive.
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
     *            The name of the custom vocabulary you want to include in your
     *            Call Analytics transcription request. Custom vocabulary names
     *            are case sensitive.
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
     * The name of the custom vocabulary filter you want to include in your Call
     * Analytics transcription request. Custom vocabulary filter names are case
     * sensitive.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your
     * request, you must also include <code>VocabularyFilterMethod</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom vocabulary filter you want to include in
     *         your Call Analytics transcription request. Custom vocabulary
     *         filter names are case sensitive.
     *         </p>
     *         <p>
     *         Note that if you include <code>VocabularyFilterName</code> in
     *         your request, you must also include
     *         <code>VocabularyFilterMethod</code>.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to include in your Call
     * Analytics transcription request. Custom vocabulary filter names are case
     * sensitive.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your
     * request, you must also include <code>VocabularyFilterMethod</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the custom vocabulary filter you want to include
     *            in your Call Analytics transcription request. Custom
     *            vocabulary filter names are case sensitive.
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFilterName</code> in
     *            your request, you must also include
     *            <code>VocabularyFilterMethod</code>.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to include in your Call
     * Analytics transcription request. Custom vocabulary filter names are case
     * sensitive.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your
     * request, you must also include <code>VocabularyFilterMethod</code>.
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
     *            The name of the custom vocabulary filter you want to include
     *            in your Call Analytics transcription request. Custom
     *            vocabulary filter names are case sensitive.
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFilterName</code> in
     *            your request, you must also include
     *            <code>VocabularyFilterMethod</code>.
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
     * Specify how you want your custom vocabulary filter applied to your
     * transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @return <p>
     *         Specify how you want your custom vocabulary filter applied to
     *         your transcript.
     *         </p>
     *         <p>
     *         To replace words with <code>***</code>, choose <code>mask</code>.
     *         </p>
     *         <p>
     *         To delete words, choose <code>remove</code>.
     *         </p>
     *         <p>
     *         To flag words without changing them, choose <code>tag</code>.
     *         </p>
     * @see VocabularyFilterMethod
     */
    public String getVocabularyFilterMethod() {
        return vocabularyFilterMethod;
    }

    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your
     * transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Specify how you want your custom vocabulary filter applied to
     *            your transcript.
     *            </p>
     *            <p>
     *            To replace words with <code>***</code>, choose
     *            <code>mask</code>.
     *            </p>
     *            <p>
     *            To delete words, choose <code>remove</code>.
     *            </p>
     *            <p>
     *            To flag words without changing them, choose <code>tag</code>.
     *            </p>
     * @see VocabularyFilterMethod
     */
    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your
     * transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Specify how you want your custom vocabulary filter applied to
     *            your transcript.
     *            </p>
     *            <p>
     *            To replace words with <code>***</code>, choose
     *            <code>mask</code>.
     *            </p>
     *            <p>
     *            To delete words, choose <code>remove</code>.
     *            </p>
     *            <p>
     *            To flag words without changing them, choose <code>tag</code>.
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
     * Specify how you want your custom vocabulary filter applied to your
     * transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Specify how you want your custom vocabulary filter applied to
     *            your transcript.
     *            </p>
     *            <p>
     *            To replace words with <code>***</code>, choose
     *            <code>mask</code>.
     *            </p>
     *            <p>
     *            To delete words, choose <code>remove</code>.
     *            </p>
     *            <p>
     *            To flag words without changing them, choose <code>tag</code>.
     *            </p>
     * @see VocabularyFilterMethod
     */
    public void setVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
    }

    /**
     * <p>
     * Specify how you want your custom vocabulary filter applied to your
     * transcript.
     * </p>
     * <p>
     * To replace words with <code>***</code>, choose <code>mask</code>.
     * </p>
     * <p>
     * To delete words, choose <code>remove</code>.
     * </p>
     * <p>
     * To flag words without changing them, choose <code>tag</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Specify how you want your custom vocabulary filter applied to
     *            your transcript.
     *            </p>
     *            <p>
     *            To replace words with <code>***</code>, choose
     *            <code>mask</code>.
     *            </p>
     *            <p>
     *            To delete words, choose <code>remove</code>.
     *            </p>
     *            <p>
     *            To flag words without changing them, choose <code>tag</code>.
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
     * The name of the custom language model you want to use when processing
     * your Call Analytics job. Note that custom language model names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom language model must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom language model isn't applied. There are
     * no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom language model you want to use when
     *         processing your Call Analytics job. Note that custom language
     *         model names are case sensitive.
     *         </p>
     *         <p>
     *         The language of the specified custom language model must match
     *         the language code that you specify in your transcription request.
     *         If the languages don't match, the custom language model isn't
     *         applied. There are no errors or warnings associated with a
     *         language mismatch.
     *         </p>
     */
    public String getLanguageModelName() {
        return languageModelName;
    }

    /**
     * <p>
     * The name of the custom language model you want to use when processing
     * your Call Analytics job. Note that custom language model names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom language model must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom language model isn't applied. There are
     * no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param languageModelName <p>
     *            The name of the custom language model you want to use when
     *            processing your Call Analytics job. Note that custom language
     *            model names are case sensitive.
     *            </p>
     *            <p>
     *            The language of the specified custom language model must match
     *            the language code that you specify in your transcription
     *            request. If the languages don't match, the custom language
     *            model isn't applied. There are no errors or warnings
     *            associated with a language mismatch.
     *            </p>
     */
    public void setLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
    }

    /**
     * <p>
     * The name of the custom language model you want to use when processing
     * your Call Analytics job. Note that custom language model names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom language model must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom language model isn't applied. There are
     * no errors or warnings associated with a language mismatch.
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
     *            The name of the custom language model you want to use when
     *            processing your Call Analytics job. Note that custom language
     *            model names are case sensitive.
     *            </p>
     *            <p>
     *            The language of the specified custom language model must match
     *            the language code that you specify in your transcription
     *            request. If the languages don't match, the custom language
     *            model isn't applied. There are no errors or warnings
     *            associated with a language mismatch.
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
     * Makes it possible to redact or flag specified personally identifiable
     * information (PII) in your transcript. If you use
     * <code>ContentRedaction</code>, you must also include the sub-parameters:
     * <code>PiiEntityTypes</code>, <code>RedactionOutput</code>, and
     * <code>RedactionType</code>.
     * </p>
     *
     * @return <p>
     *         Makes it possible to redact or flag specified personally
     *         identifiable information (PII) in your transcript. If you use
     *         <code>ContentRedaction</code>, you must also include the
     *         sub-parameters: <code>PiiEntityTypes</code>,
     *         <code>RedactionOutput</code>, and <code>RedactionType</code>.
     *         </p>
     */
    public ContentRedaction getContentRedaction() {
        return contentRedaction;
    }

    /**
     * <p>
     * Makes it possible to redact or flag specified personally identifiable
     * information (PII) in your transcript. If you use
     * <code>ContentRedaction</code>, you must also include the sub-parameters:
     * <code>PiiEntityTypes</code>, <code>RedactionOutput</code>, and
     * <code>RedactionType</code>.
     * </p>
     *
     * @param contentRedaction <p>
     *            Makes it possible to redact or flag specified personally
     *            identifiable information (PII) in your transcript. If you use
     *            <code>ContentRedaction</code>, you must also include the
     *            sub-parameters: <code>PiiEntityTypes</code>,
     *            <code>RedactionOutput</code>, and <code>RedactionType</code>.
     *            </p>
     */
    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * Makes it possible to redact or flag specified personally identifiable
     * information (PII) in your transcript. If you use
     * <code>ContentRedaction</code>, you must also include the sub-parameters:
     * <code>PiiEntityTypes</code>, <code>RedactionOutput</code>, and
     * <code>RedactionType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRedaction <p>
     *            Makes it possible to redact or flag specified personally
     *            identifiable information (PII) in your transcript. If you use
     *            <code>ContentRedaction</code>, you must also include the
     *            sub-parameters: <code>PiiEntityTypes</code>,
     *            <code>RedactionOutput</code>, and <code>RedactionType</code>.
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
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media. Including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * Including language options can improve the accuracy of language
     * identification.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     *
     * @return <p>
     *         You can specify two or more language codes that represent the
     *         languages you think may be present in your media. Including more
     *         than five is not recommended. If you're unsure what languages are
     *         present, do not include this parameter.
     *         </p>
     *         <p>
     *         Including language options can improve the accuracy of language
     *         identification.
     *         </p>
     *         <p>
     *         For a list of languages supported with Call Analytics, refer to
     *         the <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a> table.
     *         </p>
     *         <p>
     *         To transcribe speech in Modern Standard Arabic (
     *         <code>ar-SA</code>), your media file must be encoded at a sample
     *         rate of 16,000 Hz or higher.
     *         </p>
     */
    public java.util.List<String> getLanguageOptions() {
        return languageOptions;
    }

    /**
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media. Including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * Including language options can improve the accuracy of language
     * identification.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     *
     * @param languageOptions <p>
     *            You can specify two or more language codes that represent the
     *            languages you think may be present in your media. Including
     *            more than five is not recommended. If you're unsure what
     *            languages are present, do not include this parameter.
     *            </p>
     *            <p>
     *            Including language options can improve the accuracy of
     *            language identification.
     *            </p>
     *            <p>
     *            For a list of languages supported with Call Analytics, refer
     *            to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (
     *            <code>ar-SA</code>), your media file must be encoded at a
     *            sample rate of 16,000 Hz or higher.
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
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media. Including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * Including language options can improve the accuracy of language
     * identification.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            You can specify two or more language codes that represent the
     *            languages you think may be present in your media. Including
     *            more than five is not recommended. If you're unsure what
     *            languages are present, do not include this parameter.
     *            </p>
     *            <p>
     *            Including language options can improve the accuracy of
     *            language identification.
     *            </p>
     *            <p>
     *            For a list of languages supported with Call Analytics, refer
     *            to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (
     *            <code>ar-SA</code>), your media file must be encoded at a
     *            sample rate of 16,000 Hz or higher.
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
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media. Including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * Including language options can improve the accuracy of language
     * identification.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            You can specify two or more language codes that represent the
     *            languages you think may be present in your media. Including
     *            more than five is not recommended. If you're unsure what
     *            languages are present, do not include this parameter.
     *            </p>
     *            <p>
     *            Including language options can improve the accuracy of
     *            language identification.
     *            </p>
     *            <p>
     *            For a list of languages supported with Call Analytics, refer
     *            to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (
     *            <code>ar-SA</code>), your media file must be encoded at a
     *            sample rate of 16,000 Hz or higher.
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
     * If using automatic language identification in your request and you want
     * to apply a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, include <code>LanguageIdSettings</code> with the
     * relevant sub-parameters (<code>VocabularyName</code>,
     * <code>LanguageModelName</code>, and <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each
     * language code you include can have an associated custom language model,
     * custom vocabulary, and custom vocabulary filter. The language codes that
     * you specify must match the languages of the associated custom language
     * models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using
     * <code>LanguageIdSettings</code> to ensure that the correct language
     * dialect is identified. For example, if you specify a custom vocabulary
     * that is in <code>en-US</code> but Amazon Transcribe determines that the
     * language spoken in your media is <code>en-AU</code>, your custom
     * vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only
     * English language dialect, your custom vocabulary <i>is</i> applied to
     * your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model, custom vocabulary, or
     * custom vocabulary filter with your request but <b>do not</b> want to use
     * automatic language identification, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code>, or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages and language-specific features</a>.
     * </p>
     *
     * @return <p>
     *         If using automatic language identification in your request and
     *         you want to apply a custom language model, a custom vocabulary,
     *         or a custom vocabulary filter, include
     *         <code>LanguageIdSettings</code> with the relevant sub-parameters
     *         (<code>VocabularyName</code>, <code>LanguageModelName</code>, and
     *         <code>VocabularyFilterName</code>).
     *         </p>
     *         <p>
     *         <code>LanguageIdSettings</code> supports two to five language
     *         codes. Each language code you include can have an associated
     *         custom language model, custom vocabulary, and custom vocabulary
     *         filter. The language codes that you specify must match the
     *         languages of the associated custom language models, custom
     *         vocabularies, and custom vocabulary filters.
     *         </p>
     *         <p>
     *         It's recommended that you include <code>LanguageOptions</code>
     *         when using <code>LanguageIdSettings</code> to ensure that the
     *         correct language dialect is identified. For example, if you
     *         specify a custom vocabulary that is in <code>en-US</code> but
     *         Amazon Transcribe determines that the language spoken in your
     *         media is <code>en-AU</code>, your custom vocabulary <i>is not</i>
     *         applied to your transcription. If you include
     *         <code>LanguageOptions</code> and include <code>en-US</code> as
     *         the only English language dialect, your custom vocabulary
     *         <i>is</i> applied to your transcription.
     *         </p>
     *         <p>
     *         If you want to include a custom language model, custom
     *         vocabulary, or custom vocabulary filter with your request but
     *         <b>do not</b> want to use automatic language identification, use
     *         instead the
     *         <code/> parameter with the <code>LanguageModelName</code>,
     *         <code>VocabularyName</code>, or <code>VocabularyFilterName</code>
     *         sub-parameters.
     *         </p>
     *         <p>
     *         For a list of languages supported with Call Analytics, refer to
     *         <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages and language-specific features</a>.
     *         </p>
     */
    public java.util.Map<String, LanguageIdSettings> getLanguageIdSettings() {
        return languageIdSettings;
    }

    /**
     * <p>
     * If using automatic language identification in your request and you want
     * to apply a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, include <code>LanguageIdSettings</code> with the
     * relevant sub-parameters (<code>VocabularyName</code>,
     * <code>LanguageModelName</code>, and <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each
     * language code you include can have an associated custom language model,
     * custom vocabulary, and custom vocabulary filter. The language codes that
     * you specify must match the languages of the associated custom language
     * models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using
     * <code>LanguageIdSettings</code> to ensure that the correct language
     * dialect is identified. For example, if you specify a custom vocabulary
     * that is in <code>en-US</code> but Amazon Transcribe determines that the
     * language spoken in your media is <code>en-AU</code>, your custom
     * vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only
     * English language dialect, your custom vocabulary <i>is</i> applied to
     * your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model, custom vocabulary, or
     * custom vocabulary filter with your request but <b>do not</b> want to use
     * automatic language identification, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code>, or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages and language-specific features</a>.
     * </p>
     *
     * @param languageIdSettings <p>
     *            If using automatic language identification in your request and
     *            you want to apply a custom language model, a custom
     *            vocabulary, or a custom vocabulary filter, include
     *            <code>LanguageIdSettings</code> with the relevant
     *            sub-parameters (<code>VocabularyName</code>,
     *            <code>LanguageModelName</code>, and
     *            <code>VocabularyFilterName</code>).
     *            </p>
     *            <p>
     *            <code>LanguageIdSettings</code> supports two to five language
     *            codes. Each language code you include can have an associated
     *            custom language model, custom vocabulary, and custom
     *            vocabulary filter. The language codes that you specify must
     *            match the languages of the associated custom language models,
     *            custom vocabularies, and custom vocabulary filters.
     *            </p>
     *            <p>
     *            It's recommended that you include <code>LanguageOptions</code>
     *            when using <code>LanguageIdSettings</code> to ensure that the
     *            correct language dialect is identified. For example, if you
     *            specify a custom vocabulary that is in <code>en-US</code> but
     *            Amazon Transcribe determines that the language spoken in your
     *            media is <code>en-AU</code>, your custom vocabulary <i>is
     *            not</i> applied to your transcription. If you include
     *            <code>LanguageOptions</code> and include <code>en-US</code> as
     *            the only English language dialect, your custom vocabulary
     *            <i>is</i> applied to your transcription.
     *            </p>
     *            <p>
     *            If you want to include a custom language model, custom
     *            vocabulary, or custom vocabulary filter with your request but
     *            <b>do not</b> want to use automatic language identification,
     *            use instead the
     *            <code/> parameter with the <code>LanguageModelName</code>,
     *            <code>VocabularyName</code>, or
     *            <code>VocabularyFilterName</code> sub-parameters.
     *            </p>
     *            <p>
     *            For a list of languages supported with Call Analytics, refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages and language-specific features</a>.
     *            </p>
     */
    public void setLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
    }

    /**
     * <p>
     * If using automatic language identification in your request and you want
     * to apply a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, include <code>LanguageIdSettings</code> with the
     * relevant sub-parameters (<code>VocabularyName</code>,
     * <code>LanguageModelName</code>, and <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each
     * language code you include can have an associated custom language model,
     * custom vocabulary, and custom vocabulary filter. The language codes that
     * you specify must match the languages of the associated custom language
     * models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using
     * <code>LanguageIdSettings</code> to ensure that the correct language
     * dialect is identified. For example, if you specify a custom vocabulary
     * that is in <code>en-US</code> but Amazon Transcribe determines that the
     * language spoken in your media is <code>en-AU</code>, your custom
     * vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only
     * English language dialect, your custom vocabulary <i>is</i> applied to
     * your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model, custom vocabulary, or
     * custom vocabulary filter with your request but <b>do not</b> want to use
     * automatic language identification, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code>, or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages and language-specific features</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageIdSettings <p>
     *            If using automatic language identification in your request and
     *            you want to apply a custom language model, a custom
     *            vocabulary, or a custom vocabulary filter, include
     *            <code>LanguageIdSettings</code> with the relevant
     *            sub-parameters (<code>VocabularyName</code>,
     *            <code>LanguageModelName</code>, and
     *            <code>VocabularyFilterName</code>).
     *            </p>
     *            <p>
     *            <code>LanguageIdSettings</code> supports two to five language
     *            codes. Each language code you include can have an associated
     *            custom language model, custom vocabulary, and custom
     *            vocabulary filter. The language codes that you specify must
     *            match the languages of the associated custom language models,
     *            custom vocabularies, and custom vocabulary filters.
     *            </p>
     *            <p>
     *            It's recommended that you include <code>LanguageOptions</code>
     *            when using <code>LanguageIdSettings</code> to ensure that the
     *            correct language dialect is identified. For example, if you
     *            specify a custom vocabulary that is in <code>en-US</code> but
     *            Amazon Transcribe determines that the language spoken in your
     *            media is <code>en-AU</code>, your custom vocabulary <i>is
     *            not</i> applied to your transcription. If you include
     *            <code>LanguageOptions</code> and include <code>en-US</code> as
     *            the only English language dialect, your custom vocabulary
     *            <i>is</i> applied to your transcription.
     *            </p>
     *            <p>
     *            If you want to include a custom language model, custom
     *            vocabulary, or custom vocabulary filter with your request but
     *            <b>do not</b> want to use automatic language identification,
     *            use instead the
     *            <code/> parameter with the <code>LanguageModelName</code>,
     *            <code>VocabularyName</code>, or
     *            <code>VocabularyFilterName</code> sub-parameters.
     *            </p>
     *            <p>
     *            For a list of languages supported with Call Analytics, refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages and language-specific features</a>.
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
     * If using automatic language identification in your request and you want
     * to apply a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, include <code>LanguageIdSettings</code> with the
     * relevant sub-parameters (<code>VocabularyName</code>,
     * <code>LanguageModelName</code>, and <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * <code>LanguageIdSettings</code> supports two to five language codes. Each
     * language code you include can have an associated custom language model,
     * custom vocabulary, and custom vocabulary filter. The language codes that
     * you specify must match the languages of the associated custom language
     * models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * It's recommended that you include <code>LanguageOptions</code> when using
     * <code>LanguageIdSettings</code> to ensure that the correct language
     * dialect is identified. For example, if you specify a custom vocabulary
     * that is in <code>en-US</code> but Amazon Transcribe determines that the
     * language spoken in your media is <code>en-AU</code>, your custom
     * vocabulary <i>is not</i> applied to your transcription. If you include
     * <code>LanguageOptions</code> and include <code>en-US</code> as the only
     * English language dialect, your custom vocabulary <i>is</i> applied to
     * your transcription.
     * </p>
     * <p>
     * If you want to include a custom language model, custom vocabulary, or
     * custom vocabulary filter with your request but <b>do not</b> want to use
     * automatic language identification, use instead the
     * <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code>, or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     * <p>
     * For a list of languages supported with Call Analytics, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages and language-specific features</a>.
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
