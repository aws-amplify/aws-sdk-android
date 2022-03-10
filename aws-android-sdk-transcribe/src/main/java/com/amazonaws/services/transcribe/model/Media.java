/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the input media file in a transcription request.
 * </p>
 */
public class Media implements Serializable {
    /**
     * <p>
     * The S3 object location of the input media file. The URI must be in the
     * same region as the API endpoint that you are calling. The general form
     * is:
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/keyprefix/objectkey</code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/example.flac</code>
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/mediafiles/example.flac</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     * >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String mediaFileUri;

    /**
     * <p>
     * The S3 object location for your redacted output media file. This is only
     * supported for call analytics jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String redactedMediaFileUri;

    /**
     * <p>
     * The S3 object location of the input media file. The URI must be in the
     * same region as the API endpoint that you are calling. The general form
     * is:
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/keyprefix/objectkey</code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/example.flac</code>
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/mediafiles/example.flac</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     * >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The S3 object location of the input media file. The URI must be
     *         in the same region as the API endpoint that you are calling. The
     *         general form is:
     *         </p>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/keyprefix/objectkey</code>
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/example.flac</code>
     *         </p>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/mediafiles/example.flac</code>
     *         </p>
     *         <p>
     *         For more information about S3 object names, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     *         >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     *         </p>
     */
    public String getMediaFileUri() {
        return mediaFileUri;
    }

    /**
     * <p>
     * The S3 object location of the input media file. The URI must be in the
     * same region as the API endpoint that you are calling. The general form
     * is:
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/keyprefix/objectkey</code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/example.flac</code>
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/mediafiles/example.flac</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     * >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param mediaFileUri <p>
     *            The S3 object location of the input media file. The URI must
     *            be in the same region as the API endpoint that you are
     *            calling. The general form is:
     *            </p>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/keyprefix/objectkey</code>
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/example.flac</code>
     *            </p>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/mediafiles/example.flac</code>
     *            </p>
     *            <p>
     *            For more information about S3 object names, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     *            >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
     *            </p>
     */
    public void setMediaFileUri(String mediaFileUri) {
        this.mediaFileUri = mediaFileUri;
    }

    /**
     * <p>
     * The S3 object location of the input media file. The URI must be in the
     * same region as the API endpoint that you are calling. The general form
     * is:
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/keyprefix/objectkey</code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/example.flac</code>
     * </p>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/mediafiles/example.flac</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     * >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
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
     *            The S3 object location of the input media file. The URI must
     *            be in the same region as the API endpoint that you are
     *            calling. The general form is:
     *            </p>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/keyprefix/objectkey</code>
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/example.flac</code>
     *            </p>
     *            <p>
     *            <code>s3://DOC-EXAMPLE-BUCKET/mediafiles/example.flac</code>
     *            </p>
     *            <p>
     *            For more information about S3 object names, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys"
     *            >Object Keys</a> in the <i>Amazon S3 Developer Guide</i>.
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
     * The S3 object location for your redacted output media file. This is only
     * supported for call analytics jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The S3 object location for your redacted output media file. This
     *         is only supported for call analytics jobs.
     *         </p>
     */
    public String getRedactedMediaFileUri() {
        return redactedMediaFileUri;
    }

    /**
     * <p>
     * The S3 object location for your redacted output media file. This is only
     * supported for call analytics jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param redactedMediaFileUri <p>
     *            The S3 object location for your redacted output media file.
     *            This is only supported for call analytics jobs.
     *            </p>
     */
    public void setRedactedMediaFileUri(String redactedMediaFileUri) {
        this.redactedMediaFileUri = redactedMediaFileUri;
    }

    /**
     * <p>
     * The S3 object location for your redacted output media file. This is only
     * supported for call analytics jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param redactedMediaFileUri <p>
     *            The S3 object location for your redacted output media file.
     *            This is only supported for call analytics jobs.
     *            </p>
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
