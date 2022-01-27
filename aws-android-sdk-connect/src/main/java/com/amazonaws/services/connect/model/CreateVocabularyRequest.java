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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a custom vocabulary associated with your Amazon Connect instance. You
 * can set a custom vocabulary to be your default vocabulary for a given
 * language. Contact Lens for Amazon Connect uses the default vocabulary in
 * post-call and real-time contact analysis sessions for that language.
 * </p>
 */
public class CreateVocabularyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If a create request is received more than
     * once with same client token, subsequent requests return the previous
     * response without creating a vocabulary again.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     */
    private String languageCode;

    /**
     * <p>
     * The content of the custom vocabulary in plain-text format with a table of
     * values. Each row in the table represents a word or a phrase, described
     * with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and
     * <code>DisplayAs</code> fields. Separate the fields with TAB characters.
     * The size limit is 50KB. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     * >Create a custom vocabulary using a table</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     */
    private String content;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If a create request is received more than
     * once with same client token, subsequent requests return the previous
     * response without creating a vocabulary again.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. If a create request is received
     *         more than once with same client token, subsequent requests return
     *         the previous response without creating a vocabulary again.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If a create request is received more than
     * once with same client token, subsequent requests return the previous
     * response without creating a vocabulary again.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If a create request is
     *            received more than once with same client token, subsequent
     *            requests return the previous response without creating a
     *            vocabulary again.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If a create request is received more than
     * once with same client token, subsequent requests return the previous
     * response without creating a vocabulary again.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If a create request is
     *            received more than once with same client token, subsequent
     *            requests return the previous response without creating a
     *            vocabulary again.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         A unique name of the custom vocabulary.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            A unique name of the custom vocabulary.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            A unique name of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyRequest withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @return <p>
     *         The language code of the vocabulary entries. For a list of
     *         languages and their corresponding language codes, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *         >What is Amazon Transcribe?</a>
     *         </p>
     * @see VocabularyLanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries. For a list of
     *            languages and their corresponding language codes, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *            >What is Amazon Transcribe?</a>
     *            </p>
     * @see VocabularyLanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries. For a list of
     *            languages and their corresponding language codes, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *            >What is Amazon Transcribe?</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyLanguageCode
     */
    public CreateVocabularyRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries. For a list of
     *            languages and their corresponding language codes, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *            >What is Amazon Transcribe?</a>
     *            </p>
     * @see VocabularyLanguageCode
     */
    public void setLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries. For a list of
     *            languages and their corresponding language codes, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *            >What is Amazon Transcribe?</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyLanguageCode
     */
    public CreateVocabularyRequest withLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The content of the custom vocabulary in plain-text format with a table of
     * values. Each row in the table represents a word or a phrase, described
     * with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and
     * <code>DisplayAs</code> fields. Separate the fields with TAB characters.
     * The size limit is 50KB. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     * >Create a custom vocabulary using a table</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     *
     * @return <p>
     *         The content of the custom vocabulary in plain-text format with a
     *         table of values. Each row in the table represents a word or a
     *         phrase, described with <code>Phrase</code>, <code>IPA</code>,
     *         <code>SoundsLike</code>, and <code>DisplayAs</code> fields.
     *         Separate the fields with TAB characters. The size limit is 50KB.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     *         >Create a custom vocabulary using a table</a>.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the custom vocabulary in plain-text format with a table of
     * values. Each row in the table represents a word or a phrase, described
     * with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and
     * <code>DisplayAs</code> fields. Separate the fields with TAB characters.
     * The size limit is 50KB. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     * >Create a custom vocabulary using a table</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     *
     * @param content <p>
     *            The content of the custom vocabulary in plain-text format with
     *            a table of values. Each row in the table represents a word or
     *            a phrase, described with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and <code>DisplayAs</code> fields.
     *            Separate the fields with TAB characters. The size limit is
     *            50KB. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     *            >Create a custom vocabulary using a table</a>.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the custom vocabulary in plain-text format with a table of
     * values. Each row in the table represents a word or a phrase, described
     * with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and
     * <code>DisplayAs</code> fields. Separate the fields with TAB characters.
     * The size limit is 50KB. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     * >Create a custom vocabulary using a table</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     *
     * @param content <p>
     *            The content of the custom vocabulary in plain-text format with
     *            a table of values. Each row in the table represents a word or
     *            a phrase, described with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and <code>DisplayAs</code> fields.
     *            Separate the fields with TAB characters. The size limit is
     *            50KB. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     *            >Create a custom vocabulary using a table</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateVocabularyRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getVocabularyName() != null)
            sb.append("VocabularyName: " + getVocabularyName() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
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
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVocabularyRequest == false)
            return false;
        CreateVocabularyRequest other = (CreateVocabularyRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
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
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
