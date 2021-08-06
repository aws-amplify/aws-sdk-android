/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new custom vocabulary that you can use to change how Amazon
 * Transcribe Medical transcribes your audio file.
 * </p>
 */
public class CreateMedicalVocabularyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom vocabulary. This case-sensitive name must be
     * unique within an Amazon Web Services account. If you try to create a
     * vocabulary with the same name as a previous vocabulary, you get a
     * <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * The language code for the language used for the entries in your custom
     * vocabulary. The language code of your custom vocabulary must match the
     * language code of your transcription job. US English (en-US) is the only
     * language code available for Amazon Transcribe Medical.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN
     */
    private String languageCode;

    /**
     * <p>
     * The location in Amazon S3 of the text file you use to define your custom
     * vocabulary. The URI must be in the same Amazon Web Services Region as the
     * resource that you're calling. Enter information about your
     * <code>VocabularyFileUri</code> in the following format:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * The following is an example URI for a vocabulary file that is stored in
     * Amazon S3:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     * </p>
     * <p>
     * For more information about Amazon S3 object names, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     * >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med"
     * >Medical Custom Vocabularies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String vocabularyFileUri;

    /**
     * <p>
     * The name of the custom vocabulary. This case-sensitive name must be
     * unique within an Amazon Web Services account. If you try to create a
     * vocabulary with the same name as a previous vocabulary, you get a
     * <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom vocabulary. This case-sensitive name must
     *         be unique within an Amazon Web Services account. If you try to
     *         create a vocabulary with the same name as a previous vocabulary,
     *         you get a <code>ConflictException</code> error.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary. This case-sensitive name must be
     * unique within an Amazon Web Services account. If you try to create a
     * vocabulary with the same name as a previous vocabulary, you get a
     * <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the custom vocabulary. This case-sensitive name
     *            must be unique within an Amazon Web Services account. If you
     *            try to create a vocabulary with the same name as a previous
     *            vocabulary, you get a <code>ConflictException</code> error.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary. This case-sensitive name must be
     * unique within an Amazon Web Services account. If you try to create a
     * vocabulary with the same name as a previous vocabulary, you get a
     * <code>ConflictException</code> error.
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
     *            The name of the custom vocabulary. This case-sensitive name
     *            must be unique within an Amazon Web Services account. If you
     *            try to create a vocabulary with the same name as a previous
     *            vocabulary, you get a <code>ConflictException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMedicalVocabularyRequest withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * The language code for the language used for the entries in your custom
     * vocabulary. The language code of your custom vocabulary must match the
     * language code of your transcription job. US English (en-US) is the only
     * language code available for Amazon Transcribe Medical.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN
     *
     * @return <p>
     *         The language code for the language used for the entries in your
     *         custom vocabulary. The language code of your custom vocabulary
     *         must match the language code of your transcription job. US
     *         English (en-US) is the only language code available for Amazon
     *         Transcribe Medical.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the language used for the entries in your custom
     * vocabulary. The language code of your custom vocabulary must match the
     * language code of your transcription job. US English (en-US) is the only
     * language code available for Amazon Transcribe Medical.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN
     *
     * @param languageCode <p>
     *            The language code for the language used for the entries in
     *            your custom vocabulary. The language code of your custom
     *            vocabulary must match the language code of your transcription
     *            job. US English (en-US) is the only language code available
     *            for Amazon Transcribe Medical.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language used for the entries in your custom
     * vocabulary. The language code of your custom vocabulary must match the
     * language code of your transcription job. US English (en-US) is the only
     * language code available for Amazon Transcribe Medical.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN
     *
     * @param languageCode <p>
     *            The language code for the language used for the entries in
     *            your custom vocabulary. The language code of your custom
     *            vocabulary must match the language code of your transcription
     *            job. US English (en-US) is the only language code available
     *            for Amazon Transcribe Medical.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CreateMedicalVocabularyRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the language used for the entries in your custom
     * vocabulary. The language code of your custom vocabulary must match the
     * language code of your transcription job. US English (en-US) is the only
     * language code available for Amazon Transcribe Medical.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN
     *
     * @param languageCode <p>
     *            The language code for the language used for the entries in
     *            your custom vocabulary. The language code of your custom
     *            vocabulary must match the language code of your transcription
     *            job. US English (en-US) is the only language code available
     *            for Amazon Transcribe Medical.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the language used for the entries in your custom
     * vocabulary. The language code of your custom vocabulary must match the
     * language code of your transcription job. US English (en-US) is the only
     * language code available for Amazon Transcribe Medical.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN
     *
     * @param languageCode <p>
     *            The language code for the language used for the entries in
     *            your custom vocabulary. The language code of your custom
     *            vocabulary must match the language code of your transcription
     *            job. US English (en-US) is the only language code available
     *            for Amazon Transcribe Medical.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CreateMedicalVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 of the text file you use to define your custom
     * vocabulary. The URI must be in the same Amazon Web Services Region as the
     * resource that you're calling. Enter information about your
     * <code>VocabularyFileUri</code> in the following format:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * The following is an example URI for a vocabulary file that is stored in
     * Amazon S3:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     * </p>
     * <p>
     * For more information about Amazon S3 object names, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     * >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med"
     * >Medical Custom Vocabularies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The location in Amazon S3 of the text file you use to define your
     *         custom vocabulary. The URI must be in the same Amazon Web
     *         Services Region as the resource that you're calling. Enter
     *         information about your <code>VocabularyFileUri</code> in the
     *         following format:
     *         </p>
     *         <p>
     *         <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *         </p>
     *         <p>
     *         The following is an example URI for a vocabulary file that is
     *         stored in Amazon S3:
     *         </p>
     *         <p>
     *         <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     *         </p>
     *         <p>
     *         For more information about Amazon S3 object names, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     *         >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     *         </p>
     *         <p>
     *         For more information about custom vocabularies, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med"
     *         >Medical Custom Vocabularies</a>.
     *         </p>
     */
    public String getVocabularyFileUri() {
        return vocabularyFileUri;
    }

    /**
     * <p>
     * The location in Amazon S3 of the text file you use to define your custom
     * vocabulary. The URI must be in the same Amazon Web Services Region as the
     * resource that you're calling. Enter information about your
     * <code>VocabularyFileUri</code> in the following format:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * The following is an example URI for a vocabulary file that is stored in
     * Amazon S3:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     * </p>
     * <p>
     * For more information about Amazon S3 object names, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     * >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med"
     * >Medical Custom Vocabularies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param vocabularyFileUri <p>
     *            The location in Amazon S3 of the text file you use to define
     *            your custom vocabulary. The URI must be in the same Amazon Web
     *            Services Region as the resource that you're calling. Enter
     *            information about your <code>VocabularyFileUri</code> in the
     *            following format:
     *            </p>
     *            <p>
     *            <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *            </p>
     *            <p>
     *            The following is an example URI for a vocabulary file that is
     *            stored in Amazon S3:
     *            </p>
     *            <p>
     *            <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     *            </p>
     *            <p>
     *            For more information about Amazon S3 object names, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     *            >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about custom vocabularies, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med"
     *            >Medical Custom Vocabularies</a>.
     *            </p>
     */
    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The location in Amazon S3 of the text file you use to define your custom
     * vocabulary. The URI must be in the same Amazon Web Services Region as the
     * resource that you're calling. Enter information about your
     * <code>VocabularyFileUri</code> in the following format:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * The following is an example URI for a vocabulary file that is stored in
     * Amazon S3:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     * </p>
     * <p>
     * For more information about Amazon S3 object names, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     * >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med"
     * >Medical Custom Vocabularies</a>.
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
     *            The location in Amazon S3 of the text file you use to define
     *            your custom vocabulary. The URI must be in the same Amazon Web
     *            Services Region as the resource that you're calling. Enter
     *            information about your <code>VocabularyFileUri</code> in the
     *            following format:
     *            </p>
     *            <p>
     *            <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *            </p>
     *            <p>
     *            The following is an example URI for a vocabulary file that is
     *            stored in Amazon S3:
     *            </p>
     *            <p>
     *            <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     *            </p>
     *            <p>
     *            For more information about Amazon S3 object names, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     *            >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about custom vocabularies, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med"
     *            >Medical Custom Vocabularies</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMedicalVocabularyRequest withVocabularyFileUri(String vocabularyFileUri) {
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

        if (obj instanceof CreateMedicalVocabularyRequest == false)
            return false;
        CreateMedicalVocabularyRequest other = (CreateMedicalVocabularyRequest) obj;

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
