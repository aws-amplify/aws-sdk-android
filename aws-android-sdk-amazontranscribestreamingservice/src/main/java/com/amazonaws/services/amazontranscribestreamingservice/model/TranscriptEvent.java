/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazontranscribestreamingservice.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a set of transcription results from the server to the client. It
 * contains one or more segments of the transcription.
 * </p>
 */
public class TranscriptEvent implements Serializable {
    /**
     * <p>
     * The transcription of the audio stream. The transcription is composed of
     * all of the items in the results list.
     * </p>
     */
    private Transcript transcript;

    /**
     * <p>
     * The transcription of the audio stream. The transcription is composed of
     * all of the items in the results list.
     * </p>
     *
     * @return <p>
     *         The transcription of the audio stream. The transcription is
     *         composed of all of the items in the results list.
     *         </p>
     */
    public Transcript getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * The transcription of the audio stream. The transcription is composed of
     * all of the items in the results list.
     * </p>
     *
     * @param transcript <p>
     *            The transcription of the audio stream. The transcription is
     *            composed of all of the items in the results list.
     *            </p>
     */
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * The transcription of the audio stream. The transcription is composed of
     * all of the items in the results list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            The transcription of the audio stream. The transcription is
     *            composed of all of the items in the results list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptEvent withTranscript(Transcript transcript) {
        this.transcript = transcript;
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
        if (getTranscript() != null)
            sb.append("Transcript: " + getTranscript());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptEvent == false)
            return false;
        TranscriptEvent other = (TranscriptEvent) obj;

        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null
                && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        return true;
    }
}
