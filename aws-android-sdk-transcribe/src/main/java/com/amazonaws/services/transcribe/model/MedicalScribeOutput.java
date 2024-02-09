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
 * The location of the output of your Medical Scribe job.
 * <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for the Clinical
 * Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the
 * Transcript.
 * </p>
 */
public class MedicalScribeOutput implements Serializable {
    /**
     * <p>
     * Holds the Amazon S3 URI for the Transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String transcriptFileUri;

    /**
     * <p>
     * Holds the Amazon S3 URI for the Clinical Document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String clinicalDocumentUri;

    /**
     * <p>
     * Holds the Amazon S3 URI for the Transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         Holds the Amazon S3 URI for the Transcript.
     *         </p>
     */
    public String getTranscriptFileUri() {
        return transcriptFileUri;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param transcriptFileUri <p>
     *            Holds the Amazon S3 URI for the Transcript.
     *            </p>
     */
    public void setTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Transcript.
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
     *            Holds the Amazon S3 URI for the Transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeOutput withTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
        return this;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Clinical Document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         Holds the Amazon S3 URI for the Clinical Document.
     *         </p>
     */
    public String getClinicalDocumentUri() {
        return clinicalDocumentUri;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Clinical Document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param clinicalDocumentUri <p>
     *            Holds the Amazon S3 URI for the Clinical Document.
     *            </p>
     */
    public void setClinicalDocumentUri(String clinicalDocumentUri) {
        this.clinicalDocumentUri = clinicalDocumentUri;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Clinical Document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param clinicalDocumentUri <p>
     *            Holds the Amazon S3 URI for the Clinical Document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MedicalScribeOutput withClinicalDocumentUri(String clinicalDocumentUri) {
        this.clinicalDocumentUri = clinicalDocumentUri;
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
        if (getClinicalDocumentUri() != null)
            sb.append("ClinicalDocumentUri: " + getClinicalDocumentUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptFileUri() == null) ? 0 : getTranscriptFileUri().hashCode());
        hashCode = prime * hashCode
                + ((getClinicalDocumentUri() == null) ? 0 : getClinicalDocumentUri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalScribeOutput == false)
            return false;
        MedicalScribeOutput other = (MedicalScribeOutput) obj;

        if (other.getTranscriptFileUri() == null ^ this.getTranscriptFileUri() == null)
            return false;
        if (other.getTranscriptFileUri() != null
                && other.getTranscriptFileUri().equals(this.getTranscriptFileUri()) == false)
            return false;
        if (other.getClinicalDocumentUri() == null ^ this.getClinicalDocumentUri() == null)
            return false;
        if (other.getClinicalDocumentUri() != null
                && other.getClinicalDocumentUri().equals(this.getClinicalDocumentUri()) == false)
            return false;
        return true;
    }
}
