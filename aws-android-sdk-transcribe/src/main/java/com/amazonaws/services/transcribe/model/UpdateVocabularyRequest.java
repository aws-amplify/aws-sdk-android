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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing custom vocabulary with new values. This operation
 * overwrites all existing information with your new values; you cannot append
 * new terms onto an existing custom vocabulary.
 * </p>
 */
public class UpdateVocabularyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom vocabulary you want to update. Custom vocabulary
     * names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. Each custom vocabulary must contain
     * terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same
     * language as the custom vocabulary. For example, if you create a custom
     * vocabulary using US English (<code>en-US</code>), you can only apply this
     * custom vocabulary to files that contain English audio.
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
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     */
    private String languageCode;

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your custom vocabulary is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot
     * use <code>VocabularyFileUri</code>; you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     */
    private java.util.List<String> phrases;

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary. The URI must be located in the same Amazon Web Services
     * Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFileUri</code> in your request,
     * you cannot use the <code>Phrases</code> flag; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String vocabularyFileUri;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files (in this case,
     * your custom vocabulary). If the role that you specify doesn’t have the
     * appropriate permissions to access the specified Amazon S3 location, your
     * request fails.
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
     * The name of the custom vocabulary you want to update. Custom vocabulary
     * names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom vocabulary you want to update. Custom
     *         vocabulary names are case sensitive.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to update. Custom vocabulary
     * names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the custom vocabulary you want to update. Custom
     *            vocabulary names are case sensitive.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to update. Custom vocabulary
     * names are case sensitive.
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
     *            The name of the custom vocabulary you want to update. Custom
     *            vocabulary names are case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyRequest withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. Each custom vocabulary must contain
     * terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same
     * language as the custom vocabulary. For example, if you create a custom
     * vocabulary using US English (<code>en-US</code>), you can only apply this
     * custom vocabulary to files that contain English audio.
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
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @return <p>
     *         The language code that represents the language of the entries in
     *         the custom vocabulary you want to update. Each custom vocabulary
     *         must contain terms in only one language.
     *         </p>
     *         <p>
     *         A custom vocabulary can only be used to transcribe files in the
     *         same language as the custom vocabulary. For example, if you
     *         create a custom vocabulary using US English (<code>en-US</code>),
     *         you can only apply this custom vocabulary to files that contain
     *         English audio.
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
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. Each custom vocabulary must contain
     * terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same
     * language as the custom vocabulary. For example, if you create a custom
     * vocabulary using US English (<code>en-US</code>), you can only apply this
     * custom vocabulary to files that contain English audio.
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
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in the custom vocabulary you want to update. Each custom
     *            vocabulary must contain terms in only one language.
     *            </p>
     *            <p>
     *            A custom vocabulary can only be used to transcribe files in
     *            the same language as the custom vocabulary. For example, if
     *            you create a custom vocabulary using US English (
     *            <code>en-US</code>), you can only apply this custom vocabulary
     *            to files that contain English audio.
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
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. Each custom vocabulary must contain
     * terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same
     * language as the custom vocabulary. For example, if you create a custom
     * vocabulary using US English (<code>en-US</code>), you can only apply this
     * custom vocabulary to files that contain English audio.
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
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in the custom vocabulary you want to update. Each custom
     *            vocabulary must contain terms in only one language.
     *            </p>
     *            <p>
     *            A custom vocabulary can only be used to transcribe files in
     *            the same language as the custom vocabulary. For example, if
     *            you create a custom vocabulary using US English (
     *            <code>en-US</code>), you can only apply this custom vocabulary
     *            to files that contain English audio.
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
    public UpdateVocabularyRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. Each custom vocabulary must contain
     * terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same
     * language as the custom vocabulary. For example, if you create a custom
     * vocabulary using US English (<code>en-US</code>), you can only apply this
     * custom vocabulary to files that contain English audio.
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
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in the custom vocabulary you want to update. Each custom
     *            vocabulary must contain terms in only one language.
     *            </p>
     *            <p>
     *            A custom vocabulary can only be used to transcribe files in
     *            the same language as the custom vocabulary. For example, if
     *            you create a custom vocabulary using US English (
     *            <code>en-US</code>), you can only apply this custom vocabulary
     *            to files that contain English audio.
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
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. Each custom vocabulary must contain
     * terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same
     * language as the custom vocabulary. For example, if you create a custom
     * vocabulary using US English (<code>en-US</code>), you can only apply this
     * custom vocabulary to files that contain English audio.
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
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in the custom vocabulary you want to update. Each custom
     *            vocabulary must contain terms in only one language.
     *            </p>
     *            <p>
     *            A custom vocabulary can only be used to transcribe files in
     *            the same language as the custom vocabulary. For example, if
     *            you create a custom vocabulary using US English (
     *            <code>en-US</code>), you can only apply this custom vocabulary
     *            to files that contain English audio.
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
    public UpdateVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your custom vocabulary is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot
     * use <code>VocabularyFileUri</code>; you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     *
     * @return <p>
     *         Use this parameter if you want to update your custom vocabulary
     *         by including all desired terms, as comma-separated values, within
     *         your request. The other option for updating your custom
     *         vocabulary is to save your entries in a text file and upload them
     *         to an Amazon S3 bucket, then specify the location of your file
     *         using the <code>VocabularyFileUri</code> parameter.
     *         </p>
     *         <p>
     *         Note that if you include <code>Phrases</code> in your request,
     *         you cannot use <code>VocabularyFileUri</code>; you must choose
     *         one or the other.
     *         </p>
     *         <p>
     *         Each language has a character set that contains all allowed
     *         characters for that specific language. If you use unsupported
     *         characters, your custom vocabulary filter request fails. Refer to
     *         <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *         >Character Sets for Custom Vocabularies</a> to get the character
     *         set for your language.
     *         </p>
     */
    public java.util.List<String> getPhrases() {
        return phrases;
    }

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your custom vocabulary is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot
     * use <code>VocabularyFileUri</code>; you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     *
     * @param phrases <p>
     *            Use this parameter if you want to update your custom
     *            vocabulary by including all desired terms, as comma-separated
     *            values, within your request. The other option for updating
     *            your custom vocabulary is to save your entries in a text file
     *            and upload them to an Amazon S3 bucket, then specify the
     *            location of your file using the <code>VocabularyFileUri</code>
     *            parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Phrases</code> in your request,
     *            you cannot use <code>VocabularyFileUri</code>; you must choose
     *            one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your custom vocabulary filter request fails. Refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     */
    public void setPhrases(java.util.Collection<String> phrases) {
        if (phrases == null) {
            this.phrases = null;
            return;
        }

        this.phrases = new java.util.ArrayList<String>(phrases);
    }

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your custom vocabulary is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot
     * use <code>VocabularyFileUri</code>; you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phrases <p>
     *            Use this parameter if you want to update your custom
     *            vocabulary by including all desired terms, as comma-separated
     *            values, within your request. The other option for updating
     *            your custom vocabulary is to save your entries in a text file
     *            and upload them to an Amazon S3 bucket, then specify the
     *            location of your file using the <code>VocabularyFileUri</code>
     *            parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Phrases</code> in your request,
     *            you cannot use <code>VocabularyFileUri</code>; you must choose
     *            one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your custom vocabulary filter request fails. Refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyRequest withPhrases(String... phrases) {
        if (getPhrases() == null) {
            this.phrases = new java.util.ArrayList<String>(phrases.length);
        }
        for (String value : phrases) {
            this.phrases.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to update your custom vocabulary by
     * including all desired terms, as comma-separated values, within your
     * request. The other option for updating your custom vocabulary is to save
     * your entries in a text file and upload them to an Amazon S3 bucket, then
     * specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot
     * use <code>VocabularyFileUri</code>; you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phrases <p>
     *            Use this parameter if you want to update your custom
     *            vocabulary by including all desired terms, as comma-separated
     *            values, within your request. The other option for updating
     *            your custom vocabulary is to save your entries in a text file
     *            and upload them to an Amazon S3 bucket, then specify the
     *            location of your file using the <code>VocabularyFileUri</code>
     *            parameter.
     *            </p>
     *            <p>
     *            Note that if you include <code>Phrases</code> in your request,
     *            you cannot use <code>VocabularyFileUri</code>; you must choose
     *            one or the other.
     *            </p>
     *            <p>
     *            Each language has a character set that contains all allowed
     *            characters for that specific language. If you use unsupported
     *            characters, your custom vocabulary filter request fails. Refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     *            >Character Sets for Custom Vocabularies</a> to get the
     *            character set for your language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyRequest withPhrases(java.util.Collection<String> phrases) {
        setPhrases(phrases);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary. The URI must be located in the same Amazon Web Services
     * Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFileUri</code> in your request,
     * you cannot use the <code>Phrases</code> flag; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the text file that contains your custom
     *         vocabulary. The URI must be located in the same Amazon Web
     *         Services Region as the resource you're calling.
     *         </p>
     *         <p>
     *         Here's an example URI path:
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *         </p>
     *         <p>
     *         Note that if you include <code>VocabularyFileUri</code> in your
     *         request, you cannot use the <code>Phrases</code> flag; you must
     *         choose one or the other.
     *         </p>
     */
    public String getVocabularyFileUri() {
        return vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary. The URI must be located in the same Amazon Web Services
     * Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFileUri</code> in your request,
     * you cannot use the <code>Phrases</code> flag; you must choose one or the
     * other.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param vocabularyFileUri <p>
     *            The Amazon S3 location of the text file that contains your
     *            custom vocabulary. The URI must be located in the same Amazon
     *            Web Services Region as the resource you're calling.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFileUri</code> in
     *            your request, you cannot use the <code>Phrases</code> flag;
     *            you must choose one or the other.
     *            </p>
     */
    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom
     * vocabulary. The URI must be located in the same Amazon Web Services
     * Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFileUri</code> in your request,
     * you cannot use the <code>Phrases</code> flag; you must choose one or the
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
     * @param vocabularyFileUri <p>
     *            The Amazon S3 location of the text file that contains your
     *            custom vocabulary. The URI must be located in the same Amazon
     *            Web Services Region as the resource you're calling.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFileUri</code> in
     *            your request, you cannot use the <code>Phrases</code> flag;
     *            you must choose one or the other.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyRequest withVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files (in this case,
     * your custom vocabulary). If the role that you specify doesn’t have the
     * appropriate permissions to access the specified Amazon S3 location, your
     * request fails.
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
     *         input files (in this case, your custom vocabulary). If the role
     *         that you specify doesn’t have the appropriate permissions to
     *         access the specified Amazon S3 location, your request fails.
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
     * access the Amazon S3 bucket that contains your input files (in this case,
     * your custom vocabulary). If the role that you specify doesn’t have the
     * appropriate permissions to access the specified Amazon S3 location, your
     * request fails.
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
     *            input files (in this case, your custom vocabulary). If the
     *            role that you specify doesn’t have the appropriate permissions
     *            to access the specified Amazon S3 location, your request
     *            fails.
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
     * access the Amazon S3 bucket that contains your input files (in this case,
     * your custom vocabulary). If the role that you specify doesn’t have the
     * appropriate permissions to access the specified Amazon S3 location, your
     * request fails.
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
     *            input files (in this case, your custom vocabulary). If the
     *            role that you specify doesn’t have the appropriate permissions
     *            to access the specified Amazon S3 location, your request
     *            fails.
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
    public UpdateVocabularyRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getPhrases() != null)
            sb.append("Phrases: " + getPhrases() + ",");
        if (getVocabularyFileUri() != null)
            sb.append("VocabularyFileUri: " + getVocabularyFileUri() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn());
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
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getPhrases() == null) ? 0 : getPhrases().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyFileUri() == null) ? 0 : getVocabularyFileUri().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVocabularyRequest == false)
            return false;
        UpdateVocabularyRequest other = (UpdateVocabularyRequest) obj;

        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null
                && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getPhrases() == null ^ this.getPhrases() == null)
            return false;
        if (other.getPhrases() != null && other.getPhrases().equals(this.getPhrases()) == false)
            return false;
        if (other.getVocabularyFileUri() == null ^ this.getVocabularyFileUri() == null)
            return false;
        if (other.getVocabularyFileUri() != null
                && other.getVocabularyFileUri().equals(this.getVocabularyFileUri()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }
}
