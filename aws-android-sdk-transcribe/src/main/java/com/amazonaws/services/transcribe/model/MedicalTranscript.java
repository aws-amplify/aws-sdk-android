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
 * Provides you with the Amazon S3 URI you can use to access your transcript.
 * </p>
 */
public class MedicalTranscript implements Serializable {
    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access
     * or download your transcript.
     * </p>
     * <p>
     * Note that this is the Amazon S3 location you specified in your request
     * using the <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String transcriptFileUri;

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access
     * or download your transcript.
     * </p>
     * <p>
     * Note that this is the Amazon S3 location you specified in your request
     * using the <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location of your transcript. You can use this URI
     *         to access or download your transcript.
     *         </p>
     *         <p>
     *         Note that this is the Amazon S3 location you specified in your
     *         request using the <code>OutputBucketName</code> parameter.
     *         </p>
     */
    public String getTranscriptFileUri() {
        return transcriptFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access
     * or download your transcript.
     * </p>
     * <p>
     * Note that this is the Amazon S3 location you specified in your request
     * using the <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param transcriptFileUri <p>
     *            The Amazon S3 location of your transcript. You can use this
     *            URI to access or download your transcript.
     *            </p>
     *            <p>
     *            Note that this is the Amazon S3 location you specified in your
     *            request using the <code>OutputBucketName</code> parameter.
     *            </p>
     */
    public void setTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access
     * or download your transcript.
     * </p>
     * <p>
     * Note that this is the Amazon S3 location you specified in your request
     * using the <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param transcriptFileUri <p>
     *            The Amazon S3 location of your transcript. You can use this
     *            URI to access or download your transcript.
     *            </p>
     *            <p>
     *            Note that this is the Amazon S3 location you specified in your
     *            request using the <code>OutputBucketName</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalTranscript withTranscriptFileUri(String transcriptFileUri) {
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

        if (obj instanceof MedicalTranscript == false)
            return false;
        MedicalTranscript other = (MedicalTranscript) obj;

        if (other.getTranscriptFileUri() == null ^ this.getTranscriptFileUri() == null)
            return false;
        if (other.getTranscriptFileUri() != null
                && other.getTranscriptFileUri().equals(this.getTranscriptFileUri()) == false)
            return false;
        return true;
    }
}
