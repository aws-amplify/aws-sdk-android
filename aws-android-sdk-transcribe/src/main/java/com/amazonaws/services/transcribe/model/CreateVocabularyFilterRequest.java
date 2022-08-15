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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new custom vocabulary filter.
 * </p>
 * <p>
 * You can use vocabulary filters to mask, delete, or flag specific words from
 * your transcript. Vocabulary filters are commonly used to mask profanity in
 * transcripts.
 * </p>
 * <p>
 * Each language has a character set that contains all allowed characters for
 * that specific language. If you use unsupported characters, your vocabulary
 * filter request fails. Refer to <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
 * >Character Sets for Custom Vocabularies</a> to get the character set for your
 * language.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html"
 * >Using vocabulary filtering with unwanted words</a>.
 * </p>
 */
public class CreateVocabularyFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary filter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique
     * within an Amazon Web Services account. If you try to create a new
     * vocabulary filter with the same name as an existing vocabulary filter,
     * you get a <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each vocabulary filter must contain terms in only one
     * language.
     * </p>
     * <p>
     * A vocabulary filter can only be used to transcribe files in the same
     * language as the filter. For example, if you create a vocabulary filter
     * using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     */
    private String languageCode;

    /**
     * <p>
     * Use this parameter if you want to create your vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for creating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     */
    private java.util.List<String> words;

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary filter terms. The URI must be located in the same Amazon Web
     * Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your
     * request, you cannot use <code>Words</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String vocabularyFilterFileUri;

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new custom vocabulary filter at the time you create this new filter.
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
     * A unique name, chosen by you, for your new custom vocabulary filter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique
     * within an Amazon Web Services account. If you try to create a new
     * vocabulary filter with the same name as an existing vocabulary filter,
     * you get a <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         A unique name, chosen by you, for your new custom vocabulary
     *         filter.
     *         </p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be
     *         unique within an Amazon Web Services account. If you try to
     *         create a new vocabulary filter with the same name as an existing
     *         vocabulary filter, you get a <code>ConflictException</code>
     *         error.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary filter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique
     * within an Amazon Web Services account. If you try to create a new
     * vocabulary filter with the same name as an existing vocabulary filter,
     * you get a <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            A unique name, chosen by you, for your new custom vocabulary
     *            filter.
     *            </p>
     *            <p>
     *            This name is case sensitive, cannot contain spaces, and must
     *            be unique within an Amazon Web Services account. If you try to
     *            create a new vocabulary filter with the same name as an
     *            existing vocabulary filter, you get a
     *            <code>ConflictException</code> error.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary filter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique
     * within an Amazon Web Services account. If you try to create a new
     * vocabulary filter with the same name as an existing vocabulary filter,
     * you get a <code>ConflictException</code> error.
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
     *            A unique name, chosen by you, for your new custom vocabulary
     *            filter.
     *            </p>
     *            <p>
     *            This name is case sensitive, cannot contain spaces, and must
     *            be unique within an Amazon Web Services account. If you try to
     *            create a new vocabulary filter with the same name as an
     *            existing vocabulary filter, you get a
     *            <code>ConflictException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyFilterRequest withVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each vocabulary filter must contain terms in only one
     * language.
     * </p>
     * <p>
     * A vocabulary filter can only be used to transcribe files in the same
     * language as the filter. For example, if you create a vocabulary filter
     * using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @return <p>
     *         The language code that represents the language of the entries in
     *         your vocabulary filter. Each vocabulary filter must contain terms
     *         in only one language.
     *         </p>
     *         <p>
     *         A vocabulary filter can only be used to transcribe files in the
     *         same language as the filter. For example, if you create a
     *         vocabulary filter using US English (<code>en-US</code>), you can
     *         only apply this filter to files that contain English audio.
     *         </p>
     *         <p>
     *         For a list of supported languages and their associated language
     *         codes, refer to the <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a> table.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each vocabulary filter must contain terms in only one
     * language.
     * </p>
     * <p>
     * A vocabulary filter can only be used to transcribe files in the same
     * language as the filter. For example, if you create a vocabulary filter
     * using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in your vocabulary filter. Each vocabulary filter must contain
     *            terms in only one language.
     *            </p>
     *            <p>
     *            A vocabulary filter can only be used to transcribe files in
     *            the same language as the filter. For example, if you create a
     *            vocabulary filter using US English (<code>en-US</code>), you
     *            can only apply this filter to files that contain English
     *            audio.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each vocabulary filter must contain terms in only one
     * language.
     * </p>
     * <p>
     * A vocabulary filter can only be used to transcribe files in the same
     * language as the filter. For example, if you create a vocabulary filter
     * using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in your vocabulary filter. Each vocabulary filter must contain
     *            terms in only one language.
     *            </p>
     *            <p>
     *            A vocabulary filter can only be used to transcribe files in
     *            the same language as the filter. For example, if you create a
     *            vocabulary filter using US English (<code>en-US</code>), you
     *            can only apply this filter to files that contain English
     *            audio.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CreateVocabularyFilterRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each vocabulary filter must contain terms in only one
     * language.
     * </p>
     * <p>
     * A vocabulary filter can only be used to transcribe files in the same
     * language as the filter. For example, if you create a vocabulary filter
     * using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in your vocabulary filter. Each vocabulary filter must contain
     *            terms in only one language.
     *            </p>
     *            <p>
     *            A vocabulary filter can only be used to transcribe files in
     *            the same language as the filter. For example, if you create a
     *            vocabulary filter using US English (<code>en-US</code>), you
     *            can only apply this filter to files that contain English
     *            audio.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each vocabulary filter must contain terms in only one
     * language.
     * </p>
     * <p>
     * A vocabulary filter can only be used to transcribe files in the same
     * language as the filter. For example, if you create a vocabulary filter
     * using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in your vocabulary filter. Each vocabulary filter must contain
     *            terms in only one language.
     *            </p>
     *            <p>
     *            A vocabulary filter can only be used to transcribe files in
     *            the same language as the filter. For example, if you create a
     *            vocabulary filter using US English (<code>en-US</code>), you
     *            can only apply this filter to files that contain English
     *            audio.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CreateVocabularyFilterRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to create your vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for creating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     *
     * @return <p>
     *         Use this parameter if you want to create your vocabulary filter
     *         by including all desired terms, as comma-separated values, within
     *         your request. The other option for creating your vocabulary
     *         filter is to save your entries in a text file and upload them to
     *         an Amazon S3 bucket, then specify the location of your file using
     *         the <code>VocabularyFilterFileUri</code> parameter.
     *         </p>
     *         <p>
     *         Note that if you include <code>Words</code> in your request, you
     *         cannot use <code>VocabularyFilterFileUri</code>; you must choose
     *         one or the other.
     *         </p>
     *         <p>
     *         Each language has a character set that contains all allowed
     *         characters for that specific language. If you use unsupported
     *         characters, your vocabulary filter request fails. Refer to <a
     *         href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *         >Character Sets for Custom Vocabularies</a> to get the character
     *         set for your language.
     *         </p>
     */
    public java.util.List<String> getWords() {
        return words;
    }

    /**
     * <p>
     * Use this parameter if you want to create your vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for creating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     *
     * @param words <p>
     *            Use this parameter if you want to create your vocabulary
     *            filter by including all desired terms, as comma-separated
     *            values, within your request. The other option for creating
     *            your vocabulary filter is to save your entries in a text file
     *            and upload them to an Amazon S3 bucket, then specify the
     *            location of your file using the
     *            <code>VocabularyFilterFileUri</code> parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Words</code> in your request,
     *            you cannot use <code>VocabularyFilterFileUri</code>; you must
     *            choose one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your vocabulary filter request fails. Refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     */
    public void setWords(java.util.Collection<String> words) {
        if (words == null) {
            this.words = null;
            return;
        }

        this.words = new java.util.ArrayList<String>(words);
    }

    /**
     * <p>
     * Use this parameter if you want to create your vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for creating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param words <p>
     *            Use this parameter if you want to create your vocabulary
     *            filter by including all desired terms, as comma-separated
     *            values, within your request. The other option for creating
     *            your vocabulary filter is to save your entries in a text file
     *            and upload them to an Amazon S3 bucket, then specify the
     *            location of your file using the
     *            <code>VocabularyFilterFileUri</code> parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Words</code> in your request,
     *            you cannot use <code>VocabularyFilterFileUri</code>; you must
     *            choose one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your vocabulary filter request fails. Refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyFilterRequest withWords(String... words) {
        if (getWords() == null) {
            this.words = new java.util.ArrayList<String>(words.length);
        }
        for (String value : words) {
            this.words.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to create your vocabulary filter by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for creating your vocabulary filter is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot
     * use <code>VocabularyFilterFileUri</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param words <p>
     *            Use this parameter if you want to create your vocabulary
     *            filter by including all desired terms, as comma-separated
     *            values, within your request. The other option for creating
     *            your vocabulary filter is to save your entries in a text file
     *            and upload them to an Amazon S3 bucket, then specify the
     *            location of your file using the
     *            <code>VocabularyFilterFileUri</code> parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Words</code> in your request,
     *            you cannot use <code>VocabularyFilterFileUri</code>; you must
     *            choose one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your vocabulary filter request fails. Refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyFilterRequest withWords(java.util.Collection<String> words) {
        setWords(words);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary filter terms. The URI must be located in the same Amazon Web
     * Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your
     * request, you cannot use <code>Words</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the text file that contains your custom
     *         vocabulary filter terms. The URI must be located in the same
     *         Amazon Web Services Region as the resource you're calling.
     *         </p>
     *         <p>
     *         Here's an example URI path:
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *         </p>
     *         <p>
     *         Note that if you include <code>VocabularyFilterFileUri</code> in
     *         your request, you cannot use <code>Words</code>; you must choose
     *         one or the other.
     *         </p>
     */
    public String getVocabularyFilterFileUri() {
        return vocabularyFilterFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary filter terms. The URI must be located in the same Amazon Web
     * Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your
     * request, you cannot use <code>Words</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param vocabularyFilterFileUri <p>
     *            The Amazon S3 location of the text file that contains your
     *            custom vocabulary filter terms. The URI must be located in the
     *            same Amazon Web Services Region as the resource you're
     *            calling.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFilterFileUri</code>
     *            in your request, you cannot use <code>Words</code>; you must
     *            choose one or the other.
     *            </p>
     */
    public void setVocabularyFilterFileUri(String vocabularyFilterFileUri) {
        this.vocabularyFilterFileUri = vocabularyFilterFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary filter terms. The URI must be located in the same Amazon Web
     * Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your
     * request, you cannot use <code>Words</code>; you must choose one or the
     * other.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param vocabularyFilterFileUri <p>
     *            The Amazon S3 location of the text file that contains your
     *            custom vocabulary filter terms. The URI must be located in the
     *            same Amazon Web Services Region as the resource you're
     *            calling.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFilterFileUri</code>
     *            in your request, you cannot use <code>Words</code>; you must
     *            choose one or the other.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyFilterRequest withVocabularyFilterFileUri(String vocabularyFilterFileUri) {
        this.vocabularyFilterFileUri = vocabularyFilterFileUri;
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new custom vocabulary filter at the time you create this new filter.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @return <p>
     *         Adds one or more custom tags, each in the form of a key:value
     *         pair, to a new custom vocabulary filter at the time you create
     *         this new filter.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new custom vocabulary filter at the time you create this new filter.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to a new custom vocabulary filter at the time you create
     *            this new filter.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new custom vocabulary filter at the time you create this new filter.
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
     *            pair, to a new custom vocabulary filter at the time you create
     *            this new filter.
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
    public CreateVocabularyFilterRequest withTags(Tag... tags) {
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new custom vocabulary filter at the time you create this new filter.
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
     *            pair, to a new custom vocabulary filter at the time you create
     *            this new filter.
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
    public CreateVocabularyFilterRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: " + getVocabularyFilterName() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getWords() != null)
            sb.append("Words: " + getWords() + ",");
        if (getVocabularyFilterFileUri() != null)
            sb.append("VocabularyFilterFileUri: " + getVocabularyFilterFileUri() + ",");
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
                + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getWords() == null) ? 0 : getWords().hashCode());
        hashCode = prime
                * hashCode
                + ((getVocabularyFilterFileUri() == null) ? 0 : getVocabularyFilterFileUri()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVocabularyFilterRequest == false)
            return false;
        CreateVocabularyFilterRequest other = (CreateVocabularyFilterRequest) obj;

        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null
                && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getWords() == null ^ this.getWords() == null)
            return false;
        if (other.getWords() != null && other.getWords().equals(this.getWords()) == false)
            return false;
        if (other.getVocabularyFilterFileUri() == null ^ this.getVocabularyFilterFileUri() == null)
            return false;
        if (other.getVocabularyFilterFileUri() != null
                && other.getVocabularyFilterFileUri().equals(this.getVocabularyFilterFileUri()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
