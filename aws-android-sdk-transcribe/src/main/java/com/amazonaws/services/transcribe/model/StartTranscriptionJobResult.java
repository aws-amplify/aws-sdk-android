/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class StartTranscriptionJobResult implements Serializable {
    /**
     * <p>
     * An object containing details of the asynchronous transcription job.
     * </p>
     */
    private TranscriptionJob transcriptionJob;

    /**
     * <p>
     * An object containing details of the asynchronous transcription job.
     * </p>
     *
     * @return <p>
     *         An object containing details of the asynchronous transcription
     *         job.
     *         </p>
     */
    public TranscriptionJob getTranscriptionJob() {
        return transcriptionJob;
    }

    /**
     * <p>
     * An object containing details of the asynchronous transcription job.
     * </p>
     *
     * @param transcriptionJob <p>
     *            An object containing details of the asynchronous transcription
     *            job.
     *            </p>
     */
    public void setTranscriptionJob(TranscriptionJob transcriptionJob) {
        this.transcriptionJob = transcriptionJob;
    }

    /**
     * <p>
     * An object containing details of the asynchronous transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptionJob <p>
     *            An object containing details of the asynchronous transcription
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobResult withTranscriptionJob(TranscriptionJob transcriptionJob) {
        this.transcriptionJob = transcriptionJob;
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
        if (getTranscriptionJob() != null)
            sb.append("TranscriptionJob: " + getTranscriptionJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptionJob() == null) ? 0 : getTranscriptionJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTranscriptionJobResult == false)
            return false;
        StartTranscriptionJobResult other = (StartTranscriptionJobResult) obj;

        if (other.getTranscriptionJob() == null ^ this.getTranscriptionJob() == null)
            return false;
        if (other.getTranscriptionJob() != null
                && other.getTranscriptionJob().equals(this.getTranscriptionJob()) == false)
            return false;
        return true;
    }
}
