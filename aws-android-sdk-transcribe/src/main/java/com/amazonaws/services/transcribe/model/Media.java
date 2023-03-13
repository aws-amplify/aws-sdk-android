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
 * Describes the Amazon S3 location of the media file you want to use in your
 * request.
 * </p>
 * <p>
 * For information on supported media formats, refer to the <a href=
 * "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
 * >MediaFormat</a> parameter or the <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
 * >Media formats</a> section in the Amazon S3 Developer Guide.
 * </p>
 */
public class Media implements Serializable {
    /**
     * <p>
     * The Amazon S3 location of the media file you want to transcribe. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be
     * located in the same Amazon Web Services Region where you're making your
     * transcription request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String mediaFileUri;

    /**
     * <p>
     * The Amazon S3 location of the media file you want to redact. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be
     * located in the same Amazon Web Services Region where you're making your
     * transcription request.
     * </p>
     * <important>
     * <p>
     * <code>RedactedMediaFileUri</code> produces a redacted audio file in
     * addition to a redacted transcript. It is only supported for Call
     * Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String redactedMediaFileUri;

    /**
     * <p>
     * The Amazon S3 location of the media file you want to transcribe. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be
     * located in the same Amazon Web Services Region where you're making your
     * transcription request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the media file you want to transcribe.
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note that the Amazon S3 bucket that contains your input media
     *         must be located in the same Amazon Web Services Region where
     *         you're making your transcription request.
     *         </p>
     */
    public String getMediaFileUri() {
        return mediaFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to transcribe. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be
     * located in the same Amazon Web Services Region where you're making your
     * transcription request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param mediaFileUri <p>
     *            The Amazon S3 location of the media file you want to
     *            transcribe. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Note that the Amazon S3 bucket that contains your input media
     *            must be located in the same Amazon Web Services Region where
     *            you're making your transcription request.
     *            </p>
     */
    public void setMediaFileUri(String mediaFileUri) {
        this.mediaFileUri = mediaFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to transcribe. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be
     * located in the same Amazon Web Services Region where you're making your
     * transcription request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param mediaFileUri <p>
     *            The Amazon S3 location of the media file you want to
     *            transcribe. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Note that the Amazon S3 bucket that contains your input media
     *            must be located in the same Amazon Web Services Region where
     *            you're making your transcription request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Media withMediaFileUri(String mediaFileUri) {
        this.mediaFileUri = mediaFileUri;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to redact. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be
     * located in the same Amazon Web Services Region where you're making your
     * transcription request.
     * </p>
     * <important>
     * <p>
     * <code>RedactedMediaFileUri</code> produces a redacted audio file in
     * addition to a redacted transcript. It is only supported for Call
     * Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the media file you want to redact. For
     *         example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note that the Amazon S3 bucket that contains your input media
     *         must be located in the same Amazon Web Services Region where
     *         you're making your transcription request.
     *         </p>
     *         <important>
     *         <p>
     *         <code>RedactedMediaFileUri</code> produces a redacted audio file
     *         in addition to a redacted transcript. It is only supported for
     *         Call Analytics (<code>StartCallAnalyticsJob</code>) transcription
     *         requests.
     *         </p>
     *         </important>
     */
    public String getRedactedMediaFileUri() {
        return redactedMediaFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to redact. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be
     * located in the same Amazon Web Services Region where you're making your
     * transcription request.
     * </p>
     * <important>
     * <p>
     * <code>RedactedMediaFileUri</code> produces a redacted audio file in
     * addition to a redacted transcript. It is only supported for Call
     * Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param redactedMediaFileUri <p>
     *            The Amazon S3 location of the media file you want to redact.
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Note that the Amazon S3 bucket that contains your input media
     *            must be located in the same Amazon Web Services Region where
     *            you're making your transcription request.
     *            </p>
     *            <important>
     *            <p>
     *            <code>RedactedMediaFileUri</code> produces a redacted audio
     *            file in addition to a redacted transcript. It is only
     *            supported for Call Analytics (
     *            <code>StartCallAnalyticsJob</code>) transcription requests.
     *            </p>
     *            </important>
     */
    public void setRedactedMediaFileUri(String redactedMediaFileUri) {
        this.redactedMediaFileUri = redactedMediaFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to redact. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be
     * located in the same Amazon Web Services Region where you're making your
     * transcription request.
     * </p>
     * <important>
     * <p>
     * <code>RedactedMediaFileUri</code> produces a redacted audio file in
     * addition to a redacted transcript. It is only supported for Call
     * Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param redactedMediaFileUri <p>
     *            The Amazon S3 location of the media file you want to redact.
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Note that the Amazon S3 bucket that contains your input media
     *            must be located in the same Amazon Web Services Region where
     *            you're making your transcription request.
     *            </p>
     *            <important>
     *            <p>
     *            <code>RedactedMediaFileUri</code> produces a redacted audio
     *            file in addition to a redacted transcript. It is only
     *            supported for Call Analytics (
     *            <code>StartCallAnalyticsJob</code>) transcription requests.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Media withRedactedMediaFileUri(String redactedMediaFileUri) {
        this.redactedMediaFileUri = redactedMediaFileUri;
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
        if (getMediaFileUri() != null)
            sb.append("MediaFileUri: " + getMediaFileUri() + ",");
        if (getRedactedMediaFileUri() != null)
            sb.append("RedactedMediaFileUri: " + getRedactedMediaFileUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMediaFileUri() == null) ? 0 : getMediaFileUri().hashCode());
        hashCode = prime * hashCode
                + ((getRedactedMediaFileUri() == null) ? 0 : getRedactedMediaFileUri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Media == false)
            return false;
        Media other = (Media) obj;

        if (other.getMediaFileUri() == null ^ this.getMediaFileUri() == null)
            return false;
        if (other.getMediaFileUri() != null
                && other.getMediaFileUri().equals(this.getMediaFileUri()) == false)
            return false;
        if (other.getRedactedMediaFileUri() == null ^ this.getRedactedMediaFileUri() == null)
            return false;
        if (other.getRedactedMediaFileUri() != null
                && other.getRedactedMediaFileUri().equals(this.getRedactedMediaFileUri()) == false)
            return false;
        return true;
    }
}
