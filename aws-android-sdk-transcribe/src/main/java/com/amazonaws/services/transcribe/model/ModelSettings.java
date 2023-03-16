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
 * Provides the name of the custom language model that was included in the
 * specified transcription job.
 * </p>
 * <p>
 * Only use <code>ModelSettings</code> with the <code>LanguageModelName</code>
 * sub-parameter if you're <b>not</b> using automatic language identification (
 * <code/>). If using <code>LanguageIdSettings</code> in your request, this
 * parameter contains a <code>LanguageModelName</code> sub-parameter.
 * </p>
 */
public class ModelSettings implements Serializable {
    /**
     * <p>
     * The name of the custom language model you want to use when processing
     * your transcription job. Note that custom language model names are case
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
     * The name of the custom language model you want to use when processing
     * your transcription job. Note that custom language model names are case
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
     *         processing your transcription job. Note that custom language
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
     * your transcription job. Note that custom language model names are case
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
     *            processing your transcription job. Note that custom language
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
     * your transcription job. Note that custom language model names are case
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
     *            processing your transcription job. Note that custom language
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
    public ModelSettings withLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
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
        if (getLanguageModelName() != null)
            sb.append("LanguageModelName: " + getLanguageModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageModelName() == null) ? 0 : getLanguageModelName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelSettings == false)
            return false;
        ModelSettings other = (ModelSettings) obj;

        if (other.getLanguageModelName() == null ^ this.getLanguageModelName() == null)
            return false;
        if (other.getLanguageModelName() != null
                && other.getLanguageModelName().equals(this.getLanguageModelName()) == false)
            return false;
        return true;
    }
}
