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

/**
 * <p>
 * Contains summary information about the custom vocabulary.
 * </p>
 */
public class VocabularySummary implements Serializable {
    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String name;

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     */
    private String arn;

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
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     */
    private String state;

    /**
     * <p>
     * The timestamp when the custom vocabulary was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The reason why the custom vocabulary was not created.
     * </p>
     */
    private String failureReason;

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
    public String getName() {
        return name;
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
     * @param name <p>
     *            A unique name of the custom vocabulary.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
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
     * @param name <p>
     *            A unique name of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VocabularySummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The identifier of the custom vocabulary.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param id <p>
     *            The identifier of the custom vocabulary.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param id <p>
     *            The identifier of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VocabularySummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the custom vocabulary.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom vocabulary.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VocabularySummary withArn(String arn) {
        this.arn = arn;
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
    public VocabularySummary withLanguageCode(String languageCode) {
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
    public VocabularySummary withLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @return <p>
     *         The current state of the custom vocabulary.
     *         </p>
     * @see VocabularyState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param state <p>
     *            The current state of the custom vocabulary.
     *            </p>
     * @see VocabularyState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param state <p>
     *            The current state of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public VocabularySummary withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param state <p>
     *            The current state of the custom vocabulary.
     *            </p>
     * @see VocabularyState
     */
    public void setState(VocabularyState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param state <p>
     *            The current state of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public VocabularySummary withState(VocabularyState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the custom vocabulary was last modified.
     * </p>
     *
     * @return <p>
     *         The timestamp when the custom vocabulary was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the custom vocabulary was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The timestamp when the custom vocabulary was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the custom vocabulary was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The timestamp when the custom vocabulary was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VocabularySummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The reason why the custom vocabulary was not created.
     * </p>
     *
     * @return <p>
     *         The reason why the custom vocabulary was not created.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason why the custom vocabulary was not created.
     * </p>
     *
     * @param failureReason <p>
     *            The reason why the custom vocabulary was not created.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the custom vocabulary was not created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            The reason why the custom vocabulary was not created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VocabularySummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VocabularySummary == false)
            return false;
        VocabularySummary other = (VocabularySummary) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
