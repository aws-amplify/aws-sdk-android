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
 * Updates an existing custom medical vocabulary with new values. This operation
 * overwrites all existing information with your new values; you cannot append
 * new terms onto an existing custom vocabulary.
 * </p>
 */
public class UpdateMedicalVocabularyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom medical vocabulary you want to update. Custom
     * medical vocabulary names are case sensitive.
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
     * custom vocabulary you want to update. US English (<code>en-US</code>) is
     * the only language supported with Amazon Transcribe Medical.
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
     * The Amazon S3 location of the text file that contains your custom medical
     * vocabulary. The URI must be located in the same Amazon Web Services
     * Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String vocabularyFileUri;

    /**
     * <p>
     * The name of the custom medical vocabulary you want to update. Custom
     * medical vocabulary names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom medical vocabulary you want to update.
     *         Custom medical vocabulary names are case sensitive.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the custom medical vocabulary you want to update. Custom
     * medical vocabulary names are case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the custom medical vocabulary you want to update.
     *            Custom medical vocabulary names are case sensitive.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom medical vocabulary you want to update. Custom
     * medical vocabulary names are case sensitive.
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
     *            The name of the custom medical vocabulary you want to update.
     *            Custom medical vocabulary names are case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMedicalVocabularyRequest withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. US English (<code>en-US</code>) is
     * the only language supported with Amazon Transcribe Medical.
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
     *         the custom vocabulary you want to update. US English (
     *         <code>en-US</code>) is the only language supported with Amazon
     *         Transcribe Medical.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. US English (<code>en-US</code>) is
     * the only language supported with Amazon Transcribe Medical.
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
     *            in the custom vocabulary you want to update. US English (
     *            <code>en-US</code>) is the only language supported with Amazon
     *            Transcribe Medical.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. US English (<code>en-US</code>) is
     * the only language supported with Amazon Transcribe Medical.
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
     *            in the custom vocabulary you want to update. US English (
     *            <code>en-US</code>) is the only language supported with Amazon
     *            Transcribe Medical.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public UpdateMedicalVocabularyRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. US English (<code>en-US</code>) is
     * the only language supported with Amazon Transcribe Medical.
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
     *            in the custom vocabulary you want to update. US English (
     *            <code>en-US</code>) is the only language supported with Amazon
     *            Transcribe Medical.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the
     * custom vocabulary you want to update. US English (<code>en-US</code>) is
     * the only language supported with Amazon Transcribe Medical.
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
     *            in the custom vocabulary you want to update. US English (
     *            <code>en-US</code>) is the only language supported with Amazon
     *            Transcribe Medical.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public UpdateMedicalVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom medical
     * vocabulary. The URI must be located in the same Amazon Web Services
     * Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the text file that contains your custom
     *         medical vocabulary. The URI must be located in the same Amazon
     *         Web Services Region as the resource you're calling.
     *         </p>
     *         <p>
     *         Here's an example URI path:
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *         </p>
     */
    public String getVocabularyFileUri() {
        return vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom medical
     * vocabulary. The URI must be located in the same Amazon Web Services
     * Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param vocabularyFileUri <p>
     *            The Amazon S3 location of the text file that contains your
     *            custom medical vocabulary. The URI must be located in the same
     *            Amazon Web Services Region as the resource you're calling.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *            </p>
     */
    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom medical
     * vocabulary. The URI must be located in the same Amazon Web Services
     * Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path:
     * <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
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
     *            custom medical vocabulary. The URI must be located in the same
     *            Amazon Web Services Region as the resource you're calling.
     *            </p>
     *            <p>
     *            Here's an example URI path:
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMedicalVocabularyRequest withVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
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
        if (getVocabularyFileUri() != null)
            sb.append("VocabularyFileUri: " + getVocabularyFileUri());
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
        hashCode = prime * hashCode
                + ((getVocabularyFileUri() == null) ? 0 : getVocabularyFileUri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMedicalVocabularyRequest == false)
            return false;
        UpdateMedicalVocabularyRequest other = (UpdateMedicalVocabularyRequest) obj;

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
        if (other.getVocabularyFileUri() == null ^ this.getVocabularyFileUri() == null)
            return false;
        if (other.getVocabularyFileUri() != null
                && other.getVocabularyFileUri().equals(this.getVocabularyFileUri()) == false)
            return false;
        return true;
    }
}
