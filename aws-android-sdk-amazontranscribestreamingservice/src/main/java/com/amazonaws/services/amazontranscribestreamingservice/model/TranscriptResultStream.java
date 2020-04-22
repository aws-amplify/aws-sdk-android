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
 * Represents the transcription result stream from Amazon Transcribe to your
 * application.
 * </p>
 */
public class TranscriptResultStream implements Serializable {
    /**
     * <p>
     * A portion of the transcription of the audio stream. Events are sent
     * periodically from Amazon Transcribe to your application. The event can be
     * a partial transcription of a section of the audio stream, or it can be
     * the entire transcription of that portion of the audio stream.
     * </p>
     */
    private TranscriptEvent transcriptEvent;

    /**
     * <p>
     * A client error occurred when the stream was created. Check the parameters
     * of the request and try your request again.
     * </p>
     */
    private BadRequestException badRequestException;

    /**
     * <p>
     * Your client has exceeded one of the Amazon Transcribe limits, typically
     * the limit on audio length. Break your audio stream into smaller chunks
     * and try your request again.
     * </p>
     */
    private LimitExceededException limitExceededException;

    /**
     * <p>
     * A problem occurred while processing the audio. Amazon Transcribe
     * terminated processing.
     * </p>
     */
    private InternalFailureException internalFailureException;

    /**
     * <p>
     * A new stream started with the same session ID. The current stream has
     * been terminated.
     * </p>
     */
    private ConflictException conflictException;

    /**
     * <p>
     * Service is currently unavailable. Try your request later.
     * </p>
     */
    private ServiceUnavailableException serviceUnavailableException;

    /**
     * <p>
     * A portion of the transcription of the audio stream. Events are sent
     * periodically from Amazon Transcribe to your application. The event can be
     * a partial transcription of a section of the audio stream, or it can be
     * the entire transcription of that portion of the audio stream.
     * </p>
     *
     * @return <p>
     *         A portion of the transcription of the audio stream. Events are
     *         sent periodically from Amazon Transcribe to your application. The
     *         event can be a partial transcription of a section of the audio
     *         stream, or it can be the entire transcription of that portion of
     *         the audio stream.
     *         </p>
     */
    public TranscriptEvent getTranscriptEvent() {
        return transcriptEvent;
    }

    /**
     * <p>
     * A portion of the transcription of the audio stream. Events are sent
     * periodically from Amazon Transcribe to your application. The event can be
     * a partial transcription of a section of the audio stream, or it can be
     * the entire transcription of that portion of the audio stream.
     * </p>
     *
     * @param transcriptEvent <p>
     *            A portion of the transcription of the audio stream. Events are
     *            sent periodically from Amazon Transcribe to your application.
     *            The event can be a partial transcription of a section of the
     *            audio stream, or it can be the entire transcription of that
     *            portion of the audio stream.
     *            </p>
     */
    public void setTranscriptEvent(TranscriptEvent transcriptEvent) {
        this.transcriptEvent = transcriptEvent;
    }

    /**
     * <p>
     * A portion of the transcription of the audio stream. Events are sent
     * periodically from Amazon Transcribe to your application. The event can be
     * a partial transcription of a section of the audio stream, or it can be
     * the entire transcription of that portion of the audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptEvent <p>
     *            A portion of the transcription of the audio stream. Events are
     *            sent periodically from Amazon Transcribe to your application.
     *            The event can be a partial transcription of a section of the
     *            audio stream, or it can be the entire transcription of that
     *            portion of the audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptResultStream withTranscriptEvent(TranscriptEvent transcriptEvent) {
        this.transcriptEvent = transcriptEvent;
        return this;
    }

    /**
     * <p>
     * A client error occurred when the stream was created. Check the parameters
     * of the request and try your request again.
     * </p>
     *
     * @return <p>
     *         A client error occurred when the stream was created. Check the
     *         parameters of the request and try your request again.
     *         </p>
     */
    public BadRequestException getBadRequestException() {
        return badRequestException;
    }

    /**
     * <p>
     * A client error occurred when the stream was created. Check the parameters
     * of the request and try your request again.
     * </p>
     *
     * @param badRequestException <p>
     *            A client error occurred when the stream was created. Check the
     *            parameters of the request and try your request again.
     *            </p>
     */
    public void setBadRequestException(BadRequestException badRequestException) {
        this.badRequestException = badRequestException;
    }

    /**
     * <p>
     * A client error occurred when the stream was created. Check the parameters
     * of the request and try your request again.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param badRequestException <p>
     *            A client error occurred when the stream was created. Check the
     *            parameters of the request and try your request again.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptResultStream withBadRequestException(BadRequestException badRequestException) {
        this.badRequestException = badRequestException;
        return this;
    }

    /**
     * <p>
     * Your client has exceeded one of the Amazon Transcribe limits, typically
     * the limit on audio length. Break your audio stream into smaller chunks
     * and try your request again.
     * </p>
     *
     * @return <p>
     *         Your client has exceeded one of the Amazon Transcribe limits,
     *         typically the limit on audio length. Break your audio stream into
     *         smaller chunks and try your request again.
     *         </p>
     */
    public LimitExceededException getLimitExceededException() {
        return limitExceededException;
    }

    /**
     * <p>
     * Your client has exceeded one of the Amazon Transcribe limits, typically
     * the limit on audio length. Break your audio stream into smaller chunks
     * and try your request again.
     * </p>
     *
     * @param limitExceededException <p>
     *            Your client has exceeded one of the Amazon Transcribe limits,
     *            typically the limit on audio length. Break your audio stream
     *            into smaller chunks and try your request again.
     *            </p>
     */
    public void setLimitExceededException(LimitExceededException limitExceededException) {
        this.limitExceededException = limitExceededException;
    }

    /**
     * <p>
     * Your client has exceeded one of the Amazon Transcribe limits, typically
     * the limit on audio length. Break your audio stream into smaller chunks
     * and try your request again.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limitExceededException <p>
     *            Your client has exceeded one of the Amazon Transcribe limits,
     *            typically the limit on audio length. Break your audio stream
     *            into smaller chunks and try your request again.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptResultStream withLimitExceededException(
            LimitExceededException limitExceededException) {
        this.limitExceededException = limitExceededException;
        return this;
    }

    /**
     * <p>
     * A problem occurred while processing the audio. Amazon Transcribe
     * terminated processing.
     * </p>
     *
     * @return <p>
     *         A problem occurred while processing the audio. Amazon Transcribe
     *         terminated processing.
     *         </p>
     */
    public InternalFailureException getInternalFailureException() {
        return internalFailureException;
    }

    /**
     * <p>
     * A problem occurred while processing the audio. Amazon Transcribe
     * terminated processing.
     * </p>
     *
     * @param internalFailureException <p>
     *            A problem occurred while processing the audio. Amazon
     *            Transcribe terminated processing.
     *            </p>
     */
    public void setInternalFailureException(InternalFailureException internalFailureException) {
        this.internalFailureException = internalFailureException;
    }

    /**
     * <p>
     * A problem occurred while processing the audio. Amazon Transcribe
     * terminated processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param internalFailureException <p>
     *            A problem occurred while processing the audio. Amazon
     *            Transcribe terminated processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptResultStream withInternalFailureException(
            InternalFailureException internalFailureException) {
        this.internalFailureException = internalFailureException;
        return this;
    }

    /**
     * <p>
     * A new stream started with the same session ID. The current stream has
     * been terminated.
     * </p>
     *
     * @return <p>
     *         A new stream started with the same session ID. The current stream
     *         has been terminated.
     *         </p>
     */
    public ConflictException getConflictException() {
        return conflictException;
    }

    /**
     * <p>
     * A new stream started with the same session ID. The current stream has
     * been terminated.
     * </p>
     *
     * @param conflictException <p>
     *            A new stream started with the same session ID. The current
     *            stream has been terminated.
     *            </p>
     */
    public void setConflictException(ConflictException conflictException) {
        this.conflictException = conflictException;
    }

    /**
     * <p>
     * A new stream started with the same session ID. The current stream has
     * been terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conflictException <p>
     *            A new stream started with the same session ID. The current
     *            stream has been terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptResultStream withConflictException(ConflictException conflictException) {
        this.conflictException = conflictException;
        return this;
    }

    /**
     * <p>
     * Service is currently unavailable. Try your request later.
     * </p>
     *
     * @return <p>
     *         Service is currently unavailable. Try your request later.
     *         </p>
     */
    public ServiceUnavailableException getServiceUnavailableException() {
        return serviceUnavailableException;
    }

    /**
     * <p>
     * Service is currently unavailable. Try your request later.
     * </p>
     *
     * @param serviceUnavailableException <p>
     *            Service is currently unavailable. Try your request later.
     *            </p>
     */
    public void setServiceUnavailableException(
            ServiceUnavailableException serviceUnavailableException) {
        this.serviceUnavailableException = serviceUnavailableException;
    }

    /**
     * <p>
     * Service is currently unavailable. Try your request later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUnavailableException <p>
     *            Service is currently unavailable. Try your request later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptResultStream withServiceUnavailableException(
            ServiceUnavailableException serviceUnavailableException) {
        this.serviceUnavailableException = serviceUnavailableException;
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
        if (getTranscriptEvent() != null)
            sb.append("TranscriptEvent: " + getTranscriptEvent() + ",");
        if (getBadRequestException() != null)
            sb.append("BadRequestException: " + getBadRequestException() + ",");
        if (getLimitExceededException() != null)
            sb.append("LimitExceededException: " + getLimitExceededException() + ",");
        if (getInternalFailureException() != null)
            sb.append("InternalFailureException: " + getInternalFailureException() + ",");
        if (getConflictException() != null)
            sb.append("ConflictException: " + getConflictException() + ",");
        if (getServiceUnavailableException() != null)
            sb.append("ServiceUnavailableException: " + getServiceUnavailableException());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptEvent() == null) ? 0 : getTranscriptEvent().hashCode());
        hashCode = prime * hashCode
                + ((getBadRequestException() == null) ? 0 : getBadRequestException().hashCode());
        hashCode = prime
                * hashCode
                + ((getLimitExceededException() == null) ? 0 : getLimitExceededException()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInternalFailureException() == null) ? 0 : getInternalFailureException()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConflictException() == null) ? 0 : getConflictException().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUnavailableException() == null) ? 0
                        : getServiceUnavailableException().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptResultStream == false)
            return false;
        TranscriptResultStream other = (TranscriptResultStream) obj;

        if (other.getTranscriptEvent() == null ^ this.getTranscriptEvent() == null)
            return false;
        if (other.getTranscriptEvent() != null
                && other.getTranscriptEvent().equals(this.getTranscriptEvent()) == false)
            return false;
        if (other.getBadRequestException() == null ^ this.getBadRequestException() == null)
            return false;
        if (other.getBadRequestException() != null
                && other.getBadRequestException().equals(this.getBadRequestException()) == false)
            return false;
        if (other.getLimitExceededException() == null ^ this.getLimitExceededException() == null)
            return false;
        if (other.getLimitExceededException() != null
                && other.getLimitExceededException().equals(this.getLimitExceededException()) == false)
            return false;
        if (other.getInternalFailureException() == null
                ^ this.getInternalFailureException() == null)
            return false;
        if (other.getInternalFailureException() != null
                && other.getInternalFailureException().equals(this.getInternalFailureException()) == false)
            return false;
        if (other.getConflictException() == null ^ this.getConflictException() == null)
            return false;
        if (other.getConflictException() != null
                && other.getConflictException().equals(this.getConflictException()) == false)
            return false;
        if (other.getServiceUnavailableException() == null
                ^ this.getServiceUnavailableException() == null)
            return false;
        if (other.getServiceUnavailableException() != null
                && other.getServiceUnavailableException().equals(
                        this.getServiceUnavailableException()) == false)
            return false;
        return true;
    }
}
