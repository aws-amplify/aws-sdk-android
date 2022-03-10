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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about a medical transcription job.
 * </p>
 * <p>
 * To view the job's status, refer to the <code>TranscriptionJobStatus</code>
 * field. If the status is <code>COMPLETED</code>, the job is finished. You can
 * then find your transcript at the URI specified in the
 * <code>TranscriptFileUri</code> field.
 * </p>
 */
public class GetMedicalTranscriptionJobRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the medical transcription job you want information about.
     * This value is case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String medicalTranscriptionJobName;

    /**
     * <p>
     * The name of the medical transcription job you want information about.
     * This value is case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the medical transcription job you want information
     *         about. This value is case sensitive.
     *         </p>
     */
    public String getMedicalTranscriptionJobName() {
        return medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job you want information about.
     * This value is case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            The name of the medical transcription job you want information
     *            about. This value is case sensitive.
     *            </p>
     */
    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job you want information about.
     * This value is case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            The name of the medical transcription job you want information
     *            about. This value is case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMedicalTranscriptionJobRequest withMedicalTranscriptionJobName(
            String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
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
        if (getMedicalTranscriptionJobName() != null)
            sb.append("MedicalTranscriptionJobName: " + getMedicalTranscriptionJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMedicalTranscriptionJobName() == null) ? 0
                        : getMedicalTranscriptionJobName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMedicalTranscriptionJobRequest == false)
            return false;
        GetMedicalTranscriptionJobRequest other = (GetMedicalTranscriptionJobRequest) obj;

        if (other.getMedicalTranscriptionJobName() == null
                ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null
                && other.getMedicalTranscriptionJobName().equals(
                        this.getMedicalTranscriptionJobName()) == false)
            return false;
        return true;
    }
}
