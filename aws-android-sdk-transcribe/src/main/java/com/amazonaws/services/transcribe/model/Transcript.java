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
public class Transcript implements Serializable {
    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access
     * or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job
     * request, this is the URI of that bucket. If you also included
     * <code>OutputKey</code> in your request, your output is located in the
     * path you specified in your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription
     * job request, your transcript is stored in a service-managed bucket, and
     * <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for
     * 15 minutes. If you get an <code>AccesDenied</code> error, you can get a
     * new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String transcriptFileUri;

    /**
     * <p>
     * The Amazon S3 location of your redacted transcript. You can use this URI
     * to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job
     * request, this is the URI of that bucket. If you also included
     * <code>OutputKey</code> in your request, your output is located in the
     * path you specified in your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription
     * job request, your transcript is stored in a service-managed bucket, and
     * <code>RedactedTranscriptFileUri</code> provides you with a temporary URI
     * you can use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for
     * 15 minutes. If you get an <code>AccesDenied</code> error, you can get a
     * new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String redactedTranscriptFileUri;

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access
     * or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job
     * request, this is the URI of that bucket. If you also included
     * <code>OutputKey</code> in your request, your output is located in the
     * path you specified in your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription
     * job request, your transcript is stored in a service-managed bucket, and
     * <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for
     * 15 minutes. If you get an <code>AccesDenied</code> error, you can get a
     * new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
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
     *         If you included <code>OutputBucketName</code> in your
     *         transcription job request, this is the URI of that bucket. If you
     *         also included <code>OutputKey</code> in your request, your output
     *         is located in the path you specified in your request.
     *         </p>
     *         <p>
     *         If you didn't include <code>OutputBucketName</code> in your
     *         transcription job request, your transcript is stored in a
     *         service-managed bucket, and <code>TranscriptFileUri</code>
     *         provides you with a temporary URI you can use for secure access
     *         to your transcript.
     *         </p>
     *         <note>
     *         <p>
     *         Temporary URIs for service-managed Amazon S3 buckets are only
     *         valid for 15 minutes. If you get an <code>AccesDenied</code>
     *         error, you can get a new temporary URI by running a
     *         <code>GetTranscriptionJob</code> or
     *         <code>ListTranscriptionJob</code> request.
     *         </p>
     *         </note>
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
     * If you included <code>OutputBucketName</code> in your transcription job
     * request, this is the URI of that bucket. If you also included
     * <code>OutputKey</code> in your request, your output is located in the
     * path you specified in your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription
     * job request, your transcript is stored in a service-managed bucket, and
     * <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for
     * 15 minutes. If you get an <code>AccesDenied</code> error, you can get a
     * new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
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
     *            If you included <code>OutputBucketName</code> in your
     *            transcription job request, this is the URI of that bucket. If
     *            you also included <code>OutputKey</code> in your request, your
     *            output is located in the path you specified in your request.
     *            </p>
     *            <p>
     *            If you didn't include <code>OutputBucketName</code> in your
     *            transcription job request, your transcript is stored in a
     *            service-managed bucket, and <code>TranscriptFileUri</code>
     *            provides you with a temporary URI you can use for secure
     *            access to your transcript.
     *            </p>
     *            <note>
     *            <p>
     *            Temporary URIs for service-managed Amazon S3 buckets are only
     *            valid for 15 minutes. If you get an <code>AccesDenied</code>
     *            error, you can get a new temporary URI by running a
     *            <code>GetTranscriptionJob</code> or
     *            <code>ListTranscriptionJob</code> request.
     *            </p>
     *            </note>
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
     * If you included <code>OutputBucketName</code> in your transcription job
     * request, this is the URI of that bucket. If you also included
     * <code>OutputKey</code> in your request, your output is located in the
     * path you specified in your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription
     * job request, your transcript is stored in a service-managed bucket, and
     * <code>TranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for
     * 15 minutes. If you get an <code>AccesDenied</code> error, you can get a
     * new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
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
     *            If you included <code>OutputBucketName</code> in your
     *            transcription job request, this is the URI of that bucket. If
     *            you also included <code>OutputKey</code> in your request, your
     *            output is located in the path you specified in your request.
     *            </p>
     *            <p>
     *            If you didn't include <code>OutputBucketName</code> in your
     *            transcription job request, your transcript is stored in a
     *            service-managed bucket, and <code>TranscriptFileUri</code>
     *            provides you with a temporary URI you can use for secure
     *            access to your transcript.
     *            </p>
     *            <note>
     *            <p>
     *            Temporary URIs for service-managed Amazon S3 buckets are only
     *            valid for 15 minutes. If you get an <code>AccesDenied</code>
     *            error, you can get a new temporary URI by running a
     *            <code>GetTranscriptionJob</code> or
     *            <code>ListTranscriptionJob</code> request.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transcript withTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of your redacted transcript. You can use this URI
     * to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job
     * request, this is the URI of that bucket. If you also included
     * <code>OutputKey</code> in your request, your output is located in the
     * path you specified in your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription
     * job request, your transcript is stored in a service-managed bucket, and
     * <code>RedactedTranscriptFileUri</code> provides you with a temporary URI
     * you can use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for
     * 15 minutes. If you get an <code>AccesDenied</code> error, you can get a
     * new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location of your redacted transcript. You can use
     *         this URI to access or download your transcript.
     *         </p>
     *         <p>
     *         If you included <code>OutputBucketName</code> in your
     *         transcription job request, this is the URI of that bucket. If you
     *         also included <code>OutputKey</code> in your request, your output
     *         is located in the path you specified in your request.
     *         </p>
     *         <p>
     *         If you didn't include <code>OutputBucketName</code> in your
     *         transcription job request, your transcript is stored in a
     *         service-managed bucket, and
     *         <code>RedactedTranscriptFileUri</code> provides you with a
     *         temporary URI you can use for secure access to your transcript.
     *         </p>
     *         <note>
     *         <p>
     *         Temporary URIs for service-managed Amazon S3 buckets are only
     *         valid for 15 minutes. If you get an <code>AccesDenied</code>
     *         error, you can get a new temporary URI by running a
     *         <code>GetTranscriptionJob</code> or
     *         <code>ListTranscriptionJob</code> request.
     *         </p>
     *         </note>
     */
    public String getRedactedTranscriptFileUri() {
        return redactedTranscriptFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of your redacted transcript. You can use this URI
     * to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job
     * request, this is the URI of that bucket. If you also included
     * <code>OutputKey</code> in your request, your output is located in the
     * path you specified in your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription
     * job request, your transcript is stored in a service-managed bucket, and
     * <code>RedactedTranscriptFileUri</code> provides you with a temporary URI
     * you can use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for
     * 15 minutes. If you get an <code>AccesDenied</code> error, you can get a
     * new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param redactedTranscriptFileUri <p>
     *            The Amazon S3 location of your redacted transcript. You can
     *            use this URI to access or download your transcript.
     *            </p>
     *            <p>
     *            If you included <code>OutputBucketName</code> in your
     *            transcription job request, this is the URI of that bucket. If
     *            you also included <code>OutputKey</code> in your request, your
     *            output is located in the path you specified in your request.
     *            </p>
     *            <p>
     *            If you didn't include <code>OutputBucketName</code> in your
     *            transcription job request, your transcript is stored in a
     *            service-managed bucket, and
     *            <code>RedactedTranscriptFileUri</code> provides you with a
     *            temporary URI you can use for secure access to your
     *            transcript.
     *            </p>
     *            <note>
     *            <p>
     *            Temporary URIs for service-managed Amazon S3 buckets are only
     *            valid for 15 minutes. If you get an <code>AccesDenied</code>
     *            error, you can get a new temporary URI by running a
     *            <code>GetTranscriptionJob</code> or
     *            <code>ListTranscriptionJob</code> request.
     *            </p>
     *            </note>
     */
    public void setRedactedTranscriptFileUri(String redactedTranscriptFileUri) {
        this.redactedTranscriptFileUri = redactedTranscriptFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of your redacted transcript. You can use this URI
     * to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job
     * request, this is the URI of that bucket. If you also included
     * <code>OutputKey</code> in your request, your output is located in the
     * path you specified in your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription
     * job request, your transcript is stored in a service-managed bucket, and
     * <code>RedactedTranscriptFileUri</code> provides you with a temporary URI
     * you can use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for
     * 15 minutes. If you get an <code>AccesDenied</code> error, you can get a
     * new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param redactedTranscriptFileUri <p>
     *            The Amazon S3 location of your redacted transcript. You can
     *            use this URI to access or download your transcript.
     *            </p>
     *            <p>
     *            If you included <code>OutputBucketName</code> in your
     *            transcription job request, this is the URI of that bucket. If
     *            you also included <code>OutputKey</code> in your request, your
     *            output is located in the path you specified in your request.
     *            </p>
     *            <p>
     *            If you didn't include <code>OutputBucketName</code> in your
     *            transcription job request, your transcript is stored in a
     *            service-managed bucket, and
     *            <code>RedactedTranscriptFileUri</code> provides you with a
     *            temporary URI you can use for secure access to your
     *            transcript.
     *            </p>
     *            <note>
     *            <p>
     *            Temporary URIs for service-managed Amazon S3 buckets are only
     *            valid for 15 minutes. If you get an <code>AccesDenied</code>
     *            error, you can get a new temporary URI by running a
     *            <code>GetTranscriptionJob</code> or
     *            <code>ListTranscriptionJob</code> request.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transcript withRedactedTranscriptFileUri(String redactedTranscriptFileUri) {
        this.redactedTranscriptFileUri = redactedTranscriptFileUri;
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
            sb.append("TranscriptFileUri: " + getTranscriptFileUri() + ",");
        if (getRedactedTranscriptFileUri() != null)
            sb.append("RedactedTranscriptFileUri: " + getRedactedTranscriptFileUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptFileUri() == null) ? 0 : getTranscriptFileUri().hashCode());
        hashCode = prime
                * hashCode
                + ((getRedactedTranscriptFileUri() == null) ? 0 : getRedactedTranscriptFileUri()
                        .hashCode());
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
        if (other.getRedactedTranscriptFileUri() == null
                ^ this.getRedactedTranscriptFileUri() == null)
            return false;
        if (other.getRedactedTranscriptFileUri() != null
                && other.getRedactedTranscriptFileUri().equals(this.getRedactedTranscriptFileUri()) == false)
            return false;
        return true;
    }
}
