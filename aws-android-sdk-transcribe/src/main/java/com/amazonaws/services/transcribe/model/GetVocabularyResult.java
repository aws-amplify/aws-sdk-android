/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetVocabularyResult implements Serializable {
    /**
     * <p>
     * The name of the vocabulary to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     */
    private String languageCode;

    /**
     * <p>
     * The processing state of the vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     */
    private String vocabularyState;

    /**
     * <p>
     * The date and time that the vocabulary was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * If the <code>VocabularyState</code> field is <code>FAILED</code>, this
     * field contains information about why the job failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The S3 location where the vocabulary is stored. Use this URI to get the
     * contents of the vocabulary. The URI is available for a limited time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String downloadUri;

    /**
     * <p>
     * The name of the vocabulary to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary to return.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the vocabulary to return.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to return.
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
     *            The name of the vocabulary to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVocabularyResult withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @return <p>
     *         The language code of the vocabulary entries.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public GetVocabularyResult withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public GetVocabularyResult withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The processing state of the vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @return <p>
     *         The processing state of the vocabulary.
     *         </p>
     * @see VocabularyState
     */
    public String getVocabularyState() {
        return vocabularyState;
    }

    /**
     * <p>
     * The processing state of the vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param vocabularyState <p>
     *            The processing state of the vocabulary.
     *            </p>
     * @see VocabularyState
     */
    public void setVocabularyState(String vocabularyState) {
        this.vocabularyState = vocabularyState;
    }

    /**
     * <p>
     * The processing state of the vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param vocabularyState <p>
     *            The processing state of the vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public GetVocabularyResult withVocabularyState(String vocabularyState) {
        this.vocabularyState = vocabularyState;
        return this;
    }

    /**
     * <p>
     * The processing state of the vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param vocabularyState <p>
     *            The processing state of the vocabulary.
     *            </p>
     * @see VocabularyState
     */
    public void setVocabularyState(VocabularyState vocabularyState) {
        this.vocabularyState = vocabularyState.toString();
    }

    /**
     * <p>
     * The processing state of the vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param vocabularyState <p>
     *            The processing state of the vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public GetVocabularyResult withVocabularyState(VocabularyState vocabularyState) {
        this.vocabularyState = vocabularyState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time that the vocabulary was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the vocabulary was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the vocabulary was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVocabularyResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> field is <code>FAILED</code>, this
     * field contains information about why the job failed.
     * </p>
     *
     * @return <p>
     *         If the <code>VocabularyState</code> field is <code>FAILED</code>,
     *         this field contains information about why the job failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> field is <code>FAILED</code>, this
     * field contains information about why the job failed.
     * </p>
     *
     * @param failureReason <p>
     *            If the <code>VocabularyState</code> field is
     *            <code>FAILED</code>, this field contains information about why
     *            the job failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> field is <code>FAILED</code>, this
     * field contains information about why the job failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If the <code>VocabularyState</code> field is
     *            <code>FAILED</code>, this field contains information about why
     *            the job failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVocabularyResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The S3 location where the vocabulary is stored. Use this URI to get the
     * contents of the vocabulary. The URI is available for a limited time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The S3 location where the vocabulary is stored. Use this URI to
     *         get the contents of the vocabulary. The URI is available for a
     *         limited time.
     *         </p>
     */
    public String getDownloadUri() {
        return downloadUri;
    }

    /**
     * <p>
     * The S3 location where the vocabulary is stored. Use this URI to get the
     * contents of the vocabulary. The URI is available for a limited time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param downloadUri <p>
     *            The S3 location where the vocabulary is stored. Use this URI
     *            to get the contents of the vocabulary. The URI is available
     *            for a limited time.
     *            </p>
     */
    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }

    /**
     * <p>
     * The S3 location where the vocabulary is stored. Use this URI to get the
     * contents of the vocabulary. The URI is available for a limited time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param downloadUri <p>
     *            The S3 location where the vocabulary is stored. Use this URI
     *            to get the contents of the vocabulary. The URI is available
     *            for a limited time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVocabularyResult withDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
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
        if (getVocabularyState() != null)
            sb.append("VocabularyState: " + getVocabularyState() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getDownloadUri() != null)
            sb.append("DownloadUri: " + getDownloadUri());
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
                + ((getVocabularyState() == null) ? 0 : getVocabularyState().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getDownloadUri() == null) ? 0 : getDownloadUri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVocabularyResult == false)
            return false;
        GetVocabularyResult other = (GetVocabularyResult) obj;

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
        if (other.getVocabularyState() == null ^ this.getVocabularyState() == null)
            return false;
        if (other.getVocabularyState() != null
                && other.getVocabularyState().equals(this.getVocabularyState()) == false)
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
        if (other.getDownloadUri() == null ^ this.getDownloadUri() == null)
            return false;
        if (other.getDownloadUri() != null
                && other.getDownloadUri().equals(this.getDownloadUri()) == false)
            return false;
        return true;
    }
}
