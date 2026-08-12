/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains <code>GenerateAbstractiveSummary</code>, which is a required
 * parameter if you want to enable Generative call summarization in your Call
 * Analytics request.
 * </p>
 */
public class Summarization implements Serializable {
    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript
     * including important components discussed in the conversation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     * >Enabling generative call summarization</a>.
     * </p>
     */
    private Boolean generateAbstractiveSummary;

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript
     * including important components discussed in the conversation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     * >Enabling generative call summarization</a>.
     * </p>
     *
     * @return <p>
     *         Enables Generative call summarization in your Call Analytics
     *         request
     *         </p>
     *         <p>
     *         Generative call summarization provides a summary of the
     *         transcript including important components discussed in the
     *         conversation.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     *         >Enabling generative call summarization</a>.
     *         </p>
     */
    public Boolean isGenerateAbstractiveSummary() {
        return generateAbstractiveSummary;
    }

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript
     * including important components discussed in the conversation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     * >Enabling generative call summarization</a>.
     * </p>
     *
     * @return <p>
     *         Enables Generative call summarization in your Call Analytics
     *         request
     *         </p>
     *         <p>
     *         Generative call summarization provides a summary of the
     *         transcript including important components discussed in the
     *         conversation.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     *         >Enabling generative call summarization</a>.
     *         </p>
     */
    public Boolean getGenerateAbstractiveSummary() {
        return generateAbstractiveSummary;
    }

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript
     * including important components discussed in the conversation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     * >Enabling generative call summarization</a>.
     * </p>
     *
     * @param generateAbstractiveSummary <p>
     *            Enables Generative call summarization in your Call Analytics
     *            request
     *            </p>
     *            <p>
     *            Generative call summarization provides a summary of the
     *            transcript including important components discussed in the
     *            conversation.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     *            >Enabling generative call summarization</a>.
     *            </p>
     */
    public void setGenerateAbstractiveSummary(Boolean generateAbstractiveSummary) {
        this.generateAbstractiveSummary = generateAbstractiveSummary;
    }

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript
     * including important components discussed in the conversation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     * >Enabling generative call summarization</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generateAbstractiveSummary <p>
     *            Enables Generative call summarization in your Call Analytics
     *            request
     *            </p>
     *            <p>
     *            Generative call summarization provides a summary of the
     *            transcript including important components discussed in the
     *            conversation.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html"
     *            >Enabling generative call summarization</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Summarization withGenerateAbstractiveSummary(Boolean generateAbstractiveSummary) {
        this.generateAbstractiveSummary = generateAbstractiveSummary;
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
        if (getGenerateAbstractiveSummary() != null)
            sb.append("GenerateAbstractiveSummary: " + getGenerateAbstractiveSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGenerateAbstractiveSummary() == null) ? 0 : getGenerateAbstractiveSummary()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Summarization == false)
            return false;
        Summarization other = (Summarization) obj;

        if (other.getGenerateAbstractiveSummary() == null
                ^ this.getGenerateAbstractiveSummary() == null)
            return false;
        if (other.getGenerateAbstractiveSummary() != null
                && other.getGenerateAbstractiveSummary().equals(
                        this.getGenerateAbstractiveSummary()) == false)
            return false;
        return true;
    }
}
