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

package com.amazonaws.services.transcribestreaming.model;

import java.io.Serializable;

/**
 * <p>
 * The result of transcribing a portion of the input audio stream.
 * </p>
 */
public class Result implements Serializable {
    /**
     * <p>
     * A unique identifier for the result.
     * </p>
     */
    private String resultId;

    /**
     * <p>
     * The offset in seconds from the beginning of the audio stream to the
     * beginning of the result.
     * </p>
     */
    private Double startTime;

    /**
     * <p>
     * The offset in seconds from the beginning of the audio stream to the end
     * of the result.
     * </p>
     */
    private Double endTime;

    /**
     * <p>
     * Amazon Transcribe divides the incoming audio stream into segments at
     * natural points in the audio. Transcription results are returned based on
     * these segments.
     * </p>
     * <p>
     * The <code>IsPartial</code> field is <code>true</code> to indicate that
     * Amazon Transcribe has additional transcription data to send,
     * <code>false</code> to indicate that this is the last transcription result
     * for the segment.
     * </p>
     */
    private Boolean isPartial;

    /**
     * <p>
     * A list of possible transcriptions for the audio. Each alternative
     * typically contains one <code>item</code> that contains the result of the
     * transcription.
     * </p>
     */
    private java.util.List<Alternative> alternatives;

    /**
     * <p>
     * A unique identifier for the result.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the result.
     *         </p>
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * <p>
     * A unique identifier for the result.
     * </p>
     *
     * @param resultId <p>
     *            A unique identifier for the result.
     *            </p>
     */
    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * A unique identifier for the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultId <p>
     *            A unique identifier for the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Result withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * <p>
     * The offset in seconds from the beginning of the audio stream to the
     * beginning of the result.
     * </p>
     *
     * @return <p>
     *         The offset in seconds from the beginning of the audio stream to
     *         the beginning of the result.
     *         </p>
     */
    public Double getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The offset in seconds from the beginning of the audio stream to the
     * beginning of the result.
     * </p>
     *
     * @param startTime <p>
     *            The offset in seconds from the beginning of the audio stream
     *            to the beginning of the result.
     *            </p>
     */
    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The offset in seconds from the beginning of the audio stream to the
     * beginning of the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The offset in seconds from the beginning of the audio stream
     *            to the beginning of the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Result withStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The offset in seconds from the beginning of the audio stream to the end
     * of the result.
     * </p>
     *
     * @return <p>
     *         The offset in seconds from the beginning of the audio stream to
     *         the end of the result.
     *         </p>
     */
    public Double getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The offset in seconds from the beginning of the audio stream to the end
     * of the result.
     * </p>
     *
     * @param endTime <p>
     *            The offset in seconds from the beginning of the audio stream
     *            to the end of the result.
     *            </p>
     */
    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The offset in seconds from the beginning of the audio stream to the end
     * of the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The offset in seconds from the beginning of the audio stream
     *            to the end of the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Result withEndTime(Double endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Amazon Transcribe divides the incoming audio stream into segments at
     * natural points in the audio. Transcription results are returned based on
     * these segments.
     * </p>
     * <p>
     * The <code>IsPartial</code> field is <code>true</code> to indicate that
     * Amazon Transcribe has additional transcription data to send,
     * <code>false</code> to indicate that this is the last transcription result
     * for the segment.
     * </p>
     *
     * @return <p>
     *         Amazon Transcribe divides the incoming audio stream into segments
     *         at natural points in the audio. Transcription results are
     *         returned based on these segments.
     *         </p>
     *         <p>
     *         The <code>IsPartial</code> field is <code>true</code> to indicate
     *         that Amazon Transcribe has additional transcription data to send,
     *         <code>false</code> to indicate that this is the last
     *         transcription result for the segment.
     *         </p>
     */
    public Boolean isIsPartial() {
        return isPartial;
    }

    /**
     * <p>
     * Amazon Transcribe divides the incoming audio stream into segments at
     * natural points in the audio. Transcription results are returned based on
     * these segments.
     * </p>
     * <p>
     * The <code>IsPartial</code> field is <code>true</code> to indicate that
     * Amazon Transcribe has additional transcription data to send,
     * <code>false</code> to indicate that this is the last transcription result
     * for the segment.
     * </p>
     *
     * @return <p>
     *         Amazon Transcribe divides the incoming audio stream into segments
     *         at natural points in the audio. Transcription results are
     *         returned based on these segments.
     *         </p>
     *         <p>
     *         The <code>IsPartial</code> field is <code>true</code> to indicate
     *         that Amazon Transcribe has additional transcription data to send,
     *         <code>false</code> to indicate that this is the last
     *         transcription result for the segment.
     *         </p>
     */
    public Boolean getIsPartial() {
        return isPartial;
    }

    /**
     * <p>
     * Amazon Transcribe divides the incoming audio stream into segments at
     * natural points in the audio. Transcription results are returned based on
     * these segments.
     * </p>
     * <p>
     * The <code>IsPartial</code> field is <code>true</code> to indicate that
     * Amazon Transcribe has additional transcription data to send,
     * <code>false</code> to indicate that this is the last transcription result
     * for the segment.
     * </p>
     *
     * @param isPartial <p>
     *            Amazon Transcribe divides the incoming audio stream into
     *            segments at natural points in the audio. Transcription results
     *            are returned based on these segments.
     *            </p>
     *            <p>
     *            The <code>IsPartial</code> field is <code>true</code> to
     *            indicate that Amazon Transcribe has additional transcription
     *            data to send, <code>false</code> to indicate that this is the
     *            last transcription result for the segment.
     *            </p>
     */
    public void setIsPartial(Boolean isPartial) {
        this.isPartial = isPartial;
    }

    /**
     * <p>
     * Amazon Transcribe divides the incoming audio stream into segments at
     * natural points in the audio. Transcription results are returned based on
     * these segments.
     * </p>
     * <p>
     * The <code>IsPartial</code> field is <code>true</code> to indicate that
     * Amazon Transcribe has additional transcription data to send,
     * <code>false</code> to indicate that this is the last transcription result
     * for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isPartial <p>
     *            Amazon Transcribe divides the incoming audio stream into
     *            segments at natural points in the audio. Transcription results
     *            are returned based on these segments.
     *            </p>
     *            <p>
     *            The <code>IsPartial</code> field is <code>true</code> to
     *            indicate that Amazon Transcribe has additional transcription
     *            data to send, <code>false</code> to indicate that this is the
     *            last transcription result for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Result withIsPartial(Boolean isPartial) {
        this.isPartial = isPartial;
        return this;
    }

    /**
     * <p>
     * A list of possible transcriptions for the audio. Each alternative
     * typically contains one <code>item</code> that contains the result of the
     * transcription.
     * </p>
     *
     * @return <p>
     *         A list of possible transcriptions for the audio. Each alternative
     *         typically contains one <code>item</code> that contains the result
     *         of the transcription.
     *         </p>
     */
    public java.util.List<Alternative> getAlternatives() {
        return alternatives;
    }

    /**
     * <p>
     * A list of possible transcriptions for the audio. Each alternative
     * typically contains one <code>item</code> that contains the result of the
     * transcription.
     * </p>
     *
     * @param alternatives <p>
     *            A list of possible transcriptions for the audio. Each
     *            alternative typically contains one <code>item</code> that
     *            contains the result of the transcription.
     *            </p>
     */
    public void setAlternatives(java.util.Collection<Alternative> alternatives) {
        if (alternatives == null) {
            this.alternatives = null;
            return;
        }

        this.alternatives = new java.util.ArrayList<Alternative>(alternatives);
    }

    /**
     * <p>
     * A list of possible transcriptions for the audio. Each alternative
     * typically contains one <code>item</code> that contains the result of the
     * transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alternatives <p>
     *            A list of possible transcriptions for the audio. Each
     *            alternative typically contains one <code>item</code> that
     *            contains the result of the transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Result withAlternatives(Alternative... alternatives) {
        if (getAlternatives() == null) {
            this.alternatives = new java.util.ArrayList<Alternative>(alternatives.length);
        }
        for (Alternative value : alternatives) {
            this.alternatives.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of possible transcriptions for the audio. Each alternative
     * typically contains one <code>item</code> that contains the result of the
     * transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alternatives <p>
     *            A list of possible transcriptions for the audio. Each
     *            alternative typically contains one <code>item</code> that
     *            contains the result of the transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Result withAlternatives(java.util.Collection<Alternative> alternatives) {
        setAlternatives(alternatives);
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
        if (getResultId() != null)
            sb.append("ResultId: " + getResultId() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getIsPartial() != null)
            sb.append("IsPartial: " + getIsPartial() + ",");
        if (getAlternatives() != null)
            sb.append("Alternatives: " + getAlternatives());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getIsPartial() == null) ? 0 : getIsPartial().hashCode());
        hashCode = prime * hashCode
                + ((getAlternatives() == null) ? 0 : getAlternatives().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Result == false)
            return false;
        Result other = (Result) obj;

        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getIsPartial() == null ^ this.getIsPartial() == null)
            return false;
        if (other.getIsPartial() != null
                && other.getIsPartial().equals(this.getIsPartial()) == false)
            return false;
        if (other.getAlternatives() == null ^ this.getAlternatives() == null)
            return false;
        if (other.getAlternatives() != null
                && other.getAlternatives().equals(this.getAlternatives()) == false)
            return false;
        return true;
    }
}
