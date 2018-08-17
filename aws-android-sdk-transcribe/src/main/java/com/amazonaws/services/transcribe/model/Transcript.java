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

/**
 * <p>
 * Identifies the location of a transcription.
 * </p>
 */
public class Transcript implements Serializable {
    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * Use this URI to access the transcription. If you specified an S3 bucket
     * in the <code>OutputBucketName</code> field when you created the job, this
     * is the URI of that bucket. If you chose to store the transcription in
     * Amazon Transcribe, this is a shareable URL that provides secure access to
     * that location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String transcriptFileUri;

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * Use this URI to access the transcription. If you specified an S3 bucket
     * in the <code>OutputBucketName</code> field when you created the job, this
     * is the URI of that bucket. If you chose to store the transcription in
     * Amazon Transcribe, this is a shareable URL that provides secure access to
     * that location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The location where the transcription is stored.
     *         </p>
     *         <p>
     *         Use this URI to access the transcription. If you specified an S3
     *         bucket in the <code>OutputBucketName</code> field when you
     *         created the job, this is the URI of that bucket. If you chose to
     *         store the transcription in Amazon Transcribe, this is a shareable
     *         URL that provides secure access to that location.
     *         </p>
     */
    public String getTranscriptFileUri() {
        return transcriptFileUri;
    }

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * Use this URI to access the transcription. If you specified an S3 bucket
     * in the <code>OutputBucketName</code> field when you created the job, this
     * is the URI of that bucket. If you chose to store the transcription in
     * Amazon Transcribe, this is a shareable URL that provides secure access to
     * that location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param transcriptFileUri <p>
     *            The location where the transcription is stored.
     *            </p>
     *            <p>
     *            Use this URI to access the transcription. If you specified an
     *            S3 bucket in the <code>OutputBucketName</code> field when you
     *            created the job, this is the URI of that bucket. If you chose
     *            to store the transcription in Amazon Transcribe, this is a
     *            shareable URL that provides secure access to that location.
     *            </p>
     */
    public void setTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
    }

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * Use this URI to access the transcription. If you specified an S3 bucket
     * in the <code>OutputBucketName</code> field when you created the job, this
     * is the URI of that bucket. If you chose to store the transcription in
     * Amazon Transcribe, this is a shareable URL that provides secure access to
     * that location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param transcriptFileUri <p>
     *            The location where the transcription is stored.
     *            </p>
     *            <p>
     *            Use this URI to access the transcription. If you specified an
     *            S3 bucket in the <code>OutputBucketName</code> field when you
     *            created the job, this is the URI of that bucket. If you chose
     *            to store the transcription in Amazon Transcribe, this is a
     *            shareable URL that provides secure access to that location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transcript withTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
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
        if (getTranscriptFileUri() != null)
            sb.append("TranscriptFileUri: " + getTranscriptFileUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptFileUri() == null) ? 0 : getTranscriptFileUri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transcript == false)
            return false;
        Transcript other = (Transcript) obj;

        if (other.getTranscriptFileUri() == null ^ this.getTranscriptFileUri() == null)
            return false;
        if (other.getTranscriptFileUri() != null
                && other.getTranscriptFileUri().equals(this.getTranscriptFileUri()) == false)
            return false;
        return true;
    }
}
